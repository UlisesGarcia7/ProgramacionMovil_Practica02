/*
    Alumno: García Garzón Ulises Enrique
    Matricula: 2019030286
    Grupo: Clase "Cotizacion "
 */
package Practica02;

public class Cotizacion {
    // Atributos
    private int numCotizacion;
    private String descripcion;
    private double precio;
    private double porcentajePagoInicial;
    private int plazo;
    
    // Constructores 
    
    // Constructor Vacio
    public Cotizacion(){
        this.numCotizacion = 0;
        this.descripcion = "";
        this.precio = 0.0;
        this.porcentajePagoInicial = 0.0;
        this.plazo = 0;
    }
    
    // Constructor de Parametros
    public Cotizacion(int numCotizacion, String descripción, double precio, double porcentajePagoInicial, int plazo){
        this.numCotizacion = numCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentajePagoInicial = porcentajePagoInicial;
        this.plazo = plazo;
    }
    
    // Constructor de Copia
    public Cotizacion(Cotizacion cotizacion){
        this.numCotizacion = cotizacion.numCotizacion;
        this.descripcion = cotizacion.descripcion;
        this.precio = cotizacion.precio;
        this.porcentajePagoInicial = cotizacion.porcentajePagoInicial;
        this.plazo = cotizacion.plazo;
    }
    
    // Encapsulamiento

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentajePagoInicial
     */
    public double getPorcentajePagoInicial() {
        return porcentajePagoInicial;
    }

    /**
     * @param porcentajePagoInicial the porcentajePagoInicial to set
     */
    public void setPorcentajePagoInicial(double porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public double calcularPagoInicial(){
    double pagoInicial;
        pagoInicial = (this.porcentajePagoInicial/100) * this.precio;
        return pagoInicial;
    }
    
    public double calcularTotalFinanciero(){
    double totalFin;
        totalFin = this.precio - this.calcularPagoInicial();
        return totalFin;
    }
    
    public double calcularPagoMensual(){
    double pagoMensual;
        pagoMensual = this.calcularTotalFinanciero() / this.plazo;
        return pagoMensual;
    }
}
