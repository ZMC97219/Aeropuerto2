/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 * Gestiona los datos basicos de una compañia, con el fin de almacenarlos
 * @author jrubioa
 */
public class Company {
    
    private int prefijo;
    private String codigo;
    private String nombre;
    private String direccion;
    private String codigoMunicipio;
    private String telefonoPasajero;
    private String telefonoAeropuerto;

    // contructor por defecto
    public Company(){
         
     }
     
    /**
     * 
     * @param prefijo prefijo de la compañia 
     * @param codigo codigo de la compañia 
     * @param nombre nombre de la compañia 
     * @param direccion direccion de la compañia 
     * @param codigoMunicipio codigo del Municipio de la compañia 
     * @param telefonoPasajero telefono Pasajero que viaja con la compañia
     * @param telefonoAeropuerto telefono del Aeropuerto de la compañia 
     */
    public Company(int prefijo, String codigo, String nombre, String direccion, String codigoMunicipio, String telefonoPasajero, String telefonoAeropuerto) {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoMunicipio = codigoMunicipio;
        this.telefonoPasajero = telefonoPasajero;
        this.telefonoAeropuerto = telefonoAeropuerto;
    }

    /**
     * metodo get del atributo Prefijo
     * @return devuelve el Prefijo de una compañia
     */
    public int getPrefijo() {
        return prefijo;
    }

    /**
     * metodo set del atributo Prefijo
     * @param prefijo asigna el Prefijo de una compañia
     */
    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    /**
     * metodo get del atributo codigo
     * @return devuelve el codigo de una compañia
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * metodo set del atributo codigo
     * @param codigo asigna el codigo de una compañia
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * metodo get del atributo nombre
     * @return devuelve el nombre de una compañia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo set del atributo nombre
     * @param nombre asigna el nombre de una compañia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo get del atributo direccion
     * @return devuelve la direccion de una compañia
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * metodo set del atributo direccion
     * @param direccion asigna la direccion de una compañia
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * metodo get del atributo codigoMunicipio
     * @return devuelve el codgo de municipio de una compañia
     */
    public String getcodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * metodo set del atributo codigoMunicipio
     * @param codigoMunicipio asigna el codgo de municipio de una compañia
     */
    public void setcodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    /**
     * metodo get del atributo telefonoPasajero
     * @return devuelve el telefono de pasajero que viaja en una compañia
     */
    public String getTelefonoPasajero() {
        return telefonoPasajero;
    }

    /**
     * metodo set del atributo telefonoPasajero
     * @param telefonoPasajero signa el telefono de pasajero que viaja en una compañia
     */
    public void setTelefonoPasajero(String telefonoPasajero) {
        this.telefonoPasajero = telefonoPasajero;
    }

    /**
     * metodo get del atributo telefonoPasajero
     * @return devuelve el telefono del Aeropuerto de una compañia
     */
    public String getTelefonoAeropuerto() {
        return telefonoAeropuerto;
    }

    /**
    * metodo set del atributo telefonoAeropuerto
    * @param telefonoAeropuerto signa el telefono del Aeropuerto de una compañia
    */
    public void setTelefonoAeropuerto(String telefonoAeropuerto) {
        this.telefonoAeropuerto = telefonoAeropuerto;
    }
    
    
}
