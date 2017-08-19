package DIALOGOS;

import CLASES.EnrrolarHuella;
import MODEL.Cliente;
import MODEL.Rol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistrarCliente extends javax.swing.JDialog {
    
    EnrrolarHuella rh;
    
    public RegistrarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lblcedula.setText(CLASES.Idioma.idioma().getProperty("RC0"));
        lblnombre.setText(CLASES.Idioma.idioma().getProperty("RC1"));
        lblapellido.setText(CLASES.Idioma.idioma().getProperty("RC2"));
        lbltelefono.setText(CLASES.Idioma.idioma().getProperty("RC3"));
        lbldireccion.setText(CLASES.Idioma.idioma().getProperty("RC4"));
        lblcodigopostal.setText(CLASES.Idioma.idioma().getProperty("RC8"));
        lblcorreo.setText(CLASES.Idioma.idioma().getProperty("RC5"));
        lblfechanacimiento.setText(CLASES.Idioma.idioma().getProperty("RC7"));
        btnGuardar.setText(CLASES.Idioma.idioma().getProperty("guardar"));
        btnHuella.setText(CLASES.Idioma.idioma().getProperty("huella"));
        panelRegistrarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, CLASES.Idioma.idioma().getProperty("RC6"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 11))); // NOI18N        
        setTitle(CLASES.Idioma.idioma().getProperty("RC6"));
        
        try {
            panelFoto.setImagen(ImageIO.read(getClass().getResourceAsStream("/imagenes/camera32.png")));
        } catch (IOException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StringTokenizer token = new StringTokenizer(CLASES.Idioma.idioma().getProperty("genero"), ",");
        while(token.hasMoreElements()){
            comboGenero.addItem(token.nextElement().toString());
        }
        
        java.util.List<Rol> roles = MODEL.Rol.getRoles();
        roles.forEach(rol -> comboRol.addItem(rol));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRegistrarCliente = new javax.swing.JPanel();
        lblcedula = new javax.swing.JLabel();
        cjidentificacion = new CompuChiqui.JTextFieldPopup();
        lblnombre = new javax.swing.JLabel();
        cjnombre = new CompuChiqui.JTextFieldPopup();
        lblapellido = new javax.swing.JLabel();
        cjapellido = new CompuChiqui.JTextFieldPopup();
        lbltelefono = new javax.swing.JLabel();
        cjtelefono = new CompuChiqui.JTextFieldPopup();
        lblcodigopostal = new javax.swing.JLabel();
        cjcodigopostal = new CompuChiqui.JTextFieldPopup();
        lblcorreo = new javax.swing.JLabel();
        cjcorreo = new CompuChiqui.JTextFieldPopup();
        lblfechanacimiento = new javax.swing.JLabel();
        cjfechanacimiento = new com.toedter.calendar.JDateChooser();
        cjdireccion = new CompuChiqui.JTextFieldPopup();
        lbldireccion = new javax.swing.JLabel();
        lblfechanacimiento1 = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<>();
        lblfechanacimiento2 = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        panelFoto = new JPanelWebCam.JPanelWebCam();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnHuella = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Cliente");
        setBackground(new java.awt.Color(255, 255, 255));

        panelRegistrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistrarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 11))); // NOI18N
        panelRegistrarCliente.setLayout(new java.awt.GridBagLayout());

        lblcedula.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblcedula.setText("Nº Identificacion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblcedula, gridBagConstraints);

        cjidentificacion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 5, 10);
        panelRegistrarCliente.add(cjidentificacion, gridBagConstraints);

        lblnombre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblnombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblnombre, gridBagConstraints);

        cjnombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(cjnombre, gridBagConstraints);

        lblapellido.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblapellido.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblapellido, gridBagConstraints);

        cjapellido.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(cjapellido, gridBagConstraints);

        lbltelefono.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbltelefono.setText("Nº Telefonico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lbltelefono, gridBagConstraints);

        cjtelefono.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(cjtelefono, gridBagConstraints);

        lblcodigopostal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblcodigopostal.setText("Codigo postal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblcodigopostal, gridBagConstraints);

        cjcodigopostal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(cjcodigopostal, gridBagConstraints);

        lblcorreo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblcorreo.setText("Correo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblcorreo, gridBagConstraints);

        cjcorreo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(cjcorreo, gridBagConstraints);

        lblfechanacimiento.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblfechanacimiento.setText("Fecha Nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblfechanacimiento, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 11, 10);
        panelRegistrarCliente.add(cjfechanacimiento, gridBagConstraints);

        cjdireccion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(cjdireccion, gridBagConstraints);

        lbldireccion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbldireccion.setText("Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lbldireccion, gridBagConstraints);

        lblfechanacimiento1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblfechanacimiento1.setText("Rol:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblfechanacimiento1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(comboRol, gridBagConstraints);

        lblfechanacimiento2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblfechanacimiento2.setText("Genero:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        panelRegistrarCliente.add(lblfechanacimiento2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 5, 10);
        panelRegistrarCliente.add(comboGenero, gridBagConstraints);

        panelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelFoto.setToolTipText("Click para tomar foto");

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);
        jToolBar1.add(jSeparator1);

        btnHuella.setBackground(new java.awt.Color(255, 255, 255));
        btnHuella.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnHuella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella.png"))); // NOI18N
        btnHuella.setText("Registrar Huella");
        btnHuella.setFocusable(false);
        btnHuella.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHuella.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuellaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuella);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(panelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Cliente cliente = new Cliente();
        cliente.setIdentificacion(cjidentificacion.getText());
        cliente.setNombre(cjnombre.getText());
        cliente.setApellido(cjapellido.getText());
        cliente.setTelefono(cjtelefono.getText());
        cliente.setDireccion(cjdireccion.getText());
        cliente.setCorreo(cjcorreo.getText());
        cliente.setCodigopostal(cjcodigopostal.getText());
        cliente.setFechanacimiento(cjfechanacimiento.getDate());
        cliente.setFoto(panelFoto.getBytes());
        cliente.setGenero(comboGenero.getSelectedItem().toString());
        cliente.setIdrol(comboRol.getItemAt(comboRol.getSelectedIndex()).getIdrol());
        if(rh!=null&&rh.getPlantillaHuella()==null){
            cliente.setHuella(rh.getPlantillaHuella().serialize());
        }else{
            cliente.setHuella(null);
        }
        (new Thread(){
            @Override
            public void run(){
                DIALOGOS.RegistrarCliente.btnGuardar.setIcon(new ImageIcon(getClass().getResource("/imagenes/btncargando.gif")));
                if(cliente.registrarCliente(true)){
                    dispose();
                }
            }
        }).start();        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnHuellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuellaActionPerformed
        rh = new EnrrolarHuella(this, "Registre la huella 4 veces...", true);
        rh.setVisible(true);
    }//GEN-LAST:event_btnHuellaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RegistrarCliente dialog = new RegistrarCliente(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHuella;
    private CompuChiqui.JTextFieldPopup cjapellido;
    private CompuChiqui.JTextFieldPopup cjcodigopostal;
    private CompuChiqui.JTextFieldPopup cjcorreo;
    private CompuChiqui.JTextFieldPopup cjdireccion;
    private com.toedter.calendar.JDateChooser cjfechanacimiento;
    private CompuChiqui.JTextFieldPopup cjidentificacion;
    private CompuChiqui.JTextFieldPopup cjnombre;
    private CompuChiqui.JTextFieldPopup cjtelefono;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JComboBox<Rol> comboRol;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcodigopostal;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblfechanacimiento1;
    private javax.swing.JLabel lblfechanacimiento2;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private JPanelWebCam.JPanelWebCam panelFoto;
    private javax.swing.JPanel panelRegistrarCliente;
    // End of variables declaration//GEN-END:variables
}
