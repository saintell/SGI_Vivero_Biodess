package Modelo;

public class Ingreso_ {

    private int codigoIngreso;
    private int codigoEspecie;
    private String tamanoBolsa;
    private String rango;
    private int costo;
    private int stock;
    private int salidas;
    private int reservas;
    private int disponibles;

    public Ingreso_(int codigoIngreso, int codigoEspecie, String tamanoBolsa, String rango, int costo, int stock) {

        this.codigoIngreso = codigoIngreso;
        this.codigoEspecie = codigoEspecie;
        this.tamanoBolsa = tamanoBolsa;
        this.costo = costo;
        this.stock = stock;
        this.rango = rango;

    }

    public int getCodigoEspecie() {
        return codigoEspecie;
    }

    public void setCodigoEspecie(int codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }

    public String getTamanoBolsa() {
        return tamanoBolsa;
    }

    public void setTamanoBolsa(String tamanoBolsa) {
        this.tamanoBolsa = tamanoBolsa;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSalidas() {
        return salidas;
    }

    public void setSalidas(int salidas) {
        this.salidas = salidas;
    }

    public int getReservas() {
        return reservas;
    }

    public void setReservas(int reservas) {
        this.reservas = reservas;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getCodigoIngreso() {
        return codigoIngreso;
    }

    public void setCodigoIngreso(int codigoIngreso) {
        this.codigoIngreso = codigoIngreso;
    }

}
