package VISTAS;

import CLASES.HiloLogin;
import MODEL.Cliente;
import MODEL.Usuario;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.StringTokenizer;

public class Login extends javax.swing.JFrame {

    Point inicial;
    private String EQUIPO = "";
    boolean NOESTA = false;
    
    public Login(){
        initComponents();                               
        
        setTitle(CLASES.Idioma.idioma().getProperty("titulologin"));
        lbluser.setText(CLASES.Idioma.idioma().getProperty("lbluser"));
        lblpass.setText(CLASES.Idioma.idioma().getProperty("lblpass"));
        btnEntrar.setText(CLASES.Idioma.idioma().getProperty("btnentrar"));
        btnSalir.setText(CLASES.Idioma.idioma().getProperty("btnsalir"));        
        
        btnEntrar.addActionListener((ActionEvent e) ->{
            btnEntrar.setEnabled(false);
            entrar();
        });
        btnSalir.addActionListener((ActionEvent e) ->{
            System.exit(0);
        });
        
        cjusuario.grabFocus();
    }
    
    public void entrar(){
        HiloLogin hiloLogin = new HiloLogin();
        hiloLogin.setUser(cjusuario.getText());
        hiloLogin.setPass(cjpass.getText());
        hiloLogin.setLbl(lblicon);
        hiloLogin.setVlogin(this);
        hiloLogin.execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        cjusuario = new CompuChiqui.JTextFieldPopup();
        lblpass = new javax.swing.JLabel();
        cjpass = new javax.swing.JPasswordField();
        lblicon = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnEntrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar sesion");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbluser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbluser.setText("Usuario:");
        lbluser.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel1.add(lbluser, gridBagConstraints);

        cjusuario.setCampodetexto(cjpass);
        cjusuario.setPlaceholder("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 9, 5, 10);
        jPanel1.add(cjusuario, gridBagConstraints);

        lblpass.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpass.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel1.add(lblpass, gridBagConstraints);

        cjpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjpassKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 9, 5, 10);
        jPanel1.add(cjpass, gridBagConstraints);

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/locked.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        jPanel1.add(lblicon, gridBagConstraints);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);

        btnEntrar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(85, 85, 85));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        jToolBar1.add(btnEntrar);
        jToolBar1.add(jSeparator2);

        btnSalir.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(85, 85, 85));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel1.add(jToolBar1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cjpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjpassKeyTyped
        if(evt.getKeyChar()==10){
            entrar();
        }
    }//GEN-LAST:event_cjpassKeyTyped

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        inicial = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - inicial.x, this.getLocation().y + evt.getY() - inicial.y);
    }//GEN-LAST:event_formMouseDragged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing
   
    public static void main(String args[]) {               
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login dialog = new Login();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField cjpass;
    private CompuChiqui.JTextFieldPopup cjusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables

}
