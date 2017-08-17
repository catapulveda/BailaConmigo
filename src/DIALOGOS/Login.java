package DIALOGOS;

import MODEL.Usuario;
import java.awt.Point;
import java.awt.event.ActionEvent;

public class Login extends javax.swing.JDialog {

    Point inicial;
    private String EQUIPO = "";
    boolean NOESTA = false;
    
    public Login(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();                               
        
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
        MODEL.Usuario usuario = new Usuario();
        if(usuario.iniciarSesion(cjusuario.getText(), cjpass.getText())){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cjusuario = new CompuChiqui.JTextFieldPopup();
        cjpass = new javax.swing.JPasswordField();
        jToolBar1 = new javax.swing.JToolBar();
        btnEntrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        cjusuario.setCampodetexto(cjpass);
        cjusuario.setPlaceholder("Usuario");

        cjpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjpassKeyTyped(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/locked.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cjpass)
                    .addComponent(cjusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cjusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cjpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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
   
//    public static void main(String args[]) {               
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                Login dialog = new Login(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField cjpass;
    private CompuChiqui.JTextFieldPopup cjusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
