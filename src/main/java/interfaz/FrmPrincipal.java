/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;

/**
 *  Interface principal donde puedes gestionar tanto compañias, vuelos base diarios y acceder a los paneles o a la gestion de temperaturas
 * @author jrubioa
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private JFXPanel jfxPanel; 
    private JFrame frame;
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setHelp();
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

        brnVuelosBase = new javax.swing.JButton();
        brnVuelosDiarios = new javax.swing.JButton();
        brnCompany = new javax.swing.JButton();
        brnPanel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mmuAyudaMain = new javax.swing.JMenu();
        mmuAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion del Aeropuerto");
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        brnVuelosBase.setText("Vuelos Base");
        brnVuelosBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnVuelosBaseActionPerformed(evt);
            }
        });
        getContentPane().add(brnVuelosBase);

        brnVuelosDiarios.setText("Vuelos Diarios");
        brnVuelosDiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnVuelosDiariosActionPerformed(evt);
            }
        });
        getContentPane().add(brnVuelosDiarios);

        brnCompany.setText("Compañias");
        brnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCompanyActionPerformed(evt);
            }
        });
        getContentPane().add(brnCompany);

        brnPanel.setText("Temperatura y paneles");
        brnPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPanelActionPerformed(evt);
            }
        });
        getContentPane().add(brnPanel);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * Evento que permite abrir la gestion de campañas del sistema
     */
    private void brnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCompanyActionPerformed
        //new FrmCompany().setVisible(true);
        FrmCompany.getInstance().setVisible(true);
        
    }//GEN-LAST:event_brnCompanyActionPerformed

    /**
     * 
     * Evento que permite abrir la gestion de paneles o temperatura del sistema
     */
    private void brnPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnPanelActionPerformed

        FrmRestTemp temp = new FrmRestTemp();
        temp.setVisible(true);
    }//GEN-LAST:event_brnPanelActionPerformed

    /**
     * 
     * Evento que permite abrir la gestion de vuelos base del sistema
     */
    private void brnVuelosBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnVuelosBaseActionPerformed
        // TODO add your handling code here:
        FrmVuelosBase vuelos = new FrmVuelosBase();
        vuelos.setVisible(true);
    }//GEN-LAST:event_brnVuelosBaseActionPerformed

    /**
     * Permite abrir el menu de ayuda
     */
    private void mmuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmuAyudaActionPerformed
        //Se llama al metodo de abajo con la URL a mostrar
        openWebView("https://educastur-1.gitbook.io/untitled-1/");
    }//GEN-LAST:event_mmuAyudaActionPerformed


    /**
     * 
     * Evento que permite abrir la gestion de vuelos diarios del sistema
     */
    private void brnVuelosDiariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnVuelosDiariosActionPerformed
        // TODO add your handling code here:
        FrmVuelosDiarios vuelos = new FrmVuelosDiarios();
        vuelos.setVisible(true);
    }//GEN-LAST:event_brnVuelosDiariosActionPerformed

    /**
     * Metodo que permite abrir la URL de ayuda
     * @param url que se abre en el menu de ayuda
     */
    private void openWebView(String url) { 
            Platform.runLater(() -> { 
            WebView webView = new WebView(); 
            WebEngine webEngine = webView.getEngine();
            webEngine.load(url); 
            jfxPanel.setScene(new Scene(webView)); 
            frame.setVisible(true); 
        }); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCompany;
    private javax.swing.JButton brnPanel;
    private javax.swing.JButton brnVuelosBase;
    private javax.swing.JButton brnVuelosDiarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mmuAyuda;
    private javax.swing.JMenu mmuAyudaMain;
    // End of variables declaration//GEN-END:variables
}
