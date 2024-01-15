/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


import datos.VueloBase;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jrubioa
 */
public class VuelosBaseModelTable extends AbstractTableModel{

    private List<VueloBase> listaVueloBase;
    private List<String> columnNames;
    private List<Class> columnClasses;
    
    public VuelosBaseModelTable(List<VueloBase> listaVueloBase) {
        
        this.listaVueloBase = listaVueloBase;

        columnNames = new ArrayList<>();
        columnNames.add("Codigo vuelo");
        columnNames.add("IATA Origen");
        columnNames.add("IATA Destino");
        columnNames.add("Num. plazas");
        columnNames.add("Hora salida");
        columnNames.add("Hora llegada");
        columnNames.add("Dias vuelo");
        
        columnClasses = new ArrayList<>();
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(Integer.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        
        
        
    }
    @Override
    public int getRowCount() {
        return listaVueloBase.size();
        
    }

    @Override
    public int getColumnCount() {
       return columnNames.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VueloBase VuelosBase = this.listaVueloBase.get(rowIndex);
        SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
        
        switch (columnIndex) {
            case 0: 
                return VuelosBase.getCodigoVuelo();
            case 1: 
                return VuelosBase.getCodigoIATAOrigen();
            case 2: 
                return VuelosBase.getCodigoIATADestino();
            case 3: 
                return VuelosBase.getNumeroPlazas();
            case 4: 
                String HoraSalida = sd.format(VuelosBase.getHoraSalida());
                return HoraSalida;
            case 5: 
                String HoraLegada = sd.format(VuelosBase.getHoraLlegada());
                return HoraLegada;
            case 6: 
                return VuelosBase.getDiasSemanaVuelo();
            default:
                return "";
        }
        
    }
    
}
