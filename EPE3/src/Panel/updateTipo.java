/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import javax.swing.ButtonGroup;
import BaseDeDatos.Gestion;
/**
 *
 * @author DeTTroX
 */
public class updateTipo extends javax.swing.JFrame {

     Gestion  g;
    
    public updateTipo() {
        initComponents();
        configurarRBTipo();
         g = new Gestion();
    }
    private void configurarRBTipo(){

    ButtonGroup tipo = new ButtonGroup();
    tipo.add(avion);
    tipo.add(tanque);
    tipo.add(barco);
    
    avion.setSelected(true);

}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avion = new javax.swing.JRadioButton();
        tanque = new javax.swing.JRadioButton();
        barco = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        avion.setForeground(new java.awt.Color(255, 255, 0));
        avion.setText("AVION");
        getContentPane().add(avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, -1));

        tanque.setForeground(new java.awt.Color(255, 255, 0));
        tanque.setText("TANQUE");
        getContentPane().add(tanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        barco.setForeground(new java.awt.Color(255, 255, 0));
        barco.setText("BARCO");
        getContentPane().add(barco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("INGRESE EL ID DEL TIPO QUE DESEA MODIFICAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ELIJA NUEVO TIPO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jButton1.setText("ACEPAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 250, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fond.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ID1=Integer.parseInt(id.getText());
        String ID2="";
        
        if (avion.isSelected())
            ID2="Avion";
            if (tanque.isSelected())
                ID2="Tanque";
                if(barco.isSelected())
                    ID2="Barco";
                
                g.updateDatosTipo(ID1,ID2);
                
                dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(updateTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton avion;
    private javax.swing.JRadioButton barco;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton tanque;
    // End of variables declaration//GEN-END:variables
}
