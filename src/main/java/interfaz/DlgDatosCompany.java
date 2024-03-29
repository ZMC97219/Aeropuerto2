/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz;

import datos.Company;
import datos.Municipio;
import logica.LogicaNegocio;

/**
 * Interface a modificar y añadir compañias en el sistema
 * @author jrubioa
 */
public class DlgDatosCompany extends javax.swing.JDialog {

    private Company company;
    private boolean change = false;
    private boolean isvalid = false;

    public boolean isChange() {
        return change;
    }
    /**
     * Contructor
     * Creates new form DlgDatosCompany
     */
    public DlgDatosCompany(java.awt.Frame parent, boolean modal, Company company ) {
        super(parent, modal);
        initComponents();
        this.company=company;
        this.txtCodigo.setText(this.company.getCodigo());
        this.txtDireccion.setText(this.company.getDireccion());
        this.txtNombre.setText(this.company.getNombre());
        this.txtPrefijo.setText(String.valueOf(this.company.getPrefijo()));
        this.txtTelAeropuerto.setText(this.company.getTelefonoAeropuerto());
        this.txtTelUsuario.setText(this.company.getTelefonoPasajero());
        
        
        LogicaNegocio.getAllMunicipios().forEach(m->this.cbMunicipios.addItem(m));
        
        // Caso de que se añada una nueva compañia
        if(company == null || company.getCodigo().isBlank()){
            btnGuardar.setEnabled(true);
            setControlState(true);
            
        }else{
            btnGuardar.setEnabled(true);
            setControlState(true);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbMunicipios = new javax.swing.JComboBox<>();
        txtTelUsuario = new javax.swing.JTextField();
        txtTelAeropuerto = new javax.swing.JTextField();
        txtPrefijo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Prefijo");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        jLabel5.setText("Municipio");

        jLabel6.setText("Telefono del usuario");

        jLabel7.setText("Telefono del Aeropuerto");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Cancelar/salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnGuardar)
                        .addGap(118, 118, 118)
                        .addComponent(btnSalir))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrefijo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cbMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que sale de este formularios sin realizar cambios
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        this.change = false;
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * Evento que guarda los datos  de este formularios
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        this.validate();
        //this.isvalid=true;
        if(isvalid){
            this.change = true;
            // Se modifican los datos anteriores
            // Ademas se controla si la compañia es nula o no
            if (this.company == null){
                this.company = new Company();
            }
            this.company.setCodigo(txtCodigo.getText());
            this.company.setDireccion(txtDireccion.getText());
            this.company.setNombre(txtNombre.getText());
            this.company.setPrefijo(Integer.parseInt(txtPrefijo.getText()));
            this.company.setTelefonoAeropuerto(txtTelAeropuerto.getText());
            this.company.setTelefonoPasajero(txtTelUsuario.getText());
            Municipio m = (Municipio)cbMunicipios.getSelectedItem();
            this.company.setcodigoMunicipio(m.codigo());
            
        }else{
            this.change = false;
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * Metodo get de la compañia
     * @return Devuelve la compañia
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Metodo set de la compañia
     * @param company asigna la compañia
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Municipio> cbMunicipios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrefijo;
    private javax.swing.JTextField txtTelAeropuerto;
    private javax.swing.JTextField txtTelUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que se usa para desabilitar o habilitar controles
     * @param state puede ser true o false en funcion si se quiere habilitar o no
     */
    private void setControlState(boolean state) {
        this.txtCodigo.setEditable(state);
        this.txtPrefijo.setEditable(state);
        this.txtDireccion.setEditable(state);
        this.txtNombre.setEditable(state);
        this.txtTelAeropuerto.setEditable(state);
        this.txtTelUsuario.setEditable(state);
        this.cbMunicipios.setEditable(state);
        
    }
    
    /**
     * Metodo que realiza la validacion antes de guardar los cambios
     */
    public void validate(){
        
        super.validate();
        int prefijo = txtPrefijo.getText().equals("") ? -1 :Integer.parseInt(txtPrefijo.getText());
        
        
        if(LogicaNegocio.getCompanyByPrefijo(prefijo)!= null 
            || LogicaNegocio.getCompanyByCodigo(txtCodigo.getText())!= null){
             isvalid=false;
            
        }else{
            isvalid=true;
        }
        
    }
}
