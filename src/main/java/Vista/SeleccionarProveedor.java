package Vista;

import DAO.ProveedoresDAO;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class SeleccionarProveedor extends javax.swing.JFrame {

    private static SeleccionarProveedor instance = new SeleccionarProveedor();
    ProveedoresDAO pDao = new ProveedoresDAO();

    private SeleccionarProveedor() {
        initComponents();
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura2.png")).getImage();
        super.setIconImage(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarE = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        txfBuscarProv = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BUSQUE Y SELECCIONE EL PROVEEDOR:");

        btnEliminarE.setContentAreaFilled(false);
        btnEliminarE.setFocusPainted(false);
        btnEliminarE.setFocusable(false);
        btnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("Buscar:");

        txfBuscarProv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfBuscarProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarProv.setToolTipText("");
        txfBuscarProv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txfBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarProvActionPerformed(evt);
            }
        });
        txfBuscarProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarProvKeyTyped(evt);
            }
        });

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nit", "Nombre", "Ubicacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaProveedoresMouseReleased(evt);
            }
        });
        tablaProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaProveedoresKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProveedores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(txfBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(193, 193, 193))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnEliminarEActionPerformed

    private void txfBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarProvActionPerformed

    private void txfBuscarProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarProvKeyReleased

        if (txfBuscarProv.getText().length() == 0) {

            limpiarTablaProveedores();

        } else {

            buscarProveedor();
        }
    }//GEN-LAST:event_txfBuscarProvKeyReleased

    private void txfBuscarProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarProvKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

    }//GEN-LAST:event_txfBuscarProvKeyTyped

    private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked

        if (tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1) {

                int resultado = JOptionPane.showConfirmDialog(null, "¿Seleccionar proveedor?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    seleccionarProveedor();

                } else {

                }

            }
        }
    }//GEN-LAST:event_tablaProveedoresMouseClicked

    private void tablaProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseReleased

        if (tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1) {

                int resultado = JOptionPane.showConfirmDialog(null, "¿Seleccionar proveedor?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    seleccionarProveedor();

                } else {

                }

            }
        }
    }//GEN-LAST:event_tablaProveedoresMouseReleased

    private void tablaProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProveedoresKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProveedoresKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txfBuscarProv;
    // End of variables declaration//GEN-END:variables

    public void limpiarTablaProveedores() {
        DefaultTableModel modelo = (DefaultTableModel) tablaProveedores.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void seleccionarProveedor() {

        String nit = tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString();
        VistaSGI.txfNitIngresarEspecie.setText(nit);
        dispose();

    }

    public void buscarProveedor() {

        try {

            DefaultTableModel modelo;
            TableColumnModel column = tablaProveedores.getColumnModel();
            modelo = pDao.seleccionarProveedor(txfBuscarProv.getText());
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaProveedores.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            tablaProveedores.getColumnModel().getColumn(1).setCellRenderer(tcr);
            column.getColumn(1).setPreferredWidth(200);

        } catch (IllegalArgumentException a) {

        }
    }

    public static SeleccionarProveedor ObtenerInstancia() {
        if (instance == null) {
            instance = new SeleccionarProveedor();
        }
        return instance;
    }
}
