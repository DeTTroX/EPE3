/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import BaseDeDatos.Gestion;
import java.sql.DriverManager;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
/**
 *
 * @author DeTTroX
 */
public class updateEstado extends javax.swing.JFrame {

    Gestion g;
    public updateEstado() {
        initComponents();
        g=new Gestion();
        configurarRBEstado2();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());
    }

     private void configurarRBEstado2(){

    ButtonGroup alertas = new ButtonGroup();
    alertas.add(viejo2);
    alertas.add(rest2);
    alertas.add(total2);
    
    
    rest2.setSelected(true);

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        rest2 = new javax.swing.JRadioButton();
        viejo2 = new javax.swing.JRadioButton();
        total2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("INGRESE EL ID DEL ESTADO QUE DESEA MODIFICAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, -1));

        rest2.setForeground(new java.awt.Color(255, 255, 0));
        rest2.setText("RESTAURADO");
        getContentPane().add(rest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, -1));

        viejo2.setForeground(new java.awt.Color(255, 255, 0));
        viejo2.setText("VIEJO_SIN_MODIFCAR");
        getContentPane().add(viejo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 180, -1));

        total2.setForeground(new java.awt.Color(255, 255, 0));
        total2.setText("TOTAL_CHATARRA");
        getContentPane().add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 180, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ELIJA NUEVA OPCION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fond.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String est="";
        
        
        if(rest2.isSelected())
            est="restaurado";
            if(viejo2.isSelected())
                est="Viejo sin modificar";
                if(total2.isSelected())
                    est="Chatarra total";
        String ide = id.getText();
        
        g.updateDatosEstado(ide, est);
        
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(updateEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rest2;
    private javax.swing.JRadioButton total2;
    private javax.swing.JRadioButton viejo2;
    // End of variables declaration//GEN-END:variables
}