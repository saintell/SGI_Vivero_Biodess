package Modelo;

import java.sql.Date;

public class DetalleIngreso_ {

    private String nit;
    private int codigoEspecie;
    private int cantidad;
    private Date fecha;
    private long costo_compra;
    private int codigo_ingreso;

    public DetalleIngreso_(String nit, int codigoEspecie, int cantidad, Date fecha, long costo_compra, int codigo_ingreso) {
        this.nit = nit;
        this.codigoEspecie = codigoEspecie;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.costo_compra = costo_compra;
        this.codigo_ingreso = codigo_ingreso;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getCodigoEspecie() {
        return codigoEspecie;
    }

    public void setCodigoEspecie(int codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getCosto_compra() {
        return costo_compra;
    }

    public void setCosto_compra(long costo_compra) {
        this.costo_compra = costo_compra;
    }

    public int getCodigo_ingreso() {
        return codigo_ingreso;
    }

    public void setCodigo_ingreso(int codigo_ingreso) {
        this.codigo_ingreso = codigo_ingreso;
    }

}
