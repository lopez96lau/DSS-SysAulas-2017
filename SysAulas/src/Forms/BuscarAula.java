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
public class BuscarAula extends javax.swing.JFrame {

    /**
     * Creates new form BuscarAula
     */
    public BuscarAula() {
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

        lblBuscar = new javax.swing.JLabel();
        btnModificarAula = new javax.swing.JButton();
        btnEliminarAula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAulas = new javax.swing.JTable();
        pnlFiltrar = new javax.swing.JPanel();
        lblNumeroAula = new javax.swing.JLabel();
        txtNumeroAula = new javax.swing.JTextField();
        lblTipoAula = new javax.swing.JLabel();
        cmbTipoAula = new javax.swing.JComboBox<>();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblSesion = new javax.swing.JLabel();
        lblNombreBedel = new javax.swing.JLabel();
        lblFiltre = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GateKeeper - Buscar Aula [BEDEL]");
        setResizable(false);
        setSize(new java.awt.Dimension(680, 300));
        setType(java.awt.Window.Type.UTILITY);

        lblBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBuscar.setText("Buscar Aula");

        btnModificarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aula_edit.png"))); // NOI18N
        btnModificarAula.setText("Modificar Aula");
        btnModificarAula.setToolTipText("Modifique los datos del aula seleccionada");
        btnModificarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAulaActionPerformed(evt);
            }
        });

        btnEliminarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aula_delete.png"))); // NOI18N
        btnEliminarAula.setText("Eliminar Aula");
        btnEliminarAula.setToolTipText("Elimine el aula seleccionada");

        tblAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° de Aula", "Piso", "Tipo de Aula", "Capacidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAulas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAulas);
        tblAulas.getAccessibleContext().setAccessibleName("");

        pnlFiltrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar Aulas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N

        lblNumeroAula.setText("N° de Aula");

        txtNumeroAula.setToolTipText("Ingrese el numero de un aula para buscar en la base de datos");
        txtNumeroAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAulaActionPerformed(evt);
            }
        });

        lblTipoAula.setText("Tipo de Aula");

        cmbTipoAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula", "Multimedios", "Informática", "Sin Recursos" }));
        cmbTipoAula.setToolTipText("Ingrese el tipo de aula para filtrar la base de datos");

        lblCapacidad.setText("Capacidad");

        txtCapacidad.setToolTipText("Ingrese la capacidad del aula para buscar en la base de datos");

        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Busque un aula específica con los datos ingresados");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpie los campos ingresados para ver todas las aulas existentes");
        btnLimpiar.setActionCommand("");

        javax.swing.GroupLayout pnlFiltrarLayout = new javax.swing.GroupLayout(pnlFiltrar);
        pnlFiltrar.setLayout(pnlFiltrarLayout);
        pnlFiltrarLayout.setHorizontalGroup(
            pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiltrarLayout.createSequentialGroup()
                        .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                                .addComponent(lblTipoAula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                                .addComponent(lblNumeroAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17)))
                        .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroAula)
                            .addComponent(cmbTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFiltrarLayout.createSequentialGroup()
                        .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                                .addComponent(lblCapacidad)
                                .addGap(18, 18, 18)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFiltrarLayout.setVerticalGroup(
            pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroAula)
                    .addComponent(txtNumeroAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoAula)
                    .addComponent(cmbTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidad)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreBedel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreBedel.setText("Nombre_Bedel");

        lblFiltre.setText("Filtre y seleccione las aulas que desee que sean modificadas o eliminadas.");

        btnVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_menu.png"))); // NOI18N
        btnVolverMenu.setText("Volver al Menu");
        btnVolverMenu.setToolTipText("Vuelva al menu de bedel");
        btnVolverMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addComponent(pnlFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreBedel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolverMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFiltre, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(btnVolverMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBedel)
                    .addComponent(lblFiltre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAula))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAulaActionPerformed

    private void txtNumeroAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAulaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarAula;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarAula;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JComboBox<String> cmbTipoAula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblFiltre;
    private javax.swing.JLabel lblNombreBedel;
    private javax.swing.JLabel lblNumeroAula;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblTipoAula;
    private javax.swing.JPanel pnlFiltrar;
    private javax.swing.JTable tblAulas;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtNumeroAula;
    // End of variables declaration//GEN-END:variables
}
