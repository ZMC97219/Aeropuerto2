/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import datos.Aeropuerto;
import datos.Company;
import datos.Municipio;
import datos.Temperatura;
import datos.VueloBase;
import datos.VueloDiario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import java.text.ParseException;

/**
 * Clase donde se agrupan los metedos y funciones para dar soporte a la logistica del Aeropuerto
 * @author jrubioa
 * @since 1.0
 */
public class LogicaNegocio {
    
    // Para inicializar con algunos municipios
    public static void initializesystem () {
        fillMunicipiosList();
        fillAeropuertosList();
        
        //fillCompanyList();
        leerCompany();
        try {
            leerVueloBase();
        } catch (ParseException ex) {
            Logger.getLogger("error al leer Vuelos Base");
        }
        
        try {
            leerVueloDario();
        } catch (ParseException ex) {
            Logger.getLogger("error al leer Vuelos Diarios");
        }
        
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Logica de Municipios"> 
    private static List<Municipio> lstMunicipios = new ArrayList<>();
    
    public static List<Municipio> getAllMunicipios(){
        return lstMunicipios;
    }
    
    private static void fillMunicipiosList(){
        // Se añaden a la lista algunos municipios, se eligen del excel
        lstMunicipios.add(new Municipio("00000", "internacional"));
        lstMunicipios.add(new Municipio("42164", "San Leonardo de Yagüe"));
        lstMunicipios.add(new Municipio("33020", "Corvera de Asturias"));
        lstMunicipios.add(new Municipio("33011", "Cangas del Narcea"));
        lstMunicipios.add(new Municipio("08019", "Barcelona"));
        lstMunicipios.add(new Municipio("28079", "Madrid"));
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Logica de aeropuertos"> 
    
    private static void fillAeropuertosList(){
        // Se añaden a la lista algunos municipios, se eligen del excel
        lstAeropuertos.add(new Aeropuerto ("OVD", "Aeropuerto de Asturias", "33014"));
        lstAeropuertos.add(new Aeropuerto ("MAD", "Aeropuerto Adolfo Suárez Madrid-Barajas", "28079"));
        lstAeropuertos.add(new Aeropuerto ("BCN", "Aeropuerto de Barcelona-El Prat", "08019"));
        lstAeropuertos.add(new Aeropuerto ("PNA", "Aeropuerto de Pamplona", "42164"));
        
        lstAeropuertos.add(new Aeropuerto ("FCO", "Aeropuerto de Roma-Fiumicino", "00000"));
        lstAeropuertos.add(new Aeropuerto ("GIB", "Aeropuerto de Gibraltar", "00000"));

    }
    
    // lista de aeropuerto del sistema
    private static List<Aeropuerto> lstAeropuertos = new ArrayList<>();
    
    // Aeropuerto base del sistema
    public static Aeropuerto aeropuertoBase = getAeropuertoByCodigoIATA ("OVD");
    
    /**
     * Se obtienen toda la colección de aeropuertos del sistema, con el fin de 
     * de que nos devuelva los aeropuertos de la lista instanciada arriba
     * @return una lista de aeropuertos
     */
    public static List<Aeropuerto> getAllAeropuertos(){
        return lstAeropuertos;
    }
            
    /**
     * Se obtiene un aeropuerto dado su codigo
     * @param codigoIATA codigo del aeropuerto a obtener
     * @return un aeropuerto correspondiente al codigo 
     */
    public static Aeropuerto getAeropuertoByCodigoIATA (String codigoIATA){
        
        /* forma 1
        for(Aeropuerto a : lstAeropuertos){
            if(a.getCodigoIATA().equals(codigoIATA)){
                return a;
            }else{
                return null;
            }
            
        }*/
        
        // forma 2
        // Necesitamos un aeropuertos por codigo IATA, para eso recorremos la lista
        // Basicamente lo que hace es compararar los dos codigoIATA y devuelve el primero con esta coincidencia
        Optional<Aeropuerto> aeropuertoPorCodigo = lstAeropuertos.stream()
                .filter(a-> a.getCodigoIATA().equals(codigoIATA))
                .findFirst();

        return aeropuertoPorCodigo.isPresent() ? aeropuertoPorCodigo.get(): null;
        
    }// </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="Logica de compañias"> 
     
    private static void fillCompanyList() {
        lstCompanys.add(new Company(75, "RB", "Iberia Líneas Aéreas de España", "Desconocida", "28079", "911234568", "911234567"));
        lstCompanys.add(new Company(125, "BA", "British Airways P.L.C.", "Desconocida", "00000", "981234568", "981234567"));
        lstCompanys.add(new Company(137, "VX", "Aerolíneas Centrales de Colombia", "Desconocida", "00000", "961234568", "961234568"));

    }
    
    public static void leerCompany() {
        try {
            String l;
            String[] leer;
            FileReader file= new FileReader("src/main/resources/company.csv");
            BufferedReader br = new BufferedReader(file);
            while ((l = br.readLine()) != null) {
                leer= l.split(",");
                int prefijo = Integer.parseInt(leer[0]);
                String codigo = leer[1];
                String nombre = leer[2];
                String direccion = leer[3];
                String codigoMunicipio = leer[4];
                String telefonoPasajero = leer[5];
                String telefonoAeropuerto = leer[6];
                Company comp = new Company(prefijo, codigo, nombre, direccion, codigoMunicipio, telefonoPasajero, telefonoAeropuerto);
                addCompany(comp);
            }

            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void escribirCompany(List<Company> comp) {
        try {
            /*try {
            FileWriter f = new FileWriter("src/main/resources/company.csv");
            CSVWriter writer = new CSVWriter(f);
            try {
            writer.writeAll((ResultSet) comp, true);
            } catch (Exception ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
            }
            writer.close();
            
            } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            FileWriter f = new FileWriter("src/main/resources/company.csv");
            
            for (Company company : comp) {
                f.write(String.valueOf(company.getPrefijo()));
                f.write(",");
                f.write(company.getCodigo());
                f.write(",");
                f.write(company.getNombre());
                f.write(",");
                f.write(company.getDireccion());
                f.write(",");
                f.write(company.getcodigoMunicipio());
                f.write(",");
                f.write(company.getTelefonoPasajero());
                f.write(",");
                f.write(company.getTelefonoAeropuerto());
                f.write("\n");
            }
            
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Se ha escrito el fichero company.csv");
        
    }
    // lista de compañias del sistema
    private static List<Company> lstCompanys = new ArrayList<>();
    
    
    /**
     * Se obtienen toda la colección de compañias del sistema
     * @return una lista de aeropuertos
     */
    public static List<Company> getAllCompany(){
        return lstCompanys;
    }
            
    
    public static Company getCompanyByCodigo (String codigo){
        
        Optional<Company> companyByCodigo = lstCompanys.stream()
                .filter(a-> a.getCodigo().equals(codigo))
                .findFirst();

        return companyByCodigo.isPresent() ? companyByCodigo.get(): null;
        
    }
    
    public static Company getCompanyByPrefijo (int prefijo){
        
        Optional<Company> companyByPrefijo = lstCompanys.stream()
                .filter(a-> a.getPrefijo()==prefijo)
                .findFirst();

        return companyByPrefijo.isPresent() ? companyByPrefijo.get(): null;
        
    }
    
    public static void addCompany (Company comp){
        lstCompanys.add(comp);
    }
    
    public static void deleteCompany (int prefijo){
        // Usamos el prefijo para borrar la compañia. Para esto buscamos la compañia que tenga el prefijo y a continuacion la borramos
        Company comp = getCompanyByPrefijo(prefijo);
        lstCompanys.remove(comp);
    }
    
    public static void updateCompany (Company oldcomp, Company newcomp){
        Company actual= getCompanyByPrefijo(oldcomp.getPrefijo());
        actual.setDireccion(newcomp.getDireccion());
        actual.setcodigoMunicipio(newcomp.getcodigoMunicipio());
        actual.setNombre(newcomp.getNombre());
        actual.setTelefonoAeropuerto(newcomp.getTelefonoAeropuerto());
        actual.setTelefonoPasajero(newcomp.getTelefonoPasajero());
    }
    
    
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Vuelos Base"> 
    public static String getHoraFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(fecha);
    }
    
    public static void leerVueloBase() throws ParseException {
        try {
            String l;
            String[] leer;
            SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
            FileReader file= new FileReader("src/main/resources/vueloBase.csv");
            BufferedReader br = new BufferedReader(file);
            while ((l = br.readLine()) != null) {
                leer= l.split(",");
                String codigoVuelo = leer[0];
                String codigoIATAOrigen = leer[1];
                String codigoIATADestino = leer[2];
                int numeroPlazas = Integer.parseInt(leer[3]);
                Date horaSalida = sd.parse(leer[4]);
                Date horaLlegada = sd.parse(leer[5]);
                String diasSemanaVuelo = leer[6];
                VueloBase VueloBase = new VueloBase(codigoVuelo, codigoIATAOrigen, codigoIATADestino, numeroPlazas, horaSalida, horaLlegada, diasSemanaVuelo);
                addVueloBase(VueloBase);
            }

            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void escribirVueloBase(List<VueloBase> Vuelo) {
        try {
            
            FileWriter f = new FileWriter("src/main/resources/vueloBase.csv");
            SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
            
            for (VueloBase VueloBase : Vuelo) {
                f.write(String.valueOf(VueloBase.getCodigoVuelo()));
                f.write(",");
                f.write(VueloBase.getCodigoIATAOrigen());
                f.write(",");
                f.write(VueloBase.getCodigoIATADestino());
                f.write(",");
                f.write(String.valueOf(VueloBase.getNumeroPlazas()));
                f.write(",");
                f.write(sd.format(VueloBase.getHoraSalida()));
                f.write(",");
                f.write(sd.format(VueloBase.getHoraLlegada()));
                f.write(",");
                f.write(VueloBase.getDiasSemanaVuelo());
                f.write("\n");
            }
            
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Se ha escrito el fichero VueloBase.csv");
        
    }
    
    
    private static List<VueloBase> lstVueloBase = new ArrayList<>();
    
    public static List<VueloBase> getAllVueloBase(){
        return lstVueloBase;
    }
            
    
    public static VueloBase getVueloBaseByCodigo (String codigo){
        
        Optional<VueloBase> vueloBaseByCodigo = lstVueloBase.stream()
                .filter(a-> a.getCodigoVuelo().equals(codigo))
                .findFirst();

        return vueloBaseByCodigo.isPresent() ? vueloBaseByCodigo.get(): null;
        
    }
    
    
    public static void addVueloBase (VueloBase VueloBase){
        lstVueloBase.add(VueloBase);
    }
    
    public static void deleteVueloBase (String codigoVuelo){
        // Usamos el prefijo para borrar la compañia. Para esto buscamos la compañia que tenga el prefijo y a continuacion la borramos
        VueloBase VueloBase = getVueloBaseByCodigo(codigoVuelo);
        lstVueloBase.remove(VueloBase);
    }
    
    public static void updateVueloBase (VueloBase oldVueloBase, VueloBase newVueloBase){
        VueloBase actual= getVueloBaseByCodigo(oldVueloBase.getCodigoVuelo());
        
        actual.setCodigoVuelo(newVueloBase.getCodigoVuelo());
        actual.setCodigoIATAOrigen(newVueloBase.getCodigoIATAOrigen());
        actual.setCodigoIATADestino(newVueloBase.getCodigoIATADestino());
        actual.setAeropuertoOrigen(newVueloBase.getAeropuertoOrigen());
        actual.setAeropuertoDestino(newVueloBase.getAeropuertoDestino());
        actual.setNumeroPlazas(newVueloBase.getNumeroPlazas());
        actual.setHoraSalida(newVueloBase.getHoraSalida());
        actual.setHoraLlegada(newVueloBase.getHoraLlegada());
        actual.setDiasSemanaVuelo(newVueloBase.getDiasSemanaVuelo());

    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Vuelos Diarios"> 
    
    
    public static void leerVueloDario() throws ParseException {
        try {
            String l;
            String[] leer;
            SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdH = new SimpleDateFormat("HH:mm");
            FileReader file= new FileReader("src/main/resources/vueloDiario.csv");
            BufferedReader br = new BufferedReader(file);
            while ((l = br.readLine()) != null) {
                leer= l.split(",");
                String codigoVueloBase = leer[0];
                Date fechaVuelo = sdF.parse(leer[1]);
                Date horaSalidaReal = sdH.parse(leer[2]);
                Date horaLegadaReal = sdH.parse(leer[3]);
                int numeroPlazas = Integer.parseInt(leer[4]);
                float precio = Float.parseFloat(leer[5]);
                
                VueloDiario vueloDiario = new VueloDiario(codigoVueloBase, fechaVuelo, horaSalidaReal, horaLegadaReal,numeroPlazas, precio);
                
                addVueloDiario(vueloDiario);
            }

            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void escribirVueloDario(List<VueloDiario> Vuelo) {
        try {
            
            FileWriter f = new FileWriter("src/main/resources/vueloDiario.csv");
            SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdH = new SimpleDateFormat("HH:mm");
            
            for (VueloDiario VueloDiario : Vuelo) {
                f.write(String.valueOf(VueloDiario.getCodigoVueloBase()));
                f.write(",");
                f.write(sdF.format(VueloDiario.getFechaVuelo()));
                f.write(",");
                f.write(sdH.format(VueloDiario.getHoraSalidaReal()));
                f.write(",");
                f.write(sdH.format(VueloDiario.getHoraLegadaReal()));
                f.write(",");
                f.write(String.valueOf(VueloDiario.getNumeroPlazas()));
                f.write(",");
                f.write(String.valueOf(VueloDiario.getPrecio()));
                f.write("\n");
            }
            
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(LogicaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Se ha escrito el fichero vueloDiario.csv");
        
    }
    
    
    private static List<VueloDiario> lstVueloDiario = new ArrayList<>();
    
    // Obtiene toda la coleccion de vuelos diarios
    public static List<VueloDiario> getAllVueloDiario(){
        return lstVueloDiario;
    }
            
    
    public static VueloDiario getVueloDiarioByCodigo (String codigo){
        
        Optional<VueloDiario> vueloDiarioByCodigo = lstVueloDiario.stream()
                .filter(a-> a.getCodigoVueloBase().equals(codigo))
                .findFirst();

        return vueloDiarioByCodigo.isPresent() ? vueloDiarioByCodigo.get(): null;
    }
    
    
    public static void addVueloDiario (VueloDiario vueloDiario){
        lstVueloDiario.add(vueloDiario);
    }
    
    public static void deleteVueloDiario (String codigoVuelo){
        // Usamos el prefijo para borrar la compañia. Para esto buscamos la compañia que tenga el prefijo y a continuacion la borramos
        VueloDiario VueloDiario = getVueloDiarioByCodigo(codigoVuelo);
        lstVueloDiario.remove(VueloDiario);
    }
    
    public static void updateVueloDiario (VueloDiario oldVueloDiario, VueloDiario newVueloDiario){
        VueloDiario actual= getVueloDiarioByCodigo(oldVueloDiario.getCodigoVueloBase());
        
        actual.setCodigoVueloBase(newVueloDiario.getCodigoVueloBase());
        actual.setFechaVuelo(newVueloDiario.getFechaVuelo());
        actual.setHoraSalidaReal(newVueloDiario.getHoraSalidaReal());
        actual.setHoraLegadaReal(newVueloDiario.getHoraLegadaReal());
        actual.setNumeroPlazas(newVueloDiario.getNumeroPlazas());
        actual.setPrecio(newVueloDiario.getPrecio());
        
    }
    
    
    
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Logica de REST"> 

    /**
     *
     * @param codMunicipio
     * @return
     * @throws UnirestException
     */
    public static Temperatura serviceSearch(String codMunicipio) throws UnirestException {
        Temperatura retValue = null;
        
        //Primera llamada al servicio del REST
        //La peticion entera esta formada por dos Arrays, esta seria la primera
        HttpResponse<JsonNode> jsonResponse
                = Unirest.get("https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/" + codMunicipio)
                        .header("accept", "application/json")
                        .queryString("api_key", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJaTUM5NzIxOUBlZHVjYXN0dXIuZXMiLCJqdGkiOiI3OGI2NGVjYi0xMWUwLTQ0YmQtODRkNy1lMDk4NjUzOTFiZjkiLCJpc3MiOiJBRU1FVCIsImlhdCI6MTcwNDk3NzgxNCwidXNlcklkIjoiNzhiNjRlY2ItMTFlMC00NGJkLTg0ZDctZTA5ODY1MzkxYmY5Iiwicm9sZSI6IiJ9.jW836TQiWm1FDGKzB58Hj8L35fHseRBESZbJsiSVGw8")
                        .asJson();
        
        
        // Cogemos la URL de datos
        String nuevaURL = jsonResponse.getBody().getObject().getString("datos");
        
        //Segunda llamada al servicio        
        HttpResponse<JsonNode> finalJsonResponse
                = Unirest.get(nuevaURL)
                        .header("accept", "application/json")
                        .asJson();
        JSONObject raiz_temp = finalJsonResponse.getBody().getArray().getJSONObject(0)
                .getJSONObject("prediccion")
                .getJSONArray("dia")
                .getJSONObject(0)
                .getJSONObject("temperatura");
        
        retValue = new Temperatura(codMunicipio, raiz_temp.getInt("minima"), raiz_temp.getInt("maxima"));
        
        System.out.println("Temperatura Maxima "+retValue.getTempMaxima());
        System.out.println("Temperatura Miima "+retValue.getTempMinima());
        return retValue;
    }

    // </editor-fold> 
}
