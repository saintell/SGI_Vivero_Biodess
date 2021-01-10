package DAO;

import Modelo.Salida_;
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
public class SalidasDAO {

    ConexionBD cc = new ConexionBD();
    Connection cn = cc.conectar();
    String sSql = " ";
    ResultSet rs;
    Statement st;
    int totalregistros;

    public boolean CrearSalida(Salida_ s) {

        sSql = "INSERT INTO salida(codigo_salida, motivo, fecha, observacion, destino, total,predio, id_cliente, id_conductor, placa)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setInt(1, s.getCodigo_salida());
            pst.setString(2, s.getMotivo());
            pst.setDate(3, s.getFecha());
            pst.setString(4, s.getObservacion());
            pst.setString(5, s.getDestino());
            pst.setInt(6, s.getTotal());
            pst.setString(7, s.getPredio());
            pst.setString(8, s.getId_cliente());
            pst.setInt(9, s.getId_conductor());
            pst.setString(10, s.getPlaca());

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

    public ResultSet MAXSalida() throws SQLException {
        try {
            sSql = "SELECT MAX(codigo_salida + 1) FROM salida ";
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

    public boolean trasplantar(int codigo_ingreso, int cantidad) {

        sSql = "UPDATE ingreso_planta SET disponibles = disponibles + '" + cantidad + "' , stock = reservas + (disponibles + '" + cantidad + "')  WHERE "
                + " codigo_ingreso = '" + codigo_ingreso + "'";

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

    public boolean cancelarSalida(int codigo_ingreso, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "UPDATE ingreso_planta SET disponibles = disponibles + '" + cantidad + "',stock = reservas + (disponibles +  '" + cantidad + "') WHERE "
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

    public DefaultTableModel buscarSalidaSinMotivoDetallado(String desde, String hasta, String numero) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Fecha", "Motivo", "Cédula", "Cliente"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT s.codigo_salida, to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.id_cliente, c.nombre FROM salida s, cliente c "
                + " WHERE fecha BETWEEN '" + desde + "' AND '" + hasta + "' AND s.id_cliente = '" + numero + "' AND c.id_cliente = s.id_cliente"
                + " ORDER BY codigo_salida ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("motivo");
                registro[3] = rs.getString("id_cliente");
                registro[4] = rs.getString("nombre");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public DefaultTableModel buscarSalidaSinMotivo(String desde, String hasta) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Fecha", "Motivo", "Cédula", "Cliente"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT s.codigo_salida, to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.id_cliente, c.nombre FROM salida s, cliente c "
                + " WHERE fecha BETWEEN '" + desde + "' AND '" + hasta + "' AND s.id_cliente != '' AND c.id_cliente = s.id_cliente"
                + " ORDER BY codigo_salida ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("motivo");
                registro[3] = rs.getString("id_cliente");
                registro[4] = rs.getString("nombre");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public DefaultTableModel buscarSalida(String motivo, String desde, String hasta) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Fecha", "Motivo", "Cédula", "Cliente"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT s.codigo_salida, to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.id_cliente, s.destino, s.total, c.nombre FROM salida s, cliente c "
                + " WHERE motivo = '" + motivo + "' AND fecha BETWEEN '" + desde + "' AND '" + hasta + "' AND c.id_cliente = s.id_cliente"
                + " ORDER BY codigo_salida ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("motivo");
                registro[3] = rs.getString("id_cliente");
                registro[4] = rs.getString("nombre");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet buscarSalidaPerdida(int codigo_salida) throws SQLException {

        sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.codigo_salida, s.motivo, s.observacion FROM salida s"
                + " WHERE s.codigo_salida = '" + codigo_salida + "'";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public DefaultTableModel buscarSalidasPerdida(String motivo, String desde, String hasta) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Fecha", "Motivo", "Total de pérdidas"};

        String[] registro = new String[4];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT SUM(d.cantidad) AS ctotal, s.codigo_salida, to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo FROM salida s, detalle_salida d "
                + " WHERE motivo = '" + motivo + "' AND fecha BETWEEN '" + desde + "' AND '" + hasta + "' AND s.codigo_salida = d.codigo_salida"
                + " GROUP BY s.codigo_salida ORDER BY codigo_salida ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("motivo");
                registro[3] = rs.getString("ctotal");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public DefaultTableModel buscarSalidaTrasplantado(String motivo, String desde, String hasta) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Fecha", "Motivo", "Total trasplantadas"};

        String[] registro = new String[4];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT SUM(d.cantidad) AS ctotal, s.codigo_salida, to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo FROM salida s, detalle_salida d "
                + " WHERE motivo = '" + motivo + "' AND fecha BETWEEN '" + desde + "' AND '" + hasta + "' AND s.codigo_salida = d.codigo_salida"
                + " GROUP BY s.codigo_salida ORDER BY codigo_salida ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("motivo");
                registro[3] = rs.getString("ctotal");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public DefaultTableModel buscarSalidaDetalle(String motivo, String desde, String hasta, String numero) {
        DefaultTableModel modelo;

        String[] titulos = {"Código Salida", "Fecha", "Motivo", "Cédula", "Cliente"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT s.codigo_salida, to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.id_cliente, s.destino, s.total, c.nombre FROM salida s, cliente c "
                + " WHERE motivo = '" + motivo + "' AND fecha BETWEEN '" + desde + "' AND '" + hasta + "' AND s.id_cliente = '" + numero + "' AND c.id_cliente = s.id_cliente"
                + " ORDER BY codigo_salida ASC ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_salida");
                registro[1] = rs.getString("fecha");
                registro[2] = rs.getString("motivo");
                registro[3] = rs.getString("id_cliente");
                registro[4] = rs.getString("nombre");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet contarSalidas(String mes) throws SQLException {
        sSql = "SELECT COUNT(distinct codigo_salida) FROM salida WHERE date_part('month', fecha) = '" + mes + "' AND codigo_salida != 0";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarSalidaPorCodigo(int codigo_salida) throws SQLException {

        sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.destino, s.predio, c.nombre AS nombreco, c.apellido AS apellidoco, "
                + " c.id_conductor, c.celular AS celularco, s.placa, ci.nombre, ci. id_cliente, ci.celular, s.observacion "
                + " FROM salida s, conductor c, cliente ci WHERE s.codigo_salida = '" + codigo_salida + "' AND s.id_cliente = ci.id_cliente AND s.id_conductor = c.id_conductor ";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarExcelSalida(String motivo, String desde, String hasta) throws SQLException {

        if (!motivo.equals("")) {
            sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.destino, s.predio, SUM(d.cantidad) AS ctotal, s.id_cliente, c.nombre, c.celular, s.id_conductor, CONCAT(co.nombre, ' ', co.apellido) AS nombreco, co.celular AS celularco, i.codigo_ingreso, d.codigo_salida, d.cantidad, i.tamaño_bolsa, i.rango, p.codigo_planta, p.nombre_vulgar, p.nombre_cientifico, p.familia, p.msnm FROM salida s, detalle_salida d, cliente c, conductor co, planta p, ingreso_planta i "
                    + "WHERE s.codigo_salida != 0 AND s.codigo_salida = d.codigo_salida AND d.codigo_planta = i.codigo_ingreso AND i.codigo_planta = p.codigo_planta AND s.id_cliente = c.id_cliente AND s.id_conductor = co.id_conductor AND s.motivo = '" + motivo + "' AND s.fecha BETWEEN '" + desde + "' AND '" + hasta + "' GROUP BY i.codigo_ingreso, i.tamaño_bolsa, i.rango, p.nombre_vulgar, p.nombre_cientifico, p.familia, p.msnm, p.codigo_planta, d.cantidad, d.codigo_salida, s.fecha, s.codigo_salida, s.motivo, s.id_cliente, s.id_conductor, s.predio, s.destino, c.nombre, c.celular, co.nombre, co.apellido, co.celular, d.codigo_planta ORDER BY s.codigo_salida DESC";
        } else {

            sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, s.destino, s.predio, SUM(d.cantidad) AS ctotal, s.id_cliente, c.nombre, c.celular, s.id_conductor, CONCAT(co.nombre, ' ', co.apellido) AS nombreco, co.celular AS celularco, i.codigo_ingreso, d.codigo_salida, d.cantidad, i.tamaño_bolsa, i.rango, p.codigo_planta, p.nombre_vulgar, p.nombre_cientifico, p.familia, p.msnm FROM salida s, detalle_salida d, cliente c, conductor co, planta p, ingreso_planta i "
                    + "WHERE s.codigo_salida != 0 AND s.codigo_salida = d.codigo_salida AND d.codigo_planta = i.codigo_ingreso AND i.codigo_planta = p.codigo_planta AND s.id_cliente = c.id_cliente AND s.id_conductor = co.id_conductor AND s.fecha BETWEEN '" + desde + "' AND '" + hasta + "' GROUP BY i.codigo_ingreso, i.tamaño_bolsa, i.rango, p.nombre_vulgar, p.nombre_cientifico, p.familia, p.msnm, p.codigo_planta, d.cantidad, d.codigo_salida, s.fecha, s.codigo_salida, s.motivo, s.id_cliente, s.id_conductor, s.predio, s.destino, c.nombre, c.celular, co.nombre, co.apellido, co.celular, d.codigo_planta ORDER BY s.codigo_salida DESC";
        }

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarExcelSalidaDetallado(String motivo, String desde, String hasta, String cedula) throws SQLException {

        if (!motivo.equals("")) {
            sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.codigo_salida, s.motivo, s.destino, s.predio, SUM(d.cantidad) AS ctotal, s.id_cliente, c.nombre, c.celular, s.id_conductor, CONCAT(co.nombre, ' ', co.apellido) AS nombreco, co.celular AS celularco FROM salida s, detalle_salida d, cliente c, conductor co "
                    + "WHERE s.id_cliente = '" + cedula + "' AND s.id_cliente = c.id_cliente AND s.id_conductor = co.id_conductor AND s.codigo_salida != 0 AND s.codigo_salida = d.codigo_salida AND s.codigo_salida = d.codigo_salida AND s.motivo = '" + motivo + "' AND s.fecha BETWEEN '" + desde + "' AND '" + hasta + "' GROUP BY s.fecha, s.codigo_salida, c.nombre, c.celular, co.nombre, co.apellido, co.celular ORDER BY s.codigo_salida DESC";
        } else {

            sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.codigo_salida, s.motivo, s.destino, s.predio, SUM(d.cantidad) AS ctotal, s.id_cliente, c.nombre, c.celular, s.id_conductor, CONCAT(co.nombre, ' ', co.apellido) AS nombreco, co.celular AS celularco FROM salida s, detalle_salida d, cliente c, conductor co "
                    + "WHERE s.id_cliente = '" + cedula + "' AND s.id_cliente = c.id_cliente AND s.id_conductor = co.id_conductor AND s.codigo_salida != 0 AND s.codigo_salida = d.codigo_salida AND s.fecha BETWEEN '" + desde + "' AND '" + hasta + "' GROUP BY s.fecha, s.codigo_salida, c.nombre, c.celular, co.nombre, co.apellido, co.celular ORDER BY s.codigo_salida DESC";
        }

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarExcelSalidaEspecifico(String codigo) throws SQLException {

        sSql = "SELECT * FROM salida s, detalle_salida d, planta p, ingreso_planta i WHERE s.codigo_salida = '" + codigo + "' "
                + "AND d.codigo_salida = s.codigo_salida AND i.codigo_ingreso = d.codigo_planta AND i.codigo_planta = p.codigo_planta ORDER BY i.codigo_ingreso ASC";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarExcelInfoSalida(String codigo) throws SQLException {

        sSql = sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.codigo_salida, s.motivo, s.destino, s.predio, SUM(d.cantidad) AS ctotal, s.id_cliente, c.nombre, c.celular, s.id_conductor, CONCAT(co.nombre, ' ', co.apellido) AS nombreco, co.celular AS celularco FROM salida s, detalle_salida d, cliente c, conductor co "
                + "WHERE s.id_cliente = c.id_cliente AND s.id_conductor = co.id_conductor AND s.codigo_salida = '" + codigo + "' AND s.codigo_salida = d.codigo_salida GROUP BY s.fecha, s.codigo_salida, c.nombre, c.celular, co.nombre, co.apellido, co.celular ORDER BY s.codigo_salida DESC";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarSalidaPorCliente(String cedula) throws SQLException {

        sSql = "SELECT id_cliente FROM salida WHERE id_cliente =  '" + cedula + "' ";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarExcelSalidaTyP(String desde, String hasta) throws SQLException {

        sSql = "SELECT to_char(s.fecha, 'DD/MM/YYYY') AS fecha, s.motivo, d.cantidad, i.codigo_ingreso, d.codigo_salida, i.tamaño_bolsa, d.tamaño_destino, i.rango, p.codigo_planta, p.nombre_vulgar, p.nombre_cientifico, p.familia, p.msnm FROM salida s, detalle_salida d, planta p, ingreso_planta i "
                + " WHERE s.codigo_salida != 0 AND s.codigo_salida = d.codigo_salida AND d.codigo_planta = i.codigo_ingreso AND i.codigo_planta = p.codigo_planta AND s.motivo = 'Pérdida' AND s.fecha BETWEEN '" + desde + "' AND '" + hasta + "' OR s.codigo_salida != 0 AND s.codigo_salida = d.codigo_salida AND d.codigo_planta = i.codigo_ingreso AND i.codigo_planta = p.codigo_planta AND s.motivo = 'Trasplantado' AND s.fecha BETWEEN '" + desde + "' AND '" + hasta + "' ";

        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public boolean eliminarSalida(String codigo_salida) {

        sSql = "DELETE FROM salida WHERE codigo_salida = '" + codigo_salida + "'";

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

    public boolean actualizar(int codigo_salida, String destino, String predio, String placa) {

        sSql = "UPDATE salida SET destino = '" + destino + "', predio = '" + predio + "', placa = '" + placa + "' WHERE codigo_salida = '" + codigo_salida + "'";

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
}
