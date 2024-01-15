/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;


import datos.Temperatura;
import java.awt.Dimension;


import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import logica.LogicaNegocio;

/**
 *
 * @author usuario
 */
public class FrmRestTemp extends javax.swing.JFrame {

    private JFXPanel jfxPanel; 
    private JFrame frame;
    /**
     * Creates new form FrmRestTemp
     */
    public FrmRestTemp() {
        initComponents();
        setHelp();
        txtError.setEnabled(false);
    }
    
    
    private void setHelp() { 
        jfxPanel = new JFXPanel(); 
        frame = new JFrame("Ayuda"); 
        frame.setSize(new Dimension(500, 500)); 
        frame.add(jfxPanel); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTempMax = new javax.swing.JTextField();
        txtTempMin = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        btnPanel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mmuAyudaMain = new javax.swing.JMenu();
        mmuAyuda = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setTitle("Gestion de Temperturas");

        jLabel1.setText("Por favor, inserta un codigo de municipio (Ej: 28079)");

        btnBuscar.setText("Buscar API");
        btnBuscar.setToolTipText("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("TempMax:");

        jLabel3.setText("TempMin:");

        btnPanel.setText("PANEL DE SALIDAS");

        mmuAyudaMain.setText("Ayuda");

        mmuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mmuAyuda.setText("Ayuda principal");
        mmuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmuAyudaActionPerformed(evt);
            }
        });
        mmuAyudaMain.add(mmuAyuda);

        jMenuBar1.add(mmuAyudaMain);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTempMin, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(txtTempMax)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtError)
                    .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtTempMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTempMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPanel)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

            
        try {
            txtError.setText(" ");
            Temperatura c = LogicaNegocio.serviceSearch(txtBusqueda.getText());
            txtTempMax.setText(String.valueOf(c.getTempMaxima()));
            txtTempMin.setText(String.valueOf(c.getTempMinima()));
            txtError.setEnabled(false);
            
        } catch (Exception ex) {
            txtError.setEnabled(true);
            txtError.setText("Inserta un codigo de municipio correcto. Gracias");
            //Logger.getLogger(FrmRestTemp.class.getName()).log(Level.SEVERE, null, ex);
        }


        

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mmuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmuAyudaActionPerformed
        //Se llama al metodo de abajo con la URL a mostrar
        openWebView("https://educastur-1.gitbook.io/llamada-a-la-api-servicios-rest-de-la-aemet/");
    }//GEN-LAST:event_mmuAyudaActionPerformed

    // Basicamente esto es para que carge la pagina URL
    private void openWebView(String url) { 
            Platform.runLater(() -> { 
            WebView webView = new WebView(); 
            WebEngine webEngine = webView.getEngine(); 
            webEngine.load(url); 
            jfxPanel.setScene(new Scene(webView)); 
            frame.setVisible(true); 
        }); 
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mmuAyuda;
    private javax.swing.JMenu mmuAyudaMain;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtTempMax;
    private javax.swing.JTextField txtTempMin;
    // End of variables declaration//GEN-END:variables
}