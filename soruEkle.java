/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class soruEkle extends javax.swing.JFrame {
  
    /**
     * Creates new form soruEkle
     */
    public soruEkle() {
        initComponents();
        
        
    }
public void populateArrayList(){
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butonKaydet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        soruEkleText = new javax.swing.JTextField();
        cevapEkleText = new javax.swing.JTextField();
        arkaPlan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(775, 551));
        setSize(new java.awt.Dimension(775, 551));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Soru :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(44, 178, 139, 43);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Sorularınızı buradan ekleyebilirsiniz");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(44, 60, 684, 69);

        butonKaydet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        butonKaydet.setForeground(new java.awt.Color(51, 51, 51));
        butonKaydet.setText("Kaydet");
        butonKaydet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        butonKaydet.setContentAreaFilled(false);
        butonKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonKaydetActionPerformed(evt);
            }
        });
        getContentPane().add(butonKaydet);
        butonKaydet.setBounds(290, 430, 143, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cevap :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 270, 139, 43);
        getContentPane().add(soruEkleText);
        soruEkleText.setBounds(188, 190, 454, 20);
        getContentPane().add(cevapEkleText);
        cevapEkleText.setBounds(188, 282, 454, 20);

        arkaPlan.setBackground(new java.awt.Color(239, 235, 224));
        arkaPlan.setForeground(new java.awt.Color(239, 235, 224));
        arkaPlan.setOpaque(true);
        getContentPane().add(arkaPlan);
        arkaPlan.setBounds(1, 6, 780, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonKaydetActionPerformed
       if(soruEkleText.getText().isEmpty()|| cevapEkleText.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Lutfen her boslugu doldurun");
       }
       else{
         String soru = soruEkleText.getText();
        String cevap = cevapEkleText.getText();
        CreateFile a = new CreateFile();
           try {
               a.olusturVeYaz(soru,cevap);
               soruEkleText.setText("");
               cevapEkleText.setText("");
               
               
           } catch (IOException ex) {
               Logger.getLogger(soruEkle.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        
        
        
    }//GEN-LAST:event_butonKaydetActionPerformed

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
            java.util.logging.Logger.getLogger(soruEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soruEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soruEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soruEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soruEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel arkaPlan;
    private javax.swing.JButton butonKaydet;
    private javax.swing.JTextField cevapEkleText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField soruEkleText;
    // End of variables declaration//GEN-END:variables
}