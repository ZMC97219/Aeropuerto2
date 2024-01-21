/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


import datos.VueloDiario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Clase destinada a la rellenar los datos de los vuelos diarios
 * @author jrubioa
 */
public class VuelosDiariosModelTable extends AbstractTableModel{

    private List<VueloDiario> listaVueloDiario;
    private ArrayList<String> columnNames; // nombre de las columnas
    private ArrayList<Class> columnClasses; // Clases de las columnas
    
    /**
     * contructor para rellenar el Table Model 
     * @param listaVueloDiario lista con los datos de los vuelos diarios
     */
    public VuelosDiariosModelTable(List<VueloDiario> listaVueloDiario) {
        this.listaVueloDiario = listaVueloDiario;
        columnNames = new ArrayList<>();
        columnNames.add("Codigo Vuelo Base");
        columnNames.add("Fecha Vuelo");
        columnNames.add("Hora Salida");
        columnNames.add("Hora Llegada");
        columnNames.add("Numero Plazas");
        columnNames.add("Precio");
        columnClasses = new ArrayList<>();
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(Float.class);
        
    }
    
    
    /**
     * Metodo con el numero de filas
     * @return devuelve el tamaño de filas
     */
    @Override
    public int getRowCount() {
        //return 6;
        return this.listaVueloDiario.size();
    }

    /**
     * Metodo con el numero de filas
     * @return devuelve el tamaño de columnas
     */
    @Override
    public int getColumnCount() {
        return this.listaVueloDiario.size();
    }

    /**
     * Metodo que rellena la tabla
     * @param rowIndex correspnde a la fila
     * @param columnIndex correspnde a la columnna
     * @return el valor de la tabla
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        SimpleDateFormat sdH = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy");

        VueloDiario vueloDiario = this.listaVueloDiario.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vueloDiario.getCodigoVueloBase();
            case 1:
                String fechaVuelo = sdF.format(vueloDiario.getFechaVuelo());
                return fechaVuelo;
            case 2:
                String horaSalidaReal = sdH.format(vueloDiario.getHoraSalidaReal());
                return horaSalidaReal;
            case 3:
                String horaLlegadaReal = sdH.format(vueloDiario.getHoraLegadaReal());
                return horaLlegadaReal;
            case 4:
                return String.valueOf(vueloDiario.getNumeroPlazas());
            case 5:
                return vueloDiario.getPrecio();
            default:
                return "";

        }
    }
        
    /**
     * 
     * @param col columnna
     * @return devuelve el tipo de comunna a rellenar
     */
    @Override
    public Class getColumnClass(int col) {
        return this.columnClasses.get(col);
    }
    /**
     * 
     * @param col columnna
     * @return devuelve el nombre de la comunna a rellenar
     */
    @Override
    public String getColumnName(int col) {
        return this.columnNames.get(col);
    }

}
    
 
