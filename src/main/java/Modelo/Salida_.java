package Modelo;

import java.sql.Date;

/**
 *
 * @author Alvaro Jose
 */
public class Salida_ {

    private int codigo_salida;
    private String motivo;
    private Date fecha;
    private String observacion;
    private String destino;
    private int total;
    private String id_cliente;
    private int id_conductor;
    private String placa;
    private String predio;

    public Salida_(int codigo_salida, String motivo, String predio, Date fecha, String observacion, String destino, int total, String id_cliente, int id_conductor, String placa) {
        this.codigo_salida = codigo_salida;
        this.motivo = motivo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.destino = destino;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_conductor = id_conductor;
        this.placa = placa;
        this.predio = predio;
    }

    public int getCodigo_salida() {
        return codigo_salida;
    }

    public void setCodigo_salida(int codigo_Salida) {
        this.codigo_salida = codigo_Salida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

}
