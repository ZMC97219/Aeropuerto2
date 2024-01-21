/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 * Clase destinada a la gestion del Aeropuerto
 * @author jrubioa
 */
public class Aeropuerto {
    private String codigoIATA; // Son tres letras
    private String nombre;
    private String codigoMunicipio;

    /**
     * Constructor por defecto
     */
    public Aeropuerto(){
        
    }
    
    /**
     * 
     * @param codigoIATA codigo IATA del aeropuerto
     * @param nombre Nombre del aeropuerto
     * @param codigoMunicipio  codigoi postal del municipio del aeropuerto
     */
    public Aeropuerto(String codigoIATA, String nombre, String codigoMunicipio) {
        this.codigoIATA = codigoIATA;
        this.nombre = nombre;
        this.codigoMunicipio = codigoMunicipio;
    }

    /**
     * metodo get del atributo CodigoIATA
     * @return devuelve el Codigo IATA del aeropuerto
     */
    public String getCodigoIATA() {
        return codigoIATA;
    }

    /**
     * metodo set del atributo CodigoIATA
     * @param codigoIATA asigna el Codigo IATA del aeropuerto
     */
    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }
    
    /**
     * metodo get del atributo Nombre
     * @return devuelve el nombre del aeropuerto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo set del atributo Nombre
     * @param nombre asigna el nombre del aeropuerto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo get del atributo CodigoMunicipio
     * @return devuelve el codigo del municipio del aeropuerto
     */
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * set del atributo CodigoMunicipio
     * @param codigoMunicipio asigna el codigo del municipio del aeropuerto
     */
    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    /**
     * metodo de toString
     * @return devuelve el codigo IATA del aeropuerto
     */
    @Override
    public String toString() {
        return codigoIATA;
    }
    
    
}
