package Vista;

import DAO.DetalleIngresoDAO;
import DAO.DetalleSalidaDAO;
import DAO.EspeciesDAO;
import DAO.IngresoDAO;
import DAO.ReservasDAO;
import DAO.SalidasDAO;
import Modelo.DetalleSalida_;
import Modelo.Reserva_;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class SeleccionarEspecie extends javax.swing.JFrame implements FocusListener, WindowListener {

    private static SeleccionarEspecie instance = new SeleccionarEspecie();
    private SalidasDAO sDao = new SalidasDAO();
    private EspeciesDAO eDao = new EspeciesDAO();
    private ReservasDAO rDao = new ReservasDAO();
    private DetalleIngresoDAO dDao = new DetalleIngresoDAO();
    private DetalleSalidaDAO dsDao = new DetalleSalidaDAO();
    private IngresoDAO iDao = new IngresoDAO();
    private int cantidad = 0;
    private int codigoIngreso = 0;
    private int cantidadDuplicada = 0;

    private SeleccionarEspecie() {
        initComponents();
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura2.png")).getImage();
        super.setIconImage(icon);
        addFocusListener(this);
        addWindowListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarE = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        txfBuscarEsp = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaEspecies = new javax.swing.JTable();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        rangoCombo = new javax.swing.JComboBox<>();
        tamanoCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BUSQUE Y SELECCIONE LA ESPECIE:");

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

        txfBuscarEsp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfBuscarEsp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarEsp.setToolTipText("");
        txfBuscarEsp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txfBuscarEsp.setNextFocusableComponent(tamanoCombo);
        txfBuscarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarEspActionPerformed(evt);
            }
        });
        txfBuscarEsp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarEspKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarEspKeyTyped(evt);
            }
        });

        tablaEspecies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEspecies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEspeciesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaEspeciesMouseReleased(evt);
            }
        });
        tablaEspecies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaEspeciesKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tablaEspecies);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Tamaño de Bolsa:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 102));
        jLabel66.setText("Rango:");

        rangoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rangoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< 20 cm", "20 - 40 cm", "40 - 60 cm" }));
        rangoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rangoComboItemStateChanged(evt);
            }
        });

        tamanoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tamanoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4x8", "18x34", "25x35" }));
        tamanoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamanoComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(664, 664, 664)
                .addComponent(btnEliminarE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel65)
                .addGap(41, 41, 41)
                .addComponent(jLabel66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel64))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBuscarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tamanoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(rangoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnEliminarE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tamanoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rangoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel64)
                .addGap(4, 4, 4)
                .addComponent(txfBuscarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnEliminarEActionPerformed

    private void txfBuscarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarEspActionPerformed

    private void txfBuscarEspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarEspKeyReleased

        if (txfBuscarEsp.getText().length() == 0) {

            limpiarTablaEspecies();

        } else {

            buscarEspecie();
        }
    }//GEN-LAST:event_txfBuscarEspKeyReleased

    private void txfBuscarEspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarEspKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }


    }//GEN-LAST:event_txfBuscarEspKeyTyped

    private void tablaEspeciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspeciesMouseClicked


    }//GEN-LAST:event_tablaEspeciesMouseClicked

    private void tablaEspeciesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspeciesMouseReleased

        if (tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {
            try {

                if (evt.getClickCount() == 1) {

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad:"));
                    codigoIngreso = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString());
                    String nombre_vulgar = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 1).toString();
                    String nombre_cientifico = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 2).toString();
                    String costo = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 6).toString();
                    String tamaño = tamanoCombo.getSelectedItem().toString();
                    String rango = rangoCombo.getSelectedItem().toString();

                    if (cantidad < 1) {

                        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero.");

                    } else if (!VistaSGI.Reservas.isShowing() && cantidad > Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 5).toString())) {

                        JOptionPane.showMessageDialog(null, "La cantidad no debe superar al número de disponibles.");

                    } else {

                        reemplazarDuplicado(codigoIngreso, tamaño, rango);

                        if (VistaSGI.Reservar.isShowing()) {

                            seleccionarEspecie();

                        } else if (VistaSGI.ConsultarReserva.isShowing()) {

                            seleccionarConsultarReserva();

                        } else if (VistaSGI.Salidas.isShowing() && VistaSGI.VentaPanel.isShowing()) {

                            if (cantidad > obtenerCantidad(codigoIngreso)) {

                                JOptionPane.showMessageDialog(null, "La cantidad no debe superar al número de disponibles.");

                            } else {
                                seleccionarEspecieSalidas(Integer.toString(codigoIngreso), nombre_vulgar, nombre_cientifico, rango, tamaño, Integer.toString(cantidad), costo);
                                restar(codigoIngreso, cantidad, tamaño, rango);
                            }
                        } else if (VistaSGI.Salidas.isShowing() && VistaSGI.PerdidaPanel.isShowing()) {

                            if (cantidad > obtenerCantidad(codigoIngreso)) {
                                JOptionPane.showMessageDialog(null, "La cantidad no debe superar al número de disponibles.");

                            } else {
                                seleccionarEspeciePerdida(Integer.toString(codigoIngreso), nombre_vulgar, nombre_cientifico, rango, tamaño, Integer.toString(cantidad), costo);
                                restar(codigoIngreso, cantidad, tamaño, rango);
                            }
                        } else if (VistaSGI.Salidas.isShowing() && VistaSGI.TrasplantadoPanel.isShowing()) {

                            if (cantidad > obtenerCantidad(codigoIngreso)) {
                                JOptionPane.showMessageDialog(null, "La cantidad no debe superar al número de disponibles.");

                            } else {
                                seleccionarEspecieTrasplantado();
                            }
                        } else {
                            agregarEspecieInfoSalida(Integer.toString(codigoIngreso), nombre_vulgar, nombre_cientifico, tamaño, rango);
                        }
                    }
                }
            } catch (NumberFormatException nfe) {

                System.out.println(nfe.getMessage());
                if (cantidad == 0) {

                } else {
                    JOptionPane.showMessageDialog(null, "Digite solo números, por favor.");
                }

            }
        }
    }//GEN-LAST:event_tablaEspeciesMouseReleased

    private void tablaEspeciesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEspeciesKeyReleased


    }//GEN-LAST:event_tablaEspeciesKeyReleased

    private void rangoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rangoComboItemStateChanged

        try {

            if (rangoCombo.getSelectedIndex() == -1) {

                txfBuscarEsp.setEnabled(false);
                txfBuscarEsp.setText(null);
                limpiarTablaEspecies();

            } else if (rangoCombo.getSelectedIndex() != -1 && txfBuscarEsp.getText().length() != 0) {

                txfBuscarEsp.setEnabled(true);
                buscarEspecie();

            } else if (rangoCombo.getSelectedIndex() != -1) {

                txfBuscarEsp.setEnabled(true);

            }
        } catch (NullPointerException npe) {

        }

    }//GEN-LAST:event_rangoComboItemStateChanged

    private void tamanoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamanoComboItemStateChanged

        if (tamanoCombo.getSelectedIndex() == 0) {

            rangoCombo.removeAllItems();
            rangoCombo.addItem("< 20 cm");
            rangoCombo.addItem("20 - 40 cm");
            rangoCombo.addItem("40 - 60 cm");
            rangoCombo.setSelectedIndex(0);

        } else if (tamanoCombo.getSelectedIndex() == 1) {

            rangoCombo.removeAllItems();
            rangoCombo.addItem("< 60 cm");
            rangoCombo.addItem("60 - 100 cm");
            rangoCombo.addItem("100 - 150 cm");
            rangoCombo.addItem("> 150 cm");
            rangoCombo.setSelectedIndex(0);

        } else if (tamanoCombo.getSelectedIndex() == 2) {

            rangoCombo.removeAllItems();
            rangoCombo.addItem("100 - 150 cm");
            rangoCombo.addItem("> 150 cm");
            rangoCombo.setSelectedIndex(0);

        }
    }//GEN-LAST:event_tamanoComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JComboBox<String> rangoCombo;
    public static javax.swing.JTable tablaEspecies;
    public static javax.swing.JComboBox<String> tamanoCombo;
    public static javax.swing.JTextField txfBuscarEsp;
    // End of variables declaration//GEN-END:variables

    public boolean reemplazarDuplicado(int codigo, String tamaño_bolsa, String rango) {

        JTable tabla = null;

        if (VistaSGI.Reservar.isShowing()) {
            tabla = VistaSGI.tablaReservas;
            System.out.println("Reserva");
        } else if (VistaSGI.ConsultarReserva.isShowing()) {
            tabla = VistaSGI.tablaConsultarReservas;
            System.out.println("Consultar Reserva");
        } else if (VistaSGI.Salidas.isShowing() && !InfoSalida.InfoSalidaPanel.isShowing()) {
            tabla = VistaSGI.tablaSalidas;
            System.out.println("Salida");
        } else {
            tabla = InfoSalida.tablaSalidas;
            System.out.println("InfoSalida");
        }

        int filas = tabla.getRowCount();
        int cantidad_duplicada = 0;
        int codigo_ingreso = 0;
        int bandera = 0;

        for (int i = 0; i < filas; i++) {

            if (InfoSalida.InfoSalidaPanel.isShowing()) {

                codigo_ingreso = Integer.parseInt(tabla.getValueAt(i, 1).toString());
                bandera = 1;
            } else {

                codigo_ingreso = Integer.parseInt(tabla.getValueAt(i, 0).toString());
                bandera = 0;
            }

            if (codigo_ingreso == codigo) {

                if (bandera == 1) {
                    cantidad_duplicada = Integer.parseInt(tabla.getValueAt(i, 6).toString());
                } else {
                    cantidad_duplicada = Integer.parseInt(tabla.getValueAt(i, 5).toString());
                }

                if (!VistaSGI.Reservas.isShowing()) {

                    if (dDao.sumar(codigoIngreso, cantidad_duplicada, tamaño_bolsa, rango)) {
                        cantidad += cantidad_duplicada;
                        limpiarTablaInventario();
                        if (VistaSGI.Salidas.isShowing() && !InfoSalida.InfoSalidaPanel.isShowing()) {
                            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                            modelo.removeRow(i);
                        } else {
                            System.out.println("Entra");
                            eliminarDetalleSalida(InfoSalida.txfCodigoSalida.getText().trim(), cantidad_duplicada);
                        }

                        return true;
                    } else {
                        System.out.println("No se sumó.");
                    }
                } else if (VistaSGI.ConsultarReserva.isShowing()) {
                    cantidad += cantidad_duplicada;
                    limpiarTablaInventario();
                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                    modelo.removeRow(i);
                    eliminarReservaConsultar(cantidad_duplicada, codigo_ingreso, tamaño_bolsa, rango);
                    System.out.println("Se eliminó la fila: " + i);
                    break;
                } else {
                    cantidad += cantidad_duplicada;
                    limpiarTablaInventario();
                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                    modelo.removeRow(i);
                    eliminarReserva(cantidad_duplicada, codigo_ingreso, tamaño_bolsa, rango);
                    break;

                }
            } else {
                System.out.println("No encontré nada.");
            }
        }

        if (InfoSalida.InfoSalidaPanel.isShowing()) {
            buscarSalida();
        }

        return false;
    }

    public void limpiarTablaEspecies() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEspecies.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void limpiarTablaInventario() {
        DefaultTableModel modelo = (DefaultTableModel) VistaSGI.tablaInventario.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public static String fechaActual() {
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }

    public void restar(int codigo, int cantidad, String tamaño, String rango) {

        if (dDao.restar(codigo, cantidad, tamaño, rango)) {

            buscarEspecie();

        } else {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, inténtelo de nuevo.");
        }

    }

    public void seleccionarEspecie() {

        try {
            int codigo_reserva = Integer.parseInt(VistaSGI.lblNumeroReserva.getText());
            String id_cliente = VistaSGI.txfIdentificacionReservas.getText();
            int codigo_ingreso = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString());
            String tamaño_bolsa = tamanoCombo.getSelectedItem().toString();
            String rango = rangoCombo.getSelectedItem().toString();
            int costo = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 6).toString()) * cantidad;
            String fechaString = fechaActual();
            java.sql.Date fechaApertura = null;
            SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            fechaApertura = new java.sql.Date(sdf.parse(fechaString).getTime());
            Reserva_ r = new Reserva_(codigo_reserva, id_cliente, codigo_ingreso, tamaño_bolsa, rango, cantidad, costo, fechaApertura, null);

            if (rDao.CrearReserva(r)) {

                if (rDao.reservar(codigo_ingreso, cantidad, tamaño_bolsa, rango)) {
                    mostrarEspeciesReservadas();
                    buscarEspecie();
                    calcularTotal();
                } else {

                    JOptionPane.showMessageDialog(null, "Hubo un error. Verifique la información del cliente y que este esté registrado.");

                }
            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error. Verifique la información del cliente y que este esté registrado.");

            }
        } catch (ParseException ex) {
            Logger.getLogger(SeleccionarEspecie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarReserva(int cantidad_duplicada, int codigo_ingreso, String tamaño_bolsa, String rango) {

        int codigo_reserva = Integer.parseInt(VistaSGI.lblNumeroReserva.getText().trim());

        if (rDao.deshacerReserva(codigo_ingreso, cantidad_duplicada, tamaño_bolsa, rango)) {

            if (rDao.eliminarReserva(codigo_reserva, codigo_ingreso, cantidad_duplicada, tamaño_bolsa, rango)) {
                System.out.println("Se eliminó la reserva");
                mostrarEspeciesReservadas();
            } else {
                System.out.println("Ha ocurrido un error, contacte a los desarrolladores.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, contacte a los desarrolladores.");
        }
    }
    
    public void eliminarReservaConsultar(int cantidad_duplicada, int codigo_ingreso, String tamaño_bolsa, String rango) {

        int codigo_reserva = Integer.parseInt(VistaSGI.txfCodigoReserva.getText().trim());
        System.out.println("CÓDIGO DE RESERVA PARA ELIMINAR: " + codigo_reserva);

        if (rDao.deshacerReserva(codigo_ingreso, cantidad_duplicada, tamaño_bolsa, rango)) {

            if (rDao.eliminarReserva(codigo_reserva, codigo_ingreso, cantidad_duplicada, tamaño_bolsa, rango)) {
                System.out.println("Se eliminó la reserva");
                mostrarEspeciesConsultarReservadas();
            } else {
                System.out.println("Ha ocurrido un error, contacte a los desarrolladores.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, contacte a los desarrolladores.");
        }
    }

    public void eliminarDetalleSalida(String codigo_salida, int cantidad_duplicada) {

        if (dsDao.eliminar(codigoIngreso, codigo_salida, cantidad_duplicada)) {
            System.out.println(codigoIngreso + " Ingreso");
        } else {
            JOptionPane.showMessageDialog(null, "ERROR (Seleccionar Especie - Info Salida): No se devolvió al inventario.");
        }
    }

    public void seleccionarConsultarReserva() {

        try {
            int codigo_reserva = Integer.parseInt(VistaSGI.txfCodigoReserva.getText());
            String id_cliente = VistaSGI.txfIdentificacionConsultarReservas.getText();
            int codigo_ingreso = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString());
            String tamaño_bolsa = tamanoCombo.getSelectedItem().toString();
            String rango = rangoCombo.getSelectedItem().toString();
            int costo = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 6).toString()) * cantidad;
            String fechaString = fechaActual();
            java.sql.Date fechaApertura = null;
            SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            fechaApertura = new java.sql.Date(sdf.parse(fechaString).getTime());
            Reserva_ r = new Reserva_(codigo_reserva, id_cliente, codigo_ingreso, tamaño_bolsa, rango, cantidad, costo, fechaApertura, null);

            if (rDao.CrearReserva(r)) {

                if (rDao.reservar(codigo_ingreso, cantidad, tamaño_bolsa, rango)) {
                    mostrarEspeciesConsultarReservadas();
                    buscarEspecie();
                    calcularTotalConsultarReservas();
                } else {

                    JOptionPane.showMessageDialog(null, "Hubo un error. Verifique la información del cliente y que este esté registrado.");

                }
            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error. Verifique la información del cliente y que este esté registrado.");

            }
        } catch (ParseException ex) {
            System.out.println(ex.getMessage() + " Aquí fue");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void seleccionarEspecieSalidas(String codigo, String nombre_vulgar, String nombre_cientifico, String rango, String tamaño, String cantidad_, String costo) {

        try {
            String especie = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 1).toString();
            VistaSGI.txfEspecieSalidas.setText(especie);
            VistaSGI.txfCantidadSalidas.setText(Integer.toString(cantidad));
            String datos[] = {codigo, nombre_vulgar, nombre_cientifico, rango, tamaño, cantidad_, costo};
            DefaultTableModel modelo = (DefaultTableModel) VistaSGI.tablaSalidas.getModel();
            modelo.addRow(datos);
            calcularTotalSalidas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void seleccionarEspeciePerdida(String codigo, String nombre_vulgar, String nombre_cientifico, String rango, String tamaño, String cantidad_, String costo) {

        String especie = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 1).toString();
        VistaSGI.txfEspeciePerdida.setText(especie);
        VistaSGI.txfCantidadPerdida.setText(Integer.toString(cantidad));
        String datos[] = {codigo, nombre_vulgar, nombre_cientifico, rango, tamaño, cantidad_, costo};
        DefaultTableModel modelo = (DefaultTableModel) VistaSGI.tablaSalidas.getModel();
        modelo.addRow(datos);
        calcularTotalSalidas();

    }

    public void seleccionarEspecieTrasplantado() {

        String especie = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 1).toString();
        String tamaño = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 3).toString();
        String rango = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 4).toString();
        VistaSGI.txfEspecieTrasplantado.setText(tamaño + ", " + "(" + rango + ")" + ", " + especie);

        if (VistaSGI.txfCantidadTrasplantado.getText().length() == 0) {

            VistaSGI.txfCantidadTrasplantado.setText(Integer.toString(cantidad));

            VistaSGI.codigo_Ingreso = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString());
            VistaSGI.codigo_Especie = Integer.parseInt(tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 7).toString());
            VistaSGI.tamañoTrasplantado = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 3).toString();
            VistaSGI.rangoTrasplantado = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 4).toString();

            restar(codigoIngreso, cantidad, tamaño, rango);

            dispose();

        } else {

            JOptionPane.showMessageDialog(null, "Registre o cancele el trasplantado anterior, antes de realizar otro por favor.");
            dispose();
        }

    }

    public void agregarEspecieInfoSalida(String codigo_ingreso, String nombre_comun, String nombre_cientifico, String tamaño, String rango) {
        try {
            int codigo_salida = Integer.parseInt(InfoSalida.txfCodigoSalida.getText().trim());
            DetalleSalida_ detalle;

            detalle = new DetalleSalida_(codigo_salida, Integer.parseInt(codigo_ingreso), tamaño, cantidad, 0, 0);

            if (dsDao.CrearDetalleSalida(detalle)) {
                seleccionarEspecieInfoSalida(Integer.toString(codigo_salida), codigo_ingreso, nombre_comun, nombre_cientifico, tamaño, rango, cantidad);
                restar(Integer.parseInt(codigo_ingreso), cantidad, tamaño, rango);
                limpiarTablaInventario();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error.");
            }

            buscarSalida();
        } catch (NumberFormatException numberF) {
            JOptionPane.showMessageDialog(null, "ERROR: Cierre esta ventana.");
        }
    }

    public void seleccionarEspecieInfoSalida(String codigo_salida, String codigo_ingreso, String nombre_comun, String nombre_cientifico, String tamaño, String rango, int cantidad) {

        try {
            String datos[] = {codigo_salida, codigo_ingreso, nombre_comun, nombre_cientifico, tamaño, rango, Integer.toString(cantidad)};
            DefaultTableModel modelo = (DefaultTableModel) InfoSalida.tablaSalidas.getModel();
            modelo.addRow(datos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void cancelarTrasplantado() {

        int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que descartar el trasplantado anterior?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (resultado == 0) {

            int cantidad = Integer.parseInt(VistaSGI.txfCantidadTrasplantado.getText());

            if (sDao.cancelarSalida(VistaSGI.codigo_Ingreso, cantidad, VistaSGI.tamañoTrasplantado, VistaSGI.rangoTrasplantado)) {

            } else {

                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            }

            buscarEspecie();
        } else {

        }
    }

    public void buscarEspecie() {

        try {

            DefaultTableModel modelo;
            TableColumnModel column = tablaEspecies.getColumnModel();
            String busca = txfBuscarEsp.getText();
            String tamaño = tamanoCombo.getSelectedItem().toString();
            String rango = rangoCombo.getSelectedItem().toString();
            modelo = eDao.listarEspRes(busca, tamaño, rango);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaEspecies.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            tablaEspecies.getColumnModel().getColumn(1).setCellRenderer(tcr);
            column.getColumn(1).setPreferredWidth(200);
            column.getColumn(2).setPreferredWidth(200);
            column.getColumn(3).setPreferredWidth(150);

        } catch (IllegalArgumentException a) {
        }
    }

    public void mostrarEspeciesReservadas() {

        try {

            DefaultTableModel modelo;
            String codigo_reserva = VistaSGI.lblNumeroReserva.getText();
            modelo = rDao.mostrarReservadas(codigo_reserva);
            TableColumnModel column = VistaSGI.tablaReservas.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            VistaSGI.tablaReservas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            column.getColumn(1).setPreferredWidth(200);

        } catch (Exception e) {

        }

    }

    public void mostrarEspeciesConsultarReservadas() {

        try {

            DefaultTableModel modelo;
            String codigo_reserva = VistaSGI.txfCodigoReserva.getText();
            modelo = rDao.mostrarReservadas(codigo_reserva);
            TableColumnModel column = VistaSGI.tablaConsultarReservas.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            VistaSGI.tablaConsultarReservas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            column.getColumn(1).setPreferredWidth(200);

        } catch (Exception e) {

        }

    }

    public void calcularTotal() {

        int total = 0;
        int acumulador = 0;

        if (VistaSGI.tablaReservas.getRowCount() > 0) {

            for (int i = 0; i < VistaSGI.tablaReservas.getRowCount(); i++) {

                acumulador = Integer.parseInt(VistaSGI.tablaReservas.getValueAt(i, 5).toString()) * Integer.parseInt(VistaSGI.tablaReservas.getValueAt(i, 6).toString());
                total += acumulador;

            }

            VistaSGI.lblTotal.setText(Integer.toString(total));

        } else {

            VistaSGI.lblTotal.setText("0");

        }

    }

    public void calcularTotalConsultarReservas() {

        int total = 0;
        int acumulador = 0;

        if (VistaSGI.tablaConsultarReservas.getRowCount() > 0) {

            for (int i = 0; i < VistaSGI.tablaConsultarReservas.getRowCount(); i++) {

                acumulador = Integer.parseInt(VistaSGI.tablaConsultarReservas.getValueAt(i, 5).toString()) * Integer.parseInt(VistaSGI.tablaConsultarReservas.getValueAt(i, 6).toString());
                total += acumulador;

            }

            VistaSGI.lblTotalConsultarReservas.setText(Integer.toString(total));

        } else {

            VistaSGI.lblTotalConsultarReservas.setText("0");

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

    public void buscarSalida() {
        try {
            int codigo_salida = VistaSGI.identificador;
            ResultSet rs = sDao.buscarSalidaPorCodigo(codigo_salida);

            if (rs.next()) {
                InfoSalida.txfCodigoSalida.setText(Integer.toString(codigo_salida));
                InfoSalida.txfSoporte.setText(rs.getString("motivo"));
                InfoSalida.txfDestino.setText(rs.getString("destino"));
                InfoSalida.txfPredio.setText(rs.getString("predio"));

                InfoSalida.txfConductor.setText(rs.getString("nombreco") + " " + rs.getString("apellidoco"));
                InfoSalida.txfCedulaConductor.setText(rs.getString("id_conductor"));

                if (rs.getLong("celularco") == 0) {

                } else {
                    InfoSalida.txfCelularConductor.setText(rs.getString("celularco"));
                }
                InfoSalida.txfPlaca.setText(rs.getString("placa"));
                InfoSalida.txfCliente.setText(rs.getString("nombre"));
                InfoSalida.txfIdentificacion.setText(rs.getString("id_cliente"));
                InfoSalida.txfCelularCliente.setText(rs.getString("celular"));
                InfoSalida.lblFecha.setText(rs.getString("fecha"));

            }

            mostrarProductosInfoSalida(codigo_salida);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void mostrarProductosInfoSalida(int codigo_salida) {

        try {

            DefaultTableModel modelo;
            modelo = dsDao.buscarDetalleSalidaConIngreso(codigo_salida);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            InfoSalida.tablaSalidas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    public void reiniciar() {

        tamanoCombo.setSelectedIndex(0);
        rangoCombo.setSelectedIndex(0);
        txfBuscarEsp.setText(null);
        limpiarTablaEspecies();

    }

    public int obtenerCantidad(int codigo_ingreso) {

        try {
            ResultSet rs = iDao.obtenerCantidad(codigo_ingreso);

            if (rs.next()) {

                int cantidad = rs.getInt("disponibles");
            }
            return cantidad;
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
            return 0;
        }
    }

    public static SeleccionarEspecie ObtenerInstancia() {
        if (instance == null) {
            instance = new SeleccionarEspecie();
        }
        return instance;
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {

        reiniciar();
        dispose();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        reiniciar();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        reiniciar();
    }

    @Override
    public void windowIconified(WindowEvent e) {
        reiniciar();
        dispose();
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        dispose();
    }

}
