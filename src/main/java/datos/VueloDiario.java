/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Date;

/**
 * Clase destinada a la gestion de Vuelo diarios de un Aeropuerto
 * @author jrubioa
 */
public class VueloDiario {
    
    //A lahora de instanciar, codigoVueloBase y VueloBase no pueden estar a la vez
    private String codigoVueloBase;
    private VueloBase VueloBase; // Para que el VueloDiario se relacione con el VueloBase
    
    private Date fechaVuelo;
    private Date horaSalidaReal;
    private Date horaLegadaReal;
    private int numeroPlazas;
    private float precio;
    
    /**
     * contructor por defecto
     */
    public VueloDiario(){
        
    }
    
    /**
     * Se crea el contructor sin el VueloBase
     * @param codigoVueloBase codigo base del vuelo
     * @param fechaVuelo fecha del vuelo 
     * @param horaSalidaReal hora de salida real del vuelo 
     * @param horaLegadaReal hora de llegada real del vuelo
     * @param numeroPlazas numero de plazas del vuelo
     * @param precio precio del vuelo 
     */
    
    public VueloDiario(String codigoVueloBase, Date fechaVuelo, Date horaSalidaReal, Date horaLegadaReal, int numeroPlazas, float precio) {
        this.codigoVueloBase = codigoVueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalidaReal = horaSalidaReal;
        this.horaLegadaReal = horaLegadaReal;
        this.numeroPlazas = numeroPlazas;
        this.precio = precio;
    }
    

    /**
     * Se crea el contructor con el VueloBase sin el codigoVueloBase
     * @param VueloBase vuelo base del vuelo 
     * @param fechaVuelo fecha del vuelo 
     * @param horaSalidaReal hora de salida real del vuelo 
     * @param horaLegadaReal hora de llegada real del vuelo
     * @param numeroPlazas numero de plazas del vuelo
     * @param precio precio del vuelo  
     */
    public VueloDiario(VueloBase VueloBase, Date fechaVuelo, Date horaSalidaReal, Date horaLegadaReal, int numeroPlazas, float precio) {
        this.VueloBase = VueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalidaReal = horaSalidaReal;
        this.horaLegadaReal = horaLegadaReal;
        this.numeroPlazas = numeroPlazas;
        this.precio = precio;
    }

    /**
     * metodo get del atributo codigoVueloBase
     * @return devuelve el codigo Vuelo Base del vuelo
     */
    public String getCodigoVueloBase() {
        return codigoVueloBase;
    }

    /**
     * metodo set del atributo codigoVueloBase
     * @param codigoVueloBase asigna el codigo Vuelo Base del vuelo
     */
    public void setCodigoVueloBase(String codigoVueloBase) {
        this.codigoVueloBase = codigoVueloBase;
    }

    /**
     * metodo get del atributo VueloBase del vuelo base
     * @return devuelve el vuelo base
     */
    public VueloBase getVueloBase() {
        return VueloBase;
    }

    /**
     * metodo set del atributo VueloBase del vuelo base
     * @param VueloBase asigna el vuelo base
     */
    public void setVueloBase(VueloBase VueloBase) {
        this.VueloBase = VueloBase;
    }

    /**
     * metodo get del atributo fechaVuelo
     * @return devuelve la fecha del vuelo
     */
    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    /**
     * metodo set del atributo fechaVuelo
     * @param fechaVuelo asigna la fecha del vuelo
     */
    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    /**
     * metodo get del atributo horaSalidaReal
     * @return devuelve la hora de salida real del vuelo
     */
    public Date getHoraSalidaReal() {
        return horaSalidaReal;
    }

    /**
     * metodo set del atributo horaSalidaReal
     * @param horaSalidaReal asigna la hora de salida real del vuelo
     */
    public void setHoraSalidaReal(Date horaSalidaReal) {
        this.horaSalidaReal = horaSalidaReal;
    }

    /**
     * metodo get del atributo horaLegadaReal
     * @return devuelve la hora de llegada real del vuelo
     */
    public Date getHoraLegadaReal() {
        return horaLegadaReal;
    }
    /**
    * metodo set del atributo horaLegadaReal
    * @param horaLegadaReal asigna la hora de llegada real del vuelo
     */
    public void setHoraLegadaReal(Date horaLegadaReal) {
        this.horaLegadaReal = horaLegadaReal;
    }

    /**
     * metodo get del atributo numeroPlazas
     * @return devuelve el numero de plazas del vuelo
     */
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    /**
     * metodo set del atributo numeroPlazas
     * @param numeroPlazas asigna el numero de plazas del vuelo
     */
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    /**
     * metodo get del atributo precio
     * @return devuelve el precio del vuelo
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * metodo set del atributo precio
     * @param precio asigna el precio del vuelo
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
