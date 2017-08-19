package PANELES;

import CLASES.CustomTableModel;
import javax.swing.JButton;
import javax.swing.table.TableRowSorter;

public class PanelClientes extends javax.swing.JPanel {

    CustomTableModel modeloTablaUsuario;
    TableRowSorter rowSorter;
    int IDBUSQUEDA = 2;
    
    public PanelClientes() {
        initComponents();
        
        lblbuscar.setText(CLASES.Idioma.idioma().getProperty("lblbuscar"));
        btnNuevoUsuario.setToolTipText(CLASES.Idioma.idioma().getProperty("btnregistrarcliente"));
    }

    public void cargarClientes(){
        tablaclientes.setRowSorter(null);
        modeloTablaUsuario = new CustomTableModel(
            new Object[][]{},
            MODEL.Cliente.getColumnNames(),
            tablaclientes,
            MODEL.Cliente.getColumnClass(),
            MODEL.Cliente.getColumnEditable()
        );
        tablaclientes.getColumnModel().getColumn(0).setCellRenderer(new CLASES.BotonEnColumnaJTable());
        
        String sql = "";
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        lblbuscar = new javax.swing.JLabel();
        cjbuscar = new CompuChiqui.JTextFieldPopup();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnRefrescar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnNuevoUsuario = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnVerUsuario = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnImprimir = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnExportar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnRealizarPago = new javax.swing.JButton();

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaclientes);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);

        lblbuscar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        lblbuscar.setText("Buscar:");
        jToolBar1.add(lblbuscar);
        jToolBar1.add(cjbuscar);
        jToolBar1.add(jSeparator1);

        btnRefrescar.setBackground(new java.awt.Color(255, 255, 255));
        btnRefrescar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefrescar.setToolTipText("Actualizar tabla");
        btnRefrescar.setFocusable(false);
        btnRefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefrescar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRefrescar);
        jToolBar1.add(jSeparator2);

        btnNuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarusuario.png"))); // NOI18N
        btnNuevoUsuario.setToolTipText("Agregar usuario");
        btnNuevoUsuario.setFocusable(false);
        btnNuevoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevoUsuario);
        jToolBar1.add(jSeparator3);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarusuario.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar usuario");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);
        jToolBar1.add(jSeparator4);

        btnVerUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnVerUsuario.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnVerUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        btnVerUsuario.setToolTipText("Ver usuario");
        btnVerUsuario.setFocusable(false);
        btnVerUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVerUsuario);
        jToolBar1.add(jSeparator5);

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir datos");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimir);
        jToolBar1.add(jSeparator6);

        btnExportar.setBackground(new java.awt.Color(255, 255, 255));
        btnExportar.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportar.setToolTipText("Exportar a excel");
        btnExportar.setFocusable(false);
        btnExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExportar);
        jToolBar1.add(jSeparator7);

        btnRealizarPago.setBackground(new java.awt.Color(255, 255, 255));
        btnRealizarPago.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        btnRealizarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarpago.png"))); // NOI18N
        btnRealizarPago.setToolTipText("Realizar pago");
        btnRealizarPago.setFocusable(false);
        btnRealizarPago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRealizarPago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRealizarPago);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        DIALOGOS.RegistrarCliente rc = new DIALOGOS.RegistrarCliente(null, true);
        rc.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUsuarioActionPerformed
        
    }//GEN-LAST:event_btnVerUsuarioActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagoActionPerformed
       
    }//GEN-LAST:event_btnRealizarPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRealizarPago;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnVerUsuario;
    private CompuChiqui.JTextFieldPopup cjbuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JTable tablaclientes;
    // End of variables declaration//GEN-END:variables
}
