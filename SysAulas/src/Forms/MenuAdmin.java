/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gestores.AdministradorSesion;

/**
 *
 * @author Laureano
 */
public class MenuAdmin extends javax.swing.JFrame {

    private AdministradorSesion adminSesion;
    
    /**
     * Creates new form Menu_Bedel
     */
    public MenuAdmin() {
        initComponents();
    }
    
    public MenuAdmin(AdministradorSesion a) {
        initComponents();
        adminSesion = a;
        lblNombreAdmin.setText(adminSesion.getUsuarioActual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        lblNombreAdmin = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        btnAgregarBedel = new javax.swing.JButton();
        btnBuscarBedel = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysAulas - Menu [ADMINISTRADOR]");
        setPreferredSize(new java.awt.Dimension(430, 170));
        setResizable(false);
        setSize(new java.awt.Dimension(430, 170));
        setType(java.awt.Window.Type.UTILITY);

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBienvenido.setText("Bienvenido Administrador");

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreAdmin.setText("Nombre_Admin");

        lblSeleccione.setText("<html>Seleccione alguna de las opciones disponibles.</html>");

        btnAgregarBedel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_add.png"))); // NOI18N
        btnAgregarBedel.setText("Registrar Bedel");
        btnAgregarBedel.setToolTipText("Agregue un bedel al sistema");
        btnAgregarBedel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarBedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBedelActionPerformed(evt);
            }
        });

        btnBuscarBedel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_search.png"))); // NOI18N
        btnBuscarBedel.setText("Buscar Bedel");
        btnBuscarBedel.setToolTipText("Busque los bedeles del sistema");
        btnBuscarBedel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/log_out.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setToolTipText("Cierre su sesión y vuelva al inicio");
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarBedel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarBedel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreAdmin))
                            .addComponent(lblSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenido)
                    .addComponent(btnCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarBedel)
                    .addComponent(btnAgregarBedel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBedelActionPerformed
        RegistrarBedel regBedel = new RegistrarBedel(adminSesion);
        regBedel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarBedelActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        adminSesion.setUsuarioActual("");
        adminSesion.getMenuInicio().resetearCampos();
        adminSesion.getMenuInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBedel;
    private javax.swing.JButton btnBuscarBedel;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNombreAdmin;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblSesion;
    // End of variables declaration//GEN-END:variables
}
