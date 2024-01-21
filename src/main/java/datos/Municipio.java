/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package datos;



/**
 * Clase para la gestion de los municipios
 * @author jrubioa
 */
public record Municipio(String codigo,String nombre ) {
    
    
    /**
     * Se realiza con el objetivo de que el combo solo muestre el nombre del municipio
     * @return devuelve el nombre del Municipio
     */
    public String toString() {
        return nombre;
    }
}
