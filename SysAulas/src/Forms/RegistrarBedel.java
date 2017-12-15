/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gestores.AdministradorBedeles;
import Gestores.AdministradorInterfaz;
import Gestores.AdministradorSesion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Laureano
 */
public class RegistrarBedel extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarBedel
     */
    public RegistrarBedel() {
        initComponents();
        
        
        cmbTurno.removeAllItems();
        cmbTurno.addItem("---Seleccione Turno---");
        ArrayList<String> pes = AdministradorBedeles.getAllTurnos();
        for (String s : pes) {
            cmbTurno.addItem(s);
        }
        
    }

    @Override
    public void setVisible(boolean b) {
        lblNombreAdmin.setText(AdministradorSesion.getUsuarioActual().getNombreUsuario());
        super.setVisible(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistrar = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        lblNombreAdmin = new javax.swing.JLabel();
        lblComplete = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();
        lblContraseña2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbTurno = new javax.swing.JComboBox<>();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseña1 = new javax.swing.JPasswordField();
        txtContraseña2 = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GateKeeper - Registrar Bedel [ADMINISTRADOR]");
        setResizable(false);
        setSize(new java.awt.Dimension(370, 370));
        setType(java.awt.Window.Type.UTILITY);

        lblRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistrar.setText("Registrar Bedel");

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreAdmin.setText("Nombre_Administrador");

        lblComplete.setText("<html>Complete todos los campos para registrar un nuevo bedel.</html>");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("Nombre del Bedel");

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblApellido.setText("Apellido del Bedel");

        lblTurno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTurno.setText("Turno");

        lblNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre de Usuario");

        lblContraseña1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContraseña1.setText("Contraseña");

        lblContraseña2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContraseña2.setText("Confirmar Contraseña");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtNombre.setText("Nombre");
        txtNombre.setToolTipText("Ingrese el nombre del bedel (5 - 20 caracteres)");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtApellido.setText("Apellido");
        txtApellido.setToolTipText("Ingrese el apellido del bedel (2 - 20 caracteres)");
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
        });

        cmbTurno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione Turno---", "MAÑANA", "TARDE", "NOCHE" }));
        cmbTurno.setToolTipText("Seleccione el turno en el que trabaja el bedel");

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreUsuario.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtNombreUsuario.setText("Usuario");
        txtNombreUsuario.setToolTipText("Ingrese el nombre de usuario para el bedel (7 - 15 caracteres alfanumericos sin espacios ni símbolos)");
        txtNombreUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreUsuarioFocusGained(evt);
            }
        });

        txtContraseña1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtContraseña1.setText("Contr1");
        txtContraseña1.setToolTipText("Ingrese la contraseña para el bedel (10 - 20 caracteres alfanumericos y símbolos y sin espacios)");
        txtContraseña1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseña1FocusGained(evt);
            }
        });

        txtContraseña2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtContraseña2.setText("Contr2");
        txtContraseña2.setToolTipText("Vuelva a ingresar la contraseña");
        txtContraseña2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseña2FocusGained(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancele el ingreso de datos");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarde los datos ingresados y registre al bedel");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_menu.png"))); // NOI18N
        btnVolver.setText("Volver al Menu");
        btnVolver.setToolTipText("Vuelva al menu administrador");
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
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
                        .addComponent(lblRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblComplete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTurno)
                            .addComponent(lblNombreUsuario)
                            .addComponent(lblContraseña1)
                            .addComponent(lblContraseña2)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(cmbTurno, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContraseña1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContraseña2)
                            .addComponent(txtNombre))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrar)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblComplete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurno)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña1)
                    .addComponent(txtContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña2)
                    .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (cmbTurno.getSelectedIndex() != 0) {
            Boolean hh,hh2;
            hh2 = true;
            hh = txtApellido.getText().matches("^[ A-Za-záéíóú]+$");
            if (hh) {
                hh = txtNombre.getText().matches("^[ A-Za-záéíóú]+$");
            }
            if ((txtNombre.getText().length() > 20) || (txtApellido.getText().length() > 20)) {
                hh2 = false;
            }

            if (!hh) {
                JOptionPane.showMessageDialog(this, "Campos con carácteres invalidos", "Error cargando los datos", JOptionPane.ERROR_MESSAGE);
            } else if (!hh2){
                JOptionPane.showMessageDialog(this, "Nombre o apellido muy largo, tienen que tener 20 caracteres o menos", "Error cargando los datos", JOptionPane.ERROR_MESSAGE);
            } else {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                Integer turnoID = cmbTurno.getSelectedIndex();
                String usuario = txtNombreUsuario.getText();
                String contraseña = new String(txtContraseña1.getPassword());
                String contraseñaRepetir = new String(txtContraseña2.getPassword());
                Integer resultado = AdministradorBedeles.registrarBedel(nombre, apellido, turnoID, usuario, contraseña, contraseñaRepetir);

                switch (resultado) {
                    case 0:
                        JOptionPane.showMessageDialog(this, "Usuario " + usuario + " creado con exito!");
                        txtNombre.setText("Nombre");
                        txtApellido.setText("Apellido");
                        cmbTurno.setSelectedIndex(0);
                        txtNombreUsuario.setText("Usuario");
                        txtContraseña1.setText("Contr1");
                        txtContraseña2.setText("Contr2");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(this, "No ha seleccionado un turno para el bedel.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "La contraseña ingresada no coincide con la repetida.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(this, "El nombre de usuario escrito esta siendo usado por otra persona.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(this, "El nombre de usuario o la contraseña no se ajusta a la politica actual.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                        break;

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un turno.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        AdministradorInterfaz.getMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        txtNombre.setText("Nombre");
        txtApellido.setText("Apellido");
        cmbTurno.setSelectedIndex(0);
        txtNombreUsuario.setText("Usuario");
        txtContraseña1.setText("Contr1");
        txtContraseña2.setText("Contr2");
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        // TODO add your handling code here:
        txtApellido.setText("");
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtNombreUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUsuarioFocusGained
        // TODO add your handling code here:
        txtNombreUsuario.setText("");
    }//GEN-LAST:event_txtNombreUsuarioFocusGained

    private void txtContraseña1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseña1FocusGained
        // TODO add your handling code here:
        txtContraseña1.setText("");
    }//GEN-LAST:event_txtContraseña1FocusGained

    private void txtContraseña2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseña2FocusGained
        // TODO add your handling code here:
        txtContraseña2.setText("");
    }//GEN-LAST:event_txtContraseña2FocusGained

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
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarBedel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblComplete;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreAdmin;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
