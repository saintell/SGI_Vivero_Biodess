package Vista;

import DAO.DetalleIngresoDAO;
import DAO.DetalleSalidaDAO;
import DAO.EspeciesDAO;
import DAO.IngresoDAO;
import DAO.SalidasDAO;
import Modelo.DetalleSalida_;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class InfoSalida extends javax.swing.JFrame {

    private static InfoSalida instance = new InfoSalida();
    private SalidasDAO sDao = new SalidasDAO();
    private DetalleSalidaDAO dsDao = new DetalleSalidaDAO();
    private DetalleIngresoDAO dDao = new DetalleIngresoDAO();
    private EspeciesDAO eDao = new EspeciesDAO();
    private IngresoDAO iDao = new IngresoDAO();
    private SeleccionarEspecie ventanaEspeciesReservas = SeleccionarEspecie.ObtenerInstancia();
    private ResultSet rs;
    private String nombre_comun = "";
    private String nombre_cientifico = "";
    private String tamano = "";
    private String rango = "";
    private int cantidadDuplicada = 0;
    private int pedidasDuplicada = 0;

    private InfoSalida() {
        initComponents();
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura2.png")).getImage();
        super.setIconImage(icon);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                buscarSalida();
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

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                buscarSalida();
            }

            @Override
            public void windowActivated(WindowEvent e) {
                buscarSalida();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        InfoSalidaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txfCodigoSalida = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txfDestino = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txfPredio = new javax.swing.JTextField();
        txfSoporte = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        txfConductor = new javax.swing.JTextField();
        txfCedulaConductor = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jScrollBar = new javax.swing.JScrollBar();
        jLabel115 = new javax.swing.JLabel();
        txfCelularConductor = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        txfPlaca = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        txfCliente = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        txfIdentificacion = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        txfCelularCliente = new javax.swing.JTextField();
        btnQuitar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojo.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setNextFocusableComponent(txfDestino);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzul.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzul.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        InfoSalidaPanel.setBackground(new java.awt.Color(255, 255, 255));
        InfoSalidaPanel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Información de la salida:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("N°");

        txfCodigoSalida.setEditable(false);
        txfCodigoSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCodigoSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCodigoSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCodigoSalidaKeyTyped(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel112.setText("Soporte:");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel110.setText("Municipio/Vereda:");

        txfDestino.setEditable(false);
        txfDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDestinoActionPerformed(evt);
            }
        });
        txfDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfDestinoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfDestinoKeyTyped(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel113.setText("Predio:");

        txfPredio.setEditable(false);
        txfPredio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPredio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPredio.setNextFocusableComponent(txfPlaca);
        txfPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPredioActionPerformed(evt);
            }
        });
        txfPredio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPredioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPredioKeyTyped(evt);
            }
        });

        txfSoporte.setEditable(false);
        txfSoporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfSoporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSoporteActionPerformed(evt);
            }
        });
        txfSoporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfSoporteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfSoporteKeyTyped(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel114.setText("Conductor:");

        txfConductor.setEditable(false);
        txfConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfConductorActionPerformed(evt);
            }
        });
        txfConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfConductorKeyTyped(evt);
            }
        });

        txfCedulaConductor.setEditable(false);
        txfCedulaConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCedulaConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCedulaConductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txfCedulaConductorMouseEntered(evt);
            }
        });
        txfCedulaConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCedulaConductorActionPerformed(evt);
            }
        });
        txfCedulaConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCedulaConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCedulaConductorKeyTyped(evt);
            }
        });

        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel138.setText("C.C:");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel115.setText("Celular:");

        txfCelularConductor.setEditable(false);
        txfCelularConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelularConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCelularConductorActionPerformed(evt);
            }
        });
        txfCelularConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelularConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularConductorKeyTyped(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel116.setText("Placa:");

        txfPlaca.setEditable(false);
        txfPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlaca.setNextFocusableComponent(btnAgregar);
        txfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPlacaActionPerformed(evt);
            }
        });
        txfPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPlacaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPlacaKeyTyped(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel117.setText("Cliente:");

        txfCliente.setEditable(false);
        txfCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfClienteActionPerformed(evt);
            }
        });
        txfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfClienteKeyTyped(evt);
            }
        });

        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel139.setText("Identificación:");

        txfIdentificacion.setEditable(false);
        txfIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfIdentificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txfIdentificacionMouseEntered(evt);
            }
        });
        txfIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdentificacionActionPerformed(evt);
            }
        });
        txfIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfIdentificacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdentificacionKeyTyped(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel140.setText("Celular:");

        txfCelularCliente.setEditable(false);
        txfCelularCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelularCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txfCelularClienteMouseEntered(evt);
            }
        });
        txfCelularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCelularClienteActionPerformed(evt);
            }
        });
        txfCelularCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelularClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularClienteKeyTyped(evt);
            }
        });

        btnQuitar.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnQuitar.setBorderPainted(false);
        btnQuitar.setContentAreaFilled(false);
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setNextFocusableComponent(btnEditar);
        btnQuitar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar1.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar2.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Código", "Nombre Común", "Nombre Científico", "Tamaño", "Rango", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSalidasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaSalidasMouseReleased(evt);
            }
        });
        tablaSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaSalidasKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tablaSalidas);

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusable(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout InfoSalidaPanelLayout = new javax.swing.GroupLayout(InfoSalidaPanel);
        InfoSalidaPanel.setLayout(InfoSalidaPanelLayout);
        InfoSalidaPanelLayout.setHorizontalGroup(
            InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel114)
                                        .addComponent(txfConductor)
                                        .addComponent(jLabel117)
                                        .addComponent(txfCliente)
                                        .addComponent(txfSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel112))
                                .addGap(33, 33, 33)
                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txfCedulaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel138)
                                            .addComponent(txfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel139))
                                        .addGap(30, 30, 30)
                                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel140, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                                                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txfCelularConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel115))
                                                        .addGap(32, 32, 32))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                                                        .addComponent(txfCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30)))
                                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel116))
                                                        .addGap(30, 30, 30))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel110)
                                            .addComponent(txfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel113)
                                            .addComponent(txfPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(10, 10, 10)
                                .addComponent(txfCodigoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))))
                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
        );
        InfoSalidaPanelLayout.setVerticalGroup(
            InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfCodigoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel18))))
                        .addGap(28, 28, 28)
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel112)
                                .addGap(6, 6, 6)
                                .addComponent(txfSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel110)
                                    .addGap(5, 5, 5)
                                    .addComponent(txfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel113)
                                    .addGap(5, 5, 5)
                                    .addComponent(txfPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel114)
                                    .addGap(5, 5, 5)
                                    .addComponent(txfConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel115)
                                    .addGap(5, 5, 5)
                                    .addComponent(txfCelularConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel116)
                                    .addGap(5, 5, 5)
                                    .addComponent(txfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel138)
                                .addGap(5, 5, 5)
                                .addComponent(txfCedulaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel117)
                                        .addGap(5, 5, 5)
                                        .addComponent(txfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel140)
                                        .addGap(5, 5, 5)
                                        .addComponent(txfCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel139)
                                        .addGap(5, 5, 5)
                                        .addComponent(txfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(636, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(InfoSalidaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar la salida? Se eliminará completamente.", "Confirmación", JOptionPane.YES_NO_OPTION);
        String codigo_salida = txfCodigoSalida.getText().trim();

        if (resultado == 0) {

            for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

                dDao.sumar(Integer.parseInt(tablaSalidas.getValueAt(i, 1).toString()), Integer.parseInt(tablaSalidas.getValueAt(i, 6).toString()), tablaSalidas.getValueAt(i, 4).toString(), tablaSalidas.getValueAt(i, 5).toString());
            }

            if (dsDao.eliminarDetalle(codigo_salida)) {

                if (sDao.eliminarSalida(codigo_salida)) {
                    JOptionPane.showMessageDialog(null, "Salida eliminada correctamente.");
                    reiniciar();
                    limpiarTablaConsultarSalidas();
                    limpiarTablaInventario();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar la salida, ha ocurrido un error.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar la salida, ha ocurrido un error.");

            }

        } else {

        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txfCodigoSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCodigoSalidaKeyTyped

        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c)) {
            evt.consume();
        }

        if (txfCodigoSalida.getText().length() >= 4) {

            evt.consume();

        }
    }//GEN-LAST:event_txfCodigoSalidaKeyTyped

    private void txfDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDestinoActionPerformed

    }//GEN-LAST:event_txfDestinoActionPerformed

    private void txfDestinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDestinoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDestinoKeyReleased

    private void txfDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDestinoKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }
        if (Character.isDigit(c)) {
            evt.consume();
        }

        if (txfDestino.getText().length() > 20) {

            evt.consume();

        }

    }//GEN-LAST:event_txfDestinoKeyTyped

    private void txfPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPredioActionPerformed

    }//GEN-LAST:event_txfPredioActionPerformed

    private void txfPredioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPredioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPredioKeyReleased

    private void txfPredioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPredioKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }
        if (Character.isDigit(c)) {
            evt.consume();
        }

        if (txfPredio.getText().length() > 20) {

            evt.consume();

        }
    }//GEN-LAST:event_txfPredioKeyTyped

    private void txfSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSoporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSoporteActionPerformed

    private void txfSoporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSoporteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSoporteKeyReleased

    private void txfSoporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSoporteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSoporteKeyTyped

    private void txfConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfConductorActionPerformed

    private void txfConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfConductorKeyReleased

    private void txfConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfConductorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfConductorKeyTyped

    private void txfCedulaConductorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCedulaConductorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaConductorMouseEntered

    private void txfCedulaConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCedulaConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaConductorActionPerformed

    private void txfCedulaConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaConductorKeyReleased

    private void txfCedulaConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaConductorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaConductorKeyTyped

    private void txfCelularConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCelularConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularConductorActionPerformed

    private void txfCelularConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularConductorKeyReleased

    private void txfCelularConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularConductorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularConductorKeyTyped

    private void txfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPlacaActionPerformed

    private void txfPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPlacaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPlacaKeyReleased

    private void txfPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPlacaKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txfPlaca.getText().length() > 6) {

            evt.consume();

        }
    }//GEN-LAST:event_txfPlacaKeyTyped

    private void txfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfClienteActionPerformed

    private void txfClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfClienteKeyReleased

    private void txfClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfClienteKeyTyped

    private void txfIdentificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfIdentificacionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionMouseEntered

    private void txfIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionActionPerformed

    private void txfIdentificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionKeyReleased

    private void txfIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionKeyTyped

    private void txfCelularClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCelularClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteMouseEntered

    private void txfCelularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCelularClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteActionPerformed

    private void txfCelularClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteKeyReleased

    private void txfCelularClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteKeyTyped

    private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked

    }//GEN-LAST:event_tablaSalidasMouseClicked

    private void tablaSalidasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaSalidasMouseReleased

    private void tablaSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaSalidasKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        txfDestino.setEditable(true);
        txfPredio.setEditable(true);
        txfPlaca.setEditable(true);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        txfDestino.requestFocus(true);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int codigo_salida = VistaSGI.identificador;
        String destino = txfDestino.getText().trim();
        String predio = txfPredio.getText().trim();
        String placa = txfPlaca.getText().trim();

        if (sDao.actualizar(codigo_salida, destino, predio, placa)) {

            JOptionPane.showMessageDialog(null, "Salida actualizada correctamente.");
            btnGuardar.setEnabled(false);
            btnEditar.setEnabled(true);
            txfDestino.setEditable(false);
            txfPredio.setEditable(false);
            txfPlaca.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar, verifique su información.");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        ventanaEspeciesReservas.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed

        if (tablaSalidas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una especie primero.");
        } else if (tablaSalidas.getRowCount() == 1) {
            JOptionPane.showMessageDialog(null, "La salida no puede quedar sin material vegetal, registre algo más para borrar la fila seleccionada");
        } else {
            quitarEspecie();
        }


    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel InfoSalidaPanel;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JLabel lblFecha;
    public static javax.swing.JTable tablaSalidas;
    public static javax.swing.JTextField txfCedulaConductor;
    public static javax.swing.JTextField txfCelularCliente;
    public static javax.swing.JTextField txfCelularConductor;
    public static javax.swing.JTextField txfCliente;
    public static javax.swing.JTextField txfCodigoSalida;
    public static javax.swing.JTextField txfConductor;
    public static javax.swing.JTextField txfDestino;
    public static javax.swing.JTextField txfIdentificacion;
    public static javax.swing.JTextField txfPlaca;
    public static javax.swing.JTextField txfPredio;
    public static javax.swing.JTextField txfSoporte;
    // End of variables declaration//GEN-END:variables

    public void reiniciarSeleccionarEspecie() {

        ventanaEspeciesReservas.tamanoCombo.setSelectedIndex(0);
        ventanaEspeciesReservas.rangoCombo.setSelectedIndex(0);
        ventanaEspeciesReservas.txfBuscarEsp.setText(null);
        limpiarTablaInventario();
        btnAgregar.requestFocus(true);
    }

    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaSalidas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void limpiarTablaConsultarSalidas() {
        DefaultTableModel modelo = (DefaultTableModel) VistaSGI.tablaConsultarSalidas.getModel();
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

    public void buscarSalida() {
        try {
            int codigo_salida = VistaSGI.identificador;
            rs = sDao.buscarSalidaPorCodigo(codigo_salida);

            if (rs.next()) {
                txfCodigoSalida.setText(Integer.toString(codigo_salida));
                txfSoporte.setText(rs.getString("motivo"));
                txfDestino.setText(rs.getString("destino"));
                txfPredio.setText(rs.getString("predio"));

                txfConductor.setText(rs.getString("nombreco") + " " + rs.getString("apellidoco"));
                txfCedulaConductor.setText(rs.getString("id_conductor"));

                if (rs.getLong("celularco") == 0) {

                } else {
                    txfCelularConductor.setText(rs.getString("celularco"));
                }
                txfPlaca.setText(rs.getString("placa"));
                txfCliente.setText(rs.getString("nombre"));
                txfIdentificacion.setText(rs.getString("id_cliente"));
                txfCelularCliente.setText(rs.getString("celular"));
                lblFecha.setText(rs.getString("fecha"));

            }

            mostrarProductos(codigo_salida);
            btnAgregar.requestFocus(true);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void mostrarProductos(int codigo_salida) {

        try {

            DefaultTableModel modelo;
            modelo = dsDao.buscarDetalleSalidaConIngreso(codigo_salida);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaSalidas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            TableColumnModel column = tablaSalidas.getColumnModel();
        } catch (Exception e) {

        }

    }

    public void quitarEspecie() {

        if (tablaSalidas.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(null, "Seleccione una especie de la tabla, por favor.");
        } else {

            String codigo_salida = tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 0).toString();
            int codigo_ingreso = Integer.parseInt(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 1).toString());
            int cantidad = Integer.parseInt(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 6).toString());
            String tamaño_bolsa = tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 4).toString();
            String rango = tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 5).toString();
            DefaultTableModel modelo = (DefaultTableModel) tablaSalidas.getModel();
            modelo.removeRow(tablaSalidas.getSelectedRow());

            if (dsDao.eliminar(codigo_ingreso, codigo_salida, cantidad)) {
                if (dDao.sumar(codigo_ingreso, cantidad, tamaño_bolsa, rango)) {

                    limpiarTablaInventario();

//                    if (txfCodigoEspcSalidas.getText().trim().length() != 0 && !txfCodigoEspcSalidas.isEditable()) {
//
//                        buscarEspeciesSalidas();
//                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Hubo un error.");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error.");

            }

            buscarSalida();

        }

    }

    public void seleccionarEspecieSalidas(String codigo_salida, String codigo_ingreso, String nombre_vulgar, String nombre_cientifico, String tamaño, String rango, String pedido, String cantidad_) {

        try {
            String datos[] = {codigo_salida, codigo_ingreso, nombre_vulgar, nombre_cientifico, tamaño, rango, pedido, cantidad_};
            DefaultTableModel modelo = (DefaultTableModel) tablaSalidas.getModel();
            modelo.addRow(datos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void restar(int codigo, int cantidad, String tamaño, String rango) {

        if (dDao.restar(codigo, cantidad, tamaño, rango)) {

        } else {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, inténtelo de nuevo.");
        }

    }

    public boolean buscarEnLaTabla(int codigo) {

        int filas = tablaSalidas.getRowCount();

        for (int i = 0; i < filas; i++) {

            if (Integer.parseInt(tablaSalidas.getValueAt(i, 1).toString()) == codigo) {

                cantidadDuplicada = Integer.parseInt(tablaSalidas.getValueAt(i, 7).toString());

                if (dsDao.eliminar(codigo, tablaSalidas.getValueAt(i, 0).toString(), cantidadDuplicada)) {
                    if (dDao.sumar(codigo, cantidadDuplicada, "", "")) {

                        limpiarTablaInventario();

                    } else {

                        JOptionPane.showMessageDialog(null, "Hubo un error.");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error.");

                }

                return true;
            }
        }
        buscarSalida();
        return false;
    }

    public void reiniciar() {

        txfCodigoSalida.setText(null);
        txfSoporte.setText(null);
        txfDestino.setText(null);
        txfPredio.setText(null);
        txfConductor.setText(null);
        txfCedulaConductor.setText(null);
        txfCelularConductor.setText(null);
        txfPlaca.setText(null);
        txfCliente.setText(null);
        txfIdentificacion.setText(null);
        txfCelularCliente.setText(null);
        limpiarTabla();
        txfDestino.setEditable(false);
        txfPredio.setEditable(false);
        txfPlaca.setEditable(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnAgregar.requestFocus(true);
    }

    public static InfoSalida ObtenerInstancia() {
        if (instance == null) {
            instance = new InfoSalida();
        }
        return instance;
    }

}
