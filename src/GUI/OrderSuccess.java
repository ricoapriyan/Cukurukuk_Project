/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nadya
 */
public class OrderSuccess extends javax.swing.JFrame {
    
    public OrderSuccess() {
        initComponents();
        jCustName.setEditable(false);
        jServiceTime.setEditable(false);
        jOrderCode.setEditable(false);
        jCustName.setBackground(new java.awt.Color(0,0,0,1));
        jServiceTime.setBackground(new java.awt.Color(0,0,0,1));
        jOrderCode.setBackground(new java.awt.Color(0,0,0,1));
        OrderConfirmed();
    }
    
    public void OrderConfirmed() {
        try (BufferedReader reader = new BufferedReader(new FileReader("service_details.txt"))) {
            String line;
            String username = Nama.getInstance().getUsername();
            while ((line = reader.readLine()) != null) {
                String[] elemen = line.split("\\|");
                if(elemen[1].trim().equals(username)){
                    String kode = elemen[0].trim();
                    String time = elemen[3].trim();
                    jCustName.setText(username);
                    jServiceTime.setText(time);
                    jOrderCode.setText(kode);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCustName = new javax.swing.JTextField();
        jServiceTime = new javax.swing.JTextField();
        jOrderCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnHomeOrderSuccessToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCustName.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jCustName.setForeground(new java.awt.Color(191, 17, 114));
        jCustName.setBorder(null);
        getContentPane().add(jCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 500, 40));

        jServiceTime.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jServiceTime.setForeground(new java.awt.Color(191, 17, 114));
        jServiceTime.setBorder(null);
        getContentPane().add(jServiceTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 510, 50));

        jOrderCode.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jOrderCode.setForeground(new java.awt.Color(191, 17, 114));
        jOrderCode.setBorder(null);
        jOrderCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrderCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jOrderCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 510, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/11.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnHomeOrderSuccessToHome.setText("Home");
        btnHomeOrderSuccessToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeOrderSuccessToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomeOrderSuccessToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeOrderSuccessToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeOrderSuccessToHomeActionPerformed
        Home homeordersuccesstohome = new Home();
        homeordersuccesstohome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeOrderSuccessToHomeActionPerformed

    private void jOrderCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrderCodeActionPerformed
        
    }//GEN-LAST:event_jOrderCodeActionPerformed

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
            java.util.logging.Logger.getLogger(OrderSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderSuccess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomeOrderSuccessToHome;
    private javax.swing.JTextField jCustName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jOrderCode;
    private javax.swing.JTextField jServiceTime;
    // End of variables declaration//GEN-END:variables
}
