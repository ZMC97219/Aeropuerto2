/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 * Clase destinada a la gestion de temperatura de un municipio
 * @author jrubioa
 */
public class Temperatura {
    
    private String codMunicipio;
    private int tempMinima;
    private int tempMaxima;
    

    /**
     * Contructor por defecto
     */
    public Temperatura() {
    }

    /**
     * 
     * @param codMunicipio codigo de Municipio de un aeropuerto
     * @param tempMinima Temperatura minima de Municipio de un aeropuerto
     * @param tempMaxima Temperatura maxima de Municipio de un aeropuerto
     */
    public Temperatura(String codMunicipio, int tempMinima, int tempMaxima) {
        this.codMunicipio = codMunicipio;
        this.tempMinima = tempMinima;
        this.tempMaxima = tempMaxima;
    }

    /**
     * metodo get del atributo CodMunicipio
     * @return devuelve el codigo de Municipio de un aeropuerto
     */
    public String getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * metodo set del atributo codMunicipio
     * @param codMunicipio asigna el codigo de Municipio de un aeropuerto
     */
    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    /**
     * metodo get del atributo TempMinima
     * @return devuelve la temperatura minima de Municipio de un aeropuerto
     */
    public int getTempMinima() {
        return tempMinima;
    }

    /**
     * metodo set del atributo tempMinima
     * @param tempMinima asigna la temperatura minima de Municipio de un aeropuerto
     */
    public void setTempMinima(int tempMinima) {
        this.tempMinima = tempMinima;
    }

    /**
     * metodo get del atributo TempMaxima
     * @return devuelve la temperatura maxima de Municipio de un aeropuerto
     */
    public int getTempMaxima() {
        return tempMaxima;
    }

    /**
     * metodo set del atributo tempMaxima
     * @param tempMaxima asigna la temperatura maxima de Municipio de un aeropuerto
     */
    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }
    

    
}
