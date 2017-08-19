package VISTAS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MAIN extends javax.swing.JFrame {

    PANELES.PanelClientes panelCliente;
    
    public MAIN() {
        initComponents();
        
        setTitle("Bienvenido "+MODEL.Usuario.getUsuario().getNombreusuario());
        
        panelCliente = new PANELES.PanelClientes();
        panelCliente.setName(CLASES.Idioma.idioma().getProperty("panelcliente"));
        
        contenedor.add(panelCliente, 0);
        contenedor.setIconAt(0, new ImageIcon(getClass().getResource("/imagenes/usuarios.png")));
        
        setExtendedState(MAXIMIZED_BOTH);
        
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            if(!locale.getCountry().isEmpty()){
                System.out.print(locale.getCountry());
                System.out.print(" - ");
                System.out.print(locale.getDisplayCountry());
                System.out.print(" - ");
                System.out.print(locale.getDisplayLanguage());
                System.out.print(" - ");
                System.out.print(locale.getDisplayName());
                System.out.print(" - ");
                System.out.println(locale.getLanguage());
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Configuracion");

        jMenuItem1.setText("Lenguaje");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Properties p = new Properties();
        try {            
            p.load(new FileInputStream(new File("config.properties")));
            File[] idiomas = new File("lang").listFiles();
            JComboBox combo = new JComboBox();
            combo.addItem("Seleccione");
            for (File idioma : idiomas) {
                combo.addItem(idioma.getName().split(".properties")[0]);
            }            
            JOptionPane.showMessageDialog(this, combo);
            if(combo.getSelectedIndex()>0){
                //p.setProperty("idioma", combo.getSelectedItem()+".properties");
                p.setProperty("idioma", combo.getSelectedItem().toString());
                p.store(new FileWriter("config.properties"), "Se ha cambiado el idioma");
            }            
        } catch (IOException ex){
            CLASES.Metodos.ERROR("", ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
