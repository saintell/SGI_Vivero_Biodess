package Vista;

import DAO.ClientesDAO;
import DAO.ProveedoresDAO;
import DAO.ConductoresDAO;
import DAO.DetalleIngresoDAO;
import DAO.DetalleSalidaDAO;
import DAO.EspeciesDAO;
import DAO.IngresoDAO;
import DAO.ReservasDAO;
import DAO.SalidasDAO;
import DAO.UsuariosDAO;
import Modelo.Proveedor_;
import Modelo.Cargo_;
import Modelo.Cliente_;
import Modelo.Conductor_;
import Modelo.DetalleIngreso_;
import Modelo.DetalleSalida_;
import Modelo.Especie_;
import Modelo.Estado_;
import Modelo.Ingreso_;
import Modelo.Salida_;
import Modelo.Usuario_;
import Reportes.GenerarExcel;
import Reportes.GenerarReporte;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * autores: Santiago Andrés Pineda Ramirez; Álvaro José Tobar Mayorquín
 */
public class VistaSGI extends javax.swing.JFrame {

    private Login login;
    private ConductoresDAO cDao = new ConductoresDAO();
    private SalidasDAO sDao = new SalidasDAO();
    private DetalleSalidaDAO dsDao = new DetalleSalidaDAO();
    private ProveedoresDAO pDao = new ProveedoresDAO();
    private UsuariosDAO uDao = new UsuariosDAO();
    private EspeciesDAO eDao = new EspeciesDAO();
    private DetalleIngresoDAO dDao = new DetalleIngresoDAO();
    private IngresoDAO iDao = new IngresoDAO();
    private ReservasDAO rDao = new ReservasDAO();
    private ClientesDAO clDao = new ClientesDAO();
    private boolean estado = true;
    private final ImageIcon iconoMostrar = new ImageIcon("src/main/resources/btnMostrar.png");
    private final ImageIcon iconoOcultar = new ImageIcon("src/main/resources/btnOcultar.png");
    private CodigosReservas ventanaCodigos = CodigosReservas.ObtenerInstancia();
    private SeleccionarProveedor ventanaProveedores = SeleccionarProveedor.ObtenerInstancia();
    private SeleccionarEspecieIngreso ventanaEspecies = SeleccionarEspecieIngreso.ObtenerInstancia();
    private SeleccionarEspecie ventanaEspeciesReservas = SeleccionarEspecie.ObtenerInstancia();
    private SeleccionarReserva ventanaReservas = SeleccionarReserva.ObtenerInstancia();
    private IngresoTrasplantado ventanaTrasplantado = IngresoTrasplantado.ObtenerInstancia();
    private GuardarExcel ventanaExcel = GuardarExcel.ObtenerInstancia();
    private InfoPerdida ventanaInfoPerdida = InfoPerdida.ObtenerInstancia();
    private InfoTrasplantado ventanaInfoTrasplantado = InfoTrasplantado.ObtenerInstancia();
    private InfoSalida ventanaInfoSalida = InfoSalida.ObtenerInstancia();
    public static int cargo;
    public static String tamano;
    public static String rango;
    ResultSet rs;
    public static int codigo_ingresoTrasplantar = 0;
    public static int codigo_Ingreso = 0;
    public static int codigo_Especie = 0;
    public static String codigo_Reserva = " ";
    public static int codigo_Especie_Reservas = 0;
    public static String tamañoTrasplantado = "";
    public static String rangoTrasplantado = "";
    public static int identificador;

    public VistaSGI() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura2.png")).getImage();
        super.setIconImage(icon);

        if (cargo == 1) {

            btn_2.setVisible(false);
            btn_10.setVisible(false);

        }

        lblNumUsuarios.setText(numUsuarios());
        lblNumReservas.setText(numReservas());
        lblNumSalidas.setText(numSalidas(mesActual()));
        mostrarProductosAgotados();
        setColor(btn_1);
        ind_1.setOpaque(true);
        java.util.Date fechaParseada;
        try {
            fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
            fechaDesdeSalida.setDate(fechaParseada);
            fechaHastaSalida.setDate(fechaParseada);
        } catch (Exception e) {

        }
        jLabel69.setVisible(false);
        txfcontraseña_listarUsuario.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        ind_7 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        btn_8 = new javax.swing.JPanel();
        ind_8 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        btn_10 = new javax.swing.JPanel();
        ind_10 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btn_11 = new javax.swing.JPanel();
        ind_11 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        PerfilGerente = new javax.swing.JPanel();
        SignOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAgotados = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblNumUsuarios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblNumReservas = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblNumSalidas = new javax.swing.JLabel();
        GestionarConductores = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnEditarConductor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConductores = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        txfNombreConductor = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txfApellidoConductor = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txfCelularConductor = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txfCedulaConductor = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txfBuscarConductor = new javax.swing.JTextField();
        btnLimpiarConductor = new javax.swing.JButton();
        btnGuardarConductor = new javax.swing.JButton();
        estadoComboConductor = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        btnDesactivarConductor = new javax.swing.JButton();
        btnRegistrarConductor = new javax.swing.JButton();
        btnEliminarConductor = new javax.swing.JButton();
        GestionarProveedores = new javax.swing.JPanel();
        btnEliminarProveedor = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnEditarProveedor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jLabel78 = new javax.swing.JLabel();
        txfNombreProv = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txfCelularProv = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txfCorreoProv = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txfNitProv = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txfBuscarProv = new javax.swing.JTextField();
        btnLimpiarProveedor = new javax.swing.JButton();
        btnGuardarProveedor = new javax.swing.JButton();
        btnRegistrarProv = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        txfUbicacion = new javax.swing.JTextField();
        GestionarEspecies = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        btnEditarEsp = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaEspecies = new javax.swing.JTable();
        jLabel119 = new javax.swing.JLabel();
        txfNombreComun = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        txfFamilia = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        txfMsnm = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        txfNombreCien = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        txfBuscarEsp = new javax.swing.JTextField();
        btnLimpiarEsp = new javax.swing.JButton();
        btnGuardarEsp = new javax.swing.JButton();
        btnRegistrarEsp = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        lblNumeroEspecie = new javax.swing.JLabel();
        btnQuitar3 = new javax.swing.JButton();
        IngresarEspecie = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txfEspecie = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txfCostoIngresarEspecie = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txfNitIngresarEspecie = new javax.swing.JTextField();
        btnLimpiarProveedor1 = new javax.swing.JButton();
        btnIngresarEspecie = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        txfBuscarEspecie = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        btnSeleccionarProveedor = new javax.swing.JButton();
        btnSeleccionarEspecie = new javax.swing.JButton();
        btnLimpiarProveedor2 = new javax.swing.JButton();
        fechaDesde = new com.toedter.calendar.JDateChooser();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        tamanoCombo = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        fechaHasta = new com.toedter.calendar.JDateChooser();
        jLabel92 = new javax.swing.JLabel();
        txfCantidadIngresarEspecie = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        rangoCombo = new javax.swing.JComboBox<>();
        jLabel94 = new javax.swing.JLabel();
        txfCostoCompra = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        historialRegistros = new javax.swing.JTable();
        GestionarUsuarios = new javax.swing.JPanel();
        tabbedUsuarios = new javax.swing.JTabbedPane();
        CrearUsuario = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnMostrarContraseñaU = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfCelular = new javax.swing.JTextField();
        txfApellido = new javax.swing.JTextField();
        txfDireccion = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        passInput1 = new javax.swing.JTextField();
        btnLimpiarProveedor3 = new javax.swing.JButton();
        txfContraseña = new javax.swing.JPasswordField();
        ListarUsuario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnEditarCU = new javax.swing.JButton();
        txfUsuario1 = new javax.swing.JTextField();
        estadoComboCU = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        txfNombre1 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txfApellido1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txfCelular1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txfDireccion1 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarCU = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        btnEliminarUsuario = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        txfcontraseña_listarUsuario = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        Inventario = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        btnEditarInventario = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jLabel99 = new javax.swing.JLabel();
        txfBuscarInventario = new javax.swing.JTextField();
        btnDescargar = new javax.swing.JButton();
        Reservas = new javax.swing.JPanel();
        MenuReserva = new javax.swing.JTabbedPane();
        Reservar = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        jLabel95 = new javax.swing.JLabel();
        txfIdentificacionReservas = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txfNombreReservas = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txfTelefonoReservas = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        btnLimpiarReserva = new javax.swing.JButton();
        btnCancelarReserva = new javax.swing.JButton();
        btnSeleccionarEspecieReservas = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        txfEspecieReservas = new javax.swing.JTextField();
        btnQuitar = new javax.swing.JButton();
        IdentificacionCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lblNumeroReserva = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JButton();
        txfCantidadReservas = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        ConsultarReserva = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txfBuscarConsultarReservas = new javax.swing.JTextField();
        txfCodigoReserva = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txfNombreConsultarReservas = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaConsultarReservas = new javax.swing.JTable();
        jLabel106 = new javax.swing.JLabel();
        lblTotalConsultarReservas = new javax.swing.JLabel();
        txfTelefonoConsultarReservas = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txfIdentificacionConsultarReservas = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        btnLimpiarConsultarReservas = new javax.swing.JButton();
        btnCancelarConsultarReservas = new javax.swing.JButton();
        btnQuitarConsultarReservas = new javax.swing.JButton();
        btnAgregarConsultarReservas = new javax.swing.JButton();
        btnSeleccionarEspecieReservas4 = new javax.swing.JButton();
        Salidas = new javax.swing.JPanel();
        MenuSalida = new javax.swing.JTabbedPane();
        GenerarSalida = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        btnLimpiarSalida = new javax.swing.JButton();
        btnCancelarSalida = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lblNumeroSalida = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        lblTotalSalidas = new javax.swing.JLabel();
        slidePanel = new diu.swe.habib.JPanelSlider.JPanelSlider();
        InfoSalidaPanel = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        motivoCombo = new javax.swing.JComboBox<>();
        jLabel110 = new javax.swing.JLabel();
        txfDestino = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txfPredio = new javax.swing.JTextField();
        btnSiguienteInfoSalida = new javax.swing.JButton();
        btnTraerReserva = new javax.swing.JButton();
        ConductorPanel = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        txfCedulaConductorSalidas = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txfNombreConductorSalidas = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txfApellidoConductorSalidas = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        txfCelularConductorSalidas = new javax.swing.JTextField();
        btnSiguienteConductor = new javax.swing.JButton();
        btnAnteriorConductor = new javax.swing.JButton();
        btnAnteriorConductor1 = new javax.swing.JButton();
        txfPlacaSalidas = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        btnLimpiarConductorSalidas = new javax.swing.JButton();
        ClientePanel = new javax.swing.JPanel();
        btnSiguienteCliente = new javax.swing.JButton();
        btnAnteriorCliente = new javax.swing.JButton();
        IdentificacionComboSalidas = new javax.swing.JComboBox<>();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        btnNuevoCliente1 = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnLimpiarClienteSalida = new javax.swing.JButton();
        txfIdentificacionClienteSalidas = new javax.swing.JTextField();
        txfNombreClienteSalidas = new javax.swing.JTextField();
        txfTelefonoClienteSalidas = new javax.swing.JTextField();
        VentaPanel = new javax.swing.JPanel();
        btnAnteriorCliente1 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        btnSeleccionarEspecieSalidas = new javax.swing.JButton();
        txfEspecieSalidas = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        txfCantidadSalidas = new javax.swing.JTextField();
        btnQuitar1 = new javax.swing.JButton();
        btnAnteriorConductor3 = new javax.swing.JButton();
        btnLimpiarInfVenta = new javax.swing.JButton();
        PerdidaPanel = new javax.swing.JPanel();
        btnAnteriorCliente2 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        btnSeleccionarEspeciePerdida = new javax.swing.JButton();
        txfEspeciePerdida = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        txfCantidadPerdida = new javax.swing.JTextField();
        btnQuitar2 = new javax.swing.JButton();
        btnAnteriorConductor4 = new javax.swing.JButton();
        btnLimpiarInfPerdida = new javax.swing.JButton();
        TrasplantadoPanel = new javax.swing.JPanel();
        btnAnteriorCliente3 = new javax.swing.JButton();
        jLabel130 = new javax.swing.JLabel();
        btnSeleccionarEspecieReservas3 = new javax.swing.JButton();
        txfEspecieTrasplantado = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txfCantidadTrasplantado = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        tamanoComboTrasplantado = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        rangoComboTrasplantado = new javax.swing.JComboBox<>();
        btnAnteriorConductor5 = new javax.swing.JButton();
        btnLimpiarInfTrasplantado = new javax.swing.JButton();
        btnTrasplantado = new javax.swing.JButton();
        labelStock = new javax.swing.JLabel();
        btnRegistrarSalida = new javax.swing.JButton();
        ConsultarSalida = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        txfBuscarConsultarSalida = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaConsultarSalidas = new javax.swing.JTable();
        btnBuscarSalida = new javax.swing.JButton();
        motivoComboConsultarSalida = new javax.swing.JComboBox<>();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        fechaDesdeSalida = new com.toedter.calendar.JDateChooser();
        jLabel120 = new javax.swing.JLabel();
        fechaHastaSalida = new com.toedter.calendar.JDateChooser();
        btnLimpiarConsultarSalida = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();
        btnGenerarExcel = new javax.swing.JButton();
        GestionarClientes = new javax.swing.JPanel();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel143 = new javax.swing.JLabel();
        txfNombreClientes = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        txfCelularClientes = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        txfIdClientes = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        txfBuscarCliente = new javax.swing.JTextField();
        btnLimpiarClientes = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        TipoComboClientes = new javax.swing.JComboBox<>();
        jLabel153 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        side_pane.setBackground(new java.awt.Color(0, 0, 0));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg1_preview_rev_1 (4).png"))); // NOI18N

