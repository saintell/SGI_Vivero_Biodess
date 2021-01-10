package DAO;

import Modelo.Proveedor_;
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
public class ProveedoresDAO {

    ConexionBD cc = new ConexionBD();
    Connection cn = cc.conectar();
    String sSql = " ";
    ResultSet rs;
    Statement st;
    int totalregistros;

    public boolean CrearProveedor(Proveedor_ p) {

        sSql = "INSERT INTO proveedor(nit, nombre, celular, correo, ubicacion)"
                + " values (?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setString(1, p.getNit());
            pst.setString(2, p.getNombre());
            pst.setLong(3, Long.parseLong(p.getCelular()));
            pst.setString(4, p.getCorreo());
            pst.setString(5, p.getUbicacion());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            if (e.getMessage().contains("duplicada")) {

                JOptionPane.showMessageDialog(null, "El proveedor con el nit ingresado ya esta creado.");

            } else {
                System.out.println(e.getMessage());
            }

            return false;
        }
    }

    public ResultSet buscar(String nit) throws SQLException {
        sSql = "SELECT * FROM proveedor WHERE nit = '" + nit + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscar1() throws SQLException {
        sSql = "SELECT * FROM conductor WHERE nit != ''";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public DefaultTableModel mostrarACTIVOS() {
        DefaultTableModel modelo;

        String[] titulos = {"Nit", "Nombre", "Celular", "Correo", "Ubicacion"};

        String[] registro = new String[5];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sSql = "SELECT * FROM proveedor WHERE nit != ' " + "' AND nombre != '' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);

            while (rs.next()) {
                registro[0] = rs.getString("nit");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("celular");
                registro[3] = rs.getString("correo");
                registro[4] = rs.getString("ubicacion");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean actualizar(String nit, String nombre, long celular, String correo, String ubicacion) {

        sSql = "UPDATE proveedor SET nombre = '" + nombre + "'"
                + ", celular = '" + celular + "', correo = '" + correo + "',ubicacion = '" + ubicacion + "' WHERE nit = '" + nit + "'";

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
        String[] titulos = {"Nit", "Nombre", "Celular", "Correo", "Ubicacion"};
        String registro[] = new String[5];
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

        sql = "SELECT * FROM proveedor p WHERE (p.nit LIKE '" + busca + "%' OR p.nombre LIKE '" + busca + "%' "
                + " OR p.ubicacion LIKE'" + busca + "%'  OR CAST(p.nit AS VARCHAR(10)) LIKE '" + busca + "%') and p.nit != '0' ";

        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                contador++;
                registro[0] = rs.getString("nit");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("celular");
                registro[3] = rs.getString("correo");
                registro[4] = rs.getString("ubicacion");
                modelo.addRow(registro);

            }

            if (contador == 0 && !busca.equals("")) {
                registro[0] = "Sin resultados...";
                registro[1] = "Sin resultados...";
                registro[2] = "Sin resultados...";
                registro[3] = "Sin resultados...";
                registro[4] = "Sin resultados...";
                modelo.addRow(registro);

            }

            return modelo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public DefaultTableModel seleccionarProveedor(String busca) {

        DefaultTableModel modelo;
        String[] titulos = {"Nit", "Nombre", "Ubicacion"};
        String registro[] = new String[3];
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

        sql = "SELECT * FROM proveedor p WHERE (p.nit LIKE '" + busca + "%' OR p.nombre LIKE '" + busca + "%' "
                + " OR p.ubicacion LIKE'" + busca + "%'  OR CAST(p.nit AS VARCHAR(12)) LIKE '" + busca + "%') ";

        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                contador++;
                registro[0] = rs.getString("nit");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("ubicacion");
                modelo.addRow(registro);

            }

            if (contador == 0 && !busca.equals("")) {
                registro[0] = "Sin resultados...";
                registro[1] = "Sin resultados...";
                registro[2] = "Sin resultados...";
                modelo.addRow(registro);

            }

            return modelo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public DefaultTableModel buscarProveedor(String nit) {

        DefaultTableModel modelo;
        String[] titulos = {"Nit", "Nombre", "Celular", "Correo", "Ubicacion"};
        String registro[] = new String[5];
        modelo = new DefaultTableModel(null, titulos);

        int contador = 0;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT * FROM proveedor p WHERE p.nit =  '" + nit + "'";

        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                contador++;
                registro[0] = rs.getString("nit");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("celular");
                registro[3] = rs.getString("correo");
                registro[4] = rs.getString("ubicacion");
                modelo.addRow(registro);

            }

            if (contador == 0 && !nit.equals("")) {
                registro[0] = "Sin resultados...";
                registro[1] = "Sin resultados...";
                registro[2] = "Sin resultados...";
                registro[3] = "Sin resultados...";
                registro[4] = "Sin resultados...";
                modelo.addRow(registro);

            }

            return modelo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public boolean eliminarProveedor(String nit) {

        sSql = "DELETE FROM proveedor WHERE nit = '" + nit + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (e.getMessage().contains("duplicada")) {
            } else {
                JOptionPane.showMessageDialog(null, "Error, El proveedor ya se encuentra en una salida." + "\n" + "Este no se puede eliminar.");

            }
            return false;
        }
    }

}
