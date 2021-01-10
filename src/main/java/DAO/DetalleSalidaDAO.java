package DAO;

import Modelo.DetalleSalida_;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Álvaro
 */
public class DetalleSalidaDAO {

    ConexionBD cc = new ConexionBD();
    Connection cn = cc.conectar();
    String sSql = " ";
    ResultSet rs;
    Statement st;
    int totalregistros;

    public boolean CrearDetalleSalida(DetalleSalida_ d) {

        sSql = "INSERT INTO detalle_salida(codigo_salida, codigo_planta, cantidad, costo, total, tamaño_destino)"
                + " values (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setInt(1, d.getCodigo_salida());
            pst.setInt(2, d.getCodigo_planta());
            pst.setInt(3, d.getCantidad());
            pst.setInt(4, d.getCosto());
            pst.setInt(5, d.getTotal());
            pst.setString(6, d.getTamaño_destino());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            if (e.getMessage().contains("Duplicate")) {

                JOptionPane.showMessageDialog(null, "Reserva ya creada.");

            } else {
                System.out.println(e.getMessage());
            }

            return false;
        }
    }

    public ResultSet MAXreserva() throws SQLException {
        try {
            sSql = "SELECT MAX(codigo_reserva) FROM reserva ";
            st = cn.createStatement();
            rs = st.executeQuery(sSql);
            return rs;
        } catch (StackOverflowError e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return rs;
        }
    }

    public boolean reservar(int codigo_ingreso, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "UPDATE ingreso_planta SET reservas = reservas + '" + cantidad + " ', disponibles = disponibles - '" + cantidad + "'  WHERE "
                + " tamaño_bolsa = '" + tamaño_bolsa + "' AND rango = '" + rango + "' AND codigo_ingreso = '" + codigo_ingreso + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public boolean deshacerReserva(int codigo_ingreso, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "UPDATE ingreso_planta SET reservas = reservas - '" + cantidad + " ', disponibles = disponibles + '" + cantidad + "'  WHERE "
                + " tamaño_bolsa = '" + tamaño_bolsa + "' AND rango = '" + rango + "' AND codigo_ingreso = '" + codigo_ingreso + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            return false;
        }
    }

    public boolean eliminarReserva(int codigo_reserva, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "DELETE FROM reserva WHERE codigo_reserva = '" + codigo_reserva + "' AND tamaño_bolsa = '" + tamaño_bolsa + "'"
                + " AND rango = '" + rango + "' AND cantidad = '" + cantidad + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            return false;
        }
    }

    public ResultSet buscarReserva(String codigo) throws SQLException {
        sSql = "SELECT r.codigo_reserva, r.id_cliente, c.nombre, c.celular FROM reserva r, cliente c WHERE"
                + " r.codigo_reserva != 0 AND r.codigo_reserva = '" + codigo + "' AND r.id_cliente = c.id_cliente";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public DefaultTableModel mostrarReservadas(String codigo) {
        DefaultTableModel modelo;

        String[] titulos = {"Código", "Nombre Común", "Nombre Científico", "Rango", "Tamaño de Bolsa", "Cantidad", "Costo"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT * FROM reserva r, ingreso_planta i, planta p WHERE r.codigo_reserva != 0 AND r.codigo_reserva = ' " + codigo + "' AND"
                + " r.codigo_planta = i.codigo_ingreso AND i.codigo_planta = p.codigo_planta";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_ingreso");
                registro[1] = rs.getString("nombre_vulgar");
                registro[2] = rs.getString("nombre_cientifico");
                registro[3] = rs.getString("rango");
                registro[4] = rs.getString("tamaño_bolsa");
                registro[5] = rs.getString("cantidad");
                registro[6] = rs.getString("costo");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public DefaultTableModel mostrarCodigosReservas(String busca) {
        DefaultTableModel modelo;

        String[] titulos = {"Código de Reserva"};

        String[] registro = new String[1];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT codigo_reserva FROM reserva WHERE codigo_reserva != 0 AND codigo_reserva = '" + busca + "' "
                + " OR id_cliente = '" + busca + "' GROUP BY codigo_reserva ORDER BY codigo_reserva ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_reserva");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public boolean eliminarDetalle(String codigo_salida) {

        sSql = "DELETE FROM detalle_salida WHERE codigo_salida = '" + codigo_salida + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public DefaultTableModel buscarDetalleSalida(int codigo) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Nombre Común", "Nombre Científico", "Tamaño", "Rango", "Cantidad"};

        String[] registro = new String[6];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT * FROM detalle_salida d, ingreso_planta i, planta p WHERE d.codigo_salida = '" + codigo + "'"
                + " AND i.codigo_ingreso = d.codigo_planta AND p.codigo_planta = i.codigo_planta";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("nombre_vulgar");
                registro[2] = rs.getString("nombre_cientifico");
                registro[3] = rs.getString("tamaño_bolsa");
                registro[4] = rs.getString("rango");
                registro[5] = rs.getString("cantidad");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public DefaultTableModel buscarDetalleSalidaConIngreso(int codigo_salida) {
        DefaultTableModel modelo;

        String[] titulos = {"Identificador", "Código de Planta", "Nombre Común", "Nombre Científico", "Tamaño", "Rango", "Cantidad"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT * FROM detalle_salida d, ingreso_planta i, planta p, salida s WHERE s.codigo_salida = '" + codigo_salida + "' AND s.codigo_salida = d.codigo_salida "
                + "AND i.codigo_ingreso = d.codigo_planta AND p.codigo_planta = i.codigo_planta";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("codigo_ingreso");
                registro[2] = rs.getString("nombre_vulgar");
                registro[3] = rs.getString("nombre_cientifico");
                registro[4] = rs.getString("tamaño_bolsa");
                registro[5] = rs.getString("rango");
                registro[6] = rs.getString("cantidad");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminar(int codigo_ingreso, String codigo_salida, int cantidad) {

        sSql = "DELETE FROM detalle_salida WHERE codigo_planta = '" + codigo_ingreso + "'"
                + " AND codigo_salida = '" + codigo_salida + "' AND cantidad = '" + cantidad + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public ResultSet buscarDetalleTrasplantado(int codigo) throws SQLException {

        sSql = sSql = "SELECT p.codigo_planta, d.codigo_salida, d.tamaño_destino, d.cantidad, p.nombre_vulgar, i.tamaño_bolsa, i.rango FROM detalle_salida d, ingreso_planta i, planta p, salida s "
                + " WHERE s.codigo_salida = '" + codigo + "' AND d.codigo_salida = s.codigo_salida AND i.codigo_planta = p.codigo_planta AND d.codigo_planta = i.codigo_ingreso";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }
}
