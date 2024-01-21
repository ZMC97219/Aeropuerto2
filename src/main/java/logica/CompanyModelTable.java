/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import datos.Company;
import java.util.ArrayList;

/**
 * Clase destinada a la rellenar los datos de las compañias
 * @author jrubioa
 */
public class CompanyModelTable extends AbstractTableModel{
    
    private List<Company> listacompany;
    private ArrayList<String> columnNames; // nombre de las columnas
    private ArrayList<Class> columnClasses; // Clases de las columnas

    /**
     * contructor para rellenar el Table Model 
     * @param listacompany lista con los datos de las compañias
     */
    public CompanyModelTable(List<Company> listacompany) {
        this.listacompany = listacompany;
        columnNames = new ArrayList<>();
        columnNames.add("Prefijo");
        columnNames.add("Codigo");
        columnNames.add("Nombre");
        columnNames.add("Telefono de atencion");
        columnClasses = new ArrayList<>();
        columnClasses.add(Integer.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        
    }
    
    
    

    /**
     * Metodo con el numero de filas
     * @return devuelve el tamaño de filas
     */
    @Override
    public int getRowCount() {
        return listacompany.size();
    }

    /**
     * Metodo con el numero de filas
     * @return devuelve el tamaño de columnas
     */
    @Override
    public int getColumnCount() {
        return this.columnNames.size();
    }

    /**
     * Metodo que rellena la tabla
     * @param rowIndex correspnde a la fila
     * @param columnIndex correspnde a la columnna
     * @return el valor de la tabla
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Company comp = this.listacompany.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return comp.getPrefijo();
            case 1: 
                return comp.getCodigo();
            case 2: 
                return comp.getNombre();
            case 3: 
                return comp.getTelefonoPasajero();
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
