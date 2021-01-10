package DAO;

import Modelo.Ingreso_;
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
public class IngresoDAO {

    ConexionBD cc = new ConexionBD();
    Connection cn = cc.conectar();
    String sSql = " ";
    ResultSet rs;
    Statement st;
    int totalregistros;

    public boolean CrearIngreso(Ingreso_ i) {

        sSql = "INSERT INTO ingreso_planta(codigo_ingreso, codigo_planta, tamaño_bolsa, rango, costo, stock, salidas, reservas, disponibles)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setInt(1, i.getCodigoIngreso());
            pst.setInt(2, i.getCodigoEspecie());
            pst.setString(3, i.getTamanoBolsa());
            pst.setString(4, i.getRango());
            pst.setInt(5, i.getCosto());
            pst.setInt(6, i.getStock());
            pst.setInt(7, i.getSalidas());
            pst.setInt(8, i.getReservas());
            pst.setInt(9, i.getDisponibles());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {

            if (ex.getMessage().contains("Duplicate")) {

                JOptionPane.showMessageDialog(null, "Especie ya creada.");

            } else {
                System.out.println(ex.getMessage());
            }

            return false;
        }
    }

    public ResultSet buscar(int codigo_planta, String tamano_bolsa, String rango) throws SQLException {
        sSql = "SELECT * FROM ingreso_planta WHERE codigo_planta = '" + codigo_planta + "' AND tamaño_bolsa = '" + tamano_bolsa + "' AND rango = '" + rango + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarDisponibles() throws SQLException {
        sSql = "SELECT * FROM ingreso_planta i, planta p WHERE p.codigo_planta = i.codigo_planta "
                + "AND i.disponibles > 0 ORDER BY i.codigo_ingreso ASC";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarTodas() throws SQLException {
        sSql = "SELECT * FROM ingreso_planta i, planta p WHERE i.codigo_ingreso != 0 AND p.codigo_planta = i.codigo_planta ORDER BY i.codigo_ingreso ASC";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet obtenerCantidad(int codigo_ingreso) throws SQLException {
        sSql = "SELECT disponibles FROM ingreso_planta i WHERE i.codigo_ingreso = '" + codigo_ingreso + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public boolean actualizar(int codigo_planta, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "UPDATE ingreso_planta SET stock = stock  + '" + cantidad + "', disponibles = disponibles + '" + cantidad + "'   WHERE codigo_planta = '" + codigo_planta + "'"
                + "AND tamaño_bolsa = '" + tamaño_bolsa + "' AND rango = '" + rango + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean actualizarStock(String cantidad, String codigo_ingreso) {

        sSql = "UPDATE ingreso_planta  SET reservas = reservas - '" + cantidad + "', stock = disponibles + (reservas - '" + cantidad + "') "
                + " WHERE codigo_ingreso = '" + codigo_ingreso + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean actualizarCosto(int costo, int codigo) {

        sSql = "UPDATE ingreso_planta SET costo = '" + costo + "' WHERE codigo_ingreso = '" + codigo + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public DefaultTableModel listar(String busca) {

        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Nombre Común", "Nombre Científico", "Tamaño de Bolsa", "Rango", "Costo", "Stock", "Disponibles", "Reservados"};
        String registro[] = new String[9];
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        int contador = 0;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT * FROM ingreso_planta i, planta p WHERE (p.nombre_vulgar LIKE '" + busca + "%' OR p.nombre_cientifico LIKE '" + busca + "%' "
                + " OR i.tamaño_bolsa LIKE'" + busca + "%' OR i.rango LIKE '" + busca + "%') AND codigo_ingreso != 0 AND i.codigo_planta = p.codigo_planta"
                + " ORDER BY codigo_ingreso ASC";

        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                contador++;
                registro[0] = rs.getString("codigo_ingreso");
                registro[1] = rs.getString("nombre_vulgar");
                registro[2] = rs.getString("nombre_cientifico");
                registro[3] = rs.getString("tamaño_bolsa");
                registro[4] = rs.getString("rango");
                registro[5] = rs.getString("costo");
                registro[6] = rs.getString("stock");
                registro[7] = rs.getString("disponibles");
                registro[8] = rs.getString("reservas");
                modelo.addRow(registro);

            }

            if (contador == 0 && !busca.equals("")) {
                registro[0] = "Sin resultados...";
                registro[1] = "Sin resultados...";
                registro[2] = "Sin resultados...";
                registro[3] = "Sin resultados...";
                registro[4] = "Sin resultados...";
                registro[5] = "Sin resultados...";
                registro[6] = "Sin resultados...";
                modelo.addRow(registro);

            }

            return modelo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public ResultSet MAXingreso() throws SQLException {
        sSql = "SELECT MAX(codigo_ingreso + 1) FROM Ingreso_Planta ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public boolean sumar(String codigo_ingreso, int cantidad) {

        sSql = "UPDATE ingreso_planta SET disponibles = disponibles + '" + cantidad + "' WHERE codigo_ingreso = '" + codigo_ingreso + "'";

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

    public DefaultTableModel mostrarAgotados() {
        DefaultTableModel modelo;

        String[] titulos = {"Código", "Nombre", "Tamaño", "Rango", "Disponibles", "Stock"};

        String[] registro = new String[6];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT i.codigo_ingreso, p.nombre_vulgar, i. tamaño_bolsa, i.rango, i.stock, i.disponibles FROM ingreso_planta i, planta p "
                + " WHERE i.codigo_ingreso != 0 AND p.codigo_planta != 0 AND i.codigo_planta = p.codigo_planta AND i.stock <= 0 "
                + " OR i.codigo_ingreso != 0 AND p.codigo_planta != 0 AND i.codigo_planta = p.codigo_planta AND i.disponibles <= 0 ORDER BY codigo_ingreso ASC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("codigo_ingreso");
                registro[1] = rs.getString("nombre_vulgar");
                registro[2] = rs.getString("tamaño_bolsa");
                registro[3] = rs.getString("rango");
                registro[4] = rs.getString("disponibles");
                registro[5] = rs.getString("stock");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public ResultSet buscarIngreso(String codigo) throws SQLException {
        sSql = "SELECT * FROM ingreso_planta i, planta p WHERE i.codigo_ingreso = '" + codigo + "' AND p.codigo_planta = i.codigo_planta";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }
}
