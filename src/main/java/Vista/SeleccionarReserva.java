package Vista;

import DAO.ReservasDAO;
import static Vista.CodigosReservas.tablaCodigosReservas;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class SeleccionarReserva extends javax.swing.JFrame {

    private static SeleccionarReserva instance = new SeleccionarReserva();
    private ReservasDAO rDao = new ReservasDAO();
    private int cantidad = 0;

    private SeleccionarReserva() {
        initComponents();
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura2.png")).getImage();
        super.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txfBuscarConsultarReservas = new javax.swing.JTextField();
        btnSeleccionarEspecieReservas4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaReservasMouseReleased(evt);
            }
        });
        tablaReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaReservasKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tablaReservas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BUSQUE Y SELECCIONE LA RESERVA:");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel101.setText("Buscar por NIT/ C.C o código de reserva:");

        txfBuscarConsultarReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarConsultarReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarConsultarReservas.setToolTipText("Busque por NIT, Cédula o Código de reserva, y presione ENTER.");
        txfBuscarConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarConsultarReservasActionPerformed(evt);
            }
        });
        txfBuscarConsultarReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarConsultarReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarConsultarReservasKeyTyped(evt);
            }
        });

        btnSeleccionarEspecieReservas4.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas4.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar1.png"))); // NOI18N
        btnSeleccionarEspecieReservas4.setBorderPainted(false);
        btnSeleccionarEspecieReservas4.setContentAreaFilled(false);
        btnSeleccionarEspecieReservas4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarEspecieReservas4.setFocusPainted(false);
        btnSeleccionarEspecieReservas4.setFocusable(false);
        btnSeleccionarEspecieReservas4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnSeleccionarEspecieReservas4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnSeleccionarEspecieReservas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspecieReservas4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfBuscarConsultarReservas))
                        .addGap(24, 24, 24)
                        .addComponent(btnSeleccionarEspecieReservas4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeleccionarEspecieReservas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfBuscarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseClicked

    }//GEN-LAST:event_tablaReservasMouseClicked

    private void tablaReservasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseReleased

        if (tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {
            try {

                if (evt.getClickCount() == 1) {

                    int resultado = JOptionPane.showConfirmDialog(null, "¿Desea seleccionar la reserva?", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (resultado == 0) {

                        String codigo_reserva = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0).toString();
                        ResultSet rs;
                        rs = rDao.buscarReserva(codigo_reserva);

                        if (rs.next()) {

                            String cedula = rs.getString(2);

                            if (cedula.contains("-")) {

                                VistaSGI.IdentificacionComboSalidas.setSelectedIndex(1);
                                VistaSGI.IdentificacionComboSalidas.setEnabled(false);
                            } else {

                                VistaSGI.IdentificacionComboSalidas.setSelectedIndex(0);
                                VistaSGI.IdentificacionComboSalidas.setEnabled(false);

                            }

                            VistaSGI.txfIdentificacionClienteSalidas.setText(cedula);
                            VistaSGI.txfNombreClienteSalidas.setText(rs.getString(3));
                            VistaSGI.txfTelefonoClienteSalidas.setText(rs.getString(4));
                            VistaSGI.txfIdentificacionClienteSalidas.setEnabled(false);
                            VistaSGI.txfNombreClienteSalidas.setEnabled(false);
                            VistaSGI.txfTelefonoClienteSalidas.setEnabled(false);
                            VistaSGI.codigo_Reserva = codigo_reserva;
                            seleccionarReserva();
                            dispose();

                        }

                    }
                }
            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Digite solo números, por favor.");

            } catch (SQLException ex) {
                Logger.getLogger(SeleccionarReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablaReservasMouseReleased

    private void tablaReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaReservasKeyReleased

    private void txfBuscarConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarConsultarReservasActionPerformed

        buscarReservas();
    }//GEN-LAST:event_txfBuscarConsultarReservasActionPerformed

    private void txfBuscarConsultarReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConsultarReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarConsultarReservasKeyReleased

    private void txfBuscarConsultarReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConsultarReservasKeyTyped
       
          if (txfBuscarConsultarReservas.getText().length() > 11) {

            evt.consume();

        }   
    }//GEN-LAST:event_txfBuscarConsultarReservasKeyTyped

    private void btnSeleccionarEspecieReservas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspecieReservas4ActionPerformed

        buscarReservas();
    }//GEN-LAST:event_btnSeleccionarEspecieReservas4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarEspecieReservas4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable tablaReservas;
    public static javax.swing.JTextField txfBuscarConsultarReservas;
    // End of variables declaration//GEN-END:variables

    public static SeleccionarReserva ObtenerInstancia() {
        if (instance == null) {
            instance = new SeleccionarReserva();
        }
        return instance;
    }

    public void buscarReservas() {

        try {

            if (txfBuscarConsultarReservas.getText().trim().length() == 0) {

                JOptionPane.showMessageDialog(null, "Ingrese una cédula o un código de reserva, por favor.");

            } else {

                DefaultTableModel modelo;

                if (txfBuscarConsultarReservas.getText().trim().contains("-")) {

                    modelo = rDao.mostrarCodigosReservasNIT(txfBuscarConsultarReservas.getText().trim());

                } else {

                    modelo = rDao.mostrarCodigosReservas(txfBuscarConsultarReservas.getText().trim());

                }
                TableColumnModel column = tablaReservas.getColumnModel();
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tablaReservas.setModel(modelo);
                tcr.setHorizontalAlignment(SwingConstants.LEFT);
                column.getColumn(1).setPreferredWidth(200);
            }

        } catch (Exception e) {

        }

    }

    public void seleccionarReserva() {

        try {

            String codigo = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0).toString();
            ResultSet rs;
            rs = rDao.buscarReserva(codigo);

            if (rs.next()) {

                mostrarEspeciesReservadas();
                calcularTotalSalidas();
                dispose();

            }

        } catch (SQLException ex) {

        }

    }

    public void mostrarEspeciesReservadas() {

        try {

            DefaultTableModel modelo;
            String codigo_reserva = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0).toString();
            modelo = rDao.mostrarReservadas(codigo_reserva);
            TableColumnModel column = VistaSGI.tablaSalidas.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            VistaSGI.tablaSalidas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            column.getColumn(1).setPreferredWidth(200);

        } catch (Exception e) {

        }

    }

    public void calcularTotalSalidas() {

        int total = 0;
        int acumulador = 0;

        if (VistaSGI.tablaSalidas.getRowCount() > 0) {

            for (int i = 0; i < VistaSGI.tablaSalidas.getRowCount(); i++) {

                acumulador = Integer.parseInt(VistaSGI.tablaSalidas.getValueAt(i, 5).toString()) * Integer.parseInt(VistaSGI.tablaSalidas.getValueAt(i, 6).toString());
                total += acumulador;

            }

            VistaSGI.lblTotalSalidas.setText(Integer.toString(total));

        } else {

            VistaSGI.lblTotalSalidas.setText("0");

        }

    }

}
