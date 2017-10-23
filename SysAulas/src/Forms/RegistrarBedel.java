/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

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
        lblNombreBedel = new javax.swing.JLabel();
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
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysAulas - Registrar Bedel [ADMINISTRADOR]");
        setPreferredSize(new java.awt.Dimension(350, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 360));
        setType(java.awt.Window.Type.UTILITY);

        lblRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistrar.setText("Registrar Bedel");

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreBedel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreBedel.setText("Nombre_Administrador");

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

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtApellido.setText("Apellido");
        txtApellido.setToolTipText("Ingrese el apellido del bedel (2 - 20 caracteres)");

        cmbTurno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione Turno---", "MAÑANA", "TARDE", "NOCHE" }));
        cmbTurno.setToolTipText("Seleccione el turno en el que trabaja el bedel");

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreUsuario.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtNombreUsuario.setText("Usuario");
        txtNombreUsuario.setToolTipText("Ingrese el nombre de usuario para el bedel (7 - 15 caracteres alfanumericos sin espacios ni símbolos)");

        txtContraseña1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtContraseña1.setText("Contraseña");
        txtContraseña1.setToolTipText("Ingrese la contraseña para el bedel (10 - 20 caracteres alfanumericos y símbolos y sin espacios)");

        txtContraseña2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtContraseña2.setText("Contraseña");
        txtContraseña2.setToolTipText("Vuelva a ingresar la contraseña");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnGuardar.setText("Cancelar");
        btnGuardar.setToolTipText("Cancele el ingreso de datos");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        btnCancelar.setText("Guardar");
        btnCancelar.setToolTipText("Guarde los datos ingresados y registre al bedel");

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_menu.png"))); // NOI18N
        btnCerrarSesion.setText("Volver al Menu");
        btnCerrarSesion.setToolTipText("Vuelva al menu administrador");
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

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
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblComplete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreBedel))
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
                    .addComponent(btnCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBedel))
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
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

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
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblComplete;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreBedel;
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