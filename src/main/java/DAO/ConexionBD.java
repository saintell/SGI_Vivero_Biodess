package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    private Connection conexion = null;

    public Connection conectar() {
        try {

            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Pinpo9807");

        } catch (ClassNotFoundException nf) {
            JOptionPane.showMessageDialog(null, nf.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! Ejecute la base de datos primero.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.exit(0);

        }
        return conexion;

    }

    public void desconectar() throws SQLException {
        conexion = null;
        if (conexion != null) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion a la base de datos");
        }
    }

    public ResultSet Listar(String Cad) {

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:mysql://172.0.0.1/motoclinic", "root", "");

            PreparedStatement da = cn.prepareStatement(Cad);
            ResultSet tbl = da.executeQuery();
            return tbl;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

}
