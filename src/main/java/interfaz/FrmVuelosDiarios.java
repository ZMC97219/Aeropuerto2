/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import datos.VueloDiario;
import javax.swing.JOptionPane;
import logica.LogicaNegocio;
import logica.VuelosBaseModelTable;
import logica.VuelosDiariosModelTable;

/**
 *
 * @author usuario
 */
public class FrmVuelosDiarios extends javax.swing.JFrame {

    // Se utiliza el patron Singleton, con el fin de que se actualice siempre la misma ventana
    //Por tanto se decalara lo siguiente
    // De esta manera si ya esta instanciada, devuelve la misma y en caso de que no este instalaciada (caso null), crearia una nueva
    
    private static FrmVuelosDiarios INSTANCE = null;
    
    public static FrmVuelosDiarios getInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new FrmVuelosDiarios();
        }
        return INSTANCE;
    }
    
    /**
     * Creates new form FrmVuelosDiarios
     */
    public FrmVuelosDiarios() {
        initComponents();
        
        fillTableVuelosDiarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelosBase = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVuelosDarios = new javax.swing.JTable();

        tblVuelosBase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVuelosBase);

        setTitle("GESTION DE VUELOS DIARIOS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnEditar.setText("Editar o Consultar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAnadir.setText("Añadir");
        btnAnadir.setToolTipText("");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblVuelosDarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblVuelosDarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(46, 46, 46)
                        .addComponent(btnAnadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnAnadir)
                    .addComponent(btnEliminar))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        VueloDiario comp_select = LogicaNegocio.getAllVueloDiario().get(tblVuelosDarios.getSelectedRow());

        DlgVuelosDiarios dlgDatosVueloDiario = new DlgVuelosDiarios(this, true, comp_select);
        dlgDatosVueloDiario.setVueloDiario(comp_select);
        dlgDatosVueloDiario.setVisible(true);

        if (dlgDatosVueloDiario.isChange()){
            LogicaNegocio.updateVueloDiario(comp_select, dlgDatosVueloDiario.getVueloDiario());
            fillTableVuelosDiarios();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        DlgVuelosDiarios dlgDatosVueloDiario = new DlgVuelosDiarios(this, true, null);
        dlgDatosVueloDiario.setVisible(true);

        if (dlgDatosVueloDiario.isChange()){
            LogicaNegocio.addVueloDiario(dlgDatosVueloDiario.getVueloDiario());
            this.fillTableVuelosDiarios();
        }
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Nos da dal compañia de la fila selecionada
        VueloDiario comp_select = LogicaNegocio.getAllVueloDiario().get(tblVuelosDarios.getSelectedRow());
        int respuesta_borrado =JOptionPane.showConfirmDialog(this, "¿Desea borrar la fila seleciona? "+comp_select.getCodigoVueloBase(),
            "Borrado de Vuelo Diario ", JOptionPane.YES_NO_OPTION);
        if(respuesta_borrado ==JOptionPane.OK_OPTION){
            LogicaNegocio.deleteVueloDiario(comp_select.getCodigoVueloBase());
        }
        //con el fin de que refrescar la tabla
        fillTableVuelosDiarios();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        LogicaNegocio.escribirVueloDario(LogicaNegocio.getAllVueloDiario());
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVuelosBase;
    private javax.swing.JTable tblVuelosDarios;
    // End of variables declaration//GEN-END:variables

    private void fillTableVuelosDiarios() {
        tblVuelosDarios.setModel(new VuelosDiariosModelTable(LogicaNegocio.getAllVueloDiario()));
        
    }

}
