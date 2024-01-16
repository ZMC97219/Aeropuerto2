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
import static logica.LogicaNegocio.getCompanyByCodigo;

/**
 *
 * @author jrubioa
 */
public class CompanyVuelosModelTable extends AbstractTableModel {
    
    private List<VueloDiario> lstVuelosCompany;
    private List<String> columnNames;
    private List<Class> columnClasses;
    
    public CompanyVuelosModelTable(List<VueloDiario> lstVuelosCompany) {
        
        this.lstVuelosCompany = lstVuelosCompany;

        columnNames = new ArrayList<>();
        columnNames.add("Codigo vuelo base");
        columnNames.add("Fecha vuelo");
        columnNames.add("Origen");
        columnNames.add("Destino");
        columnNames.add("Compañía");

        columnClasses = new ArrayList<>();

        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        
    }
    
    @Override
    public int getRowCount() {
        return this.lstVuelosCompany.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.size();
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VueloDiario vueloDiario = this.lstVuelosCompany.get(rowIndex);
        SimpleDateFormat sdff = new SimpleDateFormat("DD/MM/YYYY");

        switch (columnIndex) {
            case 0:
                return vueloDiario.getCodigoVueloBase();
            case 1:
                String fechaVuelo = sdff.format(vueloDiario.getFechaVuelo());
                return fechaVuelo;
            case 2:
                String aeropuertoOrigen = vueloDiario.getVueloBase().getAeropuertoOrigen().getNombre();
                return aeropuertoOrigen;
            case 3:
                String aeropuertoDestino = vueloDiario.getVueloBase().getAeropuertoDestino().getNombre();
                return aeropuertoDestino;
            case 4:
                String codigo_Company = vueloDiario.getCodigoVueloBase().substring(0, 2);
                String company = getCompanyByCodigo(codigo_Company).getNombre();
                return company;
            default:
                return 0;

        }
    }
    
    
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return this.columnClasses.get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames.get(column);
    }
    
}
