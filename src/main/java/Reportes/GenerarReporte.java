package Reportes;

import DAO.ConexionBD;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarReporte {

    private ConexionBD conexion;

    private String url = new File("").getAbsolutePath();
    private String logo = url + "\\src\\main\\resources\\LogoBiodess.png";

    public void remisionSalida(String cedula, int codigo, String motivo) {

        System.out.println(logo);
        try {
            conexion = new ConexionBD();

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("RemisionSalida.jasper");
            Map parameter = new HashMap();
            parameter.put("cedula", cedula);
            parameter.put("codigo_salida", codigo);
            parameter.put("logo", logo);
            parameter.put("motivo", motivo);

            JasperPrint print = JasperFillManager.fillReport(report, parameter, conexion.conectar());
            JasperViewer jv = new JasperViewer(print, false);
            jv.setTitle("Remisión de Salida");
            jv.setVisible(true);
        } catch (JRException ex) {
        }

    }

}