        btn_1.setBackground(new java.awt.Color(0, 0, 0));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Perfil");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(0, 155, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_2.setBackground(new java.awt.Color(0, 0, 0));
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gestionar Usuarios");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_3MouseReleased(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Gestionar Conductores");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btn_4.setBackground(new java.awt.Color(0, 0, 0));
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_4MouseReleased(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Gestionar Proveedores");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_5.setBackground(new java.awt.Color(0, 0, 0));
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_5MouseReleased(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Alimentar Inventario");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btn_6.setBackground(new java.awt.Color(0, 0, 0));
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_6MouseReleased(evt);
            }
        });

        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Inventario");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btn_7.setBackground(new java.awt.Color(0, 0, 0));
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_7MouseReleased(evt);
            }
        });

        ind_7.setOpaque(false);
        ind_7.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_7Layout = new javax.swing.GroupLayout(ind_7);
        ind_7.setLayout(ind_7Layout);
        ind_7Layout.setHorizontalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_7Layout.setVerticalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Salidas");

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btn_8.setBackground(new java.awt.Color(0, 0, 0));
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_8consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_8MouseReleased(evt);
            }
        });
        btn_8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn_8ComponentHidden(evt);
            }
        });

        ind_8.setOpaque(false);
        ind_8.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_8Layout = new javax.swing.GroupLayout(ind_8);
        ind_8.setLayout(ind_8Layout);
        ind_8Layout.setHorizontalGroup(
            ind_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_8Layout.setVerticalGroup(
            ind_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Reservas");

        javax.swing.GroupLayout btn_8Layout = new javax.swing.GroupLayout(btn_8);
        btn_8.setLayout(btn_8Layout);
        btn_8Layout.setHorizontalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_8Layout.createSequentialGroup()
                .addComponent(ind_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_8Layout.setVerticalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_8Layout.createSequentialGroup()
                .addComponent(ind_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btn_10.setBackground(new java.awt.Color(0, 0, 0));
        btn_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_10consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_10MouseReleased(evt);
            }
        });

        ind_10.setOpaque(false);
        ind_10.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_10Layout = new javax.swing.GroupLayout(ind_10);
        ind_10.setLayout(ind_10Layout);
        ind_10Layout.setHorizontalGroup(
            ind_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_10Layout.setVerticalGroup(
            ind_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Gestionar Especies");

        javax.swing.GroupLayout btn_10Layout = new javax.swing.GroupLayout(btn_10);
        btn_10.setLayout(btn_10Layout);
        btn_10Layout.setHorizontalGroup(
            btn_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_10Layout.createSequentialGroup()
                .addComponent(ind_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_10Layout.setVerticalGroup(
            btn_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_10Layout.createSequentialGroup()
                .addComponent(ind_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_11.setBackground(new java.awt.Color(0, 0, 0));
        btn_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_11consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_11MouseReleased(evt);
            }
        });

        ind_11.setOpaque(false);
        ind_11.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_11Layout = new javax.swing.GroupLayout(ind_11);
        ind_11.setLayout(ind_11Layout);
        ind_11Layout.setHorizontalGroup(
            ind_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_11Layout.setVerticalGroup(
            ind_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Gestionar Clientes");

        javax.swing.GroupLayout btn_11Layout = new javax.swing.GroupLayout(btn_11);
        btn_11.setLayout(btn_11Layout);
        btn_11Layout.setHorizontalGroup(
            btn_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_11Layout.createSequentialGroup()
                .addComponent(ind_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_11Layout.setVerticalGroup(
            btn_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_11Layout.createSequentialGroup()
                .addComponent(ind_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout side_paneLayout = new javax.swing.GroupLayout(side_pane);
        side_pane.setLayout(side_paneLayout);
        side_paneLayout.setHorizontalGroup(
            side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_paneLayout.createSequentialGroup()
                .addGroup(side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(side_paneLayout.createSequentialGroup()
                .addGroup(side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_paneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(side_paneLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        side_paneLayout.setVerticalGroup(
            side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_paneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(btnCerrar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        parent.setBackground(new java.awt.Color(255, 255, 255));
        parent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        parent.setPreferredSize(new java.awt.Dimension(1214, 420));
        parent.setLayout(new java.awt.CardLayout());

        PerfilGerente.setBackground(new java.awt.Color(255, 255, 255));
        PerfilGerente.setForeground(new java.awt.Color(255, 255, 255));
        PerfilGerente.setPreferredSize(new java.awt.Dimension(1214, 460));

        SignOut.setBackground(new java.awt.Color(255, 255, 255));
        SignOut.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        SignOut.setForeground(new java.awt.Color(255, 255, 255));
        SignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        SignOut.setBorderPainted(false);
        SignOut.setContentAreaFilled(false);
        SignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignOut.setFocusable(false);
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Apellido: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Cargo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Direccion:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre.setText("jLabel15");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblUsuario.setText("jLabel15");

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblApellido.setText("jLabel15");

        lblCelular.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCelular.setText("jLabel15");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Usuario:");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDireccion.setText("jLabel15");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        lblCargo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCargo.setText("jLabel15");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("PERFIL DEL GERENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblUsuario))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblNombre))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblCelular))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addComponent(jLabel12))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblCargo)))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblCelular)
                    .addComponent(lblDireccion)
                    .addComponent(lblCargo))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("PRODUCTOS AGOTADOS");

        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuIco.PNG"))); // NOI18N
        btnCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCambiarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        tablaAgotados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaAgotados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuarioIcon.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Usuarios");

        lblNumUsuarios.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumUsuarios.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNumUsuarios)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasIcon.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Reservas");

        lblNumReservas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumReservas.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblNumReservas)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(21, 21, 21))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventasIcon.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Ventas este Mes");

        lblNumSalidas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumSalidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumSalidas.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblNumSalidas)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumSalidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout PerfilGerenteLayout = new javax.swing.GroupLayout(PerfilGerente);
        PerfilGerente.setLayout(PerfilGerenteLayout);
        PerfilGerenteLayout.setHorizontalGroup(
            PerfilGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PerfilGerenteLayout.createSequentialGroup()
                .addGroup(PerfilGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilGerenteLayout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(SignOut))
                    .addGroup(PerfilGerenteLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PerfilGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PerfilGerenteLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PerfilGerenteLayout.setVerticalGroup(
            PerfilGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerfilGerenteLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PerfilGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SignOut)
                .addContainerGap())
        );

        parent.add(PerfilGerente, "card6");

        GestionarConductores.setBackground(new java.awt.Color(255, 255, 255));
        GestionarConductores.setPreferredSize(new java.awt.Dimension(1214, 460));

        jLabel21.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel21.setText("GESTIONAR CONDUCTORES");

        btnEditarConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzul.png"))); // NOI18N
        btnEditarConductor.setBorderPainted(false);
        btnEditarConductor.setContentAreaFilled(false);
        btnEditarConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarConductorActionPerformed(evt);
            }
        });

        tablaConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaConductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConductoresMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaConductoresMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablaConductores);

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel70.setText("Nombre:");

        txfNombreConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreConductorKeyTyped(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel71.setText("Apellido:");

        txfApellidoConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfApellidoConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApellidoConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellidoConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfApellidoConductorKeyTyped(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel74.setText("Celular:");

        txfCelularConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelularConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularConductor.setNextFocusableComponent(btnRegistrarConductor);
        txfCelularConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelularConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularConductorKeyTyped(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel75.setText("Cedula:");

        txfCedulaConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCedulaConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCedulaConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCedulaConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCedulaConductorKeyTyped(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel76.setText("Buscar:");

        txfBuscarConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarConductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarConductorKeyTyped(evt);
            }
        });

        btnLimpiarConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarConductor.setBorderPainted(false);
        btnLimpiarConductor.setContentAreaFilled(false);
        btnLimpiarConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarConductorActionPerformed(evt);
            }
        });

        btnGuardarConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGuardarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzul.png"))); // NOI18N
        btnGuardarConductor.setBorderPainted(false);
        btnGuardarConductor.setContentAreaFilled(false);
        btnGuardarConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarConductor.setEnabled(false);
        btnGuardarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarConductorActionPerformed(evt);
            }
        });

        estadoComboConductor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estadoComboConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVOS", "INACTIVOS" }));
        estadoComboConductor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                estadoComboConductorItemStateChanged(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel77.setText("Ver:");

        btnDesactivarConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnDesactivarConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnDesactivarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desactivarRojo.png"))); // NOI18N
        btnDesactivarConductor.setBorderPainted(false);
        btnDesactivarConductor.setContentAreaFilled(false);
        btnDesactivarConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesactivarConductor.setNextFocusableComponent(txfCedulaConductor);
        btnDesactivarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/desactivarRojoOscuro.png"))); // NOI18N
        btnDesactivarConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/desactivarRojoOscuro.png"))); // NOI18N
        btnDesactivarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarConductorActionPerformed(evt);
            }
        });

        btnRegistrarConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnRegistrarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnRegistrarConductor.setBorderPainted(false);
        btnRegistrarConductor.setContentAreaFilled(false);
        btnRegistrarConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarConductor.setNextFocusableComponent(txfBuscarConductor);
        btnRegistrarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConductorActionPerformed(evt);
            }
        });

        btnEliminarConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEliminarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnEliminarConductor.setToolTipText("Eliminar Usuario");
        btnEliminarConductor.setBorderPainted(false);
        btnEliminarConductor.setContentAreaFilled(false);
        btnEliminarConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarConductor.setNextFocusableComponent(btnLimpiarConductor);
        btnEliminarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarConductorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GestionarConductoresLayout = new javax.swing.GroupLayout(GestionarConductores);
        GestionarConductores.setLayout(GestionarConductoresLayout);
        GestionarConductoresLayout.setHorizontalGroup(
            GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarConductoresLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel21))
            .addGroup(GestionarConductoresLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(txfCedulaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(txfNombreConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(txfApellidoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74)
                    .addComponent(txfCelularConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnRegistrarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(GestionarConductoresLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnLimpiarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEditarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGuardarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDesactivarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(GestionarConductoresLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel77))
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addComponent(txfBuscarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(estadoComboConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnEliminarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GestionarConductoresLayout.setVerticalGroup(
            GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarConductoresLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel21)
                .addGap(25, 25, 25)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addGap(6, 6, 6)
                        .addComponent(txfCedulaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(6, 6, 6)
                        .addComponent(txfNombreConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(6, 6, 6)
                        .addComponent(txfApellidoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(6, 6, 6)
                        .addComponent(txfCelularConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnRegistrarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GestionarConductoresLayout.createSequentialGroup()
                        .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77))
                        .addGap(6, 6, 6)
                        .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfBuscarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoComboConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEliminarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GestionarConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarConductor)
                    .addComponent(btnEditarConductor)
                    .addComponent(btnGuardarConductor)
                    .addComponent(btnDesactivarConductor))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        parent.add(GestionarConductores, "card4");

        GestionarProveedores.setBackground(new java.awt.Color(255, 255, 255));
        GestionarProveedores.setPreferredSize(new java.awt.Dimension(1214, 460));

        btnEliminarProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnEliminarProveedor.setToolTipText("Eliminar Especie");
        btnEliminarProveedor.setBorderPainted(false);
        btnEliminarProveedor.setContentAreaFilled(false);
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProveedor.setNextFocusableComponent(btnLimpiarProveedor);
        btnEliminarProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel29.setText("GESTIONAR PROVEEDORES");

        btnEditarProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarProveedor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzul.png"))); // NOI18N
        btnEditarProveedor.setBorderPainted(false);
        btnEditarProveedor.setContentAreaFilled(false);
        btnEditarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
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

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel78.setText("Nombre:");

        txfNombreProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreProvKeyTyped(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel79.setText("Celular:");

        txfCelularProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelularProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelularProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularProvKeyTyped(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel80.setText("Correo:");

        txfCorreoProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCorreoProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCorreoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCorreoProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCorreoProvKeyTyped(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel81.setText("Nit");

        txfNitProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNitProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNitProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNitProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNitProvKeyTyped(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel82.setText("Buscar:");

        txfBuscarProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarProvKeyTyped(evt);
            }
        });

        btnLimpiarProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarProveedor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarProveedor.setBorderPainted(false);
        btnLimpiarProveedor.setContentAreaFilled(false);
        btnLimpiarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedorActionPerformed(evt);
            }
        });

        btnGuardarProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarProveedor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzul.png"))); // NOI18N
        btnGuardarProveedor.setBorderPainted(false);
        btnGuardarProveedor.setContentAreaFilled(false);
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProveedor.setEnabled(false);
        btnGuardarProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        btnRegistrarProv.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarProv.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnRegistrarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnRegistrarProv.setBorderPainted(false);
        btnRegistrarProv.setContentAreaFilled(false);
        btnRegistrarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarProv.setNextFocusableComponent(txfNitProv);
        btnRegistrarProv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarProv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProvActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel90.setText("Ubicación:");

        txfUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfUbicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfUbicacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfUbicacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout GestionarProveedoresLayout = new javax.swing.GroupLayout(GestionarProveedores);
        GestionarProveedores.setLayout(GestionarProveedoresLayout);
        GestionarProveedoresLayout.setHorizontalGroup(
            GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
            .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel82)
                                    .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                                            .addComponent(jLabel81)
                                            .addGap(110, 110, 110))
                                        .addComponent(txfNitProv)))
                                .addGap(36, 36, 36)
                                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfNombreProv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txfBuscarProv))
                        .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79)
                                    .addComponent(txfCelularProv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel80)
                                    .addComponent(txfCorreoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel90)
                                    .addComponent(txfUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                            .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnLimpiarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnRegistrarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
            .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GestionarProveedoresLayout.setVerticalGroup(
            GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(25, 25, 25)
                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GestionarProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfCorreoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfCelularProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel81)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfNitProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarProveedoresLayout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GestionarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parent.add(GestionarProveedores, "card4");

        GestionarEspecies.setBackground(new java.awt.Color(255, 255, 255));
        GestionarEspecies.setPreferredSize(new java.awt.Dimension(1214, 460));

        jLabel36.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel36.setText("GESTIONAR ESPECIES");

        btnEditarEsp.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarEsp.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzul.png"))); // NOI18N
        btnEditarEsp.setBorderPainted(false);
        btnEditarEsp.setContentAreaFilled(false);
        btnEditarEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarEsp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarEsp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEspActionPerformed(evt);
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
        jScrollPane11.setViewportView(tablaEspecies);

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel119.setText("Nombre Común:");

        txfNombreComun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreComun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreComun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreComunActionPerformed(evt);
            }
        });
        txfNombreComun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreComunKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreComunKeyTyped(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel121.setText("Familia:");

        txfFamilia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfFamilia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFamiliaActionPerformed(evt);
            }
        });
        txfFamilia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfFamiliaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfFamiliaKeyTyped(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel133.setText("Msnm:");

        txfMsnm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMsnm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfMsnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMsnmActionPerformed(evt);
            }
        });
        txfMsnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfMsnmKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfMsnmKeyTyped(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel134.setText("Nombre de Científico:");

        txfNombreCien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreCien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreCien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreCienActionPerformed(evt);
            }
        });
        txfNombreCien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreCienKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreCienKeyTyped(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel135.setText("Buscar:");

        txfBuscarEsp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarEsp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarEsp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarEspKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarEspKeyTyped(evt);
            }
        });

        btnLimpiarEsp.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarEsp.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarEsp.setBorderPainted(false);
        btnLimpiarEsp.setContentAreaFilled(false);
        btnLimpiarEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarEsp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarEsp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEspActionPerformed(evt);
            }
        });

        btnGuardarEsp.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarEsp.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGuardarEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzul.png"))); // NOI18N
        btnGuardarEsp.setBorderPainted(false);
        btnGuardarEsp.setContentAreaFilled(false);
        btnGuardarEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEsp.setEnabled(false);
        btnGuardarEsp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarEsp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEspActionPerformed(evt);
            }
        });

        btnRegistrarEsp.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEsp.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnRegistrarEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnRegistrarEsp.setBorderPainted(false);
        btnRegistrarEsp.setContentAreaFilled(false);
        btnRegistrarEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEsp.setNextFocusableComponent(txfNombreCien);
        btnRegistrarEsp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarEsp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEspActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("N°");

        lblNumeroEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnQuitar3.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnQuitar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnQuitar3.setToolTipText("Eliminar Especie");
        btnQuitar3.setBorderPainted(false);
        btnQuitar3.setContentAreaFilled(false);
        btnQuitar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar3.setNextFocusableComponent(btnLimpiarEsp);
        btnQuitar3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GestionarEspeciesLayout = new javax.swing.GroupLayout(GestionarEspecies);
        GestionarEspecies.setLayout(GestionarEspeciesLayout);
        GestionarEspeciesLayout.setHorizontalGroup(
            GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnLimpiarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnGuardarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnRegistrarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(6, 6, 6)
                                .addComponent(lblNumeroEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(jLabel36))
                            .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                                        .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txfNombreCien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel134))
                                        .addGap(30, 30, 30)
                                        .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel119)
                                            .addComponent(txfNombreComun, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel135)
                                    .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                                        .addComponent(txfBuscarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnQuitar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121)
                                    .addComponent(txfFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel133)
                                    .addComponent(txfMsnm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(99, 99, 99))
        );
        GestionarEspeciesLayout.setVerticalGroup(
            GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel19))
                        .addComponent(lblNumeroEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GestionarEspeciesLayout.createSequentialGroup()
                            .addComponent(jLabel133)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfMsnm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                            .addComponent(jLabel121)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                            .addComponent(jLabel134)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfNombreCien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GestionarEspeciesLayout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreComun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBuscarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitar3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GestionarEspeciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarEsp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parent.add(GestionarEspecies, "card4");

        IngresarEspecie.setBackground(new java.awt.Color(255, 255, 255));
        IngresarEspecie.setPreferredSize(new java.awt.Dimension(1214, 460));

        jLabel41.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel41.setText("INGRESAR ESPECIE");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel83.setText("Especie:");

        txfEspecie.setEditable(false);
        txfEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfEspecieKeyReleased(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel84.setText("Fecha Ingreso:");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel85.setText("Costo de Venta (und):");

        txfCostoIngresarEspecie.setEditable(false);
        txfCostoIngresarEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCostoIngresarEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCostoIngresarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCostoIngresarEspecieActionPerformed(evt);
            }
        });
        txfCostoIngresarEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCostoIngresarEspecieKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCostoIngresarEspecieKeyTyped(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel86.setText("Nit:");

        txfNitIngresarEspecie.setEditable(false);
        txfNitIngresarEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNitIngresarEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNitIngresarEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNitIngresarEspecieKeyReleased(evt);
            }
        });

        btnLimpiarProveedor1.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarProveedor1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarProveedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarProveedor1.setBorderPainted(false);
        btnLimpiarProveedor1.setContentAreaFilled(false);
        btnLimpiarProveedor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarProveedor1.setNextFocusableComponent(btnSeleccionarProveedor);
        btnLimpiarProveedor1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarProveedor1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedor1ActionPerformed(evt);
            }
        });

        btnIngresarEspecie.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresarEspecie.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnIngresarEspecie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnIngresarEspecie.setBorderPainted(false);
        btnIngresarEspecie.setContentAreaFilled(false);
        btnIngresarEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarEspecie.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnIngresarEspecie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnIngresarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEspecieActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel87.setText("Desde:");

        txfBuscarEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarEspecieKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarEspecieKeyTyped(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel88.setText("Buscar:");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel89.setText("Hasta");

        btnSeleccionarProveedor.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarProveedor.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojo.png"))); // NOI18N
        btnSeleccionarProveedor.setBorderPainted(false);
        btnSeleccionarProveedor.setFocusPainted(false);
        btnSeleccionarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProveedorActionPerformed(evt);
            }
        });

        btnSeleccionarEspecie.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecie.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojo.png"))); // NOI18N
        btnSeleccionarEspecie.setBorderPainted(false);
        btnSeleccionarEspecie.setFocusPainted(false);
        btnSeleccionarEspecie.setNextFocusableComponent(tamanoCombo);
        btnSeleccionarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspecieActionPerformed(evt);
            }
        });

        btnLimpiarProveedor2.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarProveedor2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarProveedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar1.png"))); // NOI18N
        btnLimpiarProveedor2.setBorderPainted(false);
        btnLimpiarProveedor2.setContentAreaFilled(false);
        btnLimpiarProveedor2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarProveedor2.setNextFocusableComponent(btnIngresarEspecie);
        btnLimpiarProveedor2.setPreferredSize(new java.awt.Dimension(65, 49));
        btnLimpiarProveedor2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnLimpiarProveedor2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnLimpiarProveedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedor2ActionPerformed(evt);
            }
        });

        fechaDesde.setDateFormatString("dd-MM-yyyy");
        fechaDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fechaIngreso.setDateFormatString("dd-MM-yyyy");
        fechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaIngresoKeyTyped(evt);
            }
        });

        tamanoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tamanoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4x8", "18x34", "25x35" }));
        tamanoCombo.setSelectedIndex(-1);
        tamanoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamanoComboItemStateChanged(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel91.setText("Bolsa:");

        fechaHasta.setDateFormatString("dd-MM-yyyy");
        fechaHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel92.setText("Cantidad:");

        txfCantidadIngresarEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCantidadIngresarEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCantidadIngresarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCantidadIngresarEspecieActionPerformed(evt);
            }
        });
        txfCantidadIngresarEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCantidadIngresarEspecieKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCantidadIngresarEspecieKeyTyped(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel93.setText("Rango:");

        rangoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rangoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rangoComboItemStateChanged(evt);
            }
        });
        rangoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangoComboActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel94.setText("Costo de Compra:");

        txfCostoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCostoCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCostoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCostoCompraActionPerformed(evt);
            }
        });
        txfCostoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCostoCompraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCostoCompraKeyTyped(evt);
            }
        });

        historialRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre Común", "Bolsa", "Rango", "Cantidad", "Fecha"
            }
        ));
        jScrollPane13.setViewportView(historialRegistros);

        javax.swing.GroupLayout IngresarEspecieLayout = new javax.swing.GroupLayout(IngresarEspecie);
        IngresarEspecie.setLayout(IngresarEspecieLayout);
        IngresarEspecieLayout.setHorizontalGroup(
            IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarEspecieLayout.createSequentialGroup()
                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                        .addComponent(jLabel86)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSeleccionarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txfNitIngresarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfCantidadIngresarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel83)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnSeleccionarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel84)
                                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tamanoCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel93)
                                            .addComponent(rangoCombo, 0, 130, Short.MAX_VALUE)))
                                    .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfCostoIngresarEspecie)))
                            .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfBuscarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfCostoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel88))
                                .addGap(30, 30, 30)
                                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel92)
                                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel87)
                                            .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel89)
                                            .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                                .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnLimpiarProveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(IngresarEspecieLayout.createSequentialGroup()
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(322, 322, 322)
                                .addComponent(jLabel41))
                            .addComponent(jScrollPane13)))
                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(btnIngresarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnLimpiarProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        IngresarEspecieLayout.setVerticalGroup(
            IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarEspecieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEspecieLayout.createSequentialGroup()
                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSeleccionarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNitIngresarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEspecieLayout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEspecieLayout.createSequentialGroup()
                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSeleccionarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEspecieLayout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rangoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEspecieLayout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCostoIngresarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEspecieLayout.createSequentialGroup()
                            .addComponent(jLabel84)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(IngresarEspecieLayout.createSequentialGroup()
                            .addComponent(jLabel92)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfCantidadIngresarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCostoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel89)
                            .addComponent(jLabel88))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(fechaDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiarProveedor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(IngresarEspecieLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txfBuscarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(IngresarEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarProveedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresarEspecie, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parent.add(IngresarEspecie, "card4");

        GestionarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        GestionarUsuarios.setForeground(new java.awt.Color(255, 153, 51));
        GestionarUsuarios.setPreferredSize(new java.awt.Dimension(1214, 460));

        tabbedUsuarios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedUsuariosStateChanged(evt);
            }
        });

        CrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        CrearUsuario.setForeground(new java.awt.Color(255, 153, 51));
        CrearUsuario.setPreferredSize(new java.awt.Dimension(993, 565));

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel15.setText("CREAR USUARIO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Nombre: ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Apellido:");

        btnMostrarContraseñaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnMostrar.png"))); // NOI18N
        btnMostrarContraseñaU.setBorderPainted(false);
        btnMostrarContraseñaU.setContentAreaFilled(false);
        btnMostrarContraseñaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarContraseñaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContraseñaUActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Usuario:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Celular:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Dirección:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Posición de trabajo:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Contraseña:");

        txfUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfUsuarioKeyTyped(evt);
            }
        });

        txfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreKeyTyped(evt);
            }
        });

        txfCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularKeyTyped(evt);
            }
        });

        txfApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfApellidoKeyTyped(evt);
            }
        });

        txfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfDireccion.setNextFocusableComponent(txfContraseña);
        txfDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfDireccionKeyTyped(evt);
            }
        });

        btnCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnCrearUsuario.setBorderPainted(false);
        btnCrearUsuario.setContentAreaFilled(false);
        btnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnCrearUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        passInput1.setEditable(false);
        passInput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passInput1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passInput1.setText("Encargado de Vivero");

        btnLimpiarProveedor3.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarProveedor3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarProveedor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarProveedor3.setBorderPainted(false);
        btnLimpiarProveedor3.setContentAreaFilled(false);
        btnLimpiarProveedor3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarProveedor3.setNextFocusableComponent(txfUsuario);
        btnLimpiarProveedor3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarProveedor3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarProveedor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedor3ActionPerformed(evt);
            }
        });

        txfContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfContraseñaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout CrearUsuarioLayout = new javax.swing.GroupLayout(CrearUsuario);
        CrearUsuario.setLayout(CrearUsuarioLayout);
        CrearUsuarioLayout.setHorizontalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearUsuarioLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passInput1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(txfDireccion)
                    .addComponent(txfCelular)
                    .addComponent(txfApellido)
                    .addComponent(txfNombre)
                    .addComponent(txfUsuario)
                    .addGroup(CrearUsuarioLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel15))
                    .addComponent(txfContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarContraseñaU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnLimpiarProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        CrearUsuarioLayout.setVerticalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearUsuarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel15)
                .addGap(38, 38, 38)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(passInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrarContraseñaU, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(btnLimpiarProveedor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedUsuarios.addTab("Crear Usuario", CrearUsuario);

        ListarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        ListarUsuario.setPreferredSize(new java.awt.Dimension(880, 565));

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel13.setText("LISTA DE USUARIOS");

        btnEditarCU.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCU.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzul.png"))); // NOI18N
        btnEditarCU.setBorderPainted(false);
        btnEditarCU.setContentAreaFilled(false);
        btnEditarCU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCU.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarCU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCUActionPerformed(evt);
            }
        });

        txfUsuario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfUsuario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfUsuario1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfUsuario1KeyTyped(evt);
            }
        });

        estadoComboCU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estadoComboCU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVOS", "INACTIVOS" }));
        estadoComboCU.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                estadoComboCUItemStateChanged(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel60.setText("Usuario:");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellido", "Celular", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel61.setText("Nombre:");

        txfNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombre1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombre1KeyTyped(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel62.setText("Apellidos:");

        txfApellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfApellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellido1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfApellido1KeyTyped(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel63.setText("Celular:");

        txfCelular1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelular1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelular1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelular1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelular1KeyTyped(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel64.setText("Dirección:");

        txfDireccion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDireccion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfDireccion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfDireccion1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfDireccion1KeyTyped(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel65.setText("Buscar:");

        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarKeyTyped(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardarCU.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarCU.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGuardarCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzul.png"))); // NOI18N
        btnGuardarCU.setBorderPainted(false);
        btnGuardarCU.setContentAreaFilled(false);
        btnGuardarCU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCU.setEnabled(false);
        btnGuardarCU.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarCU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCUActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel66.setText("Ver:");

        btnEliminarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnEliminarUsuario.setToolTipText("Eliminar Usuario");
        btnEliminarUsuario.setBorderPainted(false);
        btnEliminarUsuario.setContentAreaFilled(false);
        btnEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarUsuario.setNextFocusableComponent(btnLimpiar);
        btnEliminarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnDesactivar.setBackground(new java.awt.Color(255, 255, 255));
        btnDesactivar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desactivarRojo.png"))); // NOI18N
        btnDesactivar.setBorderPainted(false);
        btnDesactivar.setContentAreaFilled(false);
        btnDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesactivar.setNextFocusableComponent(txfUsuario1);
        btnDesactivar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/desactivarRojoOscuro.png"))); // NOI18N
        btnDesactivar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/desactivarRojoOscuro.png"))); // NOI18N
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        txfcontraseña_listarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfcontraseña_listarUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfcontraseña_listarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfcontraseña_listarUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfcontraseña_listarUsuarioKeyTyped(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel69.setText("Contraseña:");

        javax.swing.GroupLayout ListarUsuarioLayout = new javax.swing.GroupLayout(ListarUsuario);
        ListarUsuario.setLayout(ListarUsuarioLayout);
        ListarUsuarioLayout.setHorizontalGroup(
            ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ListarUsuarioLayout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(btnEditarCU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(btnGuardarCU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ListarUsuarioLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarUsuarioLayout.createSequentialGroup()
                                    .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel60)
                                        .addComponent(txfUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(txfBuscar))
                                    .addGap(30, 30, 30))
                                .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel65)
                                    .addGap(114, 114, 114)))
                            .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                    .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel61)
                                            .addComponent(txfNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(estadoComboCU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel66))
                                    .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel62)
                                                .addComponent(txfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(30, 30, 30)
                            .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                    .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel63)
                                        .addComponent(txfCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel64)))
                                .addComponent(jLabel69)
                                .addComponent(txfcontraseña_listarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        ListarUsuarioLayout.setVerticalGroup(
            ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ListarUsuarioLayout.createSequentialGroup()
                        .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txfCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ListarUsuarioLayout.createSequentialGroup()
                                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estadoComboCU)
                                    .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ListarUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfcontraseña_listarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ListarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesactivar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabbedUsuarios.addTab("Lista de Usuario", ListarUsuario);

        javax.swing.GroupLayout GestionarUsuariosLayout = new javax.swing.GroupLayout(GestionarUsuarios);
        GestionarUsuarios.setLayout(GestionarUsuariosLayout);
        GestionarUsuariosLayout.setHorizontalGroup(
            GestionarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
        );
        GestionarUsuariosLayout.setVerticalGroup(
            GestionarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        parent.add(GestionarUsuarios, "card5");

        Inventario.setBackground(new java.awt.Color(255, 255, 255));
        Inventario.setPreferredSize(new java.awt.Dimension(1214, 460));

        jLabel48.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel48.setText("INVENTARIO BIODESS");

        btnEditarInventario.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarInventario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit (1).png"))); // NOI18N
        btnEditarInventario.setBorderPainted(false);
        btnEditarInventario.setContentAreaFilled(false);
        btnEditarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarInventario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editOscuro.png"))); // NOI18N
        btnEditarInventario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editOscuro.png"))); // NOI18N
        btnEditarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInventarioActionPerformed(evt);
            }
        });

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInventarioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaInventarioMouseReleased(evt);
            }
        });
        tablaInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaInventarioKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tablaInventario);

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel99.setText("Buscar:");

        txfBuscarInventario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarInventario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarInventarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarInventarioKeyTyped(evt);
            }
        });

        btnDescargar.setBackground(new java.awt.Color(255, 255, 255));
        btnDescargar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down-arrow (2).png"))); // NOI18N
        btnDescargar.setBorderPainted(false);
        btnDescargar.setContentAreaFilled(false);
        btnDescargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescargar.setNextFocusableComponent(txfBuscarInventario);
        btnDescargar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/down-arrowOscuro.png"))); // NOI18N
        btnDescargar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/down-arrowOscuro.png"))); // NOI18N
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InventarioLayout = new javax.swing.GroupLayout(Inventario);
        Inventario.setLayout(InventarioLayout);
        InventarioLayout.setHorizontalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
            .addGroup(InventarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99)
                    .addComponent(txfBuscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel48))
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEditarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 326, Short.MAX_VALUE))
        );
        InventarioLayout.setVerticalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(23, 23, 23)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDescargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBuscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parent.add(Inventario, "card4");

        Reservas.setBackground(new java.awt.Color(255, 255, 255));
        Reservas.setPreferredSize(new java.awt.Dimension(1214, 460));
        Reservas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ReservasFocusLost(evt);
            }
        });
        Reservas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ReservasComponentHidden(evt);
            }
        });
        Reservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuReserva.setFocusable(false);
        MenuReserva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MenuReservaStateChanged(evt);
            }
        });

        Reservar.setBackground(new java.awt.Color(255, 255, 255));
        Reservar.setPreferredSize(new java.awt.Dimension(1214, 633));

        jLabel44.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel44.setText("RESERVAS");

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre Vulgar", "Nombre Científico", "Rango", "Tamaño de Bolsa", "Cantidad", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jScrollPane6.setViewportView(tablaReservas);

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel95.setText("Nit/Cédula:");

        txfIdentificacionReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfIdentificacionReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentificacionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdentificacionReservasActionPerformed(evt);
            }
        });
        txfIdentificacionReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfIdentificacionReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdentificacionReservasKeyTyped(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel96.setText("Nombre Completo:");

        txfNombreReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreReservasKeyTyped(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel97.setText("Teléfono:");

        txfTelefonoReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfTelefonoReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTelefonoReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTelefonoReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfTelefonoReservasKeyTyped(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel98.setText("Tipo de Identificación:");

        btnLimpiarReserva.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarReserva.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarReserva.setBorderPainted(false);
        btnLimpiarReserva.setContentAreaFilled(false);
        btnLimpiarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarReserva.setFocusable(false);
        btnLimpiarReserva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarReserva.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarReservaActionPerformed(evt);
            }
        });

        btnCancelarReserva.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarReserva.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnCancelarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojo.png"))); // NOI18N
        btnCancelarReserva.setBorderPainted(false);
        btnCancelarReserva.setContentAreaFilled(false);
        btnCancelarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarReserva.setFocusable(false);
        btnCancelarReserva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelarReserva.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservaActionPerformed(evt);
            }
        });

        btnSeleccionarEspecieReservas.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojo.png"))); // NOI18N
        btnSeleccionarEspecieReservas.setBorderPainted(false);
        btnSeleccionarEspecieReservas.setEnabled(false);
        btnSeleccionarEspecieReservas.setFocusPainted(false);
        btnSeleccionarEspecieReservas.setNextFocusableComponent(btnQuitar);
        btnSeleccionarEspecieReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspecieReservasActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel102.setText("Especie:");

        txfEspecieReservas.setEditable(false);
        txfEspecieReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfEspecieReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEspecieReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfEspecieReservasKeyReleased(evt);
            }
        });

        btnQuitar.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnQuitar.setBorderPainted(false);
        btnQuitar.setContentAreaFilled(false);
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setNextFocusableComponent(IdentificacionCombo);
        btnQuitar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        IdentificacionCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IdentificacionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de Ciudadanía", "NIT" }));
        IdentificacionCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IdentificacionComboItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("N°");

        lblNumeroReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnNuevoCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-group.png"))); // NOI18N
        btnNuevoCliente.setBorderPainted(false);
        btnNuevoCliente.setContentAreaFilled(false);
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/add-group.png"))); // NOI18N
        btnNuevoCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/add-group.png"))); // NOI18N
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        txfCantidadReservas.setEditable(false);
        txfCantidadReservas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfCantidadReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCantidadReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCantidadReservasKeyTyped(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel103.setText("Cantidad:");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel100.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTotal.setText("0");
        lblTotal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnReservar.setBackground(new java.awt.Color(255, 255, 255));
        btnReservar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnReservarAzul.png"))); // NOI18N
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservar.setFocusable(false);
        btnReservar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnReservarAzulOscuro.png"))); // NOI18N
        btnReservar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnReservarAzulOscuro.png"))); // NOI18N
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReservarLayout = new javax.swing.GroupLayout(Reservar);
        Reservar.setLayout(ReservarLayout);
        ReservarLayout.setHorizontalGroup(
            ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarLayout.createSequentialGroup()
                .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(lblNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel44))
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(IdentificacionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(txfIdentificacionReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96)
                            .addComponent(txfNombreReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addGroup(ReservarLayout.createSequentialGroup()
                                .addComponent(txfTelefonoReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReservarLayout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addGap(10, 10, 10)
                                .addComponent(btnSeleccionarEspecieReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfEspecieReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addGroup(ReservarLayout.createSequentialGroup()
                                .addComponent(txfCantidadReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel100)
                        .addGap(6, 6, 6)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(275, 275, 275))
        );
        ReservarLayout.setVerticalGroup(
            ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(lblNumeroReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel98)
                    .addComponent(jLabel95)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoCliente)
                    .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txfTelefonoReservas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdentificacionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfIdentificacionReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombreReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReservarLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel102))
                            .addComponent(btnSeleccionarEspecieReservas))
                        .addGap(6, 6, 6)
                        .addComponent(txfEspecieReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel103)
                        .addGap(6, 6, 6)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCantidadReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(lblTotal)))
                    .addGroup(ReservarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarReserva)
                            .addComponent(btnCancelarReserva)
                            .addComponent(btnReservar))))
                .addContainerGap())
        );

        MenuReserva.addTab("Reservar", Reservar);

        ConsultarReserva.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarReserva.setPreferredSize(new java.awt.Dimension(1214, 633));

        jLabel45.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel45.setText("CONSULTAR RESERVAS");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel101.setText("Buscar por NIT o código de reserva:");

        txfBuscarConsultarReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarConsultarReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarConsultarReservas.setToolTipText("Busque por NIT, Cédula o Código de reserva, y presione ENTER.");
        txfBuscarConsultarReservas.setNextFocusableComponent(btnSeleccionarEspecieReservas4);
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

        txfCodigoReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCodigoReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCodigoReserva.setEnabled(false);
        txfCodigoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCodigoReservaActionPerformed(evt);
            }
        });
        txfCodigoReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCodigoReservaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCodigoReservaKeyTyped(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel104.setText("Código Reserva:");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel105.setText("Nombre Cliente:");

        txfNombreConsultarReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreConsultarReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreConsultarReservas.setEnabled(false);
        txfNombreConsultarReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreConsultarReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreConsultarReservasKeyTyped(evt);
            }
        });

        tablaConsultarReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre Vulgar", "Nombre Científico", "Rango", "Tamaño de Bolsa", "Cantidad", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaConsultarReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConsultarReservasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaConsultarReservasMouseReleased(evt);
            }
        });
        tablaConsultarReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaConsultarReservasKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tablaConsultarReservas);

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel106.setText("Total:");

        lblTotalConsultarReservas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTotalConsultarReservas.setText("0");
        lblTotalConsultarReservas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txfTelefonoConsultarReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfTelefonoConsultarReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTelefonoConsultarReservas.setEnabled(false);
        txfTelefonoConsultarReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTelefonoConsultarReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfTelefonoConsultarReservasKeyTyped(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel107.setText("Teléfono:");

        txfIdentificacionConsultarReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfIdentificacionConsultarReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentificacionConsultarReservas.setEnabled(false);
        txfIdentificacionConsultarReservas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfIdentificacionConsultarReservasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdentificacionConsultarReservasKeyTyped(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel108.setText("NIT/Cédula:");

        btnLimpiarConsultarReservas.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarConsultarReservas.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarConsultarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarConsultarReservas.setBorderPainted(false);
        btnLimpiarConsultarReservas.setContentAreaFilled(false);
        btnLimpiarConsultarReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarConsultarReservas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarConsultarReservas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarConsultarReservasActionPerformed(evt);
            }
        });

        btnCancelarConsultarReservas.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarConsultarReservas.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnCancelarConsultarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojo.png"))); // NOI18N
        btnCancelarConsultarReservas.setBorderPainted(false);
        btnCancelarConsultarReservas.setContentAreaFilled(false);
        btnCancelarConsultarReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarConsultarReservas.setNextFocusableComponent(txfBuscarConsultarReservas);
        btnCancelarConsultarReservas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelarConsultarReservas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelarConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultarReservasActionPerformed(evt);
            }
        });

        btnQuitarConsultarReservas.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitarConsultarReservas.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnQuitarConsultarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnQuitarConsultarReservas.setBorderPainted(false);
        btnQuitarConsultarReservas.setContentAreaFilled(false);
        btnQuitarConsultarReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitarConsultarReservas.setNextFocusableComponent(btnLimpiarConsultarReservas);
        btnQuitarConsultarReservas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitarConsultarReservas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitarConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarConsultarReservasActionPerformed(evt);
            }
        });

        btnAgregarConsultarReservas.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarConsultarReservas.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAgregarConsultarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar1.png"))); // NOI18N
        btnAgregarConsultarReservas.setBorderPainted(false);
        btnAgregarConsultarReservas.setContentAreaFilled(false);
        btnAgregarConsultarReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarConsultarReservas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar2.png"))); // NOI18N
        btnAgregarConsultarReservas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar2.png"))); // NOI18N
        btnAgregarConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarConsultarReservasActionPerformed(evt);
            }
        });

        btnSeleccionarEspecieReservas4.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas4.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar1.png"))); // NOI18N
        btnSeleccionarEspecieReservas4.setBorderPainted(false);
        btnSeleccionarEspecieReservas4.setContentAreaFilled(false);
        btnSeleccionarEspecieReservas4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarEspecieReservas4.setNextFocusableComponent(btnAgregarConsultarReservas);
        btnSeleccionarEspecieReservas4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnSeleccionarEspecieReservas4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnSeleccionarEspecieReservas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspecieReservas4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultarReservaLayout = new javax.swing.GroupLayout(ConsultarReserva);
        ConsultarReserva.setLayout(ConsultarReservaLayout);
        ConsultarReservaLayout.setHorizontalGroup(
            ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarReservaLayout.createSequentialGroup()
                .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel45))
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel104)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel108)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel105)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel107))
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txfCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txfIdentificacionConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txfNombreConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txfTelefonoConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel106)
                        .addGap(6, 6, 6)
                        .addComponent(lblTotalConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnLimpiarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultarReservaLayout.createSequentialGroup()
                .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addGroup(ConsultarReservaLayout.createSequentialGroup()
                                .addComponent(txfBuscarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeleccionarEspecieReservas4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnQuitarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(365, 365, 365))
        );
        ConsultarReservaLayout.setVerticalGroup(
            ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarReservaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addComponent(jLabel108)
                    .addComponent(jLabel105)
                    .addComponent(jLabel107))
                .addGap(11, 11, 11)
                .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfIdentificacionConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNombreConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfTelefonoConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addGap(6, 6, 6)
                        .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSeleccionarEspecieReservas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfBuscarConsultarReservas)))
                    .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregarConsultarReservas)
                        .addComponent(btnQuitarConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106)
                    .addComponent(lblTotalConsultarReservas)
                    .addGroup(ConsultarReservaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(ConsultarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarConsultarReservas)
                            .addComponent(btnCancelarConsultarReservas)))))
        );

        MenuReserva.addTab("Consultar", ConsultarReserva);

        Reservas.add(MenuReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        parent.add(Reservas, "card4");

        Salidas.setBackground(new java.awt.Color(255, 255, 255));
        Salidas.setPreferredSize(new java.awt.Dimension(1214, 460));
        Salidas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SalidasFocusLost(evt);
            }
        });
        Salidas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                SalidasComponentHidden(evt);
            }
        });
        Salidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuSalida.setBackground(new java.awt.Color(255, 255, 255));
        MenuSalida.setFocusable(false);
        MenuSalida.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MenuSalidaStateChanged(evt);
            }
        });

        GenerarSalida.setBackground(new java.awt.Color(255, 255, 255));
        GenerarSalida.setPreferredSize(new java.awt.Dimension(1214, 633));

        jLabel46.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel46.setText("SALIDAS");

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre Común", "Nombre Científico", "Rango", "Tamaño", "Cantidad", "Costo"
            }
        ));
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

        btnLimpiarSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarSalida.setBorderPainted(false);
        btnLimpiarSalida.setContentAreaFilled(false);
        btnLimpiarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarSalida.setFocusable(false);
        btnLimpiarSalida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarSalida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSalidaActionPerformed(evt);
            }
        });

        btnCancelarSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnCancelarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojo.png"))); // NOI18N
        btnCancelarSalida.setBorderPainted(false);
        btnCancelarSalida.setContentAreaFilled(false);
        btnCancelarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarSalida.setFocusable(false);
        btnCancelarSalida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelarSalida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCancelarRojoOscuro.png"))); // NOI18N
        btnCancelarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSalidaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("N°");

        lblNumeroSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblFecha1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel115.setText("Total:");

        lblTotalSalidas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTotalSalidas.setText("0");
        lblTotalSalidas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        slidePanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                slidePanelKeyTyped(evt);
            }
        });

        InfoSalidaPanel.setBackground(new java.awt.Color(255, 255, 255));
        InfoSalidaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la Salida"));

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel112.setText("Motivo de la salida:");

        motivoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        motivoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta", "Venta en vivero", "Donación", "Proyecto propio", "Pérdida", "Trasplantado", "Reserva" }));
        motivoCombo.setSelectedIndex(3);
        motivoCombo.setNextFocusableComponent(txfDestino);
        motivoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                motivoComboItemStateChanged(evt);
            }
        });
        motivoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motivoComboActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel110.setText("Municipio/Vereda:");

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

        txfPredio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPredio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        btnSiguienteInfoSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguienteInfoSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnSiguienteInfoSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteInfoSalida.setBorderPainted(false);
        btnSiguienteInfoSalida.setContentAreaFilled(false);
        btnSiguienteInfoSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguienteInfoSalida.setNextFocusableComponent(motivoCombo);
        btnSiguienteInfoSalida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteInfoSalida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteInfoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteInfoSalidaActionPerformed(evt);
            }
        });

        btnTraerReserva.setText("Traer Reserva");
        btnTraerReserva.setEnabled(false);
        btnTraerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoSalidaPanelLayout = new javax.swing.GroupLayout(InfoSalidaPanel);
        InfoSalidaPanel.setLayout(InfoSalidaPanelLayout);
        InfoSalidaPanelLayout.setHorizontalGroup(
            InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTraerReserva)
                        .addGap(658, 658, 658)
                        .addComponent(btnSiguienteInfoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(txfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addComponent(txfPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel112)
                        .addComponent(motivoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(614, Short.MAX_VALUE)))
        );
        InfoSalidaPanelLayout.setVerticalGroup(
            InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jLabel110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                        .addComponent(btnSiguienteInfoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoSalidaPanelLayout.createSequentialGroup()
                        .addComponent(btnTraerReserva)
                        .addGap(37, 37, 37))))
            .addGroup(InfoSalidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InfoSalidaPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel112)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(motivoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        slidePanel.add(InfoSalidaPanel, "card2");

        ConductorPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConductorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del Conductor"));

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel109.setText("Cedula:");

        txfCedulaConductorSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCedulaConductorSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCedulaConductorSalidas.setNextFocusableComponent(txfPlacaSalidas);
        txfCedulaConductorSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCedulaConductorSalidasActionPerformed(evt);
            }
        });
        txfCedulaConductorSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCedulaConductorSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCedulaConductorSalidasKeyTyped(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel72.setText("Nombre:");

        txfNombreConductorSalidas.setEditable(false);
        txfNombreConductorSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreConductorSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreConductorSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreConductorSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreConductorSalidasKeyTyped(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel73.setText("Apellido:");

        txfApellidoConductorSalidas.setEditable(false);
        txfApellidoConductorSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfApellidoConductorSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApellidoConductorSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellidoConductorSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfApellidoConductorSalidasKeyTyped(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel114.setText("Celular:");

        txfCelularConductorSalidas.setEditable(false);
        txfCelularConductorSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelularConductorSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularConductorSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelularConductorSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularConductorSalidasKeyTyped(evt);
            }
        });

        btnSiguienteConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguienteConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnSiguienteConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteConductor.setBorderPainted(false);
        btnSiguienteConductor.setContentAreaFilled(false);
        btnSiguienteConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguienteConductor.setNextFocusableComponent(txfCedulaConductorSalidas);
        btnSiguienteConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteConductorActionPerformed(evt);
            }
        });

        btnAnteriorConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorConductor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorConductor.setBorderPainted(false);
        btnAnteriorConductor.setContentAreaFilled(false);
        btnAnteriorConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorConductor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorConductorActionPerformed(evt);
            }
        });

        btnAnteriorConductor1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorConductor1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorConductor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor1.setBorderPainted(false);
        btnAnteriorConductor1.setContentAreaFilled(false);
        btnAnteriorConductor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorConductor1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorConductor1ActionPerformed(evt);
            }
        });

        txfPlacaSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPlacaSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlacaSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPlacaSalidasActionPerformed(evt);
            }
        });
        txfPlacaSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPlacaSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPlacaSalidasKeyTyped(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel132.setText("Placa:");

        btnLimpiarConductorSalidas.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarConductorSalidas.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarConductorSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiarConductorSalidas.setBorderPainted(false);
        btnLimpiarConductorSalidas.setContentAreaFilled(false);
        btnLimpiarConductorSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarConductorSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarConductorSalidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConductorPanelLayout = new javax.swing.GroupLayout(ConductorPanel);
        ConductorPanel.setLayout(ConductorPanelLayout);
        ConductorPanelLayout.setHorizontalGroup(
            ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConductorPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConductorPanelLayout.createSequentialGroup()
                        .addComponent(btnAnteriorConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnteriorConductor1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(673, 673, 673)
                        .addComponent(btnSiguienteConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConductorPanelLayout.createSequentialGroup()
                        .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109)
                            .addComponent(txfCedulaConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(txfNombreConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(txfApellidoConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114)
                            .addComponent(txfCelularConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(txfPlacaSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        ConductorPanelLayout.setVerticalGroup(
            ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConductorPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ConductorPanelLayout.createSequentialGroup()
                            .addComponent(jLabel109)
                            .addGap(6, 6, 6)
                            .addComponent(txfCedulaConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ConductorPanelLayout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addGap(6, 6, 6)
                            .addComponent(txfNombreConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ConductorPanelLayout.createSequentialGroup()
                            .addComponent(jLabel73)
                            .addGap(6, 6, 6)
                            .addComponent(txfApellidoConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ConductorPanelLayout.createSequentialGroup()
                            .addComponent(jLabel114)
                            .addGap(6, 6, 6)
                            .addComponent(txfCelularConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ConductorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel132)
                        .addGap(6, 6, 6)
                        .addComponent(txfPlacaSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ConductorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguienteConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnteriorConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnteriorConductor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarConductorSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        slidePanel.add(ConductorPanel, "card3");

        ClientePanel.setBackground(new java.awt.Color(255, 255, 255));
        ClientePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del Cliente"));

        btnSiguienteCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguienteCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnSiguienteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteCliente.setBorderPainted(false);
        btnSiguienteCliente.setContentAreaFilled(false);
        btnSiguienteCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguienteCliente.setNextFocusableComponent(IdentificacionComboSalidas);
        btnSiguienteCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha derecha.png"))); // NOI18N
        btnSiguienteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteClienteActionPerformed(evt);
            }
        });

        btnAnteriorCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente.setBorderPainted(false);
        btnAnteriorCliente.setContentAreaFilled(false);
        btnAnteriorCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorClienteActionPerformed(evt);
            }
        });

        IdentificacionComboSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IdentificacionComboSalidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de Ciudadanía", "NIT" }));
        IdentificacionComboSalidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IdentificacionComboSalidasItemStateChanged(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel126.setText("Tipo de Identificación:");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel127.setText("Nit/Cédula:");

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel128.setText("Nombre Completo:");

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel129.setText("Teléfono:");

        btnNuevoCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnNuevoCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-group.png"))); // NOI18N
        btnNuevoCliente1.setBorderPainted(false);
        btnNuevoCliente1.setContentAreaFilled(false);
        btnNuevoCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/add-group.png"))); // NOI18N
        btnNuevoCliente1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/add-group.png"))); // NOI18N
        btnNuevoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCliente1ActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnHome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnLimpiarClienteSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarClienteSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarClienteSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiarClienteSalida.setBorderPainted(false);
        btnLimpiarClienteSalida.setContentAreaFilled(false);
        btnLimpiarClienteSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarClienteSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteSalidaActionPerformed(evt);
            }
        });

        txfIdentificacionClienteSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfIdentificacionClienteSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentificacionClienteSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdentificacionClienteSalidasActionPerformed(evt);
            }
        });
        txfIdentificacionClienteSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfIdentificacionClienteSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdentificacionClienteSalidasKeyTyped(evt);
            }
        });

        txfNombreClienteSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreClienteSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreClienteSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreClienteSalidasActionPerformed(evt);
            }
        });
        txfNombreClienteSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreClienteSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreClienteSalidasKeyTyped(evt);
            }
        });

        txfTelefonoClienteSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfTelefonoClienteSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTelefonoClienteSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTelefonoClienteSalidasActionPerformed(evt);
            }
        });
        txfTelefonoClienteSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTelefonoClienteSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfTelefonoClienteSalidasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout ClientePanelLayout = new javax.swing.GroupLayout(ClientePanel);
        ClientePanel.setLayout(ClientePanelLayout);
        ClientePanelLayout.setHorizontalGroup(
            ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ClientePanelLayout.createSequentialGroup()
                        .addComponent(btnAnteriorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarClienteSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(676, 676, 676)
                        .addComponent(btnSiguienteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientePanelLayout.createSequentialGroup()
                        .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel126)
                            .addComponent(IdentificacionComboSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel127)
                            .addComponent(txfIdentificacionClienteSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128)
                            .addComponent(txfNombreClienteSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel129)
                            .addGroup(ClientePanelLayout.createSequentialGroup()
                                .addComponent(txfTelefonoClienteSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        ClientePanelLayout.setVerticalGroup(
            ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(jLabel126)
                    .addComponent(jLabel127)
                    .addComponent(jLabel129))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IdentificacionComboSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfIdentificacionClienteSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfNombreClienteSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfTelefonoClienteSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguienteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnteriorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarClienteSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        slidePanel.add(ClientePanel, "card3");

        VentaPanel.setBackground(new java.awt.Color(255, 255, 255));
        VentaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la venta"));
        VentaPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VentaPanelKeyTyped(evt);
            }
        });

        btnAnteriorCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorCliente1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente1.setBorderPainted(false);
        btnAnteriorCliente1.setContentAreaFilled(false);
        btnAnteriorCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorCliente1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorCliente1ActionPerformed(evt);
            }
        });

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel122.setText("Especie:");

        btnSeleccionarEspecieSalidas.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieSalidas.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojo.png"))); // NOI18N
        btnSeleccionarEspecieSalidas.setBorderPainted(false);
        btnSeleccionarEspecieSalidas.setFocusPainted(false);
        btnSeleccionarEspecieSalidas.setNextFocusableComponent(txfCantidadSalidas);
        btnSeleccionarEspecieSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspecieSalidasActionPerformed(evt);
            }
        });

        txfEspecieSalidas.setEditable(false);
        txfEspecieSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfEspecieSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEspecieSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfEspecieSalidasKeyReleased(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel123.setText("Cantidad:");

        txfCantidadSalidas.setEditable(false);
        txfCantidadSalidas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfCantidadSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCantidadSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCantidadSalidasKeyTyped(evt);
            }
        });

        btnQuitar1.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnQuitar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnQuitar1.setBorderPainted(false);
        btnQuitar1.setContentAreaFilled(false);
        btnQuitar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitar1ActionPerformed(evt);
            }
        });

        btnAnteriorConductor3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorConductor3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorConductor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor3.setBorderPainted(false);
        btnAnteriorConductor3.setContentAreaFilled(false);
        btnAnteriorConductor3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorConductor3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorConductor3ActionPerformed(evt);
            }
        });

        btnLimpiarInfVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarInfVenta.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarInfVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiarInfVenta.setBorderPainted(false);
        btnLimpiarInfVenta.setContentAreaFilled(false);
        btnLimpiarInfVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarInfVenta.setNextFocusableComponent(btnSeleccionarEspecieSalidas);
        btnLimpiarInfVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarInfVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentaPanelLayout = new javax.swing.GroupLayout(VentaPanel);
        VentaPanel.setLayout(VentaPanelLayout);
        VentaPanelLayout.setHorizontalGroup(
            VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentaPanelLayout.createSequentialGroup()
                        .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addGap(10, 10, 10)
                                .addComponent(btnSeleccionarEspecieSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfEspecieSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123)
                            .addComponent(txfCantidadSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(btnQuitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentaPanelLayout.createSequentialGroup()
                        .addComponent(btnAnteriorCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnteriorConductor3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiarInfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        VentaPanelLayout.setVerticalGroup(
            VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentaPanelLayout.createSequentialGroup()
                        .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentaPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel122))
                            .addComponent(btnSeleccionarEspecieSalidas))
                        .addGap(6, 6, 6)
                        .addComponent(txfEspecieSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentaPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel123)
                        .addGap(6, 6, 6)
                        .addComponent(txfCantidadSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentaPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnQuitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAnteriorConductor3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAnteriorCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarInfVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        slidePanel.add(VentaPanel, "card3");

        PerdidaPanel.setBackground(new java.awt.Color(255, 255, 255));
        PerdidaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la pérdida"));

        btnAnteriorCliente2.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorCliente2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente2.setBorderPainted(false);
        btnAnteriorCliente2.setContentAreaFilled(false);
        btnAnteriorCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorCliente2.setFocusable(false);
        btnAnteriorCliente2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorCliente2ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel124.setText("Especie:");

        btnSeleccionarEspeciePerdida.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspeciePerdida.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspeciePerdida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojo.png"))); // NOI18N
        btnSeleccionarEspeciePerdida.setBorderPainted(false);
        btnSeleccionarEspeciePerdida.setFocusPainted(false);
        btnSeleccionarEspeciePerdida.setNextFocusableComponent(btnQuitar2);
        btnSeleccionarEspeciePerdida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspeciePerdidaActionPerformed(evt);
            }
        });

        txfEspeciePerdida.setEditable(false);
        txfEspeciePerdida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfEspeciePerdida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEspeciePerdida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEspeciePerdidaActionPerformed(evt);
            }
        });
        txfEspeciePerdida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfEspeciePerdidaKeyReleased(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel125.setText("Cantidad perdida:");

        txfCantidadPerdida.setEditable(false);
        txfCantidadPerdida.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfCantidadPerdida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCantidadPerdida.setNextFocusableComponent(btnSeleccionarEspeciePerdida);
        txfCantidadPerdida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCantidadPerdidaKeyTyped(evt);
            }
        });

        btnQuitar2.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnQuitar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnQuitar2.setBorderPainted(false);
        btnQuitar2.setContentAreaFilled(false);
        btnQuitar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnQuitar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitar2ActionPerformed(evt);
            }
        });

        btnAnteriorConductor4.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorConductor4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorConductor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor4.setBorderPainted(false);
        btnAnteriorConductor4.setContentAreaFilled(false);
        btnAnteriorConductor4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorConductor4.setFocusable(false);
        btnAnteriorConductor4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorConductor4ActionPerformed(evt);
            }
        });

        btnLimpiarInfPerdida.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarInfPerdida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarInfPerdida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiarInfPerdida.setBorderPainted(false);
        btnLimpiarInfPerdida.setContentAreaFilled(false);
        btnLimpiarInfPerdida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarInfPerdida.setFocusable(false);
        btnLimpiarInfPerdida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarInfPerdidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PerdidaPanelLayout = new javax.swing.GroupLayout(PerdidaPanel);
        PerdidaPanel.setLayout(PerdidaPanelLayout);
        PerdidaPanelLayout.setHorizontalGroup(
            PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerdidaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerdidaPanelLayout.createSequentialGroup()
                        .addComponent(btnAnteriorCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnteriorConductor4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarInfPerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PerdidaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel124)
                        .addGap(10, 10, 10)
                        .addComponent(btnSeleccionarEspeciePerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfEspeciePerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125)
                    .addComponent(txfCantidadPerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnQuitar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        PerdidaPanelLayout.setVerticalGroup(
            PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerdidaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerdidaPanelLayout.createSequentialGroup()
                        .addGroup(PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PerdidaPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel124))
                            .addComponent(btnSeleccionarEspeciePerdida))
                        .addGap(6, 6, 6)
                        .addComponent(txfEspeciePerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PerdidaPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel125)
                        .addGap(6, 6, 6)
                        .addComponent(txfCantidadPerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PerdidaPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnQuitar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PerdidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAnteriorCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnteriorConductor4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarInfPerdida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        slidePanel.add(PerdidaPanel, "card3");

        TrasplantadoPanel.setBackground(new java.awt.Color(255, 255, 255));
        TrasplantadoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Trasplantar"));

        btnAnteriorCliente3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorCliente3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente3.setBorderPainted(false);
        btnAnteriorCliente3.setContentAreaFilled(false);
        btnAnteriorCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorCliente3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha izquierda.png"))); // NOI18N
        btnAnteriorCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorCliente3ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel130.setText("Especie:");

        btnSeleccionarEspecieReservas3.setBackground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas3.setForeground(new java.awt.Color(77, 123, 179));
        btnSeleccionarEspecieReservas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojo.png"))); // NOI18N
        btnSeleccionarEspecieReservas3.setBorderPainted(false);
        btnSeleccionarEspecieReservas3.setFocusPainted(false);
        btnSeleccionarEspecieReservas3.setNextFocusableComponent(btnTrasplantado);
        btnSeleccionarEspecieReservas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEspecieReservas3ActionPerformed(evt);
            }
        });

        txfEspecieTrasplantado.setEditable(false);
        txfEspecieTrasplantado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfEspecieTrasplantado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEspecieTrasplantado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfEspecieTrasplantadoKeyReleased(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel131.setText("Cantidad:");

        txfCantidadTrasplantado.setEditable(false);
        txfCantidadTrasplantado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfCantidadTrasplantado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCantidadTrasplantado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCantidadTrasplantadoKeyTyped(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel67.setText("Tamaño de Bolsa:");

        tamanoComboTrasplantado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tamanoComboTrasplantado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4x8", "18x34", "25x35" }));
        tamanoComboTrasplantado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamanoComboTrasplantadoItemStateChanged(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel68.setText("Rango:");

        rangoComboTrasplantado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rangoComboTrasplantado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< 20 cm", "20 - 40 cm", "40 - 60 cm" }));
        rangoComboTrasplantado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rangoComboTrasplantadoItemStateChanged(evt);
            }
        });

        btnAnteriorConductor5.setBackground(new java.awt.Color(255, 255, 255));
        btnAnteriorConductor5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAnteriorConductor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor5.setBorderPainted(false);
        btnAnteriorConductor5.setContentAreaFilled(false);
        btnAnteriorConductor5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnteriorConductor5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        btnAnteriorConductor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorConductor5ActionPerformed(evt);
            }
        });

        btnLimpiarInfTrasplantado.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarInfTrasplantado.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarInfTrasplantado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        btnLimpiarInfTrasplantado.setBorderPainted(false);
        btnLimpiarInfTrasplantado.setContentAreaFilled(false);
        btnLimpiarInfTrasplantado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarInfTrasplantado.setNextFocusableComponent(btnSeleccionarEspecieReservas3);
        btnLimpiarInfTrasplantado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarInfTrasplantadoActionPerformed(evt);
            }
        });

        btnTrasplantado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intercambio.png"))); // NOI18N
        btnTrasplantado.setBorderPainted(false);
        btnTrasplantado.setContentAreaFilled(false);
        btnTrasplantado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrasplantado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/intercambioOscuro.png"))); // NOI18N
        btnTrasplantado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intercambioOscuro.png"))); // NOI18N
        btnTrasplantado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intercambioOscuro.png"))); // NOI18N
        btnTrasplantado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasplantadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TrasplantadoPanelLayout = new javax.swing.GroupLayout(TrasplantadoPanel);
        TrasplantadoPanel.setLayout(TrasplantadoPanelLayout);
        TrasplantadoPanelLayout.setHorizontalGroup(
            TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addComponent(btnAnteriorCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnteriorConductor5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarInfTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel130)
                                .addGap(10, 10, 10)
                                .addComponent(btnSeleccionarEspecieReservas3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfEspecieTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(labelStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                                .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfCantidadTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(btnTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel68))
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addComponent(tamanoComboTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(rangoComboTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        TrasplantadoPanelLayout.setVerticalGroup(
            TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel130))
                            .addComponent(btnSeleccionarEspecieReservas3))
                        .addGap(6, 6, 6)
                        .addComponent(txfEspecieTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addGap(6, 6, 6)
                        .addComponent(txfCantidadTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addGap(6, 6, 6)
                        .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                                .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamanoComboTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rangoComboTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(btnTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStock, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrasplantadoPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(TrasplantadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAnteriorCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnteriorConductor5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarInfTrasplantado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        slidePanel.add(TrasplantadoPanel, "card3");

        btnRegistrarSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnRegistrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnRegistrarSalida.setBorderPainted(false);
        btnRegistrarSalida.setContentAreaFilled(false);
        btnRegistrarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarSalida.setFocusable(false);
        btnRegistrarSalida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarSalida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GenerarSalidaLayout = new javax.swing.GroupLayout(GenerarSalida);
        GenerarSalida.setLayout(GenerarSalidaLayout);
        GenerarSalidaLayout.setHorizontalGroup(
            GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerarSalidaLayout.createSequentialGroup()
                .addGroup(GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel115)
                        .addGap(6, 6, 6)
                        .addComponent(lblTotalSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addComponent(lblNumeroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel46))
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(slidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9)))
                .addGap(20, 20, 20))
        );
        GenerarSalidaLayout.setVerticalGroup(
            GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerarSalidaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18))
                    .addComponent(lblNumeroSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(slidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(lblTotalSalidas)))
                    .addGroup(GenerarSalidaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(GenerarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarSalida)
                            .addComponent(btnRegistrarSalida)
                            .addComponent(btnCancelarSalida))))
                .addGap(1032, 1032, 1032))
        );

        MenuSalida.addTab("Salidas", GenerarSalida);

        ConsultarSalida.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarSalida.setPreferredSize(new java.awt.Dimension(1214, 633));

        jLabel47.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel47.setText("CONSULTAR SALIDAS");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel116.setText("Buscar por ID:");

        txfBuscarConsultarSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarConsultarSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarConsultarSalida.setToolTipText("Busque por NIT, Cédula del cliente.");
        txfBuscarConsultarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarConsultarSalidaActionPerformed(evt);
            }
        });
        txfBuscarConsultarSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarConsultarSalidaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarConsultarSalidaKeyTyped(evt);
            }
        });

        tablaConsultarSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaConsultarSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConsultarSalidasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaConsultarSalidasMouseReleased(evt);
            }
        });
        tablaConsultarSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaConsultarSalidasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaConsultarSalidasKeyTyped(evt);
            }
        });
        jScrollPane10.setViewportView(tablaConsultarSalidas);

        btnBuscarSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnBuscarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar1.png"))); // NOI18N
        btnBuscarSalida.setBorderPainted(false);
        btnBuscarSalida.setContentAreaFilled(false);
        btnBuscarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarSalida.setNextFocusableComponent(motivoComboConsultarSalida);
        btnBuscarSalida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnBuscarSalida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar2.png"))); // NOI18N
        btnBuscarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSalidaActionPerformed(evt);
            }
        });

        motivoComboConsultarSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        motivoComboConsultarSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin motivo", "Venta", "Venta en vivero", "Donación", "Proyecto propio", "Pérdida", "Trasplantado", "Reserva" }));
        motivoComboConsultarSalida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                motivoComboConsultarSalidaItemStateChanged(evt);
            }
        });
        motivoComboConsultarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motivoComboConsultarSalidaActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel117.setText("Motivo de la salida:");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel118.setText("Desde:");

        fechaDesdeSalida.setDateFormatString("dd-MM-yyyy");
        fechaDesdeSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel120.setText("Hasta");

        fechaHastaSalida.setDateFormatString("dd-MM-yyyy");
        fechaHastaSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnLimpiarConsultarSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarConsultarSalida.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarConsultarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarConsultarSalida.setBorderPainted(false);
        btnLimpiarConsultarSalida.setContentAreaFilled(false);
        btnLimpiarConsultarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarConsultarSalida.setFocusable(false);
        btnLimpiarConsultarSalida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarConsultarSalida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarConsultarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarConsultarSalidaActionPerformed(evt);
            }
        });

        btnGenerarReporte.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarReporte.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remisionAzul.png"))); // NOI18N
        btnGenerarReporte.setBorderPainted(false);
        btnGenerarReporte.setContentAreaFilled(false);
        btnGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarReporte.setFocusable(false);
        btnGenerarReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/remisionAzulOscuro.png"))); // NOI18N
        btnGenerarReporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/remisionAzulOscuro.png"))); // NOI18N
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        btnGenerarExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarExcel.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGenerarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excel.png"))); // NOI18N
        btnGenerarExcel.setBorderPainted(false);
        btnGenerarExcel.setContentAreaFilled(false);
        btnGenerarExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarExcel.setFocusable(false);
        btnGenerarExcel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/excelOscuro.png"))); // NOI18N
        btnGenerarExcel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/excelOscuro.png"))); // NOI18N
        btnGenerarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultarSalidaLayout = new javax.swing.GroupLayout(ConsultarSalida);
        ConsultarSalida.setLayout(ConsultarSalidaLayout);
        ConsultarSalidaLayout.setHorizontalGroup(
            ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10)
                            .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel117)
                                    .addComponent(motivoComboConsultarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaDesdeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel118))
                                .addGap(30, 30, 30)
                                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel120)
                                    .addComponent(fechaHastaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel116)
                                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                                        .addComponent(txfBuscarConsultarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel47))
                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnLimpiarConsultarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnGenerarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ConsultarSalidaLayout.setVerticalGroup(
            ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                        .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(jLabel120))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaDesdeSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(fechaHastaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel117)
                        .addGap(18, 18, 18)
                        .addComponent(motivoComboConsultarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultarSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBuscarConsultarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsultarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarConsultarSalida)
                    .addComponent(btnGenerarReporte)
                    .addComponent(btnGenerarExcel))
                .addContainerGap())
        );

        MenuSalida.addTab("Consultar", ConsultarSalida);

        Salidas.add(MenuSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        parent.add(Salidas, "card4");

        GestionarClientes.setBackground(new java.awt.Color(255, 255, 255));
        GestionarClientes.setPreferredSize(new java.awt.Dimension(1214, 460));

        btnEditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzul.png"))); // NOI18N
        btnEditarCliente.setBorderPainted(false);
        btnEditarCliente.setContentAreaFilled(false);
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/editarAzulOscuro.png"))); // NOI18N
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar.png"))); // NOI18N
        btnEliminarCliente.setToolTipText("Eliminar Especie");
        btnEliminarCliente.setBorderPainted(false);
        btnEliminarCliente.setContentAreaFilled(false);
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.setNextFocusableComponent(btnLimpiarClientes);
        btnEliminarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Quitar2.0.png"))); // NOI18N
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel50.setText("GESTIONAR CLIENTES");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaClientesMouseReleased(evt);
            }
        });
        tablaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaClientesKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tablaClientes);

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel143.setText("Nombre Completo:");

        txfNombreClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombreClientes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreClientesActionPerformed(evt);
            }
        });
        txfNombreClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreClientesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreClientesKeyTyped(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel144.setText("Celular:");

        txfCelularClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCelularClientes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCelularClientesActionPerformed(evt);
            }
        });
        txfCelularClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCelularClientesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularClientesKeyTyped(evt);
            }
        });

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel146.setText("ID Cliente:");

        txfIdClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfIdClientes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdClientesActionPerformed(evt);
            }
        });
        txfIdClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfIdClientesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdClientesKeyTyped(evt);
            }
        });

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel147.setText("Buscar:");

        txfBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscarCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarClienteKeyTyped(evt);
            }
        });

        btnLimpiarClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarClientes.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzul.png"))); // NOI18N
        btnLimpiarClientes.setBorderPainted(false);
        btnLimpiarClientes.setContentAreaFilled(false);
        btnLimpiarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarClientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarAzulOscuro.png"))); // NOI18N
        btnLimpiarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClientesActionPerformed(evt);
            }
        });

        btnGuardarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzul.png"))); // NOI18N
        btnGuardarCliente.setBorderPainted(false);
        btnGuardarCliente.setContentAreaFilled(false);
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.setEnabled(false);
        btnGuardarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarAzulOscuro.png"))); // NOI18N
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzul.png"))); // NOI18N
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.setContentAreaFilled(false);
        btnRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCliente.setNextFocusableComponent(TipoComboClientes);
        btnRegistrarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/registrarAzulOscuro.png"))); // NOI18N
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        TipoComboClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TipoComboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de Ciudadanía", "NIT" }));

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel153.setText("Tipo de Identificación:");

        javax.swing.GroupLayout GestionarClientesLayout = new javax.swing.GroupLayout(GestionarClientes);
        GestionarClientes.setLayout(GestionarClientesLayout);
        GestionarClientesLayout.setHorizontalGroup(
            GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarClientesLayout.createSequentialGroup()
                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionarClientesLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnLimpiarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarClientesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GestionarClientesLayout.createSequentialGroup()
                                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipoComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel153))
                                .addGap(30, 30, 30)
                                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel146))
                                .addGap(30, 30, 30)
                                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel143)
                                    .addComponent(txfNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel144)
                                    .addComponent(txfCelularClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GestionarClientesLayout.createSequentialGroup()
                                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel147)
                                    .addComponent(txfBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GestionarClientesLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionarClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        GestionarClientesLayout.setVerticalGroup(
            GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionarClientesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GestionarClientesLayout.createSequentialGroup()
                        .addComponent(jLabel144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCelularClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionarClientesLayout.createSequentialGroup()
                        .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel146)
                            .addComponent(jLabel153))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TipoComboClientes)
                            .addComponent(txfIdClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                    .addGroup(GestionarClientesLayout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel147)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnEditarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parent.add(GestionarClientes, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(side_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        if (verificarReserva() && verificarSalida()) {
            setColor(btn_1);
            ind_1.setOpaque(true);
            resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(PerfilGerente);
            parent.repaint();
            parent.revalidate();
            lblNumUsuarios.setText(numUsuarios());
            lblNumReservas.setText(numReservas());
            lblNumSalidas.setText(numSalidas(mesActual()));
            mostrarProductosAgotados();
        } else {

        }
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:
        if (verificarReserva() && verificarSalida()) {
            setColor(btn_2);
            ind_2.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarUsuarios);
            parent.repaint();
            parent.revalidate();
            desactivarCamposCUsuario();
            txfUsuario.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_2MousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        //drag this pane

    }//GEN-LAST:event_jPanel2MousePressed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_SignOutActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed

        Usuario_ u;

        if (txfUsuario.getText().trim().length() == 0 || txfNombre.getText().trim().length() == 0
                || txfApellido.getText().trim().length() == 0 || txfDireccion.getText().trim().length() == 0 || txfContraseña.getText().trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

        } else {

            if (txfCelular.getText().trim().length() != 10) {

                JOptionPane.showMessageDialog(null, "Ingrese un número de celular válido.");

            } else {

                try {

                    String usuario = txfUsuario.getText().trim();
                    String nombre = txfNombre.getText().trim();
                    String apellido = txfApellido.getText().trim();
                    String celular = txfCelular.getText().trim();
                    String direccion = txfDireccion.getText().trim();
                    String contraseña = txfContraseña.getText();
                    u = new Usuario_(usuario, contraseña, Cargo_.ENCARGADO, nombre, apellido, celular, direccion, Estado_.ACTIVO);

                    if (uDao.CrearUsuario(u)) {

                        JOptionPane.showMessageDialog(null, "Usuario creado correctamente.");

                        limpiarRUsuario();
                    } else {

                    }
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Error, verifique e inténtelo nuevamente.");
                }

            }
        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnEditarCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCUActionPerformed

        if (txfUsuario1.getText().length() == 0) {

        } else {
            activarCamposCUsuario();

            this.txfUsuario1.setEditable(false);
            this.btnEditarCU.setEnabled(false);
            this.btnGuardarCU.setEnabled(true);
            this.txfcontraseña_listarUsuario.setVisible(true);
            this.jLabel69.setVisible(true);
        }

        if (tablaUsuarios.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(tablaUsuarios, "Seleccione un usuario primero ");
        } else {
            if (tablaUsuarios.getValueAt(0, 0).equals("Sin resultados...")) {
                JOptionPane.showMessageDialog(tablaUsuarios, "Seleccione un usuario valido ");
            }
        }


    }//GEN-LAST:event_btnEditarCUActionPerformed

    private void txfUsuario1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuario1KeyReleased


    }//GEN-LAST:event_txfUsuario1KeyReleased

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(0, 0, 0));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    private void resetColor1(JPanel panel) {

        panel.setBackground(new Color(0, 0, 0));

    }


    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked

        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar1MouseClicked

        if (Reservas.isShowing() && tablaReservas.getRowCount() != 0) {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar la reserva?" + "\n" + "Recuerde que debe dar click en el botón 'Reservar' para confirmar la reserva.", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                cancelarReserva();
                System.exit(0);

            }

        } else if (Salidas.isShowing() && tablaSalidas.getRowCount() != 0) {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar la salida?" + "\n" + "Recuerde que debe dar click en el botón 'Registrar' para confirmar la salida.", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                cancelarSalida();
                System.exit(0);

            }

        } else if (TrasplantadoPanel.isShowing() && txfEspecieTrasplantado.getText().length() != 0) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar el trasplantado?" + "\n" + "Recuerde que debe dar click en el botón 'Trasplantar' para confirmar la salida.", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                cancelarTrasplantado();
                System.exit(0);

            } else {
                System.exit(0);

            }

        } else {

            System.exit(0);

        }

    }//GEN-LAST:event_btnCerrar1MouseClicked

    private void txfNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombre1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombre1KeyReleased

    private void txfApellido1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellido1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellido1KeyReleased

    private void txfCelular1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelular1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelular1KeyReleased

    private void txfDireccion1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDireccion1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDireccion1KeyReleased

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased

        if (txfBuscar.getText().length() == 0) {

            limpiarTablaUsuarios();

        } else {

            listarUsuarios();
        }
    }//GEN-LAST:event_txfBuscarKeyReleased

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked

        if (tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1 && estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("ACTIVOS")) {

                seleccionarUsuario();

            } else if (evt.getClickCount() == 1 && estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                seleccionarUsuario();
                this.btnEditarCU.setEnabled(false);

            } else if (evt.getClickCount() == 2 && estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                activarUsuario();

            }
        }

    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCUsuario();
        desactivarCamposCUsuario();
        this.btnGuardarCU.setEnabled(false);
        this.btnEditarCU.setEnabled(true);
        txfBuscar.setText(null);
        limpiarTablaUsuarios();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCUActionPerformed

        if (txfUsuario1.getText().trim().length() == 0 || txfNombre1.getText().trim().length() == 0 || txfApellido1.getText().trim().length() == 0
                || txfDireccion1.getText().trim().length() == 0 || txfcontraseña_listarUsuario.getText().trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

        } else {

            if (txfCelular1.getText().trim().length() != 10) {

                JOptionPane.showMessageDialog(null, "Ingrese un número de celular válido.");

            } else {

                try {

                    String usuario = txfUsuario1.getText().trim();
                    String nombre = txfNombre1.getText().trim();
                    String apellido = txfApellido1.getText().trim();
                    long celular = Long.parseLong(txfCelular1.getText());
                    String direccion = txfDireccion1.getText().trim();
                    String contraseña = txfcontraseña_listarUsuario.getText().trim();

                    if (uDao.actualizar(usuario, contraseña, nombre, apellido, celular, direccion)) {
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
                        this.btnEditarCU.setEnabled(true);
                        this.btnGuardarCU.setEnabled(false);
                        buscarUsuario(usuario);
                        limpiarCUsuario();
                        desactivarCamposCUsuario();

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo actualizar, inténtelo nuevamente.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }

    }//GEN-LAST:event_btnGuardarCUActionPerformed

    private void tablaUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseReleased

        if (tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1 && estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("ACTIVOS")) {

                seleccionarUsuario();

            } else if (evt.getClickCount() == 1 && estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                seleccionarUsuario();
                this.btnEditarCU.setEnabled(false);

            } else if (evt.getClickCount() == 2 && estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                activarUsuario();

            }
        }
    }//GEN-LAST:event_tablaUsuariosMouseReleased

    private void txfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

    }//GEN-LAST:event_txfBuscarKeyTyped

    private void estadoComboCUItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_estadoComboCUItemStateChanged

        if (estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("ACTIVOS")) {

            desactivarCamposCUsuario();
            this.btnDesactivar.setEnabled(true);
            this.btnEditarCU.setEnabled(true);
            this.btnGuardarCU.setEnabled(false);
            this.btnLimpiar.setEnabled(true);
            this.txfBuscar.setEnabled(true);
            limpiarTablaUsuarios();
            limpiarCUsuario();
            txfBuscar.setText(null);
            tablaUsuarios.setForeground(Color.black);

        } else {

            if (estadoComboCU.getItemAt(estadoComboCU.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                mostrarUsuariosInactivos();
                desactivarCamposCUsuario();
                this.btnDesactivar.setEnabled(false);
                this.btnEditarCU.setEnabled(false);
                this.btnGuardarCU.setEnabled(false);
                this.btnLimpiar.setEnabled(false);
                this.txfBuscar.setEnabled(false);
                limpiarCUsuario();
            }

        }

    }//GEN-LAST:event_estadoComboCUItemStateChanged

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed

        desactivarUsuario();
        desactivarCamposCUsuario();
        limpiarTablaUsuarios();
        txfBuscar.setText(null);

    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btn_3consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3consultarEmpleados

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_3);
            ind_3.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarConductores);
            parent.repaint();
            parent.revalidate();
            txfCedulaConductor.requestFocus(true);
        } else {

        }

    }//GEN-LAST:event_btn_3consultarEmpleados

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
        if (verificarReserva() && verificarSalida()) {
            setColor(btn_3);
            ind_3.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarConductores);
            parent.repaint();
            parent.revalidate();
            txfCedulaConductor.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_3MousePressed

    private void btnDesactivarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarConductorActionPerformed
        desactivarConductor();
        txfBuscarConductor.setText(null);

    }//GEN-LAST:event_btnDesactivarConductorActionPerformed

    private void estadoComboConductorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_estadoComboConductorItemStateChanged

        if (estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("ACTIVOS")) {

            tablaConductores.setForeground(Color.black);
            limpiarTablaConductores();
            activarCamposConductor();
            this.btnDesactivarConductor.setEnabled(true);
            this.btnEditarConductor.setEnabled(true);
            this.btnGuardarConductor.setEnabled(false);
            this.btnLimpiarConductor.setEnabled(true);
            this.btnRegistrarConductor.setEnabled(true);
            this.txfBuscarConductor.setEnabled(true);
            limpiarConductor();

        } else {

            if (estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                limpiarTablaConductores();
                limpiarConductor();
                mostrarConductoresInactivos();
                desactivarCamposConductor();
                txfBuscarConductor.setText(null);
                this.btnDesactivarConductor.setEnabled(false);
                this.btnEditarConductor.setEnabled(false);
                this.btnGuardarConductor.setEnabled(false);
                this.btnLimpiarConductor.setEnabled(false);
                this.btnRegistrarConductor.setEnabled(false);
                txfBuscarConductor.setEnabled(false);
            }

        }

    }//GEN-LAST:event_estadoComboConductorItemStateChanged

    private void btnGuardarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConductorActionPerformed
        try {

            if (txfCedulaConductor.getText().trim().length() == 0 || txfNombreConductor.getText().trim().length() == 0
                    || txfApellidoConductor.getText().trim().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

            } else {

                if (txfCelularConductor.getText().trim().length() != 10) {

                    JOptionPane.showMessageDialog(null, "Ingrese un número de celular válido.");

                } else {

                    if (txfCedulaConductor.getText().trim().length() < 8 || txfCedulaConductor.getText().length() > 10) {

                        JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido.");

                    } else {

                        int cedula = Integer.parseInt(txfCedulaConductor.getText().trim());
                        String nombre = txfNombreConductor.getText().trim();
                        String apellido = txfApellidoConductor.getText().trim();
                        long celular = Long.parseLong(txfCelularConductor.getText().trim());

                        if (cDao.actualizar(Integer.toString(cedula), nombre, apellido, celular)) {
                            JOptionPane.showMessageDialog(null, "Conductor actualizado correctamente.");
                            buscarConductores(Integer.toString(cedula));
                            this.btnEditarConductor.setEnabled(true);
                            this.btnGuardarConductor.setEnabled(false);
                            this.btnRegistrarConductor.setEnabled(true);
                            limpiarConductor();
                            activarCamposConductor();

                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo actualizar, inténtelo nuevamente.");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_btnGuardarConductorActionPerformed

    private void btnLimpiarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarConductorActionPerformed
        // TODO add your handling code here:
        limpiarConductor();
        limpiarTablaConductores();
        txfBuscarConductor.setText(null);
        this.btnEditarConductor.setEnabled(true);
        this.btnGuardarConductor.setEnabled(false);
        this.btnRegistrarConductor.setEnabled(true);

    }//GEN-LAST:event_btnLimpiarConductorActionPerformed

    private void txfBuscarConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConductorKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }


    }//GEN-LAST:event_txfBuscarConductorKeyTyped

    private void txfBuscarConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConductorKeyReleased
        // TODO add your handling code here:
        try {

            if (txfBuscarConductor.getText().length() == 0) {

                limpiarTablaConductores();
                btnRegistrarConductor.setEnabled(true);

            } else {

                DefaultTableModel modelo;
                TableColumnModel column = tablaConductores.getColumnModel();

                if (estadoComboConductor.getSelectedIndex() == 0) {

                    modelo = cDao.listarActivos(this.txfBuscarConductor.getText());

                } else {

                    modelo = cDao.listarInactivos(this.txfBuscarConductor.getText());

                }
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tablaConductores.setModel(modelo);
                tcr.setHorizontalAlignment(SwingConstants.LEFT);
                tablaConductores.getColumnModel().getColumn(1).setCellRenderer(tcr);
                column.getColumn(1).setPreferredWidth(200);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txfBuscarConductorKeyReleased

    private void txfCedulaConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaConductorKeyReleased

    private void txfCelularConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularConductorKeyReleased

    private void txfNombreConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreConductorKeyReleased

    private void tablaConductoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConductoresMouseReleased

        if (tablaConductores.getValueAt(tablaConductores.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1 && estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("ACTIVOS")) {

                seleccionarConductor();

            } else if (evt.getClickCount() == 1 && estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                seleccionarConductor();
                this.btnEditarConductor.setEnabled(false);

            } else if (evt.getClickCount() == 2 && estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                activarConductor();

            }
        }
    }//GEN-LAST:event_tablaConductoresMouseReleased

    private void tablaConductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConductoresMouseClicked

        if (tablaConductores.getValueAt(tablaConductores.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1 && estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("ACTIVOS")) {

                seleccionarConductor();

            } else if (evt.getClickCount() == 1 && estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                seleccionarConductor();
                this.btnEditarConductor.setEnabled(false);

            } else if (evt.getClickCount() == 2 && estadoComboConductor.getItemAt(estadoComboConductor.getSelectedIndex()).equalsIgnoreCase("INACTIVOS")) {

                activarConductor();

            }
        }

    }//GEN-LAST:event_tablaConductoresMouseClicked

    private void btnEditarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConductorActionPerformed
        // TODO add your handling code here:
        if (tablaConductores.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(tablaConductores, "Seleccione un conductor primero ");
        } else {
            if (tablaConductores.getValueAt(0, 0).equals("Sin resultados...")) {
                JOptionPane.showMessageDialog(tablaConductores, "Seleccione un conductor valido ");
            }
        }

        if (txfCedulaConductor.getText().length() == 0) {

        } else {

            activarCamposConductor();
            this.txfCedulaConductor.setEditable(false);
            this.btnEditarConductor.setEnabled(false);
            this.btnGuardarConductor.setEnabled(true);

        }


    }//GEN-LAST:event_btnEditarConductorActionPerformed

    private void txfApellidoConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoConductorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidoConductorKeyReleased

    private void btnRegistrarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConductorActionPerformed

        try {

            if (txfCedulaConductor.getText().trim().length() == 0 || txfNombreConductor.getText().trim().length() == 0
                    || txfApellidoConductor.getText().trim().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

            } else {

                if (txfCelularConductor.getText().trim().length() != 10) {

                    JOptionPane.showMessageDialog(null, "Ingrese un número de celular válido.");

                } else {

                    if (txfCedulaConductor.getText().trim().length() < 8 || txfCedulaConductor.getText().length() > 10) {

                        JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido.");

                    } else {

                        Conductor_ c;
                        int cedula = Integer.parseInt(txfCedulaConductor.getText().trim());
                        String nombre = txfNombreConductor.getText().trim();
                        String apellido = txfApellidoConductor.getText().trim();
                        String celular = txfCelularConductor.getText().trim();

                        c = new Conductor_(nombre, apellido, cedula, celular, Estado_.ACTIVO);

                        if (cDao.CrearConductor(c)) {

                            JOptionPane.showMessageDialog(null, "Conductor creado correctamente.");
                            limpiarConductor();

                        } else {

                        }
                    }
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error, verifique que su información esté correcta (La cédula debe tener 10 dígitos)");

        }
    }//GEN-LAST:event_btnRegistrarConductorActionPerformed

    private void btn_4consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4consultarEmpleados
        // TODO add your handling code here:
        if (verificarReserva() && verificarSalida()) {
            setColor(btn_4);
            ind_4.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarProveedores);
            parent.repaint();
            parent.revalidate();
            txfNitProv.requestFocus(true);
        }
    }//GEN-LAST:event_btn_4consultarEmpleados

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_4);
            ind_4.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarProveedores);
            parent.repaint();
            parent.revalidate();
            txfNitProv.requestFocus(true);
        }
    }//GEN-LAST:event_btn_4MousePressed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        // TODO add your handling code here:

        if (txfNitProv.getText().length() == 0) {

        } else {

            activarCamposProveedor();
            this.txfNitProv.setEditable(false);
            this.btnEditarProveedor.setEnabled(false);
            this.btnGuardarProveedor.setEnabled(true);
        }
        if (tablaProveedores.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(tablaProveedores, "Seleccione un proveedor primero ");
        } else {
            if (tablaProveedores.getValueAt(0, 0).equals("Sin resultados...")) {
                JOptionPane.showMessageDialog(tablaProveedores, "Seleccione un proveedor valido ");
            }
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked

        if (tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1) {

                seleccionarProveedor();

            }
        }
    }//GEN-LAST:event_tablaProveedoresMouseClicked

    private void tablaProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseReleased

        if (tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1) {

                seleccionarProveedor();

            }
        }
    }//GEN-LAST:event_tablaProveedoresMouseReleased

    private void txfNombreProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreProvKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreProvKeyReleased

    private void txfCelularProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularProvKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularProvKeyReleased

    private void txfCorreoProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCorreoProvKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCorreoProvKeyReleased

    private void txfNitProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNitProvKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNitProvKeyReleased

    private void txfBuscarProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarProvKeyReleased
        // TODO add your handling code here:
        try {

            if (txfBuscarProv.getText().length() == 0) {

                int x = tablaProveedores.getRowCount() - 1;
                DefaultTableModel modelo = (DefaultTableModel) tablaProveedores.getModel();

                for (int i = 0; i <= x; i++) {

                    modelo.removeRow(i);

                }

                tablaProveedores.setModel(modelo);

            } else {

                DefaultTableModel modelo;
                TableColumnModel column = tablaProveedores.getColumnModel();
                modelo = pDao.listar(txfBuscarProv.getText());
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tablaProveedores.setModel(modelo);
                tcr.setHorizontalAlignment(SwingConstants.LEFT);
                tablaProveedores.getColumnModel().getColumn(1).setCellRenderer(tcr);
                column.getColumn(1).setPreferredWidth(200);

            }

        } catch (Exception e) {

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

    private void btnLimpiarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedorActionPerformed
        // TODO add your handling code here:
        limpiarProveedor();
        limpiarTablaProveedor();
        txfBuscarProv.setText(null);
        this.btnEditarProveedor.setEnabled(true);
        this.btnGuardarProveedor.setEnabled(false);
        this.btnRegistrarProv.setEnabled(true);

    }//GEN-LAST:event_btnLimpiarProveedorActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        try {

            if (txfNombreProv.getText().length() == 0 || txfUbicacion.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

            } else {

                if (txfNitProv.getText().length() > 12 || txfNitProv.getText().length() < 10) {

                    JOptionPane.showMessageDialog(null, "Ingrese un NIT válido, por favor.");

                } else {
                    if (txfCelularProv.getText().length() > 10) {

                        JOptionPane.showMessageDialog(null, "Ingrese un celular valido, por favor.");

                    } else if (txfCelularProv.getText().length() == 0) {

                        JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor");

                    } else {

                        if (txfCorreoProv.getText().length() != 0 && !txfCorreoProv.getText().contains("@")) {

                            JOptionPane.showMessageDialog(null, "Ingrese un correo válido, asegúrese de que el correo contenga @." + "\n" + "Por ejemplo: correo@gmail.com, correo@hotmail.com");

                        } else {

                            if (!txfNitProv.getText().contains("-")) {

                                JOptionPane.showMessageDialog(null, "Digite el guión en el NIT." + "\n" + "Por ejemplo: 1234567890-5");

                            } else {

                                String nit = txfNitProv.getText().trim();
                                String nombre = txfNombreProv.getText().trim();
                                long celular = Long.parseLong(txfCelularProv.getText().trim());
                                String correo = txfCorreoProv.getText().trim();
                                String ubicacion = txfUbicacion.getText().trim();

                                if (pDao.actualizar(nit, nombre, celular, correo, ubicacion)) {
                                    JOptionPane.showMessageDialog(null, "Proveedor actualizado correctamente.");
                                    this.btnEditarProveedor.setEnabled(true);
                                    this.btnGuardarProveedor.setEnabled(false);
                                    this.btnRegistrarProv.setEnabled(true);
                                    String busca = this.txfNitProv.getText();
                                    buscarProveedores(busca);
                                    limpiarProveedor();
                                    activarCamposProveedor();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se pudo actualizar, inténtelo nuevamente.");
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnRegistrarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProvActionPerformed

        try {

            if (txfNitProv.getText().trim().length() == 0 || txfNombreProv.getText().trim().length() == 0 || txfUbicacion.getText().trim().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

            } else {

                if (txfNitProv.getText().trim().length() > 12 || txfNitProv.getText().trim().length() < 8) {

                    JOptionPane.showMessageDialog(null, "Ingrese un NIT válido, por favor.");

                } else {
                    if (txfCelularProv.getText().length() > 10) {

                        JOptionPane.showMessageDialog(null, "Ingrese un celular valido, por favor.");

                    } else {

                        if (txfCorreoProv.getText().length() != 0 && !txfCorreoProv.getText().contains("@")) {

                            JOptionPane.showMessageDialog(null, "Ingrese un correo válido, asegúrese de que el correo contenga @." + "\n" + "Por ejemplo: correo@gmail.com, correo@hotmail.com");

                        } else {

                            if (!txfNitProv.getText().contains("-")) {

                                JOptionPane.showMessageDialog(null, "Digite el guión en el NIT." + "\n" + "Por ejemplo: 1234567890-5");

                            } else {

                                Proveedor_ p;
                                String nit = txfNitProv.getText().trim();
                                String nombre = txfNombreProv.getText().trim();
                                String celular = txfCelularProv.getText().trim();
                                String correo = txfCorreoProv.getText().trim();
                                String ubicacion = txfUbicacion.getText().trim();

                                p = new Proveedor_(nit, nombre, celular, correo, ubicacion);

                                if (pDao.CrearProveedor(p)) {

                                    JOptionPane.showMessageDialog(null, "Proveedor creado correctamente.");
                                    limpiarProveedor();

                                } else {

                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarProvActionPerformed

    private void btn_5consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5consultarEmpleados

        try {

            if (verificarReserva() && verificarSalida()) {
                setColor(btn_5);
                ind_5.setOpaque(true);
                resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_6, ind_7, ind_8, ind_10, ind_11});
                parent.removeAll();
                parent.add(IngresarEspecie);
                parent.repaint();
                parent.revalidate();
                java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
                fechaIngreso.setDate(fechaParseada);
                fechaDesde.setDate(fechaParseada);
                fechaHasta.setDate(fechaParseada);
                buscarIngresosFecha(fechaActual(), fechaActual());
                btnSeleccionarProveedor.requestFocus(true);
            } else {

            }
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btn_5consultarEmpleados

    private void btn_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MousePressed

        try {

            if (verificarReserva() && verificarSalida()) {
                setColor(btn_5);
                ind_5.setOpaque(true);
                resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_6, ind_7, ind_8, ind_10, ind_11});
                parent.removeAll();
                parent.add(IngresarEspecie);
                parent.repaint();
                parent.revalidate();
                java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
                fechaIngreso.setDate(fechaParseada);
                fechaDesde.setDate(fechaParseada);
                fechaHasta.setDate(fechaParseada);
                buscarIngresosFecha(fechaActual(), fechaActual());
                btnSeleccionarProveedor.requestFocus(true);
            } else {

            }
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btn_5MousePressed

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_2);
            ind_2.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarUsuarios);
            parent.repaint();
            parent.revalidate();
            desactivarCamposCUsuario();
            txfUsuario.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_6consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6consultarEmpleados

        reiniciarInventario();

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_6);
            ind_6.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(Inventario);
            txfBuscarInventario.requestFocus();
            txfBuscarInventario.selectAll();
            parent.repaint();
            parent.revalidate();
        } else {

        }
    }//GEN-LAST:event_btn_6consultarEmpleados

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        reiniciarInventario();

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_6);
            ind_6.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(Inventario);
            txfBuscarInventario.requestFocus();
            txfBuscarInventario.selectAll();
            parent.repaint();
            parent.revalidate();
        } else {

        }
    }//GEN-LAST:event_btn_6MousePressed

    private void txfEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfEspecieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEspecieKeyReleased

    private void txfCostoIngresarEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCostoIngresarEspecieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCostoIngresarEspecieKeyReleased

    private void txfNitIngresarEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNitIngresarEspecieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNitIngresarEspecieKeyReleased

    private void btnLimpiarProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedor1ActionPerformed

        limpiarIngresarEspecie();

    }//GEN-LAST:event_btnLimpiarProveedor1ActionPerformed

    private void btnIngresarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEspecieActionPerformed

        ingresarEspecie();

    }//GEN-LAST:event_btnIngresarEspecieActionPerformed

    private void txfBuscarEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarEspecieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarEspecieKeyReleased

    private void txfUbicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUbicacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfUbicacionKeyReleased

    private void btnLimpiarProveedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedor2ActionPerformed

        try {

            Calendar fecha1 = fechaDesde.getCalendar();
            Calendar fecha2 = fechaHasta.getCalendar();
            String fechaInicio = Integer.toString(fecha1.get(Calendar.YEAR)) + "-" + Integer.toString(fecha1.get(Calendar.MONTH) + 1) + "-" + Integer.toString(fecha1.get(Calendar.DAY_OF_MONTH));
            String fechaFin = Integer.toString(fecha2.get(Calendar.YEAR)) + "-" + Integer.toString(fecha2.get(Calendar.MONTH) + 1) + "-" + Integer.toString(fecha2.get(Calendar.DAY_OF_MONTH));

            if (txfBuscarEspecie.getText().length() == 0) {

                buscarIngresosFecha(fechaInicio, fechaFin);

            } else {

                String busca = txfBuscarEspecie.getText();
                buscarIngresos(busca, fechaInicio, fechaFin);

            }

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, "Digite toda la información de la búsqueda con fechas válidas.");

        }
    }//GEN-LAST:event_btnLimpiarProveedor2ActionPerformed

    private void tablaProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProveedoresKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProveedoresKeyReleased

    private void txfUsuario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuario1KeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (Character.isSpaceChar(c)) {

            evt.consume();

        }

        if (txfUsuario1.getText().length() > 14) {

            evt.consume();

        }

    }//GEN-LAST:event_txfUsuario1KeyTyped

    private void txfNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombre1KeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txfNombre1.getText().length() > 14) {

            evt.consume();
        }

    }//GEN-LAST:event_txfNombre1KeyTyped

    private void txfApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellido1KeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txfApellido1.getText().length() > 19) {

            evt.consume();
        }


    }//GEN-LAST:event_txfApellido1KeyTyped

    private void txfCelular1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelular1KeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCelular1.getText().length() > 9) {

            evt.consume();

        }

    }//GEN-LAST:event_txfCelular1KeyTyped

    private void txfDireccion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDireccion1KeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txfDireccion1.getText().length() > 29) {

            evt.consume();

        }


    }//GEN-LAST:event_txfDireccion1KeyTyped

    private void txfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuarioKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (Character.isSpaceChar(c)) {

            evt.consume();

        }

        if (txfUsuario.getText().length() > 19) {

            evt.consume();

        }

    }//GEN-LAST:event_txfUsuarioKeyTyped

    private void txfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombre.getText().length() > 29) {

            evt.consume();

        }

    }//GEN-LAST:event_txfNombreKeyTyped

    private void txfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfApellido.getText().length() > 29) {

            evt.consume();

        }

    }//GEN-LAST:event_txfApellidoKeyTyped

    private void txfCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCelular.getText()
                .length() > 9) {

            evt.consume();

        }

    }//GEN-LAST:event_txfCelularKeyTyped

    private void txfDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDireccionKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (txfDireccion.getText().length() > 29) {

            evt.consume();

        }

    }//GEN-LAST:event_txfDireccionKeyTyped

    private void txfCedulaConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaConductorKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCedulaConductor.getText().length() > 9) {

            evt.consume();

        }

    }//GEN-LAST:event_txfCedulaConductorKeyTyped

    private void txfNombreConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreConductorKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreConductor.getText().length() > 39) {

            evt.consume();

        }

    }//GEN-LAST:event_txfNombreConductorKeyTyped

    private void txfApellidoConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoConductorKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfApellidoConductor.getText().length() > 29) {

            evt.consume();

        }

    }//GEN-LAST:event_txfApellidoConductorKeyTyped

    private void txfCelularConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularConductorKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCelularConductor.getText().length() > 9) {

            evt.consume();

        }


    }//GEN-LAST:event_txfCelularConductorKeyTyped

    private void txfNitProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNitProvKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.toString(c).equals("-")) {

        } else {

            evt.consume();
        }

        if (txfNitProv.getText().length() > 11) {

            evt.consume();
        }


    }//GEN-LAST:event_txfNitProvKeyTyped

    private void txfNombreProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreProvKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreProv.getText().length() > 49) {

            evt.consume();
        }


    }//GEN-LAST:event_txfNombreProvKeyTyped

    private void txfCelularProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularProvKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCelularProv.getText().length() > 9) {

            evt.consume();
        }


    }//GEN-LAST:event_txfCelularProvKeyTyped

    private void txfUbicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUbicacionKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfUbicacion.getText().length() > 29) {

            evt.consume();
        }

    }//GEN-LAST:event_txfUbicacionKeyTyped

    private void txfCostoIngresarEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCostoIngresarEspecieKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {

            evt.consume();

        }
        if (txfCostoIngresarEspecie.getText().length() > 5) {

            evt.consume();

        }


    }//GEN-LAST:event_txfCostoIngresarEspecieKeyTyped

    private void txfBuscarEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarEspecieKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }
    }//GEN-LAST:event_txfBuscarEspecieKeyTyped

    private void btnSeleccionarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProveedorActionPerformed

        ventanaProveedores.setVisible(true);

    }//GEN-LAST:event_btnSeleccionarProveedorActionPerformed

    private void btnSeleccionarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspecieActionPerformed

        reiniciarSeleccionarEspecie();
        ventanaEspecies.setVisible(true);
    }//GEN-LAST:event_btnSeleccionarEspecieActionPerformed

    private void txfCantidadIngresarEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadIngresarEspecieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadIngresarEspecieKeyReleased

    private void txfCantidadIngresarEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadIngresarEspecieKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {

            evt.consume();

        }
        if (txfCantidadIngresarEspecie.getText().length() > 5) {

            evt.consume();

        }


    }//GEN-LAST:event_txfCantidadIngresarEspecieKeyTyped

    private void tamanoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamanoComboItemStateChanged

        if (tamanoCombo.getSelectedIndex() == 0) {

            rangoCombo.removeAllItems();
            rangoCombo.addItem("< 20 cm");
            rangoCombo.addItem("20 - 40 cm");
            rangoCombo.addItem("40 - 60 cm");
            rangoCombo.setSelectedIndex(-1);

        } else if (tamanoCombo.getSelectedIndex() == 1) {

            rangoCombo.removeAllItems();
            rangoCombo.addItem("< 60 cm");
            rangoCombo.addItem("60 - 100 cm");
            rangoCombo.addItem("100 - 150 cm");
            rangoCombo.addItem("> 150 cm");
            rangoCombo.setSelectedIndex(-1);

        } else if (tamanoCombo.getSelectedIndex() == 2) {

            rangoCombo.removeAllItems();
            rangoCombo.addItem("100 - 150 cm");
            rangoCombo.addItem("> 150 cm");
            rangoCombo.setSelectedIndex(-1);

        }


    }//GEN-LAST:event_tamanoComboItemStateChanged

    private void btnEditarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInventarioActionPerformed
        try {

            if (tablaInventario.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(tablaInventario, "Seleccione un item de la tabla primero. ");

            } else if (tablaInventario.getValueAt(tablaInventario.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

            } else {

                int costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo costo  "));
                int codigo = Integer.parseInt(tablaInventario.getValueAt(tablaInventario.getSelectedRow(), 0).toString());
                if (costo <= 0) {
                    JOptionPane.showMessageDialog(null, "El costo debe ser mayor a cero");
                } else {
                    if (iDao.actualizarCosto(costo, codigo)) {

                        buscarEspecieInventario();
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado, intentalo de nuevo ");
                    }

                }
            }
        } catch (NumberFormatException n) {
        }
    }//GEN-LAST:event_btnEditarInventarioActionPerformed

    private void tablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioMouseClicked


    }//GEN-LAST:event_tablaInventarioMouseClicked

    private void tablaInventarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaInventarioMouseReleased

    private void tablaInventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaInventarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaInventarioKeyReleased

    private void txfBuscarInventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarInventarioKeyReleased

        if (txfBuscarInventario.getText().length() == 0) {

            limpiarTablaInventario();

        } else {

            buscarEspecieInventario();
        }


    }//GEN-LAST:event_txfBuscarInventarioKeyReleased

    private void txfBuscarInventarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarInventarioKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

    }//GEN-LAST:event_txfBuscarInventarioKeyTyped

    private void rangoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rangoComboItemStateChanged

        if (txfEspecie.getText().length() != 0 && tamanoCombo.getSelectedIndex() != -1 && rangoCombo.getSelectedIndex() != -1) {

            consultarEspecie();

        } else {

            txfCostoIngresarEspecie.setText(null);
            txfCostoIngresarEspecie.setEditable(false);
        }

    }//GEN-LAST:event_rangoComboItemStateChanged

    private void txfCostoCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCostoCompraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCostoCompraKeyReleased

    private void txfCostoCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCostoCompraKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {

            evt.consume();

        }
        if (txfCostoCompra.getText().length() > 5) {

            evt.consume();

        }

    }//GEN-LAST:event_txfCostoCompraKeyTyped

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        ventanaExcel.TipoCombo.setEnabled(true);
        ventanaExcel.setVisible(true);

    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btn_7consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7consultarEmpleados

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_7);
            ind_7.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(Salidas);
            parent.repaint();
            parent.revalidate();
            obtenerMAXsalida();
            motivoCombo.requestFocus(true);
        } else {

        }

    }//GEN-LAST:event_btn_7consultarEmpleados

    private void btn_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MousePressed

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_7);
            ind_7.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(Salidas);
            parent.repaint();
            parent.revalidate();
            obtenerMAXsalida();
            motivoCombo.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_7MousePressed

    private void btn_8consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8consultarEmpleados

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_8);
            ind_8.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_10, ind_11});
            parent.removeAll();
            parent.add(Reservas);
            parent.repaint();
            parent.revalidate();
            lblFecha.setText(fechaActual());
            obtenerMAXreserva();
            IdentificacionCombo.requestFocus(true);
        }
    }//GEN-LAST:event_btn_8consultarEmpleados

    private void btn_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MousePressed

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_8);
            ind_8.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_10, ind_11});
            parent.removeAll();
            parent.add(Reservas);
            parent.repaint();
            parent.revalidate();
            lblFecha.setText(fechaActual());
            obtenerMAXreserva();
            IdentificacionCombo.requestFocus(true);
        }

    }//GEN-LAST:event_btn_8MousePressed

    private void tablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseClicked

        String codigo = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0).toString();
        String especie = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 1).toString();
        String rango = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 3).toString();
        String tamaño = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 4).toString();
        String cantidad = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 5).toString();
        txfEspecieReservas.setText(codigo + ". " + especie + ", " + tamaño + ", " + rango);
        txfCantidadReservas.setText(cantidad);


    }//GEN-LAST:event_tablaReservasMouseClicked

    private void tablaReservasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaReservasMouseReleased

    private void tablaReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaReservasKeyReleased

    private void txfIdentificacionReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionReservasKeyReleased

    private void txfIdentificacionReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionReservasKeyTyped

        char c = evt.getKeyChar();

        if (IdentificacionCombo.getSelectedItem().toString().equalsIgnoreCase("Cédula de Ciudadanía")) {

            if (Character.isDigit(c)) {

            } else {
                evt.consume();
            }

            if (txfIdentificacionReservas.getText().length() > 9) {
                evt.consume();
            }
        } else if (IdentificacionCombo.getSelectedItem().toString().equalsIgnoreCase("NIT")) {

            if (Character.isDigit(c) || Character.toString(c).equals("-")) {

            } else {

                evt.consume();
            }

            if (txfIdentificacionReservas.getText().length() > 11) {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txfIdentificacionReservasKeyTyped

    private void txfNombreReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreReservasKeyReleased

    private void txfNombreReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreReservasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreReservas.getText().length() > 29) {
            evt.consume();
        }


    }//GEN-LAST:event_txfNombreReservasKeyTyped

    private void txfTelefonoReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelefonoReservasKeyReleased

    private void btnLimpiarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarReservaActionPerformed

        if (tablaReservas.getRowCount() == 0) {
            limpiarReservas();
            limpiarTablaReservas();
        } else {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cancelar la reserva?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                cancelarReserva();

            } else {

            }
        }

    }//GEN-LAST:event_btnLimpiarReservaActionPerformed

    private void btnCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservaActionPerformed

        if (tablaReservas.getRowCount() != 0) {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cancelar la reserva?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                cancelarReserva();

            } else {

            }

        }


    }//GEN-LAST:event_btnCancelarReservaActionPerformed

    private void btnSeleccionarEspecieReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspecieReservasActionPerformed

        if (txfIdentificacionReservas.getText().trim().length() != 0) {

            reiniciarSeleccionarEspecie();
            ventanaEspeciesReservas.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Ingrese una identificación válida primero.");
        }
    }//GEN-LAST:event_btnSeleccionarEspecieReservasActionPerformed

    private void txfEspecieReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfEspecieReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEspecieReservasKeyReleased

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed

        try {

            if (tablaReservas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(tablaReservas, "Seleccione un item de la tabla para eliminar ");
            } else {
                int codigo_reserva = Integer.parseInt(lblNumeroReserva.getText());
                int codigo_ingreso = Integer.parseInt(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0).toString());
                int cantidad = Integer.parseInt(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 5).toString());
                String rango = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 3).toString();
                String tamaño = tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 4).toString();

                if (rDao.deshacerReserva(codigo_ingreso, cantidad, tamaño, rango)) {

                    if (rDao.eliminarReserva(codigo_reserva, cantidad, tamaño, rango)) {

                        mostrarEspeciesReservadas();
                        calcularTotal();
                        reiniciarSeleccionarEspecie();
                        txfEspecieReservas.setText(null);
                        txfCantidadReservas.setText(null);

                    } else {
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Hubo un error.");

                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void IdentificacionComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IdentificacionComboItemStateChanged

        try {

            if (IdentificacionCombo.getSelectedIndex() == 0 || IdentificacionCombo.getSelectedIndex() == 1) {

                txfIdentificacionReservas.setEnabled(true);
                txfNombreReservas.setEnabled(true);
                txfTelefonoReservas.setEnabled(true);
                txfIdentificacionReservas.setEditable(true);
                txfNombreReservas.setEditable(true);
                txfTelefonoReservas.setEditable(true);
                btnNuevoCliente.setEnabled(true);
                txfIdentificacionReservas.setText(null);
                txfNombreReservas.setText(null);
                txfTelefonoReservas.setText(null);
            }
        } catch (StackOverflowError stk) {

            System.out.println(stk.getMessage());

        }
    }//GEN-LAST:event_IdentificacionComboItemStateChanged

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed

        try {

            if (IdentificacionCombo.getSelectedItem().toString().equalsIgnoreCase("Cédula de Ciudadanía")) {

                verificarCedula();

            } else if (IdentificacionCombo.getSelectedItem().toString().equalsIgnoreCase("NIT")) {

                verificarNIT();

            } else {

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Verifique que la información esté completa, por favor.");

        }


    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void txfTelefonoReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoReservasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }
        if (txfTelefonoReservas.getText().length() > 9) {
            evt.consume();
        }


    }//GEN-LAST:event_txfTelefonoReservasKeyTyped

    private void txfIdentificacionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdentificacionReservasActionPerformed

        try {
            ResultSet rs;
            String cedula = txfIdentificacionReservas.getText().trim();
            rs = clDao.buscar(cedula);

            if (rs.next()) {

                txfNombreReservas.setText(rs.getString(2));
                txfTelefonoReservas.setText(rs.getString(3));
                btnSeleccionarEspecieReservas.setEnabled(true);
                desactivarCamposReserva();
                btnSeleccionarEspecieReservas.requestFocus(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe el cliente, llene toda la información y registre el cliente.");
                txfNombreReservas.setText(null);
                txfTelefonoReservas.setText(null);
                txfNombreReservas.requestFocus(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaSGI.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txfIdentificacionReservasActionPerformed

    private void txfCantidadReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadReservasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {

            evt.consume();

        }
    }//GEN-LAST:event_txfCantidadReservasKeyTyped

    private void ReservasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReservasFocusLost


    }//GEN-LAST:event_ReservasFocusLost

    private void btn_8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_8ComponentHidden


    }//GEN-LAST:event_btn_8ComponentHidden

    private void ReservasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ReservasComponentHidden


    }//GEN-LAST:event_ReservasComponentHidden

    private void txfBuscarConsultarReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConsultarReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarConsultarReservasKeyReleased

    private void txfBuscarConsultarReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConsultarReservasKeyTyped

        if (txfBuscarConsultarReservas.getText().length() > 11) {
            evt.consume();
        }       
    }//GEN-LAST:event_txfBuscarConsultarReservasKeyTyped

    private void txfCodigoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCodigoReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCodigoReservaActionPerformed

    private void txfCodigoReservaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCodigoReservaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCodigoReservaKeyReleased

    private void txfCodigoReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCodigoReservaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCodigoReservaKeyTyped

    private void txfNombreConsultarReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreConsultarReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreConsultarReservasKeyReleased

    private void txfNombreConsultarReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreConsultarReservasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreConsultarReservasKeyTyped

    private void tablaConsultarReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultarReservasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsultarReservasMouseClicked

    private void tablaConsultarReservasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultarReservasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsultarReservasMouseReleased

    private void tablaConsultarReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaConsultarReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsultarReservasKeyReleased

    private void txfTelefonoConsultarReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoConsultarReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelefonoConsultarReservasKeyReleased

    private void txfTelefonoConsultarReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoConsultarReservasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfTelefonoConsultarReservas.getText().length() > 9) {
            evt.consume();
        }

    }//GEN-LAST:event_txfTelefonoConsultarReservasKeyTyped

    private void txfIdentificacionConsultarReservasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionConsultarReservasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionConsultarReservasKeyReleased

    private void txfIdentificacionConsultarReservasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionConsultarReservasKeyTyped


    }//GEN-LAST:event_txfIdentificacionConsultarReservasKeyTyped

    private void btnLimpiarConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarConsultarReservasActionPerformed

        limpiarConsultarReservas();


    }//GEN-LAST:event_btnLimpiarConsultarReservasActionPerformed

    private void btnCancelarConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultarReservasActionPerformed

        if (tablaConsultarReservas.getRowCount() != 0) {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cancelar la reserva?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                cancelarConsultarReserva();
                obtenerMAXreserva();
                limpiarCUsuario();

            } else {

            }

        }


    }//GEN-LAST:event_btnCancelarConsultarReservasActionPerformed

    private void txfBuscarConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarConsultarReservasActionPerformed

        buscarReservas();

    }//GEN-LAST:event_txfBuscarConsultarReservasActionPerformed

    private void btnQuitarConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarConsultarReservasActionPerformed

        try {
            if (tablaConsultarReservas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(tablaConsultarReservas, "Seleccione un item de la tabla para eliminar ");
            } else {

                int codigo_reserva = Integer.parseInt(txfCodigoReserva.getText());
                int codigo_ingreso = Integer.parseInt(tablaConsultarReservas.getValueAt(tablaConsultarReservas.getSelectedRow(), 0).toString());
                int cantidad = Integer.parseInt(tablaConsultarReservas.getValueAt(tablaConsultarReservas.getSelectedRow(), 5).toString());
                String rango = tablaConsultarReservas.getValueAt(tablaConsultarReservas.getSelectedRow(), 3).toString();
                String tamaño = tablaConsultarReservas.getValueAt(tablaConsultarReservas.getSelectedRow(), 4).toString();

                if (rDao.deshacerReserva(codigo_ingreso, cantidad, tamaño, rango)) {

                    if (rDao.eliminarReserva(codigo_reserva, cantidad, tamaño, rango)) {

                        mostrarEspeciesConsultarReservas();
                        calcularTotalConsultarReservas();
                        reiniciarSeleccionarEspecie();

                    } else {
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Hubo un error.");

                }
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnQuitarConsultarReservasActionPerformed

    private void MenuReservaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MenuReservaStateChanged

        if (MenuReserva.getSelectedIndex() == 1) {

            if (tablaReservas.getRowCount() != 0) {

                MenuReserva.setSelectedIndex(0);

                int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar la reserva?" + "\n" + "Recuerde que debe dar click en el botón 'Reservar' para confirmar la reserva.", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    cancelarReserva();
                    MenuReserva.setSelectedIndex(1);
                    txfBuscarConsultarReservas.requestFocus(true);

                }

            } else {
                txfBuscarConsultarReservas.requestFocus(true);

            }
        } else {

            IdentificacionCombo.requestFocus(true);
        }


    }//GEN-LAST:event_MenuReservaStateChanged

    private void btnAgregarConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarConsultarReservasActionPerformed

        if (txfIdentificacionConsultarReservas.getText().trim().length() != 0) {
            ventanaEspeciesReservas.setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "Busque y seleccione una reserva primero.");
        }
    }//GEN-LAST:event_btnAgregarConsultarReservasActionPerformed

    private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked

        if (VentaPanel.isShowing()) {

            txfEspecieSalidas.setText(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 1).toString());
            txfCantidadSalidas.setText(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 5).toString());
        } else if (PerdidaPanel.isShowing()) {

            txfEspeciePerdida.setText(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 1).toString());
            txfCantidadPerdida.setText(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 5).toString());
        }

    }//GEN-LAST:event_tablaSalidasMouseClicked

    private void tablaSalidasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaSalidasMouseReleased

    private void tablaSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaSalidasKeyReleased

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

        if (txfDestino.getText().length() > 30) {

            evt.consume();

        }


    }//GEN-LAST:event_txfDestinoKeyTyped

    private void btnLimpiarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSalidaActionPerformed

        if (tablaSalidas.getRowCount() == 0 && txfEspecieTrasplantado.getText().trim().length() == 0) {

            motivoCombo.setSelectedIndex(3);
            IdentificacionComboSalidas.setSelectedIndex(0);
            limpiarSalidas();

            txfCedulaConductorSalidas.setEditable(true);

        } else if (txfEspecieTrasplantado.getText().trim().length() != 0 && txfCantidadTrasplantado.getText().trim().length() != 0) {

            cancelarTrasplantado();
        } else {

            cancelarSalida();

        }


    }//GEN-LAST:event_btnLimpiarSalidaActionPerformed

    private void btnCancelarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSalidaActionPerformed

        if (TrasplantadoPanel.isShowing()) {
            cancelarTrasplantado();
            System.out.println("jum");
        } else {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cancelar la salida?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {
                cancelarSalida();
            } else {
            }
        }

    }//GEN-LAST:event_btnCancelarSalidaActionPerformed

    private void motivoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_motivoComboItemStateChanged

        switch (motivoCombo.getSelectedIndex()) {
            case -1:
                txfDestino.setEditable(false);
                txfPredio.setEditable(false);
                limpiarSalidas();
                this.btnTraerReserva.setEnabled(false);
                break;
            case 6:
                if (tablaSalidas.getRowCount() != 0) {

                    cancelarSalidaCombo();
                }
                txfDestino.setEditable(true);
                txfPredio.setEditable(true);
                this.btnTraerReserva.setEnabled(true);
                IdentificacionComboSalidas.setEnabled(true);
                limpiarTablaSalidas();
                break;
            case 0:
            case 1:
            case 2:
            case 3:
                if (tablaSalidas.getRowCount() != 0) {

                    cancelarSalidaCombo();
                }
                txfDestino.setEditable(true);
                txfPredio.setEditable(true);
                this.btnTraerReserva.setEnabled(false);
                IdentificacionComboSalidas.setEnabled(true);
                limpiarTablaSalidas();
                break;
            case 4:
            case 5:
                if (txfEspecieTrasplantado.getText().length() != 0) {

                    cancelarTrasplantadoCombo();

                }
                this.btnTraerReserva.setEnabled(false);
                IdentificacionComboSalidas.setEnabled(true);
                limpiarTablaSalidas();
            default:
                this.btnTraerReserva.setEnabled(false);
                IdentificacionComboSalidas.setEnabled(true);
                limpiarTablaSalidas();
                break;
        }

        switch (motivoCombo.getSelectedIndex()) {
            case 0:
            case 2:
            case 3:
                limpiarTrasplantado();
                limpiarPerdida();
                limpiarInfoSalida();
                btnRegistrarSalida.setEnabled(true);
                break;
            case 1:
                limpiarConductorSalidas();
                limpiarTrasplantado();
                limpiarPerdida();
                limpiarInfoSalida();
                btnRegistrarSalida.setEnabled(true);
                break;
            case 4:
                limpiarConductorSalidas();
                limpiarInfoSalida();
                txfPredio.setText("N/A");
                txfDestino.setText("N/A");
                limpiarTrasplantado();
                limpiarClienteSalidas();
                limpiarEspecieSalidas();
                btnRegistrarSalida.setEnabled(true);
                txfDestino.setEditable(false);
                txfPredio.setEditable(false);
                break;
            case 5:
                limpiarConductorSalidas();
                limpiarInfoSalida();
                txfPredio.setText("N/A");
                txfDestino.setText("N/A");
                limpiarPerdida();
                limpiarClienteSalidas();
                limpiarEspecieSalidas();
                btnRegistrarSalida.setEnabled(false);
                txfDestino.setEditable(false);
                txfPredio.setEditable(false);
                break;
            case 6:
                limpiarEspecieSalidas();
                limpiarTrasplantado();
                limpiarPerdida();
                limpiarInfoSalida();
                btnRegistrarSalida.setEnabled(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_motivoComboItemStateChanged

    private void txfBuscarConsultarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarConsultarSalidaActionPerformed

        buscarSalidas();

    }//GEN-LAST:event_txfBuscarConsultarSalidaActionPerformed

    private void txfBuscarConsultarSalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConsultarSalidaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarConsultarSalidaKeyReleased

    private void txfBuscarConsultarSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarConsultarSalidaKeyTyped
        if (txfBuscarConsultarSalida.getText().length() > 13) {

            evt.consume();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarConsultarSalidaKeyTyped

    private void tablaConsultarSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultarSalidasMouseClicked

        try {
            String motivo = null;

            if (motivoComboConsultarSalida.getSelectedIndex() != 5 && motivoComboConsultarSalida.getSelectedIndex() != 6) {

                motivo = tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 3).toString();

            } else {

                motivo = tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 2).toString();

            }

            switch (motivo) {
                case "Pérdida":
                case "Trasplantado":
                    btnGenerarReporte.setEnabled(false);
                    btnGenerarExcel.setEnabled(false);
                    break;
                default:
                    btnGenerarReporte.setEnabled(true);
                    btnGenerarExcel.setEnabled(true);
                    break;
            }

            if (evt.getButton() == 3) {
                tablaConsultarSalidas.clearSelection();
            } else if (evt.getButton() == 1 && evt.getClickCount() == 2) {
                identificador = Integer.parseInt(tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 0).toString());
                if (motivo.equalsIgnoreCase("Pérdida")) {
                    ventanaInfoPerdida.setVisible(true);
                } else if (motivo.equalsIgnoreCase("Trasplantado")) {
                    ventanaInfoTrasplantado.setVisible(true);
                } else {
                    ventanaInfoSalida.setVisible(true);
                }
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException a) {

        }

    }//GEN-LAST:event_tablaConsultarSalidasMouseClicked

    private void tablaConsultarSalidasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultarSalidasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsultarSalidasMouseReleased

    private void tablaConsultarSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaConsultarSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsultarSalidasKeyReleased

    private void btnBuscarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSalidaActionPerformed

        buscarSalidas();

    }//GEN-LAST:event_btnBuscarSalidaActionPerformed

    private void MenuSalidaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MenuSalidaStateChanged

        if (MenuSalida.getSelectedIndex() == 1) {

            if (tablaSalidas.getRowCount() != 0) {

                MenuSalida.setSelectedIndex(0);

                int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar la salida?" + "\n" + "Recuerde que debe dar click en el botón 'Registrar' para confirmar la salida.", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    cancelarSalida();
                    MenuSalida.setSelectedIndex(1);

                }

            } else {

                motivoComboConsultarSalida.requestFocus();
            }
        }

    }//GEN-LAST:event_MenuSalidaStateChanged

    private void SalidasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SalidasFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_SalidasFocusLost

    private void SalidasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SalidasComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_SalidasComponentHidden

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

        if (txfPredio.getText().length() > 30) {

            evt.consume();

        }
    }//GEN-LAST:event_txfPredioKeyTyped

    private void txfCedulaConductorSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaConductorSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaConductorSalidasKeyReleased

    private void txfCedulaConductorSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaConductorSalidasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCedulaConductorSalidas.getText().length() > 9) {

            evt.consume();

        }


    }//GEN-LAST:event_txfCedulaConductorSalidasKeyTyped

    private void txfNombreConductorSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreConductorSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreConductorSalidasKeyReleased

    private void txfNombreConductorSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreConductorSalidasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreConductorSalidas.getText().length() > 39) {

            evt.consume();

        }


    }//GEN-LAST:event_txfNombreConductorSalidasKeyTyped

    private void txfApellidoConductorSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoConductorSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidoConductorSalidasKeyReleased

    private void txfApellidoConductorSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoConductorSalidasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfApellidoConductorSalidas.getText().length() > 29) {

            evt.consume();

        }

    }//GEN-LAST:event_txfApellidoConductorSalidasKeyTyped

    private void txfCelularConductorSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularConductorSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularConductorSalidasKeyReleased

    private void txfCelularConductorSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularConductorSalidasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (txfCelularConductorSalidas.getText().length() > 9) {

            evt.consume();

        }
    }//GEN-LAST:event_txfCelularConductorSalidasKeyTyped

    private void btnSiguienteInfoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteInfoSalidaActionPerformed

        siguienteInfoSalida();

    }//GEN-LAST:event_btnSiguienteInfoSalidaActionPerformed

    private void btnSiguienteConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteConductorActionPerformed

        siguienteConductorSalidas();

    }//GEN-LAST:event_btnSiguienteConductorActionPerformed

    private void btnAnteriorConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorConductorActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnAnteriorConductorActionPerformed

    private void btnSiguienteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteClienteActionPerformed

        siguienteClienteSalidas();

    }//GEN-LAST:event_btnSiguienteClienteActionPerformed

    private void btnAnteriorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorClienteActionPerformed

        if (motivoCombo.getSelectedItem().equals("Venta")) {

            this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.right);

        } else if (motivoCombo.getSelectedItem().equals("Venta en vivero")) {

            this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.right);

        } else if (motivoCombo.getSelectedItem().equals("Proyecto propio")) {

            this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.right);

        } else if (motivoCombo.getSelectedItem().equals("Donación")) {

            this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.right);

        } else if (motivoCombo.getSelectedItem().equals("Reserva")) {
            this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.right);
        }


    }//GEN-LAST:event_btnAnteriorClienteActionPerformed

    private void IdentificacionComboSalidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IdentificacionComboSalidasItemStateChanged

        limpiarClienteSalidas();

    }//GEN-LAST:event_IdentificacionComboSalidasItemStateChanged

    private void btnNuevoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCliente1ActionPerformed

        try {

            String cedula = txfIdentificacionClienteSalidas.getText();

            if (IdentificacionComboSalidas.getSelectedIndex() == 1 && !cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Ingrese un Nit válido, por favor.");

            } else if (IdentificacionComboSalidas.getSelectedIndex() == 0 && cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Ingrese una cédula válida.");

            } else if (IdentificacionComboSalidas.getSelectedIndex() == 1 && !cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Digite el guión en el NIT." + "\n" + "Por ejemplo: 1234567890-5");

            } else if (cedula.length() < 8 || cedula.length() > 14) {

                JOptionPane.showMessageDialog(null, "Digíte un NIT válido, por favor.");

            } else {
                registrarClienteSalida();
                txfNombreClienteSalidas.setEditable(false);
                txfTelefonoClienteSalidas.setEditable(false);
                txfIdentificacionClienteSalidas.setEditable(false);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Verifique que la información esté completa, por favor.");

        }


    }//GEN-LAST:event_btnNuevoCliente1ActionPerformed

    private void btnAnteriorCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorCliente1ActionPerformed

        this.slidePanel.nextPanel(20, ClientePanel, slidePanel.right);

    }//GEN-LAST:event_btnAnteriorCliente1ActionPerformed

    private void btnSeleccionarEspecieSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspecieSalidasActionPerformed

        reiniciarSeleccionarEspecie();
        ventanaEspeciesReservas.setVisible(true);

    }//GEN-LAST:event_btnSeleccionarEspecieSalidasActionPerformed

    private void txfEspecieSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfEspecieSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEspecieSalidasKeyReleased

    private void txfCantidadSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadSalidasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadSalidasKeyTyped

    private void btnQuitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitar1ActionPerformed
        int fila = tablaSalidas.getSelectedRow();

        if (txfEspecieSalidas.getText().trim().equalsIgnoreCase("") || txfCantidadSalidas.getText().trim().equalsIgnoreCase("") || fila == -1) {

            JOptionPane.showMessageDialog(null, "Seleccione una especie primero.");

        } else {
            quitarEspecie();
        }

    }//GEN-LAST:event_btnQuitar1ActionPerformed

    private void btnAnteriorCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorCliente2ActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnAnteriorCliente2ActionPerformed

    private void btnSeleccionarEspeciePerdidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspeciePerdidaActionPerformed

        reiniciarSeleccionarEspecie();
        ventanaEspeciesReservas.setVisible(true);

    }//GEN-LAST:event_btnSeleccionarEspeciePerdidaActionPerformed

    private void txfEspeciePerdidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfEspeciePerdidaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEspeciePerdidaKeyReleased

    private void txfCantidadPerdidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadPerdidaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadPerdidaKeyTyped

    private void btnQuitar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitar2ActionPerformed

        int fila = tablaSalidas.getSelectedRow();
        if (txfEspeciePerdida.getText().trim().equalsIgnoreCase("") || txfCantidadPerdida.getText().trim().equalsIgnoreCase("") || fila == -1) {

            JOptionPane.showMessageDialog(null, "Seleccione una especie primero.");
        } else {

            quitarEspecie();
        }

    }//GEN-LAST:event_btnQuitar2ActionPerformed

    private void btnAnteriorCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorCliente3ActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnAnteriorCliente3ActionPerformed

    private void btnSeleccionarEspecieReservas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspecieReservas3ActionPerformed

        reiniciarSeleccionarEspecie();
        ventanaEspeciesReservas.setVisible(true);

    }//GEN-LAST:event_btnSeleccionarEspecieReservas3ActionPerformed

    private void txfEspecieTrasplantadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfEspecieTrasplantadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEspecieTrasplantadoKeyReleased

    private void txfCantidadTrasplantadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadTrasplantadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadTrasplantadoKeyTyped

    private void tamanoComboTrasplantadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamanoComboTrasplantadoItemStateChanged

        if (tamanoComboTrasplantado.getSelectedIndex() == 0) {

            rangoComboTrasplantado.removeAllItems();
            rangoComboTrasplantado.addItem("< 20 cm");
            rangoComboTrasplantado.addItem("20 - 40 cm");
            rangoComboTrasplantado.addItem("40 - 60 cm");
            rangoComboTrasplantado.setSelectedIndex(0);

        } else if (tamanoComboTrasplantado.getSelectedIndex() == 1) {

            rangoComboTrasplantado.removeAllItems();
            rangoComboTrasplantado.addItem("< 60 cm");
            rangoComboTrasplantado.addItem("60 - 100 cm");
            rangoComboTrasplantado.addItem("100 - 150 cm");
            rangoComboTrasplantado.addItem("> 150 cm");
            rangoComboTrasplantado.setSelectedIndex(0);

        }
    }//GEN-LAST:event_tamanoComboTrasplantadoItemStateChanged

    private void rangoComboTrasplantadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rangoComboTrasplantadoItemStateChanged


    }//GEN-LAST:event_rangoComboTrasplantadoItemStateChanged

    private void motivoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motivoComboActionPerformed


    }//GEN-LAST:event_motivoComboActionPerformed

    private void fechaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaIngresoKeyTyped

        evt.consume();

    }//GEN-LAST:event_fechaIngresoKeyTyped

    private void txfCorreoProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCorreoProvKeyTyped
        // TODO add your handling code here:

        if (txfCorreoProv.getText().length() > 29) {

            evt.consume();
        }
    }//GEN-LAST:event_txfCorreoProvKeyTyped

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed

        if (tablaReservas.getRowCount() != 0) {

            JOptionPane.showMessageDialog(null, "Reserva creada correctamente.");
            limpiarReservas();
            limpiarTablaReservas();
            obtenerMAXreserva();

        } else {

            JOptionPane.showMessageDialog(null, "Agregue especies para realizar una reserva.");

        }


    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnLimpiarProveedor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedor3ActionPerformed

        limpiarRUsuario();

    }//GEN-LAST:event_btnLimpiarProveedor3ActionPerformed

    private void rangoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangoComboActionPerformed

    private void btnSeleccionarEspecieReservas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEspecieReservas4ActionPerformed

        buscarReservas();

    }//GEN-LAST:event_btnSeleccionarEspecieReservas4ActionPerformed

    private void btnAnteriorConductor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorConductor1ActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnAnteriorConductor1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAnteriorConductor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorConductor3ActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnAnteriorConductor3ActionPerformed

    private void btnAnteriorConductor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorConductor4ActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);


    }//GEN-LAST:event_btnAnteriorConductor4ActionPerformed

    private void btnAnteriorConductor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorConductor5ActionPerformed

        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);

    }//GEN-LAST:event_btnAnteriorConductor5ActionPerformed

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed

        registrarSalida();

    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

    private void txfCedulaConductorSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCedulaConductorSalidasActionPerformed

        String cedula = txfCedulaConductorSalidas.getText();

        if (cedula.equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Digite una cédula por favor.");

        } else {

            try {
                rs = cDao.buscar(cedula);

                if (rs.next()) {

                    txfNombreConductorSalidas.setText(rs.getString(2));
                    txfApellidoConductorSalidas.setText(rs.getString(3));
                    txfCelularConductorSalidas.setText(rs.getString(4));
                    txfCedulaConductorSalidas.setEditable(false);
                    txfPlacaSalidas.requestFocus(true);
                } else {

                    JOptionPane.showMessageDialog(null, "No se ha encontrado el conductor, proceda a registrarlo.");

                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaSGI.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_txfCedulaConductorSalidasActionPerformed

    private void txfPlacaSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPlacaSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPlacaSalidasKeyReleased

    private void txfPlacaSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPlacaSalidasKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txfPlacaSalidas.getText().length() > 6) {

            evt.consume();

        }


    }//GEN-LAST:event_txfPlacaSalidasKeyTyped

    private void btnTraerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerReservaActionPerformed

        reiniciarTraerReserva();
        ventanaReservas.setVisible(true);


    }//GEN-LAST:event_btnTraerReservaActionPerformed

    private void motivoComboConsultarSalidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_motivoComboConsultarSalidaItemStateChanged

        String motivo = motivoComboConsultarSalida.getSelectedItem().toString();

        if (motivo.equalsIgnoreCase("Pérdida") || motivo.equalsIgnoreCase("Trasplantado")) {

            btnGenerarReporte.setEnabled(false);
        } else {
            btnGenerarReporte.setEnabled(true);
        }

        limpiarTablaConsultarSalidas();

    }//GEN-LAST:event_motivoComboConsultarSalidaItemStateChanged

    private void motivoComboConsultarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motivoComboConsultarSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motivoComboConsultarSalidaActionPerformed

    private void btnLimpiarConsultarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarConsultarSalidaActionPerformed

        txfBuscarConsultarSalida.setText(null);
        motivoComboConsultarSalida.setSelectedIndex(0);
        java.util.Date fechaParseada;
        try {
            fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
            fechaDesdeSalida.setDate(fechaParseada);
            fechaHastaSalida.setDate(fechaParseada);
        } catch (Exception e) {

        }
        limpiarTablaConsultarSalidas();

    }//GEN-LAST:event_btnLimpiarConsultarSalidaActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        generarReporteConsultar();

    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnCambiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarMouseReleased


    }//GEN-LAST:event_btnCambiarMouseReleased

    private void txfDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDestinoActionPerformed

        siguienteInfoSalida();

    }//GEN-LAST:event_txfDestinoActionPerformed

    private void txfPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPredioActionPerformed

        siguienteInfoSalida();

    }//GEN-LAST:event_txfPredioActionPerformed

    private void txfPlacaSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPlacaSalidasActionPerformed

        siguienteConductorSalidas();
    }//GEN-LAST:event_txfPlacaSalidasActionPerformed

    private void VentaPanelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentaPanelKeyTyped


    }//GEN-LAST:event_VentaPanelKeyTyped

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_10consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10consultarEmpleados

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_10);
            ind_10.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_11});
            parent.removeAll();
            parent.add(GestionarEspecies);
            parent.repaint();
            parent.revalidate();
            obtenerMAXEspecie();
            txfNombreCien.requestFocus(true);
        }

    }//GEN-LAST:event_btn_10consultarEmpleados

    private void btn_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MousePressed

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_10);
            ind_10.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_11});
            parent.removeAll();
            parent.add(GestionarEspecies);
            parent.repaint();
            parent.revalidate();
            obtenerMAXEspecie();
            txfNombreCien.requestFocus(true);
        }
    }//GEN-LAST:event_btn_10MousePressed

    private void btnEditarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEspActionPerformed

        if (txfNombreCien.getText().length() == 0) {

        } else {

            activarCamposEspecies();
            this.btnEditarEsp.setEnabled(false);
            this.btnGuardarEsp.setEnabled(true);
        }
        if (tablaEspecies.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una especie primero.");
        } else {
            if (tablaEspecies.getValueAt(0, 0).equals("Sin resultados...")) {
                JOptionPane.showMessageDialog(null, "Seleccione una especie válida. ");
            }
        }

    }//GEN-LAST:event_btnEditarEspActionPerformed

    private void tablaEspeciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspeciesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEspeciesMouseClicked

    private void tablaEspeciesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspeciesMouseReleased

        if (tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1) {

                seleccionarEspecie();

            }
        }

    }//GEN-LAST:event_tablaEspeciesMouseReleased

    private void tablaEspeciesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEspeciesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEspeciesKeyReleased

    private void txfNombreComunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreComunKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreComunKeyReleased

    private void txfNombreComunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreComunKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreComun.getText().length() > 19) {

            evt.consume();
        }

    }//GEN-LAST:event_txfNombreComunKeyTyped

    private void txfFamiliaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFamiliaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFamiliaKeyReleased

    private void txfFamiliaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFamiliaKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfFamilia.getText().length() > 14) {

            evt.consume();
        }

    }//GEN-LAST:event_txfFamiliaKeyTyped

    private void txfMsnmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMsnmKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMsnmKeyReleased

    private void txfMsnmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMsnmKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txfMsnm.getText().length() > 11) {

            evt.consume();
        }

    }//GEN-LAST:event_txfMsnmKeyTyped

    private void txfNombreCienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreCienKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreCienKeyReleased

    private void txfNombreCienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreCienKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreCien.getText().length() > 29) {

            evt.consume();
        }

    }//GEN-LAST:event_txfNombreCienKeyTyped

    private void txfBuscarEspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarEspKeyReleased

        try {

            if (txfBuscarEsp.getText().length() == 0) {

                DefaultTableModel modelo = (DefaultTableModel) tablaEspecies.getModel();

                limpiarTablaEspecies();

                tablaEspecies.setModel(modelo);

            } else {

                DefaultTableModel modelo;
                TableColumnModel column = tablaEspecies.getColumnModel();
                modelo = eDao.listar(txfBuscarEsp.getText());
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tablaEspecies.setModel(modelo);
                tcr.setHorizontalAlignment(SwingConstants.LEFT);
                tablaEspecies.getColumnModel().getColumn(1).setCellRenderer(tcr);
                column.getColumn(0).setPreferredWidth(150);
                column.getColumn(1).setPreferredWidth(150);

            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_txfBuscarEspKeyReleased

    private void txfBuscarEspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarEspKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }


    }//GEN-LAST:event_txfBuscarEspKeyTyped

    private void btnLimpiarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEspActionPerformed

        limpiarEspecies();

    }//GEN-LAST:event_btnLimpiarEspActionPerformed

    private void btnGuardarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEspActionPerformed

        try {

            if (txfNombreCien.getText().length() == 0 || txfNombreComun.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

            } else {

                String codigo = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString();
                String nombre_cien = txfNombreCien.getText().trim();
                String nombre_comun = txfNombreComun.getText().trim();
                String familia = txfFamilia.getText().trim();
                String msnm = txfMsnm.getText().trim();

                if (eDao.actualizar(codigo, nombre_comun, nombre_cien, familia, msnm)) {
                    JOptionPane.showMessageDialog(null, "Especie actualizada correctamente.");
                    this.btnEditarEsp.setEnabled(true);
                    this.btnGuardarEsp.setEnabled(false);
                    this.btnRegistrarEsp.setEnabled(true);
                    String busca = lblNumeroEspecie.getText();
                    buscarEspecies(busca);
                    limpiarEspecies();
                    activarCamposEspecies();

                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar, inténtelo nuevamente.");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_btnGuardarEspActionPerformed

    private void btnRegistrarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEspActionPerformed
        registrarEspecie();
    }//GEN-LAST:event_btnRegistrarEspActionPerformed

    private void txfNombreCienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreCienActionPerformed
    }//GEN-LAST:event_txfNombreCienActionPerformed

    private void txfNombreComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreComunActionPerformed

    }//GEN-LAST:event_txfNombreComunActionPerformed

    private void txfFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFamiliaActionPerformed


    }//GEN-LAST:event_txfFamiliaActionPerformed

    private void txfMsnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMsnmActionPerformed

    }//GEN-LAST:event_txfMsnmActionPerformed

    private void txfEspeciePerdidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEspeciePerdidaActionPerformed

        if (txfEspecieSalidas.getText().trim().equalsIgnoreCase("") || txfCantidadSalidas.getText().trim().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Seleccione una especie primero.");
        } else {

            quitarEspecie();
        }

    }//GEN-LAST:event_txfEspeciePerdidaActionPerformed

    private void btnQuitar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitar3ActionPerformed

        if (tablaEspecies.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(null, "Elija una especie primero.");

        } else {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está completamente seguro que desea eliminar la especie?" + "\n" + "Una vez eliminada no se podrá recuperar.", "Confirmación", JOptionPane.YES_NO_OPTION);
            String codigo = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString();

            if (resultado == 0) {

                if (eDao.eliminar(codigo)) {

                    JOptionPane.showMessageDialog(null, "Especie eliminada correctamente.");
                    limpiarEspecies();
                    obtenerMAXEspecie();

                } else {

                    JOptionPane.showMessageDialog(null, "No se pudo eliminar la especie.");
                }
            } else {

            }
        }
    }//GEN-LAST:event_btnQuitar3ActionPerformed

    private void slidePanelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slidePanelKeyTyped

    }//GEN-LAST:event_slidePanelKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

        char c = evt.getKeyChar();

        System.out.println(c);
    }//GEN-LAST:event_formKeyTyped

    private void btn_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseEntered

        setColor(btn_1);
        ind_1.setOpaque(true);
    }//GEN-LAST:event_btn_1MouseEntered

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited

        if (!PerfilGerente.isShowing()) {
            resetColor1(btn_1);
            ind_1.setOpaque(false);
        }
    }//GEN-LAST:event_btn_1MouseExited

    private void btn_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseEntered

        setColor(btn_6);
        ind_6.setOpaque(true);
    }//GEN-LAST:event_btn_6MouseEntered

    private void btn_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseExited
        if (!Inventario.isShowing()) {
            resetColor1(btn_6);
            ind_6.setOpaque(false);
        }
    }//GEN-LAST:event_btn_6MouseExited

    private void btn_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseEntered

        setColor(btn_7);
        ind_7.setOpaque(true);
    }//GEN-LAST:event_btn_7MouseEntered

    private void btn_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseExited
        if (!Salidas.isShowing()) {
            resetColor1(btn_7);
            ind_7.setOpaque(false);
        }
    }//GEN-LAST:event_btn_7MouseExited

    private void btn_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseEntered
        setColor(btn_8);
        ind_8.setOpaque(true);
    }//GEN-LAST:event_btn_8MouseEntered

    private void btn_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseExited
        if (!Reservas.isShowing()) {
            resetColor1(btn_8);
            ind_8.setOpaque(false);
        }
    }//GEN-LAST:event_btn_8MouseExited

    private void btn_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseEntered
        setColor(btn_5);
        ind_5.setOpaque(true);
    }//GEN-LAST:event_btn_5MouseEntered

    private void btn_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseExited
        if (!IngresarEspecie.isShowing()) {
            resetColor1(btn_5);
            ind_5.setOpaque(false);
        }
    }//GEN-LAST:event_btn_5MouseExited

    private void btn_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseEntered
        setColor(btn_2);
        ind_2.setOpaque(true);
    }//GEN-LAST:event_btn_2MouseEntered

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        if (!GestionarUsuarios.isShowing()) {
            resetColor1(btn_2);
            ind_2.setOpaque(false);
        }
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseEntered
        setColor(btn_3);
        ind_3.setOpaque(true);
    }//GEN-LAST:event_btn_3MouseEntered

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        if (!GestionarConductores.isShowing()) {
            resetColor1(btn_3);
            ind_3.setOpaque(false);
        }
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseEntered
        setColor(btn_4);
        ind_4.setOpaque(true);
    }//GEN-LAST:event_btn_4MouseEntered

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        if (!GestionarProveedores.isShowing()) {
            resetColor1(btn_4);
            ind_4.setOpaque(false);
        }
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseEntered
        setColor(btn_10);
        ind_10.setOpaque(true);
    }//GEN-LAST:event_btn_10MouseEntered

    private void btn_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseExited
        if (!GestionarEspecies.isShowing()) {
            resetColor1(btn_10);
            ind_10.setOpaque(false);
        }
    }//GEN-LAST:event_btn_10MouseExited

    private void tablaConsultarSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaConsultarSalidasKeyTyped

        String motivo = tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 2).toString();

        switch (motivo) {
            case "Pérdida":
            case "Trasplantado":
                btnGenerarReporte.setEnabled(false);
                break;
            default:
                btnGenerarReporte.setEnabled(true);

        }

    }//GEN-LAST:event_tablaConsultarSalidasKeyTyped

    private void btnGenerarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarExcelActionPerformed

        if (tablaConsultarSalidas.getRowCount() == 0) {

            JOptionPane.showMessageDialog(null, "Busque alguna salida primero, por favor.");
        } else {
            ventanaExcel.TipoCombo.setEnabled(false);
            ventanaExcel.setVisible(true);
        }
    }//GEN-LAST:event_btnGenerarExcelActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

        if (tablaUsuarios.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(null, "Elija un Usuario primero.");

        } else {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está completamente seguro que desea eliminar el Usuario?" + "\n" + "Una vez eliminado no se podrá recuperar.", "Confirmación", JOptionPane.YES_NO_OPTION);
            String codigo = tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString();

            if (resultado == 0) {

                if (uDao.eliminarUsuario(codigo)) {

                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
                    limpiarCUsuario();
                    limpiarTablaUsuarios();
                    txfBuscar.setText(null);
                    desactivarCamposCUsuario();
                    this.btnGuardarCU.setEnabled(false);
                    this.btnEditarCU.setEnabled(true);

                } else {

                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el Usuario.");
                }
            } else {

            }
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnEliminarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarConductorActionPerformed

        if (tablaConductores.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(null, "Elija un conductor primero.");

        } else {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está completamente seguro que desea eliminar este conductor?" + "\n" + "Una vez eliminado no se podrá recuperar.", "Confirmación", JOptionPane.YES_NO_OPTION);
            String codigo = tablaConductores.getValueAt(tablaConductores.getSelectedRow(), 0).toString();

            if (resultado == 0) {

                if (cDao.eliminarConductor(codigo)) {

                    JOptionPane.showMessageDialog(null, "Conductor eliminado correctamente.");
                    limpiarConductor();
                    limpiarTablaConductores();
                    txfBuscarConductor.setText(null);
                    btnRegistrarConductor.setEnabled(true);

                } else {

                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el conductor debido a que este se encuentra presente en alguna salida.");
                }
            } else {

            }
        }

    }//GEN-LAST:event_btnEliminarConductorActionPerformed

    private void btnMostrarContraseñaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContraseñaUActionPerformed

        if (estado) {
            txfContraseña.setEchoChar((char) 0);
            btnMostrarContraseñaU.setIcon(iconoOcultar);
        } else {
            txfContraseña.setEchoChar('•');
            btnMostrarContraseñaU.setIcon(iconoMostrar);
        }

        estado = !estado;
    }//GEN-LAST:event_btnMostrarContraseñaUActionPerformed

    private void txfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseñaKeyTyped

        if (txfContraseña.getText().length() > 19) {

            evt.consume();

        }
    }//GEN-LAST:event_txfContraseñaKeyTyped

    private void btn_11consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11consultarEmpleados

        if (verificarSalida()) {

            setColor(btn_11);
            ind_11.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10});
            parent.removeAll();
            parent.add(GestionarClientes);
            parent.repaint();
            parent.revalidate();
            TipoComboClientes.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_11consultarEmpleados

    private void btn_11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11MouseEntered

        setColor(btn_11);
        ind_11.setOpaque(true);
    }//GEN-LAST:event_btn_11MouseEntered

    private void btn_11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11MouseExited

        if (!GestionarClientes.isShowing()) {
            resetColor1(btn_11);
            ind_11.setOpaque(false);
        }
    }//GEN-LAST:event_btn_11MouseExited

    private void btn_11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11MousePressed

        if (verificarSalida()) {

            setColor(btn_11);
            ind_11.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10});
            parent.removeAll();
            parent.add(GestionarClientes);
            parent.repaint();
            parent.revalidate();
            TipoComboClientes.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_11MousePressed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if (!txfCelularClientes.isEditable()) {
            activarCamposClientes();
            txfIdClientes.setEditable(false);
            txfNombreClientes.requestFocus();
            btnGuardarCliente.setEnabled(true);
            btnEditarCliente.setEnabled(false);
            btnRegistrarCliente.setEnabled(false);
            this.TipoComboClientes.setEnabled(false);
        }
        if (tablaClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(tablaClientes, "Seleccione un cliente primero ");
        } else {
            if (tablaClientes.getValueAt(0, 0).equals("Sin resultados...")) {
                JOptionPane.showMessageDialog(tablaClientes, "Seleccione un cliente valido ");
            }
        }

    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        try {
            if (tablaClientes.getSelectedRow() == -1) {

                JOptionPane.showMessageDialog(null, "Elija un cliente primero.");

            } else {

                int resultado = JOptionPane.showConfirmDialog(null, "¿Está completamente seguro que desea eliminar este cliente?" + "\n" + "Una vez eliminado no se podrá recuperar.", "Confirmación", JOptionPane.YES_NO_OPTION);
                String codigo = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString();

                if (resultado == 0) {

                    ResultSet rs = sDao.buscarSalidaPorCliente(codigo);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente debido a que este se encuentra presente en alguna salida.");
                    } else {
                        if (clDao.eliminarCliente(codigo)) {

                            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
                            limpiarClientes();
                            limpiarTablaClientes();

                        } else {

                            JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente debido a que este se encuentra presente en alguna salida.");
                        }
                    }

                } else {

                }

            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void tablaClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseReleased
        if (tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString().equalsIgnoreCase("Sin resultados...")) {

        } else {

            if (evt.getClickCount() == 1) {

                seleccionarCliente();

            }
        }
    }//GEN-LAST:event_tablaClientesMouseReleased

    private void tablaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaClientesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaClientesKeyReleased

    private void txfNombreClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClientesActionPerformed

    private void txfNombreClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreClientesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClientesKeyReleased

    private void txfNombreClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreClientesKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreClientes.getText().length() > 29) {

            evt.consume();

        }
    }//GEN-LAST:event_txfNombreClientesKeyTyped

    private void txfCelularClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCelularClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClientesActionPerformed

    private void txfCelularClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularClientesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClientesKeyReleased

    private void txfCelularClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularClientesKeyTyped
        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c)) {

            evt.consume();

        }

        if (txfCelularClientes.getText().length() > 9) {

            evt.consume();

        }
    }//GEN-LAST:event_txfCelularClientesKeyTyped

    private void txfIdClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdClientesActionPerformed

    private void txfIdClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdClientesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdClientesKeyReleased

    private void txfIdClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdClientesKeyTyped
        char c = evt.getKeyChar();

        if (TipoComboClientes.getSelectedIndex() == 0) {

            if (Character.isDigit(c)) {

            } else {
                evt.consume();
            }

            if (txfIdClientes.getText().length() > 9) {
                evt.consume();
            }
        } else if (TipoComboClientes.getSelectedIndex() == 1) {

            if (Character.isDigit(c) || Character.toString(c).equals("-")) {

            } else {

                evt.consume();
            }

            if (txfIdClientes.getText().length() > 11) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txfIdClientesKeyTyped

    private void txfBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarClienteKeyReleased
        try {

            if (txfBuscarCliente.getText().length() == 0) {

                DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();

                limpiarTablaClientes();

                tablaClientes.setModel(modelo);

            } else {

                DefaultTableModel modelo;
                TableColumnModel column = tablaClientes.getColumnModel();
                modelo = clDao.listarClientes(txfBuscarCliente.getText());
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tablaClientes.setModel(modelo);
                tcr.setHorizontalAlignment(SwingConstants.LEFT);
                tablaClientes.getColumnModel().getColumn(1).setCellRenderer(tcr);
                column.getColumn(0).setPreferredWidth(150);
                column.getColumn(1).setPreferredWidth(150);

            }

        } catch (Exception e) {
            System.out.println(txfBuscarCliente.getText());
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_txfBuscarClienteKeyReleased

    private void txfBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarClienteKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

        if (txfBuscarCliente.getText().length() > 29) {

            evt.consume();

        }
    }//GEN-LAST:event_txfBuscarClienteKeyTyped

    private void btnLimpiarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClientesActionPerformed
        txfIdClientes.setRequestFocusEnabled(true);
        limpiarClientes();
        limpiarTablaClientes();

    }//GEN-LAST:event_btnLimpiarClientesActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        actualizarCliente();
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        try {

            String cedula = txfIdClientes.getText();

            if (TipoComboClientes.getSelectedIndex() == 1 && !cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Ingrese un Nit válido, por favor.");

            } else if (TipoComboClientes.getSelectedIndex() == 0 && cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Ingrese una cédula válida.");

            } else if (TipoComboClientes.getSelectedIndex() == 2 && !cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Digite el guión en el NIT." + "\n" + "Por ejemplo: 1234567890-1");

            } else if (cedula.length() < 7 || cedula.length() > 14) {

                JOptionPane.showMessageDialog(null, "Digíte un NIT válido, por favor.");

            } else {
                registrarCliente();
                limpiarClientes();
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Verifique que la información esté completa, por favor.");

        }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if (tablaProveedores.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(null, "Elija un proveedor primero.");

        } else {

            int resultado = JOptionPane.showConfirmDialog(null, "¿Está completamente seguro que desea eliminar el proveedor?" + "\n" + "Una vez eliminada no se podrá recuperar.", "Confirmación", JOptionPane.YES_NO_OPTION);
            String codigo = tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString();

            if (resultado == 0) {

                if (pDao.eliminarProveedor(codigo)) {

                    JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente.");
                    limpiarProveedor();
                    limpiarTablaProveedor();
                    btnRegistrarProv.setEnabled(true);

                } else {

                }
            } else {

            }
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnLimpiarClienteSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteSalidaActionPerformed
        IdentificacionComboSalidas.setSelectedIndex(0);
        limpiarClienteSalidas();

    }//GEN-LAST:event_btnLimpiarClienteSalidaActionPerformed

    private void txfIdentificacionClienteSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteSalidasActionPerformed

        try {

            String cedula = txfIdentificacionClienteSalidas.getText();

            if (cedula.equalsIgnoreCase("")) {

                JOptionPane.showMessageDialog(null, "Digite una cédula o NIT por favor.");

            } else if (IdentificacionComboSalidas.getSelectedIndex() == 1 && !cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Ingrese un Nit válido, por favor.");

            } else if (IdentificacionComboSalidas.getSelectedIndex() == 0 && cedula.contains("-")) {

                JOptionPane.showMessageDialog(null, "Ingrese una cédula válida.");

            } else {
                ResultSet rs = clDao.buscar(cedula);

                if (rs.next()) {

                    txfNombreClienteSalidas.setText(rs.getString(2));
                    txfTelefonoClienteSalidas.setText(rs.getString(3));
                    txfIdentificacionClienteSalidas.setEditable(false);
                    txfNombreClienteSalidas.setEditable(false);
                    txfTelefonoClienteSalidas.setEditable(false);
                    txfTelefonoClienteSalidas.requestFocus(true);

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha encontrado el cliente, proceda a registrarlo.");
                    txfNombreClienteSalidas.setText(null);
                    txfTelefonoClienteSalidas.setText(null);
                    txfNombreClienteSalidas.setEditable(true);
                    txfTelefonoClienteSalidas.setEditable(true);

                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txfIdentificacionClienteSalidasActionPerformed

    private void txfIdentificacionClienteSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionClienteSalidasKeyReleased

    private void txfIdentificacionClienteSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteSalidasKeyTyped
        char c = evt.getKeyChar();

        if (IdentificacionComboSalidas.getSelectedIndex() == 0) {

            if (Character.isDigit(c)) {

            } else {
                evt.consume();
            }

            if (txfIdentificacionClienteSalidas.getText().length() > 9) {
                evt.consume();
            }
        } else if (IdentificacionComboSalidas.getSelectedIndex() == 1) {

            if (Character.isDigit(c) || Character.toString(c).equals("-")) {

            } else {

                evt.consume();
            }

            if (txfIdentificacionClienteSalidas.getText().length() > 11) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txfIdentificacionClienteSalidasKeyTyped

    private void txfNombreClienteSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreClienteSalidasActionPerformed

        siguienteClienteSalidas();
    }//GEN-LAST:event_txfNombreClienteSalidasActionPerformed

    private void txfNombreClienteSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreClienteSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClienteSalidasKeyReleased

    private void txfNombreClienteSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreClienteSalidasKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else if (Character.isDigit(c)) {

            evt.consume();

        }

        if (txfNombreClienteSalidas.getText().length() > 39) {

            evt.consume();

        }

    }//GEN-LAST:event_txfNombreClienteSalidasKeyTyped

    private void txfTelefonoClienteSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTelefonoClienteSalidasActionPerformed

        siguienteClienteSalidas();
    }//GEN-LAST:event_txfTelefonoClienteSalidasActionPerformed

    private void txfTelefonoClienteSalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoClienteSalidasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelefonoClienteSalidasKeyReleased

    private void txfTelefonoClienteSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTelefonoClienteSalidasKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else if (Character.isAlphabetic(c)) {

            evt.consume();

        }

        if (txfTelefonoClienteSalidas.getText().length() > 9) {

            evt.consume();

        }

    }//GEN-LAST:event_txfTelefonoClienteSalidasKeyTyped

    private void btnLimpiarConductorSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarConductorSalidasActionPerformed

        limpiarConductorSalidas();

    }//GEN-LAST:event_btnLimpiarConductorSalidasActionPerformed

    private void btnLimpiarInfVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInfVentaActionPerformed
        limpiarSeleccionarEspecies();

    }//GEN-LAST:event_btnLimpiarInfVentaActionPerformed

    private void btnLimpiarInfPerdidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInfPerdidaActionPerformed

        txfCantidadPerdida.setText(null);
        txfEspeciePerdida.setText(null);

    }//GEN-LAST:event_btnLimpiarInfPerdidaActionPerformed

    private void btnLimpiarInfTrasplantadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInfTrasplantadoActionPerformed

        if (txfCantidadTrasplantado.getText().trim().length() != 0) {
            System.out.println(codigo_Ingreso);
            int cantidad = Integer.parseInt(txfCantidadTrasplantado.getText().trim());
            if (dDao.sumar(codigo_Ingreso, cantidad, tamañoTrasplantado, rangoTrasplantado)) {

            } else {
                JOptionPane.showMessageDialog(null, "ERROR (Trasplantado - Limpiar): Contacte a los desarrolladores.");
            }
        }
        txfEspecieTrasplantado.setText(null);
        txfCantidadTrasplantado.setText(null);
        tamanoComboTrasplantado.setSelectedIndex(0);
        rangoComboTrasplantado.setSelectedIndex(0);
        codigo_Ingreso = 0;
        tamañoTrasplantado = "";
        rangoTrasplantado = "";
        codigo_Especie = 0;

    }//GEN-LAST:event_btnLimpiarInfTrasplantadoActionPerformed

    private void btn_6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseReleased
        reiniciarInventario();

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_6);
            ind_6.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(Inventario);
            txfBuscarInventario.requestFocus();
            txfBuscarInventario.selectAll();
            parent.repaint();
            parent.revalidate();
        } else {

        }
    }//GEN-LAST:event_btn_6MouseReleased

    private void btnTrasplantadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasplantadoActionPerformed

        if (txfEspecieTrasplantado.getText().trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Seleccione una especie primero, por favor.");
        } else {

            if (txfCantidadTrasplantado.isEditable()) {

                agregarEspecieTrasplantado();

            } else {

                registrarSalidaTrasplantado();
            }
        }
    }//GEN-LAST:event_btnTrasplantadoActionPerformed

    private void btn_7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseReleased

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_7);
            ind_7.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(Salidas);
            parent.repaint();
            parent.revalidate();
            obtenerMAXsalida();
            motivoCombo.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_7MouseReleased

    private void btn_8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseReleased

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_8);
            ind_8.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_10, ind_11});
            parent.removeAll();
            parent.add(Reservas);
            parent.repaint();
            parent.revalidate();
            lblFecha.setText(fechaActual());
            obtenerMAXreserva();
            IdentificacionCombo.requestFocus(true);
        }
    }//GEN-LAST:event_btn_8MouseReleased

    private void btn_5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseReleased

        try {

            if (verificarReserva() && verificarSalida()) {
                setColor(btn_5);
                ind_5.setOpaque(true);
                resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_6, ind_7, ind_8, ind_10, ind_11});
                parent.removeAll();
                parent.add(IngresarEspecie);
                parent.repaint();
                parent.revalidate();
                java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
                fechaIngreso.setDate(fechaParseada);
                fechaDesde.setDate(fechaParseada);
                fechaHasta.setDate(fechaParseada);
                buscarIngresosFecha(fechaActual(), fechaActual());
                btnSeleccionarProveedor.requestFocus(true);
            } else {

            }
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btn_5MouseReleased

    private void btn_11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11MouseReleased

        if (verificarSalida()) {

            setColor(btn_11);
            ind_11.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10});
            parent.removeAll();
            parent.add(GestionarClientes);
            parent.repaint();
            parent.revalidate();
            TipoComboClientes.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_11MouseReleased

    private void tabbedUsuariosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedUsuariosStateChanged

        int index = tabbedUsuarios.getSelectedIndex();

        if (index == 0) {

            txfUsuario.requestFocus(true);
        } else {

            txfBuscar.requestFocus(true);
        }

    }//GEN-LAST:event_tabbedUsuariosStateChanged

    private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseReleased

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_2);
            ind_2.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarUsuarios);
            parent.repaint();
            parent.revalidate();
            desactivarCamposCUsuario();
            txfUsuario.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_2MouseReleased

    private void btn_3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseReleased

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_3);
            ind_3.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_4, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_4, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarConductores);
            parent.repaint();
            parent.revalidate();
            txfCedulaConductor.requestFocus(true);
        } else {

        }
    }//GEN-LAST:event_btn_3MouseReleased

    private void btn_4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseReleased

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_4);
            ind_4.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_5, btn_6, btn_7, btn_8, btn_10, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_5, ind_6, ind_7, ind_8, ind_10, ind_11});
            parent.removeAll();
            parent.add(GestionarProveedores);
            parent.repaint();
            parent.revalidate();
            txfNitProv.requestFocus(true);
        }
    }//GEN-LAST:event_btn_4MouseReleased

    private void btn_10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseReleased

        if (verificarReserva() && verificarSalida()) {
            setColor(btn_10);
            ind_10.setOpaque(true);
            resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_11}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6, ind_7, ind_8, ind_11});
            parent.removeAll();
            parent.add(GestionarEspecies);
            parent.repaint();
            parent.revalidate();
            obtenerMAXEspecie();
            txfNombreCien.requestFocus(true);
        }
    }//GEN-LAST:event_btn_10MouseReleased

    private void txfCostoIngresarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCostoIngresarEspecieActionPerformed

        ingresarEspecie();
    }//GEN-LAST:event_txfCostoIngresarEspecieActionPerformed

    private void txfCostoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCostoCompraActionPerformed

        ingresarEspecie();
    }//GEN-LAST:event_txfCostoCompraActionPerformed

    private void txfCantidadIngresarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCantidadIngresarEspecieActionPerformed

        ingresarEspecie();
    }//GEN-LAST:event_txfCantidadIngresarEspecieActionPerformed

    private void txfcontraseña_listarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfcontraseña_listarUsuarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfcontraseña_listarUsuarioKeyReleased

    private void txfcontraseña_listarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfcontraseña_listarUsuarioKeyTyped
        if (txfcontraseña_listarUsuario.getText().length() > 19) {

            evt.consume();
        }


    }//GEN-LAST:event_txfcontraseña_listarUsuarioKeyTyped

    public void calcularTotalSalidas() {

        int total = 0;
        int acumulador = 0;

        if (tablaSalidas.getRowCount() > 0) {

            for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

                acumulador = Integer.parseInt(tablaSalidas.getValueAt(i, 5).toString()) * Integer.parseInt(tablaSalidas.getValueAt(i, 6).toString());
                total += acumulador;

            }

            lblTotalSalidas.setText(Integer.toString(total));

        } else {

            lblTotalSalidas.setText("0");

        }

    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClientePanel;
    private javax.swing.JPanel ConductorPanel;
    public static javax.swing.JPanel ConsultarReserva;
    public static javax.swing.JPanel ConsultarSalida;
    public static javax.swing.JPanel CrearUsuario;
    public static javax.swing.JPanel GenerarSalida;
    public static javax.swing.JPanel GestionarClientes;
    public static javax.swing.JPanel GestionarConductores;
    public static javax.swing.JPanel GestionarEspecies;
    public static javax.swing.JPanel GestionarProveedores;
    public static javax.swing.JPanel GestionarUsuarios;
    public static javax.swing.JComboBox<String> IdentificacionCombo;
    public static javax.swing.JComboBox<String> IdentificacionComboSalidas;
    public static javax.swing.JPanel InfoSalidaPanel;
    public static javax.swing.JPanel IngresarEspecie;
    public static javax.swing.JPanel Inventario;
    public static javax.swing.JPanel ListarUsuario;
    private javax.swing.JLabel Logo;
    private javax.swing.JTabbedPane MenuReserva;
    private javax.swing.JTabbedPane MenuSalida;
    public static javax.swing.JPanel PerdidaPanel;
    public static javax.swing.JPanel PerfilGerente;
    public static javax.swing.JPanel Reservar;
    public static javax.swing.JPanel Reservas;
    public static javax.swing.JPanel Salidas;
    private javax.swing.JButton SignOut;
    private javax.swing.JComboBox<String> TipoComboClientes;
    public static javax.swing.JPanel TrasplantadoPanel;
    public static javax.swing.JPanel VentaPanel;
    private javax.swing.JButton btnAgregarConsultarReservas;
    private javax.swing.JButton btnAnteriorCliente;
    private javax.swing.JButton btnAnteriorCliente1;
    private javax.swing.JButton btnAnteriorCliente2;
    private javax.swing.JButton btnAnteriorCliente3;
    private javax.swing.JButton btnAnteriorConductor;
    private javax.swing.JButton btnAnteriorConductor1;
    private javax.swing.JButton btnAnteriorConductor3;
    private javax.swing.JButton btnAnteriorConductor4;
    private javax.swing.JButton btnAnteriorConductor5;
    private javax.swing.JButton btnBuscarSalida;
    private javax.swing.JLabel btnCambiar;
    private javax.swing.JButton btnCancelarConsultarReservas;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnCancelarSalida;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnDesactivarConductor;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnEditarCU;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarConductor;
    private javax.swing.JButton btnEditarEsp;
    private javax.swing.JButton btnEditarInventario;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarConductor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnGenerarExcel;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnGuardarCU;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarConductor;
    private javax.swing.JButton btnGuardarEsp;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarEspecie;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarClienteSalida;
    private javax.swing.JButton btnLimpiarClientes;
    private javax.swing.JButton btnLimpiarConductor;
    private javax.swing.JButton btnLimpiarConductorSalidas;
    private javax.swing.JButton btnLimpiarConsultarReservas;
    private javax.swing.JButton btnLimpiarConsultarSalida;
    private javax.swing.JButton btnLimpiarEsp;
    private javax.swing.JButton btnLimpiarInfPerdida;
    private javax.swing.JButton btnLimpiarInfTrasplantado;
    private javax.swing.JButton btnLimpiarInfVenta;
    private javax.swing.JButton btnLimpiarProveedor;
    private javax.swing.JButton btnLimpiarProveedor1;
    private javax.swing.JButton btnLimpiarProveedor2;
    private javax.swing.JButton btnLimpiarProveedor3;
    private javax.swing.JButton btnLimpiarReserva;
    private javax.swing.JButton btnLimpiarSalida;
    private javax.swing.JButton btnMostrarContraseñaU;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoCliente1;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnQuitar1;
    private javax.swing.JButton btnQuitar2;
    private javax.swing.JButton btnQuitar3;
    private javax.swing.JButton btnQuitarConsultarReservas;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarConductor;
    private javax.swing.JButton btnRegistrarEsp;
    private javax.swing.JButton btnRegistrarProv;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSeleccionarEspecie;
    private javax.swing.JButton btnSeleccionarEspeciePerdida;
    private javax.swing.JButton btnSeleccionarEspecieReservas;
    private javax.swing.JButton btnSeleccionarEspecieReservas3;
    private javax.swing.JButton btnSeleccionarEspecieReservas4;
    private javax.swing.JButton btnSeleccionarEspecieSalidas;
    private javax.swing.JButton btnSeleccionarProveedor;
    private javax.swing.JButton btnSiguienteCliente;
    private javax.swing.JButton btnSiguienteConductor;
    private javax.swing.JButton btnSiguienteInfoSalida;
    private javax.swing.JButton btnTraerReserva;
    private javax.swing.JButton btnTrasplantado;
    public static javax.swing.JPanel btn_1;
    public static javax.swing.JPanel btn_10;
    public static javax.swing.JPanel btn_11;
    public static javax.swing.JPanel btn_2;
    public static javax.swing.JPanel btn_3;
    public static javax.swing.JPanel btn_4;
    public static javax.swing.JPanel btn_5;
    public static javax.swing.JPanel btn_6;
    public static javax.swing.JPanel btn_7;
    public static javax.swing.JPanel btn_8;
    private javax.swing.JComboBox<String> estadoComboCU;
    private javax.swing.JComboBox<String> estadoComboConductor;
    public static com.toedter.calendar.JDateChooser fechaDesde;
    public static com.toedter.calendar.JDateChooser fechaDesdeSalida;
    public static com.toedter.calendar.JDateChooser fechaHasta;
    public static com.toedter.calendar.JDateChooser fechaHastaSalida;
    public static com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JTable historialRegistros;
    public static javax.swing.JPanel ind_1;
    public static javax.swing.JPanel ind_10;
    public static javax.swing.JPanel ind_11;
    public static javax.swing.JPanel ind_2;
    public static javax.swing.JPanel ind_3;
    public static javax.swing.JPanel ind_4;
    public static javax.swing.JPanel ind_5;
    public static javax.swing.JPanel ind_6;
    public static javax.swing.JPanel ind_7;
    public static javax.swing.JPanel ind_8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelStock;
    public static javax.swing.JLabel lblApellido;
    public static javax.swing.JLabel lblCargo;
    public static javax.swing.JLabel lblCelular;
    public static javax.swing.JLabel lblCodigo;
    public static javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumReservas;
    private javax.swing.JLabel lblNumSalidas;
    private javax.swing.JLabel lblNumUsuarios;
    public static javax.swing.JLabel lblNumeroEspecie;
    public static javax.swing.JLabel lblNumeroReserva;
    public static javax.swing.JLabel lblNumeroSalida;
    private javax.swing.JLabel lblTitulo;
    public static javax.swing.JLabel lblTotal;
    public static javax.swing.JLabel lblTotalConsultarReservas;
    public static javax.swing.JLabel lblTotalSalidas;
    public static javax.swing.JLabel lblUsuario;
    public static javax.swing.JComboBox<String> motivoCombo;
    public static javax.swing.JComboBox<String> motivoComboConsultarSalida;
    public static javax.swing.JPanel parent;
    private javax.swing.JTextField passInput1;
    public static javax.swing.JComboBox<String> rangoCombo;
    public static javax.swing.JComboBox<String> rangoComboTrasplantado;
    private javax.swing.JPanel side_pane;
    public static diu.swe.habib.JPanelSlider.JPanelSlider slidePanel;
    private javax.swing.JTabbedPane tabbedUsuarios;
    private javax.swing.JTable tablaAgotados;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaConductores;
    public static javax.swing.JTable tablaConsultarReservas;
    public static javax.swing.JTable tablaConsultarSalidas;
    private javax.swing.JTable tablaEspecies;
    public static javax.swing.JTable tablaInventario;
    private javax.swing.JTable tablaProveedores;
    public static javax.swing.JTable tablaReservas;
    public static javax.swing.JTable tablaSalidas;
    private javax.swing.JTable tablaUsuarios;
    public static javax.swing.JComboBox<String> tamanoCombo;
    public static javax.swing.JComboBox<String> tamanoComboTrasplantado;
    private javax.swing.JTextField txfApellido;
    private javax.swing.JTextField txfApellido1;
    private javax.swing.JTextField txfApellidoConductor;
    private javax.swing.JTextField txfApellidoConductorSalidas;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfBuscarCliente;
    private javax.swing.JTextField txfBuscarConductor;
    private javax.swing.JTextField txfBuscarConsultarReservas;
    public static javax.swing.JTextField txfBuscarConsultarSalida;
    private javax.swing.JTextField txfBuscarEsp;
    public static javax.swing.JTextField txfBuscarEspecie;
    private javax.swing.JTextField txfBuscarInventario;
    private javax.swing.JTextField txfBuscarProv;
    public static javax.swing.JTextField txfCantidadIngresarEspecie;
    public static javax.swing.JTextField txfCantidadPerdida;
    private javax.swing.JTextField txfCantidadReservas;
    public static javax.swing.JTextField txfCantidadSalidas;
    public static javax.swing.JTextField txfCantidadTrasplantado;
    private javax.swing.JTextField txfCedulaConductor;
    private javax.swing.JTextField txfCedulaConductorSalidas;
    private javax.swing.JTextField txfCelular;
    private javax.swing.JTextField txfCelular1;
    private javax.swing.JTextField txfCelularClientes;
    private javax.swing.JTextField txfCelularConductor;
    private javax.swing.JTextField txfCelularConductorSalidas;
    private javax.swing.JTextField txfCelularProv;
    public static javax.swing.JTextField txfCodigoReserva;
    private javax.swing.JPasswordField txfContraseña;
    private javax.swing.JTextField txfCorreoProv;
    public static javax.swing.JTextField txfCostoCompra;
    public static javax.swing.JTextField txfCostoIngresarEspecie;
    private javax.swing.JTextField txfDestino;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfDireccion1;
    public static javax.swing.JTextField txfEspecie;
    public static javax.swing.JTextField txfEspeciePerdida;
    public static javax.swing.JTextField txfEspecieReservas;
    public static javax.swing.JTextField txfEspecieSalidas;
    public static javax.swing.JTextField txfEspecieTrasplantado;
    private javax.swing.JTextField txfFamilia;
    private javax.swing.JTextField txfIdClientes;
    public static javax.swing.JTextField txfIdentificacionClienteSalidas;
    public static javax.swing.JTextField txfIdentificacionConsultarReservas;
    public static javax.swing.JTextField txfIdentificacionReservas;
    private javax.swing.JTextField txfMsnm;
    public static javax.swing.JTextField txfNitIngresarEspecie;
    private javax.swing.JTextField txfNitProv;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfNombre1;
    private javax.swing.JTextField txfNombreCien;
    public static javax.swing.JTextField txfNombreClienteSalidas;
    private javax.swing.JTextField txfNombreClientes;
    private javax.swing.JTextField txfNombreComun;
    private javax.swing.JTextField txfNombreConductor;
    private javax.swing.JTextField txfNombreConductorSalidas;
    public static javax.swing.JTextField txfNombreConsultarReservas;
    private javax.swing.JTextField txfNombreProv;
    private javax.swing.JTextField txfNombreReservas;
    private javax.swing.JTextField txfPlacaSalidas;
    private javax.swing.JTextField txfPredio;
    public static javax.swing.JTextField txfTelefonoClienteSalidas;
    public static javax.swing.JTextField txfTelefonoConsultarReservas;
    private javax.swing.JTextField txfTelefonoReservas;
    private javax.swing.JTextField txfUbicacion;
    private javax.swing.JTextField txfUsuario;
    private javax.swing.JTextField txfUsuario1;
    private javax.swing.JTextField txfcontraseña_listarUsuario;
    // End of variables declaration//GEN-END:variables

    public void registrarSalida() {

        int motivo = motivoCombo.getSelectedIndex();

        switch (motivo) {
            case 0:
            case 1:
            case 2:
            case 3:
                registrarSalidaVenta();
                break;
            case 4:
                registrarSalidaPerdida();
                break;
            case 5:
                registrarSalidaTrasplantado();
                break;
            case 6:
                registrarSalidaReserva();
                break;
            default:
                break;
        }
    }

    public void agregarEspecieTrasplantado() {

        if (txfEspecieTrasplantado.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Busque o seleccione una especie primero, por favor.");
        } else if (txfCantidadTrasplantado.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad, por favor.");
        } else if (Integer.parseInt(txfCantidadTrasplantado.getText()) < 1) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero.");
        } else {
            registrarSalidaTrasplantado();
        }
    }

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public static String mesActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM");
        return formatoFecha.format(fecha);
    }

    public static String fechaSalida() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }

    public void obtenerMAXreserva() {

        try {
            rs = rDao.MAXreserva();

            if (rs.next()) {

                int numero = rs.getInt(1) + 1;
                lblNumeroReserva.setText(Integer.toString(numero));

            } else {

            }

        } catch (SQLException ex) {
        }
    }

    public void obtenerMAXEspecie() {

        try {
            rs = eDao.MAXEspecie();

            if (rs.next()) {

                int numero = rs.getInt(1) + 1;
                lblNumeroEspecie.setText(Integer.toString(numero));

            } else {

            }

        } catch (SQLException ex) {
        }
    }

    public void obtenerMAXsalida() {

        try {
            rs = sDao.MAXSalida();

            if (rs.next()) {

                int numero = rs.getInt(1);
                lblNumeroSalida.setText(Integer.toString(numero));

            } else {

            }

        } catch (SQLException ex) {
        }
    }

    public void cancelarSalida() {

        for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

            int codigo = Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tablaSalidas.getValueAt(i, 5).toString());
            String tamano = tablaSalidas.getValueAt(i, 4).toString();
            String rango = tablaSalidas.getValueAt(i, 3).toString();

            if (sDao.cancelarSalida(codigo, cantidad, tamano, rango)) {
                System.out.println(cantidad);
            } else {

                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            }

        }

        limpiarSalidas();
        limpiarTablaSalidas();
        calcularTotalSalidas();
        motivoCombo.setSelectedIndex(3);
        IdentificacionComboSalidas.setSelectedIndex(0);
        txfCedulaConductorSalidas.setEditable(true);

    }

    public void cancelarSalidaCombo() {

        for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

            int codigo = Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tablaSalidas.getValueAt(i, 5).toString());
            String tamano = tablaSalidas.getValueAt(i, 4).toString();
            String rango = tablaSalidas.getValueAt(i, 3).toString();

            if (sDao.cancelarSalida(codigo, cantidad, tamano, rango)) {

            } else {

                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            }

        }

    }

    public void cancelarTrasplantado() {

        if (txfCantidadTrasplantado.getText().trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Trasplantado cancelado correctamente.");
            limpiarSalidas();
            calcularTotalSalidas();
            motivoCombo.setSelectedIndex(3);
            IdentificacionComboSalidas.setSelectedIndex(0);

        } else {

            int cantidad = Integer.parseInt(txfCantidadTrasplantado.getText());

            if (sDao.cancelarSalida(codigo_Ingreso, cantidad, tamañoTrasplantado, rangoTrasplantado)) {

            } else {

                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            }

            JOptionPane.showMessageDialog(null, "Salida cancelada correctamente.");
            limpiarSalidas();
            calcularTotalSalidas();
            motivoCombo.setSelectedIndex(3);
            IdentificacionComboSalidas.setSelectedIndex(0);
        }

    }

    public void cancelarTrasplantadoCombo() {

        if (txfCantidadTrasplantado.getText().trim().length() == 0) {

            IdentificacionComboSalidas.setSelectedIndex(0);
        } else {

            int cantidad = Integer.parseInt(txfCantidadTrasplantado.getText());

            if (sDao.cancelarSalida(codigo_Ingreso, cantidad, tamañoTrasplantado, rangoTrasplantado)) {

            } else {

                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            }

        }

    }

    public void limpiarTablaUsuarios() {
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void limpiarTablaConductores() {
        DefaultTableModel modelo = (DefaultTableModel) tablaConductores.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    public void limpiarTablaReservas() {
        DefaultTableModel modelo = (DefaultTableModel) tablaReservas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        calcularTotal();

    }

    public void limpiarTablaSalidas() {
        DefaultTableModel modelo = (DefaultTableModel) tablaSalidas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        calcularTotalSalidas();

    }

    public void limpiarTablaProveedor() {
        DefaultTableModel modelo = (DefaultTableModel) tablaProveedores.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    public void limpiarTablaConsultarSalidas() {
        DefaultTableModel modelo = (DefaultTableModel) tablaConsultarSalidas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void limpiarTablaTraerReserva() {
        DefaultTableModel modelo = (DefaultTableModel) SeleccionarReserva.tablaReservas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void limpiarSalidas() {

        limpiarConductorSalidas();
        limpiarClienteSalidas();
        limpiarEspecieSalidas();
        limpiarTrasplantado();
        limpiarPerdida();
        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);
        limpiarInfoSalida();
        IdentificacionComboSalidas.setEnabled(true);
        IdentificacionComboSalidas.requestFocus(true);

    }

    public void limpiarTablaConsultarReservas() {
        DefaultTableModel modelo = (DefaultTableModel) tablaConsultarReservas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        calcularTotalConsultarReservas();

    }

    public void cancelarReserva() {

        DefaultTableModel modelo = (DefaultTableModel) tablaReservas.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {

            int codigo_reserva = Integer.parseInt(lblNumeroReserva.getText());
            int codigo_ingreso = Integer.parseInt(tablaReservas.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tablaReservas.getValueAt(i, 5).toString());
            String rango = tablaReservas.getValueAt(i, 3).toString();
            String tamaño = tablaReservas.getValueAt(i, 4).toString();

            if (rDao.deshacerReserva(codigo_ingreso, cantidad, tamaño, rango)) {

                if (rDao.eliminarReserva(codigo_reserva, cantidad, tamaño, rango)) {

                    calcularTotal();

                } else {
                }

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error.");

            }
        }

        limpiarTablaReservas();
        limpiarReservas();

    }

    public void cancelarConsultarReserva() {

        DefaultTableModel modelo = (DefaultTableModel) tablaConsultarReservas.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {

            int codigo_reserva = Integer.parseInt(txfCodigoReserva.getText());
            int codigo_ingreso = Integer.parseInt(tablaConsultarReservas.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tablaConsultarReservas.getValueAt(i, 5).toString());
            String rango = tablaConsultarReservas.getValueAt(i, 3).toString();
            String tamaño = tablaConsultarReservas.getValueAt(i, 4).toString();

            if (rDao.deshacerReserva(codigo_ingreso, cantidad, tamaño, rango)) {

                if (rDao.eliminarReserva(codigo_reserva, cantidad, tamaño, rango)) {

                    calcularTotalConsultarReservas();

                } else {
                }

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error.");

            }
        }

        limpiarTablaConsultarReservas();

    }

    public void seleccionarUsuario() {

        try {

            ResultSet rs;

            String cod = tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString();

            this.txfUsuario1.setText(cod);

            rs = uDao.buscar(cod);

            if (rs.next()) {

                this.txfNombre1.setText(rs.getString("nombre_usuario"));
                this.txfApellido1.setText(rs.getString("apellido"));
                this.txfCelular1.setText(rs.getString("celular"));
                this.txfDireccion1.setText(rs.getString("direccion"));
                this.txfcontraseña_listarUsuario.setText(rs.getString("contraseña"));

                desactivarCamposCUsuario();

                this.btnGuardarCU.setEnabled(false);
                this.btnEditarCU.setEnabled(true);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el usuario.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario primero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontró el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void buscarProveedores(String busca) {
        DefaultTableModel modelo;
        TableColumnModel column = tablaProveedores.getColumnModel();
        modelo = pDao.buscarProveedor(busca);
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tablaProveedores.setModel(modelo);
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tablaProveedores.getColumnModel().getColumn(1).setCellRenderer(tcr);
        column.getColumn(1).setPreferredWidth(200);

    }

    public void buscarEspecies(String busca) {

        DefaultTableModel modelo;
        TableColumnModel column = tablaEspecies.getColumnModel();
        modelo = eDao.buscarPlanta(busca);
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tablaEspecies.setModel(modelo);
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tablaEspecies.getColumnModel().getColumn(1).setCellRenderer(tcr);
        column.getColumn(0).setPreferredWidth(150);
        column.getColumn(1).setPreferredWidth(150);

    }

    public void buscarConductores(String cedula) {

        DefaultTableModel modelo;
        TableColumnModel column = tablaConductores.getColumnModel();

        modelo = cDao.buscarConductor(cedula);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();

        tablaConductores.setModel(modelo);

        tcr.setHorizontalAlignment(SwingConstants.LEFT);

        tablaConductores.getColumnModel()
                .getColumn(1).setCellRenderer(tcr);
        column.getColumn(
                1).setPreferredWidth(200);

    }

    public void buscarUsuario(String busca) {
        DefaultTableModel modelo;
        TableColumnModel column = tablaUsuarios.getColumnModel();
        modelo = uDao.buscarUsuario(busca);
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tablaUsuarios.setModel(modelo);
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tablaUsuarios.getColumnModel().getColumn(1).setCellRenderer(tcr);
        column.getColumn(1).setPreferredWidth(200);

    }

    public void seleccionarProveedor() {

        try {

            ResultSet rs;

            String nit = tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString();

            this.txfNitProv.setText(nit);

            rs = pDao.buscar(nit);

            if (rs.next()) {

                this.txfNitProv.setText(rs.getString("nit"));
                this.txfNombreProv.setText(rs.getString("nombre"));
                this.txfCelularProv.setText(rs.getString("celular"));
                this.txfCorreoProv.setText(rs.getString("correo"));
                this.txfUbicacion.setText(rs.getString("ubicacion"));

                desactivarCamposProveedor();
                this.btnGuardarProveedor.setEnabled(false);
                this.btnEditarProveedor.setEnabled(true);
                this.btnRegistrarProv.setEnabled(false);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el proveedor.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor primero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontró el proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void seleccionarEspecie() {

        try {

            ResultSet rs;

            String codigo = tablaEspecies.getValueAt(tablaEspecies.getSelectedRow(), 0).toString();
            rs = eDao.buscarEspecie(codigo);

            if (rs.next()) {

                this.txfNombreCien.setText(rs.getString("nombre_cientifico"));
                this.txfNombreComun.setText(rs.getString("nombre_vulgar"));
                this.txfFamilia.setText(rs.getString("familia"));
                this.txfMsnm.setText(rs.getString("msnm"));

                desactivarCamposEspecies();
                this.btnGuardarEsp.setEnabled(false);
                this.btnEditarEsp.setEnabled(true);
                this.btnRegistrarEsp.setEnabled(false);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró la especie.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Seleccione una especie primero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontró la especie.", "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void seleccionarConductor() {

        try {

            ResultSet rs;

            String cedula = tablaConductores.getValueAt(tablaConductores.getSelectedRow(), 0).toString();

            this.txfCedulaConductor.setText(cedula);

            rs = cDao.buscar(cedula);

            if (rs.next()) {

                this.txfNombreConductor.setText(rs.getString("nombre"));
                this.txfApellidoConductor.setText(rs.getString("apellido"));
                this.txfCelularConductor.setText(rs.getString("celular"));

                desactivarCamposConductor();
                this.btnGuardarConductor.setEnabled(false);
                this.btnEditarConductor.setEnabled(true);
                this.btnRegistrarConductor.setEnabled(false);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el conductor.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
//            JOptionPane.showMessageDialog(null, "Seleccione un conductor primero.", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontró el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void mostrarEspeciesReservadas() {

        try {

            DefaultTableModel modelo;
            String codigo_reserva = lblNumeroReserva.getText();
            modelo = rDao.mostrarReservadas(codigo_reserva);
            TableColumnModel column = tablaReservas.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaReservas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            column.getColumn(1).setPreferredWidth(200);

        } catch (Exception e) {

        }

    }

    public void mostrarEspeciesConsultarReservas() {

        try {

            DefaultTableModel modelo;
            String codigo_reserva = txfCodigoReserva.getText();
            modelo = rDao.mostrarReservadas(codigo_reserva);
            TableColumnModel column = tablaConsultarReservas.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaConsultarReservas.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            column.getColumn(1).setPreferredWidth(200);

        } catch (Exception e) {

        }

    }

    public void mostrarProductosAgotados() {

        try {

            DefaultTableModel modelo;
            modelo = iDao.mostrarAgotados();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaAgotados.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            TableColumnModel column = tablaAgotados.getColumnModel();
            column.getColumn(1).setPreferredWidth(150);
            tablaAgotados.setForeground(Color.red);

        } catch (Exception e) {

        }

    }

    public void mostrarUsuariosInactivos() {

        DefaultTableModel modelo;
        modelo = uDao.mostrarINACTIVOS();
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        this.tablaUsuarios.setModel(modelo);
        tablaUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12));
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tablaUsuarios.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tablaUsuarios.getColumnModel().getColumn(1).setCellRenderer(tcr);
        TableColumnModel column = tablaUsuarios.getColumnModel();
        column.getColumn(1).setPreferredWidth(200);
        tablaUsuarios.setForeground(Color.red);

    }

    public void mostrarConductoresInactivos() {

        try {

            DefaultTableModel modelo;
            modelo = cDao.mostrarINACTIVOS();
            TableColumnModel column = tablaConductores.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            this.tablaConductores.setModel(modelo);
            tablaConductores.setFont(new java.awt.Font("Tahoma", 1, 12));
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            tablaConductores.getColumnModel().getColumn(0).setCellRenderer(tcr);
            tablaConductores.getColumnModel().getColumn(1).setCellRenderer(tcr);
            column.getColumn(1).setPreferredWidth(200);
            tablaConductores.setForeground(Color.red);

        } catch (Exception e) {

        }
    }

    public void limpiarRUsuario() {

        txfUsuario.setText(null);
        txfNombre.setText(null);
        txfApellido.setText(null);
        txfCelular.setText(null);
        txfDireccion.setText(null);
        txfContraseña.setText(null);
    }

    public void limpiarInfoSalida() {

        txfDestino.setText(null);
        txfPredio.setText(null);
        motivoCombo.requestFocus();
    }

    public void limpiarCUsuario() {

        txfUsuario1.setText(null);
        txfNombre1.setText(null);
        txfApellido1.setText(null);
        txfCelular1.setText(null);
        txfDireccion1.setText(null);
        txfcontraseña_listarUsuario.setVisible(false);
        jLabel69.setVisible(false);

    }

    public void limpiarConductor() {
        txfCedulaConductor.setText(null);
        txfNombreConductor.setText(null);
        txfApellidoConductor.setText(null);
        txfCelularConductor.setText(null);
        activarCamposConductor();
        txfCedulaConductor.requestFocus(true);

    }

    public void limpiarConductorSalidas() {

        txfCedulaConductorSalidas.setText(null);
        txfNombreConductorSalidas.setText(null);
        txfApellidoConductorSalidas.setText(null);
        txfCelularConductorSalidas.setText(null);
        txfPlacaSalidas.setText(null);
        txfCedulaConductorSalidas.setEditable(true);
        txfCedulaConductorSalidas.requestFocus(true);

    }

    public void limpiarProveedor() {
        txfNitProv.setText(null);
        txfNombreProv.setText(null);
        txfCelularProv.setText(null);
        txfCorreoProv.setText(null);
        txfUbicacion.setText(null);
        txfNitProv.requestFocus(true);
        activarCamposProveedor();

    }

    public void limpiarReservas() {

        txfIdentificacionReservas.setText(null);
        txfNombreReservas.setText(null);
        txfTelefonoReservas.setText(null);
        txfEspecieReservas.setText(null);
        txfCantidadReservas.setText(null);
        IdentificacionCombo.requestFocus(true);
        IdentificacionCombo.setSelectedIndex(0);
        activarCamposReserva();

    }

    public void limpiarConsultarReservas() {

        txfCodigoReserva.setText(null);
        txfIdentificacionConsultarReservas.setText(null);
        txfNombreConsultarReservas.setText(null);
        txfTelefonoConsultarReservas.setText(null);
        txfBuscarConsultarReservas.setText(null);

        limpiarTablaConsultarReservas();
    }

    public void limpiarClienteSalidas() {

        this.txfIdentificacionClienteSalidas.setText(null);
        this.txfNombreClienteSalidas.setText(null);
        this.txfTelefonoClienteSalidas.setText(null);
        txfIdentificacionClienteSalidas.setEditable(true);
        txfNombreClienteSalidas.setEditable(true);
        txfTelefonoClienteSalidas.setEditable(true);
        IdentificacionComboSalidas.requestFocus(true);

    }

    public void limpiarEspecieSalidas() {

        this.txfEspecieSalidas.setText(null);
        this.txfCantidadSalidas.setText(null);
    }

    public void limpiarTrasplantado() {

        this.txfEspecieTrasplantado.setText(null);
        this.txfCantidadTrasplantado.setText(null);
        tamanoComboTrasplantado.setSelectedIndex(0);
        rangoComboTrasplantado.setSelectedIndex(0);
    }

    public void limpiarPerdida() {

        this.txfEspeciePerdida.setText(null);
        this.txfCantidadPerdida.setText(null);
    }

    public void limpiarEspecies() {

        this.txfNombreCien.setText(null);
        this.txfNombreComun.setText(null);
        this.txfFamilia.setText(null);
        this.txfMsnm.setText(null);
        this.txfBuscarEsp.setText(null);
        this.btnRegistrarEsp.setEnabled(true);
        this.btnGuardarEsp.setEnabled(false);
        limpiarTablaEspecies();
        activarCamposEspecies();
        this.txfNombreCien.requestFocus(true);
    }

    public void limpiarIngresarEspecie() {

        try {

            txfNitIngresarEspecie.setText("");
            txfEspecie.setText("");
            tamanoCombo.setSelectedIndex(-1);
            rangoCombo.setSelectedIndex(-1);
            txfCostoIngresarEspecie.setText("");
            txfCostoCompra.setText("");
            txfCantidadIngresarEspecie.setText("");
            txfBuscarEspecie.setText("");
            java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
            fechaIngreso.setDate(fechaParseada);
            fechaDesde.setDate(fechaParseada);
            fechaHasta.setDate(fechaParseada);
            txfCostoIngresarEspecie.setEditable(false);
            buscarIngresosFecha(fechaActual(), fechaActual());
            btnSeleccionarProveedor.requestFocus(true);
        } catch (ParseException ex) {

        }

    }

    public void activarCamposCUsuario() {

        this.txfUsuario1.setEditable(true);
        this.txfNombre1.setEditable(true);
        this.txfApellido1.setEditable(true);
        this.txfCelular1.setEditable(true);
        this.txfDireccion1.setEditable(true);
        this.txfcontraseña_listarUsuario.setEditable(true);
    }

    public void activarCamposProveedor() {

        this.txfNitProv.setEditable(true);
        this.txfNombreProv.setEditable(true);
        this.txfCelularProv.setEditable(true);
        this.txfCorreoProv.setEditable(true);
        this.txfUbicacion.setEditable(true);
    }

    public void activarCamposEspecies() {

        this.txfNombreCien.setEditable(true);
        this.txfNombreComun.setEditable(true);
        this.txfFamilia.setEditable(true);
        this.txfMsnm.setEditable(true);
    }

    public void desactivarCamposEspecies() {

        this.txfNombreCien.setEditable(false);
        this.txfNombreComun.setEditable(false);
        this.txfFamilia.setEditable(false);
        this.txfMsnm.setEditable(false);
    }

    public void activarCamposConductor() {

        this.txfCedulaConductor.setEditable(true);
        this.txfNombreConductor.setEditable(true);
        this.txfApellidoConductor.setEditable(true);
        this.txfCelularConductor.setEditable(true);
    }

    public void activarCamposReserva() {

        this.txfIdentificacionReservas.setEditable(true);
        this.txfNombreReservas.setEditable(true);
        this.txfTelefonoReservas.setEditable(true);
        this.btnNuevoCliente.setEnabled(true);
        this.btnSeleccionarEspecieReservas.setEnabled(false);
    }

    public void desactivarCamposCUsuario() {

        this.txfUsuario1.setEditable(false);
        this.txfNombre1.setEditable(false);
        this.txfApellido1.setEditable(false);
        this.txfCelular1.setEditable(false);
        this.txfDireccion1.setEditable(false);

    }

    public void desactivarCamposProveedor() {

        this.txfNitProv.setEditable(false);
        this.txfNombreProv.setEditable(false);
        this.txfCelularProv.setEditable(false);
        this.txfCorreoProv.setEditable(false);
        this.txfUbicacion.setEditable(false);

    }

    public void desactivarCamposConductor() {

        this.txfCedulaConductor.setEditable(false);
        this.txfNombreConductor.setEditable(false);
        this.txfApellidoConductor.setEditable(false);
        this.txfCelularConductor.setEditable(false);

    }

    public void desactivarCamposReserva() {

        this.txfIdentificacionReservas.setEditable(false);
        this.txfNombreReservas.setEditable(false);
        this.txfTelefonoReservas.setEditable(false);
        btnNuevoCliente.setEnabled(false);

    }

    public void activarUsuario() {

        try {

            String usuario = txfUsuario1.getText();
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere activar el usuario nuevamente?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                if (uDao.activar(usuario)) {

                    JOptionPane.showMessageDialog(null, "Usuario activado correctamente.");
                    limpiarCUsuario();
                    mostrarUsuariosInactivos();

                } else {

                    JOptionPane.showMessageDialog(null, "Error, no se pudo activar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);

                }

            } else {

            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Seleccione un usuario primero.");

        }

    }

    public void activarConductor() {

        try {

            int cedula = Integer.parseInt(txfCedulaConductor.getText());
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere activar el conductor nuevamente?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == 0) {

                if (cDao.activar(Integer.toString(cedula))) {

                    JOptionPane.showMessageDialog(null, "Conductor activado correctamente.");
                    limpiarTablaConductores();
                    estadoComboConductor.setSelectedIndex(0);
                    limpiarConductor();
                    activarCamposConductor();
                    this.btnEditarConductor.setEnabled(true);
                    this.btnRegistrarConductor.setEnabled(true);
                    this.btnLimpiarConductor.setEnabled(true);
                    this.btnDesactivarConductor.setEnabled(true);

                } else {

                    JOptionPane.showMessageDialog(null, "Error, no se pudo activar el conductor.", "Error", JOptionPane.ERROR_MESSAGE);

                }

            } else {

            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Digíte números en los campos 'Cédula' y 'Celular'.");

        }

    }

    public void desactivarUsuario() {

        try {

            String usuario = txfUsuario1.getText();

            if (usuario.length() == 0) {

                JOptionPane.showMessageDialog(null, "Seleccione un usuario primero.");

            } else {
                int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere desactivar el usuario?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    if (uDao.desactivar(usuario)) {

                        JOptionPane.showMessageDialog(null, "Usuario desactivado correctamente.");
                        listarUsuarios();
                        limpiarCUsuario();
                        activarCamposCUsuario();

                    } else {

                        JOptionPane.showMessageDialog(null, "Error, no se pudo desactivar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                } else {

                }
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Seleccione un usuario primero.");

        }

    }

    public void desactivarConductor() {

        try {

            String cedula = txfCedulaConductor.getText();

            if (cedula.length() == 0) {

                JOptionPane.showMessageDialog(null, "Seleccione un conductor primero.");

            } else {
                int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere desactivar el conductor?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    if (cDao.desactivar(cedula)) {

                        JOptionPane.showMessageDialog(null, "Conductor desactivado correctamente.");
                        limpiarTablaConductores();
                        limpiarConductor();
                        activarCamposConductor();
                        this.btnRegistrarConductor.setEnabled(true);

                    } else {

                        JOptionPane.showMessageDialog(null, "Error, no se pudo desactivar el conductor.", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                } else {

                }
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Seleccione un conductor primero.");

        }

    }

    public void listarUsuarios() {

        DefaultTableModel modelo;
        TableColumnModel column = tablaUsuarios.getColumnModel();
        modelo = uDao.listar(txfBuscar.getText());
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tablaUsuarios.setModel(modelo);
        tcr.setHorizontalAlignment(SwingConstants.LEFT);
        tablaUsuarios.getColumnModel().getColumn(1).setCellRenderer(tcr);
        column.getColumn(1).setPreferredWidth(200);

    }

    public void consultarEspecie() {

        try {

            String tamano_bolsa = tamanoCombo.getSelectedItem().toString();
            String rango = rangoCombo.getSelectedItem().toString();
            ResultSet rs;
            rs = eDao.buscarIngresoPlanta(codigo_Especie, tamano_bolsa, rango);

            if (!rs.next()) {

                txfCostoIngresarEspecie.setText(null);
                txfCostoIngresarEspecie.setEditable(true);

            } else {

                txfCostoIngresarEspecie.setText(rs.getString("costo"));
                txfCostoIngresarEspecie.setEditable(false);

            }

        } catch (Exception e) {

        }

    }

    public void buscarIngresos(String busca, String fechaInicio, String fechaFin) {

        try {

            DefaultTableModel modelo;
            modelo = dDao.listarEspecies(busca, fechaInicio, fechaFin);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            historialRegistros.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            historialRegistros.getColumnModel().getColumn(1).setCellRenderer(tcr);
//            column.getColumn(2).setPreferredWidth(200);
//            column.getColumn(1).setPreferredWidth(200);

        } catch (IllegalArgumentException a) {
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }

    }

    public void buscarIngresosFecha(String fechaInicio, String fechaFin) {

        try {

            DefaultTableModel modelo;
//            TableColumnModel column = historialRegistros.getColumnModel();
            modelo = dDao.listarEspeciesFecha(fechaInicio, fechaFin);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            historialRegistros.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            historialRegistros.getColumnModel().getColumn(1).setCellRenderer(tcr);
//            column.getColumn(2).setPreferredWidth(200);
//            column.getColumn(1).setPreferredWidth(200);

        } catch (IllegalArgumentException a) {
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }

    }

    public void buscarEspecieInventario() {

        try {

            DefaultTableModel modelo;
            TableColumnModel column = tablaInventario.getColumnModel();
            modelo = iDao.listar(txfBuscarInventario.getText());
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaInventario.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            tablaInventario.getColumnModel().getColumn(1).setCellRenderer(tcr);
            column.getColumn(2).setPreferredWidth(200);
            column.getColumn(1).setPreferredWidth(200);

        } catch (IllegalArgumentException a) {
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }
    }

    public void limpiarTablaInventario() {
        DefaultTableModel modelo = (DefaultTableModel) tablaInventario.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    public void limpiarTablaEspecies() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEspecies.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    public void verificarCedula() {

        String cedula = txfIdentificacionReservas.getText().trim();
        String nombre = txfNombreReservas.getText().trim();
        long celular = Long.parseLong(txfTelefonoReservas.getText().trim());

        if (cedula.length() < 8 || cedula.length() > 10) {

            JOptionPane.showMessageDialog(null, "Digíte una cédula válida, por favor.");

        } else {

            Cliente_ cliente = new Cliente_(cedula, nombre, celular);

            if (clDao.CrearCliente(cliente)) {
                JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
                desactivarCamposReserva();
                this.btnSeleccionarEspecieReservas.setEnabled(true);

            }

        }
    }

    public void verificarNIT() {

        String NIT = txfIdentificacionReservas.getText().trim();
        String nombre = txfNombreReservas.getText().trim();
        long celular = Long.parseLong(txfTelefonoReservas.getText().trim());

        if (!NIT.contains("-")) {

            JOptionPane.showMessageDialog(null, "Digite el guión en el NIT." + "\n" + "Por ejemplo: 1234567890-5");

        } else if (NIT.length() < 8 || NIT.length() > 14) {

            JOptionPane.showMessageDialog(null, "Digíte un NIT válido, por favor.");

        } else {

            Cliente_ cliente = new Cliente_(NIT, nombre, celular);

            if (clDao.CrearCliente(cliente)) {

                JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
                desactivarCamposReserva();
                this.btnSeleccionarEspecieReservas.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente, inténtelo nuevamente.");
            }
        }
    }

    public void registrarCliente() {

        String cedula = txfIdClientes.getText().trim();
        String nombre = txfNombreClientes.getText().trim();
        long celular = Long.parseLong(txfCelularClientes.getText().trim());

        Cliente_ cliente = new Cliente_(cedula, nombre, celular);

        if (clDao.CrearCliente(cliente)) {

            JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");

        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente, inténtelo nuevamente.");
        }

    }

    public void registrarClienteSalida() {

        String cedula = txfIdentificacionClienteSalidas.getText().trim();
        String nombre = txfNombreClienteSalidas.getText().trim();
        long celular = Long.parseLong(txfTelefonoClienteSalidas.getText().trim());

        Cliente_ cliente = new Cliente_(cedula, nombre, celular);

        if (clDao.CrearCliente(cliente)) {

            JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");

        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente, inténtelo nuevamente.");
        }

    }

    public boolean verificarReserva() {

        if (Reservas.isShowing()) {

            if (tablaReservas.getRowCount() != 0) {

                int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar la reserva?" + "\n" + "Recuerde que debe dar click en el botón 'Reservar' para confirmar la reserva.", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    cancelarReserva();
                    return true;

                } else {
                    return false;
                }

            }
        }

        return true;
    }

    public boolean verificarSalida() {

        if (Salidas.isShowing()) {

            if (tablaSalidas.getRowCount() != 0 || txfEspeciePerdida.getText().length() != 0 || txfEspecieTrasplantado.getText().length() != 0) {

                int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea descartar la salida?" + "\n" + "Recuerde que debe dar click en el botón 'Registrar' para confirmar la salida.", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (resultado == 0) {

                    if (TrasplantadoPanel.isShowing()) {
                        cancelarTrasplantado();
                        return true;
                    } else {
                        cancelarSalida();
                        return true;
                    }
                } else {
                    return false;
                }

            }
        }

        return true;
    }

    public void calcularTotal() {

        int total = 0;
        int acumulador = 0;

        if (tablaReservas.getRowCount() > 0) {

            for (int i = 0; i < tablaReservas.getRowCount(); i++) {

                acumulador = Integer.parseInt(tablaReservas.getValueAt(i, 5).toString()) * Integer.parseInt(tablaReservas.getValueAt(i, 6).toString());
                total += acumulador;

            }

            lblTotal.setText(Integer.toString(total));

        } else {

            lblTotal.setText("0");

        }

    }

    public void calcularTotalConsultarReservas() {

        int total = 0;
        int acumulador = 0;

        if (tablaConsultarReservas.getRowCount() > 0) {

            for (int i = 0; i < tablaConsultarReservas.getRowCount(); i++) {

                acumulador = Integer.parseInt(tablaConsultarReservas.getValueAt(i, 5).toString()) * Integer.parseInt(tablaConsultarReservas.getValueAt(i, 6).toString());
                total += acumulador;

            }

            lblTotalConsultarReservas.setText(Integer.toString(total));

        } else {

            lblTotalConsultarReservas.setText("0");

        }

    }

    public void reiniciarSeleccionarEspecie() {

        ventanaEspeciesReservas.tamanoCombo.setSelectedIndex(0);
        ventanaEspeciesReservas.rangoCombo.setSelectedIndex(0);
        ventanaEspeciesReservas.txfBuscarEsp.setText(null);
        limpiarTablaInventario();

    }

    public void buscarReservas() {

        try {

            if (txfBuscarConsultarReservas.getText().trim().length() == 0) {

                JOptionPane.showMessageDialog(null, "Ingrese una cédula o un código de reserva, por favor.");

            } else {

                ventanaCodigos.setVisible(true);

                DefaultTableModel modelo;
                modelo = rDao.mostrarCodigosReservas(txfBuscarConsultarReservas.getText().trim());
                TableColumnModel column = CodigosReservas.tablaCodigosReservas.getColumnModel();
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                CodigosReservas.tablaCodigosReservas.setModel(modelo);
                tcr.setHorizontalAlignment(SwingConstants.LEFT);
                column.getColumn(1).setPreferredWidth(200);
            }

        } catch (Exception e) {

        }

    }

    public void buscarSalidas() {

        try {
            Calendar fecha1 = fechaDesdeSalida.getCalendar();
            Calendar fecha2 = fechaHastaSalida.getCalendar();
            String fechaInicio = Integer.toString(fecha1.get(Calendar.YEAR)) + "-" + Integer.toString(fecha1.get(Calendar.MONTH) + 1) + "-" + Integer.toString(fecha1.get(Calendar.DAY_OF_MONTH));
            String fechaFin = Integer.toString(fecha2.get(Calendar.YEAR)) + "-" + Integer.toString(fecha2.get(Calendar.MONTH) + 1) + "-" + Integer.toString(fecha2.get(Calendar.DAY_OF_MONTH));
            DefaultTableModel modelo;
            TableColumnModel column = tablaConsultarSalidas.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();

            switch (motivoComboConsultarSalida.getSelectedIndex()) {

                case -1:
                    JOptionPane.showMessageDialog(null, "Seleccione un motivo por favor.");
                    break;
                case 0:
                    if (txfBuscarConsultarSalida.getText().trim().length() == 0) {
                        modelo = sDao.buscarSalidaSinMotivo(fechaInicio, fechaFin);
                        tablaConsultarSalidas.setModel(modelo);
                        tcr.setHorizontalAlignment(SwingConstants.LEFT);
                        column.getColumn(4).setPreferredWidth(200);
                    } else {
                        modelo = sDao.buscarSalidaSinMotivoDetallado(fechaInicio, fechaFin, txfBuscarConsultarSalida.getText().trim());
                        tablaConsultarSalidas.setModel(modelo);
                        tcr.setHorizontalAlignment(SwingConstants.LEFT);
                        column.getColumn(4).setPreferredWidth(200);
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 7:
                    if (txfBuscarConsultarSalida.getText().trim().length() == 0) {

                        modelo = sDao.buscarSalida(motivoComboConsultarSalida.getSelectedItem().toString(), fechaInicio, fechaFin);
                        tablaConsultarSalidas.setModel(modelo);
                        tcr.setHorizontalAlignment(SwingConstants.LEFT);
                        column.getColumn(4).setPreferredWidth(200);

                    } else {

                        modelo = sDao.buscarSalidaDetalle(motivoComboConsultarSalida.getSelectedItem().toString(), fechaInicio, fechaFin, txfBuscarConsultarSalida.getText().trim());
                        tablaConsultarSalidas.setModel(modelo);
                        tcr.setHorizontalAlignment(SwingConstants.LEFT);
                        column.getColumn(4).setPreferredWidth(200);

                    }
                    break;
                case 5:
                    modelo = sDao.buscarSalidasPerdida(motivoComboConsultarSalida.getSelectedItem().toString(), fechaInicio, fechaFin);
                    tablaConsultarSalidas.setModel(modelo);
                    tcr.setHorizontalAlignment(SwingConstants.LEFT);
                    break;
                case 6:
                    modelo = sDao.buscarSalidaTrasplantado(motivoComboConsultarSalida.getSelectedItem().toString(), fechaInicio, fechaFin);
                    tablaConsultarSalidas.setModel(modelo);
                    tcr.setHorizontalAlignment(SwingConstants.LEFT);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elija un motivo de salida, por favor.");
                    break;

            }
        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, "Ingrese el rango de tiempo de la búsqueda (Fecha desde y Fecha hasta).");
        }

    }

    public void registrarSalidaVenta() {

        try {

            if (tablaSalidas.getRowCount() == 0) {

                JOptionPane.showMessageDialog(null, "Seleccione las especies para la venta, por favor.");

            } else {

                Salida_ s;
                int codigo_salida = Integer.parseInt(lblNumeroSalida.getText());
                String motivo = motivoCombo.getSelectedItem().toString();
                int total = Integer.parseInt(lblTotalSalidas.getText().trim());
                String destino = txfDestino.getText().trim();
                int id_conductor = Integer.parseInt(txfCedulaConductorSalidas.getText().trim());
                String placa = txfPlacaSalidas.getText().trim();
                String id_cliente = txfIdentificacionClienteSalidas.getText().trim();
                String predio = txfPredio.getText().trim();

                java.sql.Date fecha = null;
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                fecha = new java.sql.Date(sdf.parse(fechaSalida()).getTime());
                s = new Salida_(codigo_salida, motivo, predio, fecha, "", destino, total, id_cliente, id_conductor, placa);

                if (sDao.CrearSalida(s)) {

                    for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

                        DetalleSalida_ d = new DetalleSalida_(codigo_salida, Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString()), "", Integer.parseInt(tablaSalidas.getValueAt(i, 5).toString()), Integer.parseInt(tablaSalidas.getValueAt(i, 6).toString()), total);

                        if (dsDao.CrearDetalleSalida(d)) {

                        } else {

                            JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida.");
                        }
                    }

                    int resultado = JOptionPane.showConfirmDialog(null, "Salida registrada correctamente ¿Desea generar el reporte?", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (resultado == 0) {

                        generarReporte();
                        reiniciarSlider();

                    } else {
                        reiniciarSlider();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida, revise su información.");

                }
            }

        } catch (ParseException ex) {

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor.");

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, npe.getMessage());

        }

    }

    public void registrarSalidaPerdida() {

        try {

            if (tablaSalidas.getRowCount() == 0) {

                JOptionPane.showMessageDialog(null, "Seleccione las especies para la pérdida, por favor.");

            } else {

                Salida_ s;
                int codigo_salida = Integer.parseInt(lblNumeroSalida.getText());
                String motivo = motivoCombo.getSelectedItem().toString();
                int total = 0;
                String destino = "";
                int id_conductor = 0;
                String placa = "";
                String id_cliente = "";
                String predio = "";

                java.sql.Date fecha = null;
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                fecha = new java.sql.Date(sdf.parse(fechaSalida()).getTime());
                s = new Salida_(codigo_salida, motivo, predio, fecha, "", destino, total, id_cliente, id_conductor, placa);

                if (sDao.CrearSalida(s)) {

                    for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

                        DetalleSalida_ d = new DetalleSalida_(codigo_salida, Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString()), "", Integer.parseInt(tablaSalidas.getValueAt(i, 5).toString()), Integer.parseInt(tablaSalidas.getValueAt(i, 6).toString()), total);

                        if (dsDao.CrearDetalleSalida(d)) {

                        } else {

                            JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida.");
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Salida registrada correctamente");

                    reiniciarSlider();
                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida, revise su información.");

                }
            }

        } catch (ParseException ex) {

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor.");

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, npe.getMessage());

        }

    }

    public void registrarSalidaTrasplantado() {

        try {

            ResultSet rs;
            String tamaño_nueva = tamanoComboTrasplantado.getSelectedItem().toString();
            String rango_nueva = rangoComboTrasplantado.getSelectedItem().toString();
            if (tamañoTrasplantado.equalsIgnoreCase(tamaño_nueva)
                    && rangoTrasplantado.equalsIgnoreCase(rango_nueva)) {

                JOptionPane.showMessageDialog(null, "No puede hacer un trasplantado al mismo tamaño de bolsa y rango.");

            } else {
                rs = eDao.buscarIngresoPlanta(codigo_Especie, tamaño_nueva, rango_nueva);

                if (!rs.next()) {

                    int resultado = JOptionPane.showConfirmDialog(null, "Esta especie con este tamaño de bolsa (" + tamaño_nueva + ") y rango (" + rango_nueva + ") no se ha ingresado." + "\n" + "¿Desea registrarla?.", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (resultado == 0) {

                        ventanaTrasplantado.setVisible(true);
                    }

                } else {

                    Salida_ s;

                    int cantidad = Integer.parseInt(txfCantidadTrasplantado.getText().trim());
                    int codigo_salida = Integer.parseInt(lblNumeroSalida.getText());
                    String motivo = motivoCombo.getSelectedItem().toString();
                    java.sql.Date fecha = null;
                    SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                    fecha = new java.sql.Date(sdf.parse(fechaSalida()).getTime());
                    String tamaño_origen = tamanoComboTrasplantado.getSelectedItem().toString() + ", " + rangoComboTrasplantado.getSelectedItem().toString();
                    s = new Salida_(codigo_salida, motivo, "", fecha, "OBSERVACIÓN", "", 0, "", 0, "");

                    if (sDao.CrearSalida(s)) {

                        DetalleSalida_ d = new DetalleSalida_(codigo_salida, codigo_Ingreso, tamaño_origen, cantidad, 0, 0);

                        if (dsDao.CrearDetalleSalida(d)) {

                            codigo_ingresoTrasplantar = rs.getInt("codigo_ingreso");

                            if (txfCantidadTrasplantado.isEditable()) {
//                                restar(codigo_Ingreso, cantidad);
                            } else {

                            }

                            if (sDao.trasplantar(codigo_ingresoTrasplantar, cantidad)) {

                                JOptionPane.showMessageDialog(null, "Salida registrada correctamente");
                                reiniciarSlider();
                                btnRegistrarSalida.setEnabled(true);

                            } else {
                                JOptionPane.showMessageDialog(null, "No se ha podido trasplantar, ha ocurrido un error.");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida.");
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida, revise su información.");

                    }
                }
            }

        } catch (ParseException ex) {
            Logger.getLogger(VistaSGI.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VistaSGI.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {

        }

    }

    public void registrarSalidaReserva() {

        try {

            if (tablaSalidas.getRowCount() == 0) {

                JOptionPane.showMessageDialog(null, "Seleccione las especies para la venta, por favor.");

            } else {

                Salida_ s;
                int codigo_salida = Integer.parseInt(lblNumeroSalida.getText());
                String motivo = motivoCombo.getSelectedItem().toString();
                int total = Integer.parseInt(lblTotalSalidas.getText().trim());
                String id_cliente = txfIdentificacionClienteSalidas.getText().trim();
                String destino = txfDestino.getText().trim();
                int id_conductor = Integer.parseInt(txfCedulaConductorSalidas.getText().trim());
                String placa = txfPlacaSalidas.getText().trim();
                String predio = txfPredio.getText().trim();

                if (Integer.toString(id_conductor).length() == 0) {

                    id_conductor = 0;

                }

                java.sql.Date fecha = null;
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                fecha = new java.sql.Date(sdf.parse(fechaSalida()).getTime());
                s = new Salida_(codigo_salida, motivo, predio, fecha, "", destino, total, id_cliente, id_conductor, placa);

                if (sDao.CrearSalida(s)) {

                    for (int i = 0; i < tablaSalidas.getRowCount(); i++) {

                        DetalleSalida_ d = new DetalleSalida_(codigo_salida, Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString()), "", Integer.parseInt(tablaSalidas.getValueAt(i, 5).toString()), Integer.parseInt(tablaSalidas.getValueAt(i, 6).toString()), total);

                        if (dsDao.CrearDetalleSalida(d)) {

                        } else {

                            JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida.");
                        }
                    }

                    if (rDao.cerrarReserva(fechaActual(), codigo_Reserva)) {

                        System.out.println(tablaSalidas.getRowCount());
                        for (int j = 0; j < tablaSalidas.getRowCount(); j++) {

                            if (iDao.actualizarStock(tablaSalidas.getValueAt(j, 5).toString(), tablaSalidas.getValueAt(j, 0).toString())) {

                                System.out.println(tablaSalidas.getValueAt(j, 5).toString() + " " + tablaSalidas.getValueAt(j, 0).toString());
                            } else {

                                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");

                            }
                        }
                    } else {

                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");

                    }

                    int resultado = JOptionPane.showConfirmDialog(null, "Salida registrada correctamente ¿Desea generar el reporte?", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (resultado == 0) {

                        generarReporte();
                        reiniciarSlider();
                    } else {
                        reiniciarSlider();
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido registrar la salida, revise su información.");

                }
            }

        } catch (ParseException ex) {

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor.");

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, npe.getMessage());

        }

    }

    public String numUsuarios() {

        String resultado = "";
        try {

            rs = uDao.contarUsuarios();

            if (rs.next()) {

                resultado = rs.getString(1);
            } else {

                resultado = "0";
            }
        } catch (SQLException ex) {
        }
        return resultado;
    }

    public String numReservas() {

        String resultado = "";
        try {

            rs = rDao.contarReservas();

            if (rs.next()) {

                resultado = rs.getString(1);
            } else {

                resultado = "0";
            }
        } catch (SQLException ex) {
        }
        return resultado;
    }

    public String numSalidas(String mes) {

        String resultado = "";
        try {

            rs = sDao.contarSalidas(mes);

            if (rs.next()) {

                resultado = rs.getString(1);
            } else {

                resultado = "0";
            }
        } catch (SQLException ex) {
        }
        return resultado;
    }

    public void siguienteInfoSalida() {

        if (motivoCombo.getSelectedIndex() == -1) {

            JOptionPane.showMessageDialog(null, "Seleccione un motivo primero.");

        } else if (txfDestino.getText().trim().equalsIgnoreCase("") || txfPredio.getText().trim().equalsIgnoreCase("") && motivoCombo.getSelectedIndex() != 5 && motivoCombo.getSelectedIndex() != 6) {

            JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

        } else {

            String motivo = motivoCombo.getSelectedItem().toString();

            if (motivo.equalsIgnoreCase("Venta en vivero")) {

                this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.left);

            } else if (motivo.equalsIgnoreCase("Venta")) {

                this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.left);

            } else if (motivo.equalsIgnoreCase("Trasplantado")) {

                this.slidePanel.nextPanel(20, TrasplantadoPanel, slidePanel.left);
                this.btnSeleccionarEspecieReservas3.requestFocus(true);

            } else if (motivo.equalsIgnoreCase("Pérdida")) {

                this.slidePanel.nextPanel(20, PerdidaPanel, slidePanel.left);
                this.btnSeleccionarEspeciePerdida.requestFocus(true);

            } else if (motivo.equalsIgnoreCase("Donación")) {

                this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.left);

            } else if (motivo.equalsIgnoreCase("Proyecto propio")) {

                this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.left);

            } else if (motivo.equalsIgnoreCase("Reserva")) {

                if (tablaSalidas.getRowCount() == 0) {

                    JOptionPane.showMessageDialog(null, "Traiga una reserva primero.");
                } else {
                    this.slidePanel.nextPanel(20, ConductorPanel, slidePanel.left);
                }
            }
        }

    }

    public void siguienteConductorSalidas() {

        try {

            ResultSet rs = cDao.buscar(txfCedulaConductorSalidas.getText());

            if (txfCedulaConductorSalidas.getText().length() == 0 || txfNombreConductorSalidas.getText().length() == 0 || txfApellidoConductorSalidas.getText().length() == 0 || txfCelularConductorSalidas.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "Busque un conductor primero.");

            } else if (txfPlacaSalidas.getText().trim().equals("") || txfPlacaSalidas.getText().trim().length() < 6) {

                JOptionPane.showMessageDialog(null, "Ingrese una placa válida.");

            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "El conductor no existe, registrelo por favor.");
            } else {
                this.slidePanel.nextPanel(20, ClientePanel, slidePanel.left);
                IdentificacionComboSalidas.requestFocus(true);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos del conductor, por favor.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos del conductor, por favor.");
        }

    }

    public void siguienteClienteSalidas() {

        try {
            ResultSet rs = clDao.buscar(txfIdentificacionClienteSalidas.getText());

            if (IdentificacionComboSalidas.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(null, "Seleccione un tipo de identificación primero..");

            } else if (txfIdentificacionClienteSalidas.getText().trim().equals("") || txfNombreClienteSalidas.getText().trim().equals("") || txfTelefonoClienteSalidas.getText().trim().equals("")) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos.");

            } else if (motivoCombo.getSelectedIndex() == 7) {

            } else if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "El cliente no existe, por favor registrelo.");
            } else {
                this.slidePanel.nextPanel(20, VentaPanel, slidePanel.left);
            }
        } catch (SQLException ex) {
        }
    }

    public void quitarEspecie() {

        try {

            int codigo = Integer.parseInt(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 0).toString());
            int cantidad = Integer.parseInt(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 5).toString());
            String tamaño = tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 4).toString();
            String rango = tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 3).toString();
            DefaultTableModel modelo = (DefaultTableModel) VistaSGI.tablaSalidas.getModel();
            modelo.removeRow(tablaSalidas.getSelectedRow());
            calcularTotalSalidas();

            if (dDao.sumar(codigo, cantidad, tamaño, rango)) {

                txfEspecieSalidas.setText(null);
                txfCantidadSalidas.setText(null);

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error.");

            }

            if (VentaPanel.isShowing()) {

                txfEspecieSalidas.setText(null);
                txfCantidadSalidas.setText(null);
            } else if (PerdidaPanel.isShowing()) {

                txfEspeciePerdida.setText(null);
                txfCantidadPerdida.setText(null);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void reiniciarInventario() {

        limpiarTablaInventario();
        txfBuscarInventario.setText(null);

    }

    public void reiniciarTraerReserva() {

        SeleccionarReserva.txfBuscarConsultarReservas.setText(null);
        limpiarTablaTraerReserva();

    }

    public void registrarEspecie() {

        try {

            if (txfNombreCien.getText().trim().length() == 0 || txfNombreComun.getText().trim().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

            } else {

                Especie_ e;
                int codigo = Integer.parseInt(lblNumeroEspecie.getText());
                String nombre_cien = txfNombreCien.getText().trim();
                String nombre_comun = txfNombreComun.getText().trim();
                String msnm = txfMsnm.getText().trim();
                String familia = txfFamilia.getText().trim();

                e = new Especie_(codigo, nombre_comun, nombre_cien, familia, msnm);

                if (eDao.CrearEspecie(e)) {

                    JOptionPane.showMessageDialog(null, "Especie creada correctamente.");
                    limpiarEspecies();
                    obtenerMAXEspecie();

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido registrar la especie, revise su información.");
                }
            }

        } catch (Exception e) {

        }

    }

    public void generarReporte() {

        try {
            String motivo = motivoCombo.getSelectedItem().toString();
            int codigo = Integer.parseInt(lblNumeroSalida.getText());
            String cedula = txfIdentificacionClienteSalidas.getText();

            generarRemision(codigo, cedula, motivo);

        } catch (NullPointerException n) {

        }
    }

    public void generarReporteConsultar() {

        try {

            if (tablaConsultarSalidas.getRowCount() <= 0) {

                JOptionPane.showMessageDialog(null, "Busque alguna salida primero, por favor.");

            } else if (tablaConsultarSalidas.getSelectedRow() == -1) {
//
                JOptionPane.showMessageDialog(null, "Seleccione un item de la tabla primero, por favor.");
//
            } else {

                String motivo = tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 2).toString();
                int codigo = Integer.parseInt(tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 0).toString());
                String cedula = tablaConsultarSalidas.getValueAt(tablaConsultarSalidas.getSelectedRow(), 3).toString();

                generarRemision(codigo, cedula, motivo);

            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Digite valores numéricos donde sea requerido.");

        } catch (NullPointerException n) {
        }
    }

    public void generarRemision(int codigo, String cedula, String motivo) {

        GenerarReporte reporte = new GenerarReporte();
        reporte.remisionSalida(cedula, codigo, motivo);
    }

    public void reiniciarSlider() {

        limpiarSalidas();
        limpiarTablaSalidas();
        obtenerMAXsalida();
        calcularTotalSalidas();
        motivoCombo.setSelectedIndex(0);
        IdentificacionComboSalidas.setSelectedIndex(0);
        this.slidePanel.nextPanel(20, InfoSalidaPanel, slidePanel.right);

    }

    public void actualizarCliente() {

        try {

            if (txfNombreClientes.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "Llene los campos obligatorios, por favor.");

            } else {

                String codigo = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
                String nombre = txfNombreClientes.getText().trim();
                long celular = 0;

                if (txfCelularClientes.getText().trim().length() != 0) {

                    celular = Long.parseLong(txfCelularClientes.getText().trim());
                }

                if (clDao.actualizarCliente(codigo, nombre, celular)) {
                    JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.");
                    this.btnEditarCliente.setEnabled(true);
                    this.btnGuardarCliente.setEnabled(false);
                    this.btnRegistrarCliente.setEnabled(true);
                    limpiarClientes();
                    limpiarTablaClientes();

                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar, inténtelo nuevamente.");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void activarCamposClientes() {

        this.txfIdClientes.setEditable(true);
        this.txfNombreClientes.setEditable(true);
        this.txfCelularClientes.setEditable(true);
        this.TipoComboClientes.setEnabled(true);
        this.btnRegistrarCliente.setEnabled(true);
        this.btnEditarCliente.setEnabled(true);
    }

    public void limpiarTablaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    public void limpiarClientes() {

        this.txfIdClientes.setText(null);
        this.txfCelularClientes.setText(null);
        this.txfNombreClientes.setText(null);
        this.txfBuscarCliente.setText(null);
        this.txfIdClientes.setEditable(true);
        this.txfCelularClientes.setEditable(true);
        this.txfNombreClientes.setEditable(true);
        this.btnGuardarCliente.setEnabled(false);
        this.txfIdClientes.requestFocus();
        this.TipoComboClientes.setSelectedIndex(0);
        activarCamposClientes();
    }

    public void desactivarCamposClientes() {

        this.txfIdClientes.setEditable(false);
        this.txfNombreClientes.setEditable(false);
        this.txfCelularClientes.setEditable(false);
        this.TipoComboClientes.setEnabled(false);
    }

    public void seleccionarCliente() {

        try {

            ResultSet rs;

            String codigo = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
            rs = clDao.buscar(codigo);

            if (rs.next()) {
                if (codigo.contains("-")) {
                    TipoComboClientes.setSelectedIndex(1);
                } else {
                    TipoComboClientes.setSelectedIndex(0);
                }
                this.txfIdClientes.setText(codigo);
                this.txfNombreClientes.setText(rs.getString("nombre"));
                this.txfCelularClientes.setText(rs.getString("celular"));

                desactivarCamposClientes();
                this.btnGuardarCliente.setEnabled(false);
                this.btnEditarCliente.setEnabled(true);
                this.btnRegistrarCliente.setEnabled(false);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el cliente.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente primero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontró el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void limpiarSeleccionarEspecies() {

        txfEspecieSalidas.setText(null);
        txfCantidadSalidas.setText(null);
        txfCantidadSalidas.setEditable(false);
    }

    public void ingresarEspecie() {

        try {

            if (txfNitIngresarEspecie.getText().trim().length() < 10) {

                JOptionPane.showMessageDialog(null, "Digite un NIT válido.");

            } else {

                if (!txfNitIngresarEspecie.getText().trim().contains("-")) {

                    JOptionPane.showMessageDialog(null, "Digite el guión en el NIT." + "\n" + "Por ejemplo: 1234567890-5");

                } else {

                    if (txfNitIngresarEspecie.getText().trim().length() == 0 || txfEspecie.getText().trim().length() == 0
                            || txfCostoIngresarEspecie.getText().trim().length() == 0 || txfCantidadIngresarEspecie.getText().trim().length() == 0 || txfCostoCompra.getText().trim().length() == 0) {

                        JOptionPane.showMessageDialog(null, "Llene todos los campos, por favor.");

                    } else {

                        if (Integer.parseInt(txfCantidadIngresarEspecie.getText().trim()) == 0 || Integer.parseInt(txfCostoIngresarEspecie.getText().trim()) == 0) {

                            JOptionPane.showMessageDialog(null, "La cantidad y el costo de venta unitario deben ser mayores que cero.");
                        } else {

                            ResultSet rs1;
                            rs1 = iDao.MAXingreso();
                            int codigo_Ingreso;

                            if (rs1.next()) {

                                codigo_Ingreso = rs1.getInt(1);

                            } else {

                                codigo_Ingreso = 0;

                            }

                            int cantidad = Integer.parseInt(txfCantidadIngresarEspecie.getText().trim());
                            long costo_compra = Long.parseLong(txfCostoCompra.getText().trim());
                            int costo = Integer.parseInt(txfCostoIngresarEspecie.getText().trim());
                            String tamanoBolsa = tamanoCombo.getSelectedItem().toString().trim();
                            String rango = rangoCombo.getSelectedItem().toString().trim();
                            String nit = txfNitIngresarEspecie.getText().trim();
                            java.sql.Date fechaIngresoE = new java.sql.Date(fechaIngreso.getDate().getTime());
                            ResultSet rs;
                            DetalleIngreso_ detalle;
                            rs = iDao.buscar(codigo_Especie, tamanoBolsa, rango);

                            if (rs.next()) {

                                detalle = new DetalleIngreso_(nit, codigo_Especie, cantidad, (java.sql.Date) fechaIngresoE, costo_compra, rs.getInt("codigo_ingreso"));

                                if (dDao.CrearDetalle(detalle)) {

                                    if (iDao.actualizar(codigo_Especie, cantidad, tamanoBolsa, rango)) {

                                        JOptionPane.showMessageDialog(null, "Especie ingresada correctamente.");
                                        limpiarIngresarEspecie();
                                        buscarIngresosFecha(fechaActual(), fechaActual());

                                        if (txfBuscarInventario.getText().trim().length() != 0) {
                                            buscarEspecieInventario();
                                        } else {

                                        }

                                    } else {

                                        JOptionPane.showMessageDialog(null, "No se pudo actualizar, revise la información, por favor.");
                                        limpiarIngresarEspecie();
                                        buscarIngresosFecha(fechaActual(), fechaActual());

                                    }
                                } else {

                                    JOptionPane.showMessageDialog(null, "No se pudo ingresar la especie, inténtelo nuevamente.");
                                    limpiarIngresarEspecie();
                                    buscarIngresosFecha(fechaActual(), fechaActual());

                                }

                            } else {

                                detalle = new DetalleIngreso_(nit, codigo_Especie, cantidad, (java.sql.Date) fechaIngresoE, costo_compra, codigo_Ingreso);

                                Ingreso_ ingreso = new Ingreso_(codigo_Ingreso, codigo_Especie, tamanoBolsa, rango, costo, 0);

                                if (iDao.CrearIngreso(ingreso)) {

                                    if (dDao.CrearDetalle(detalle)) {

                                        if (iDao.actualizar(codigo_Especie, cantidad, tamanoBolsa, rango)) {

                                            JOptionPane.showMessageDialog(null, "Especie ingresada correctamente.");
                                            limpiarIngresarEspecie();

                                            if (txfBuscarInventario.getText().trim().length() != 0) {
                                                buscarEspecieInventario();
                                            } else {

                                            }

                                        } else {

                                            JOptionPane.showMessageDialog(null, "No se pudo actualizar, revise la información, por favor.");
                                            limpiarIngresarEspecie();
                                        }

                                    } else {

                                        JOptionPane.showMessageDialog(null, "Error, verifique que su información sea correcta.");

                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException npe) {

            JOptionPane.showMessageDialog(null, npe.getMessage());

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, "Revise si su información está correcta (se debe ingresar una fecha válida).");

        }
    }
}
