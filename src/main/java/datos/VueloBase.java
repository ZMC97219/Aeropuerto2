/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Date;

/**
 * Clase destinada a la gestion de Vuelo Base de un Aeropuerto
 * @author jrubioa
 */
public class VueloBase {
    
    private String codigoVuelo;

    private String codigoIATAOrigen;
    private String codigoIATADestino;

    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;
    
    private int numeroPlazas;
    private Date horaSalida;
    private Date horaLlegada;
    private String diasSemanaVuelo;

    /**
     * contructor por defecto
     */
    public VueloBase(){
        
    }
    /**
     * 
     * @param codigoVuelo codigo vuelo del Vuelo Base 
     * @param codigoIATAOrigen codigo IATA de origen del Vuelo Base 
     * @param codigoIATADestino codigo IATA de destino del Vuelo Base 
     * @param numeroPlazas numero de plazas del Vuelo Base 
     * @param horaSalida hora de salida del Vuelo Base 
     * @param horaLlegada hora de llegada del Vuelo Base 
     * @param diasSemanaVuelo dias de semana de vuelo del Vuelo Base 
     */
    public VueloBase(String codigoVuelo, String codigoIATAOrigen, String codigoIATADestino, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasSemanaVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.codigoIATAOrigen = codigoIATAOrigen;
        this.codigoIATADestino = codigoIATADestino;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasSemanaVuelo = diasSemanaVuelo;
    }

    /**
     * 
     * @param codigoVuelo codigo vuelo del Vuelo Base 
     * @param aeropuertoOrigen aeropuerto de origen del aeropuerto
     * @param aeropuertoDestino aeropuerto de destino del aeropuerto
     * @param numeroPlazas numero de plazas del Vuelo Base 
     * @param horaSalida hora de salida del Vuelo Base 
     * @param horaLlegada hora de llegada del Vuelo Base 
     * @param diasSemanaVuelo dias de semana de vuelo del Vuelo Base 
     */
    
    public VueloBase(String codigoVuelo, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasSemanaVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasSemanaVuelo = diasSemanaVuelo;
    }

    /**
     * metodo get del atributo codigoVuelo
     * @return devuelve el codigo vuelo del Vuelo Base 
     */
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    /**
     * metodo set del atributo codigoVuelo
     * @param codigoVuelo asigna el codigo vuelo del Vuelo Base 
     */
    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    /**
     * metodo get del atributo codigoIATAOrigen
     * @return devuelve el codigo IATA origen del Vuelo Base 
     */
    public String getCodigoIATAOrigen() {
        return codigoIATAOrigen;
    }

    /**
     * metodo set del atributo codigoIATAOrigen
     * @param codigoIATAOrigen asigna el codigo IATA origen del Vuelo Base 
     */
    public void setCodigoIATAOrigen(String codigoIATAOrigen) {
        this.codigoIATAOrigen = codigoIATAOrigen;
    }

    /**
     * metodo get del atributo CodigoIATADestino
     * @return devuelve el codigo IATA destino del Vuelo Base 
     */
    public String getCodigoIATADestino() {
        return codigoIATADestino;
    }

    /**
     * metodo set del atributo codigoIATADestino
     * @param codigoIATADestino asigna el codigo IATA destino del Vuelo Base 
     */
    public void setCodigoIATADestino(String codigoIATADestino) {
        this.codigoIATADestino = codigoIATADestino;
    }
    /**
    * metodo get del atributo AeropuertoOrigen del aeropuerto
    * @return devuelve el aeropuerto de origen del aeropuerto
    */
    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    /**
     * metodo set del atributo AeropuertoOrigen del aeropuerto
     * @param aeropuertoOrigen asigna el aeropuerto de origen del aeropuerto
     */
    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    /**
     * metodo get del atributo AeropuertoDestino del aeropuerto
     * @return devuelve el aeropuerto de destino del aeropuerto
     */
    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    /**
     * metodo set del atributo aeropuertoDestino del aeropuerto
     * @param aeropuertoDestino asigna el aeropuerto de destino del aeropuerto
     */
    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    /**
     * metodo get del atributo numeroPlazas
     * @return devuelve el numero de plazas del Vuelo Base 
     */
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    /**
     * metodo set del atributo numeroPlazas
     * @param numeroPlazas asigna el numero de plazas del Vuelo Base 
     */
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    /**
     * metodo get del atributo numeroPlazas
     * @return devuelve la hora de salida del Vuelo Base 
     */
    public Date getHoraSalida() {
        return horaSalida;
    }

    /**
     * metodo set del atributo numeroPlazas
     * @param horaSalida asigna la hora de salida del Vuelo Base 
     */
    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * metodo get del atributo horaLlegada
     * @return devuelve la hora de llegada del Vuelo Base 
     */
    public Date getHoraLlegada() {
        return horaLlegada;
    }

    /**
     * metodo set del atributo horaLlegada
     * @param horaLlegada asigna la hora de llegada del Vuelo Base 
     */
    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    /**
     * metodo get del atributo diasSemanaVuelo
     * @return devuelve los dias de semana de vuelo del Vuelo Base 
     */
    public String getDiasSemanaVuelo() {
        return diasSemanaVuelo;
    }

    /**
     * metodo set del atributo diasSemanaVuelo
     * @param diasSemanaVuelo asigna los dias de semana de vuelo del Vuelo Base 
     */
    public void setDiasSemanaVuelo(String diasSemanaVuelo) {
        this.diasSemanaVuelo = diasSemanaVuelo;
    }
    
    
    /**
     * Se realiza con el objetivo de que el combo muestre estos parametros
     * @return el codigo IATA origen y destino 
     */
    @Override
    public String toString() {
        return this.getCodigoIATAOrigen() + this.getCodigoIATADestino();
    }
    
}
