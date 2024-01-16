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
 *
 * @author jrubioa
 */
public class VuelosDiariosModelTable extends AbstractTableModel{

    private List<VueloDiario> listaVueloDiario;
    private ArrayList<String> columnNames; // nombre de las columnas
    private ArrayList<Class> columnClasses; // Clases de las columnas
    
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
        columnClasses.add(Integer.class);
        columnClasses.add(Float.class);
        
    }
    
    
    
    @Override
    public int getRowCount() {
        //return 6;
        return this.listaVueloDiario.size();
    }

    @Override
    public int getColumnCount() {
        return this.listaVueloDiario.size();
    }

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
                return vueloDiario.getNumeroPlazas();
            case 5:
                return vueloDiario.getPrecio();
            default:
                return "";

        }
    }
        
    @Override
    public Class getColumnClass(int col) {
        return this.columnClasses.get(col);
    }
    @Override
    public String getColumnName(int col) {
        return this.columnNames.get(col);
    }

}
    
 
