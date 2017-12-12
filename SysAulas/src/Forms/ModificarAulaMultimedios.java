/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author lucia
 */
public class ModificarAulaMultimedios extends javax.swing.JFrame {

    /**
     * Creates new form ModificarAulaMultim
     */
    public ModificarAulaMultimedios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModificar = new javax.swing.JLabel();
        pnlMultimedios = new javax.swing.JPanel();
        lblNumeroAula = new javax.swing.JLabel();
        txtNumeroAula = new javax.swing.JTextField();
        lblPiso = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        chkAireAcondicionado = new javax.swing.JCheckBox();
        chkCañon = new javax.swing.JCheckBox();
        chkComputadora = new javax.swing.JCheckBox();
        chkDVD = new javax.swing.JCheckBox();
        chkTelevisor = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbPizarron = new javax.swing.JComboBox<>();
        cmbHabilitacion = new javax.swing.JComboBox<>();
        lblSesion = new javax.swing.JLabel();
        lblNombreBedel = new javax.swing.JLabel();
        lblActualice = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GateKeeper - Modificar Aula Multimedios [BEDEL]");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblModificar.setText("Modificar Aula");
        lblModificar.setToolTipText("");

        pnlMultimedios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aula Multimedios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N
        pnlMultimedios.setToolTipText("");

        lblNumeroAula.setText("N° de Aula");

        txtNumeroAula.setToolTipText("Numero del aula seleccionada");
        txtNumeroAula.setEnabled(false);
        txtNumeroAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAulaActionPerformed(evt);
            }
        });

        lblPiso.setText("Piso");

        txtPiso.setToolTipText("Ubicación del aula seleccionada");
        txtPiso.setEnabled(false);
        txtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPisoActionPerformed(evt);
            }
        });

        lblCapacidad.setText("Capacidad");

        txtCapacidad.setToolTipText("Capacidad del aula seleccionada");
        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        chkAireAcondicionado.setText("Aire acondicionado");
        chkAireAcondicionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAireAcondicionadoActionPerformed(evt);
            }
        });

        chkCañon.setText("Cañón");
        chkCañon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCañonActionPerformed(evt);
            }
        });

        chkComputadora.setText("Computadora");

        chkDVD.setText("DVD");

        chkTelevisor.setText("Televisor");
        chkTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTelevisorActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Actualice los datos del aula seleccionada");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancele la modificación de los datos");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbPizarron.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Pizarrón", "MADERA", "PLÁSTICO" }));
        cmbPizarron.setToolTipText("Tipo de pizarrón del aula seleccionada");

        cmbHabilitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitación", "HABILITADA", "DESHABILITADA" }));
        cmbHabilitacion.setToolTipText("Indique si el aula está habilitada o deshabilitada");

        javax.swing.GroupLayout pnlMultimediosLayout = new javax.swing.GroupLayout(pnlMultimedios);
        pnlMultimedios.setLayout(pnlMultimediosLayout);
        pnlMultimediosLayout.setHorizontalGroup(
            pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultimediosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMultimediosLayout.createSequentialGroup()
                        .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroAula)
                            .addComponent(lblCapacidad)
                            .addComponent(lblPiso))
                        .addGap(17, 17, 17)
                        .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCapacidad)
                            .addComponent(txtPiso)
                            .addComponent(txtNumeroAula, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbHabilitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMultimediosLayout.createSequentialGroup()
                        .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCañon)
                            .addComponent(chkDVD)
                            .addComponent(chkTelevisor)
                            .addComponent(chkComputadora)
                            .addComponent(chkAireAcondicionado))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(pnlMultimediosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cmbPizarron, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMultimediosLayout.setVerticalGroup(
            pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultimediosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMultimediosLayout.createSequentialGroup()
                        .addComponent(chkTelevisor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCañon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkComputadora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkDVD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAireAcondicionado)
                        .addGap(10, 10, 10)
                        .addComponent(cmbPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlMultimediosLayout.createSequentialGroup()
                        .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroAula)
                            .addComponent(txtNumeroAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPiso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMultimediosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCapacidad)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHabilitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))))
        );

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");
        lblSesion.setToolTipText("");

        lblNombreBedel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreBedel.setText("Nombre_Bedel");
        lblNombreBedel.setToolTipText("");

        lblActualice.setText("Actualice los datos del aula seleccionada.");
        lblActualice.setToolTipText("");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/generate_list.png"))); // NOI18N
        btnVolver.setText("Volver al Listado");
        btnVolver.setToolTipText("");
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addComponent(pnlMultimedios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblActualice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreBedel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificar)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBedel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblActualice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMultimedios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void chkAireAcondicionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAireAcondicionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAireAcondicionadoActionPerformed

    private void chkCañonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCañonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCañonActionPerformed

    private void chkTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTelevisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTelevisorActionPerformed

    private void txtNumeroAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAulaActionPerformed

    private void txtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPisoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarAulaMultimedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAulaMultimedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAulaMultimedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAulaMultimedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAulaMultimedios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkAireAcondicionado;
    private javax.swing.JCheckBox chkCañon;
    private javax.swing.JCheckBox chkComputadora;
    private javax.swing.JCheckBox chkDVD;
    private javax.swing.JCheckBox chkTelevisor;
    private javax.swing.JComboBox<String> cmbHabilitacion;
    private javax.swing.JComboBox<String> cmbPizarron;
    private javax.swing.JLabel lblActualice;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombreBedel;
    private javax.swing.JLabel lblNumeroAula;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JPanel pnlMultimedios;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtNumeroAula;
    private javax.swing.JTextField txtPiso;
    // End of variables declaration//GEN-END:variables
}
