package GUI;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormBooking extends javax.swing.JFrame {
    
    
    public FormBooking() {
        initComponents();
        jCustName.setEditable(false);
        jCustName.setBackground(new java.awt.Color(0,0,0,1));
        jCustPhone.setBackground(new java.awt.Color(0,0,0,1));
        String username = Nama.getInstance().getUsername();
        jCustName.setText(username);
        setName(username);
    }
    
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCustName = new javax.swing.JTextField();
        jServiceTime = new javax.swing.JComboBox<>();
        jCustPhone = new javax.swing.JTextField();
        jCutWashKid = new javax.swing.JCheckBox();
        jCutWashAdt = new javax.swing.JCheckBox();
        jHairShampoo = new javax.swing.JCheckBox();
        jBeardMoustTrim = new javax.swing.JCheckBox();
        jBleachColor = new javax.swing.JCheckBox();
        jRebondSmooth = new javax.swing.JCheckBox();
        jHairPerming = new javax.swing.JCheckBox();
        jStylePomade = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnNextToOrderSummary = new javax.swing.JButton();
        btnFormBookingToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCustName.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jCustName.setForeground(new java.awt.Color(191, 17, 114));
        jCustName.setBorder(null);
        jCustName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCustNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCustNameFocusLost(evt);
            }
        });
        jCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustNameActionPerformed(evt);
            }
        });
        getContentPane().add(jCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 700, 40));

        jServiceTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jServiceTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(pilih waktu)", "10.00", "10.30", "11.00", "11.30", "12.00", "12.30", "13.00", "13.30", "14.00", "14.30", "15.00", "15.30", "16.00", "16.30", "17.00", "17.30", "18.00", "18.30", "19.00", "19.30", "20.00", "20.30", "21.00", "21.30" }));
        getContentPane().add(jServiceTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 580, 40));

        jCustPhone.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jCustPhone.setForeground(new java.awt.Color(191, 17, 114));
        jCustPhone.setBorder(null);
        jCustPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCustPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(jCustPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 700, 40));

        jCutWashKid.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jCutWashKid.setForeground(new java.awt.Color(191, 17, 114));
        jCutWashKid.setText("CUT AND WASH FOR KID");
        jCutWashKid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCutWashKidActionPerformed(evt);
            }
        });
        getContentPane().add(jCutWashKid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jCutWashAdt.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jCutWashAdt.setForeground(new java.awt.Color(191, 17, 114));
        jCutWashAdt.setText("CUT AND WASH FOR ADULT");
        getContentPane().add(jCutWashAdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jHairShampoo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jHairShampoo.setForeground(new java.awt.Color(191, 17, 114));
        jHairShampoo.setText("HAIR SHAMPOO");
        getContentPane().add(jHairShampoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        jBeardMoustTrim.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jBeardMoustTrim.setForeground(new java.awt.Color(191, 17, 114));
        jBeardMoustTrim.setText("BEARD AND MOUSTACHE TRIM");
        getContentPane().add(jBeardMoustTrim, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jBleachColor.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jBleachColor.setForeground(new java.awt.Color(191, 17, 114));
        jBleachColor.setText("BLEACHING AND COLORING");
        getContentPane().add(jBleachColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, -1, -1));

        jRebondSmooth.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jRebondSmooth.setForeground(new java.awt.Color(191, 17, 114));
        jRebondSmooth.setText("REBONDING AND SMOOTHING");
        getContentPane().add(jRebondSmooth, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, -1, -1));

        jHairPerming.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jHairPerming.setForeground(new java.awt.Color(191, 17, 114));
        jHairPerming.setText("HAIR PERMING");
        getContentPane().add(jHairPerming, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        jStylePomade.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jStylePomade.setForeground(new java.awt.Color(191, 17, 114));
        jStylePomade.setText("STYLING POMADE");
        getContentPane().add(jStylePomade, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/9.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnNextToOrderSummary.setText("next");
        btnNextToOrderSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextToOrderSummaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextToOrderSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, 120, 40));

        btnFormBookingToHome.setText("home");
        btnFormBookingToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormBookingToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnFormBookingToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 250, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormBookingToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormBookingToHomeActionPerformed
        Home hometoaboutus = new Home();
        hometoaboutus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFormBookingToHomeActionPerformed
    
    private void btnNextToOrderSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextToOrderSummaryActionPerformed

        String phone = jCustPhone.getText();
        String time = jServiceTime.getSelectedItem().toString();
        String price = "";
        int total = 0;
        String service = "";
        
        if(jCutWashKid.isSelected()){
            service = "CUT AND WASH FOR KID,50000/";
            total += 50000;
        }
        if(jCutWashAdt.isSelected()){
            service += "CUT AND WASH FOR ADULT,80000/";
            total += 80000;
        }
        if(jHairShampoo.isSelected()){
            service += "HAIR SHAMPOO,20000/";
            total += 20000;
        }
        if(jBeardMoustTrim.isSelected()){
            service += "BEARD AND MOUSTACHE TRIM,25000/";
            total += 25000;
        }
        if(jBleachColor.isSelected()){
            service += "BLEACHING AND COLORING,250000/";
            total += 250000;
        }
        if(jRebondSmooth.isSelected()){
            service += "REBONDING AND SMOOTHING,200000/";
            total += 200000;
        }
        if(jHairPerming.isSelected()){
            service += "HAIR PERMING,200000/";
            total += 200000;
        }
        if(jStylePomade.isSelected()){
            service += "STYLING POMADE,20000/";
            total += 20000;
        }
        
        KodePesanan code = new KodePesanan();
        String kode = code.kodePesanan();
        String nama = getName();
        String filePath = "service_details.txt";
      
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, true))) {
            pw.println(kode + "|" + nama + "|" + phone + "|" + time + "|" + service + "|" + total);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        OrderSummary nexttoordersummary = new OrderSummary();
        nexttoordersummary.setVisible(true);
        nexttoordersummary.setCustomerInfo(nama, phone, time, total, kode);
        this.dispose();
        
    }//GEN-LAST:event_btnNextToOrderSummaryActionPerformed

    private void jCutWashKidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCutWashKidActionPerformed
        
    }//GEN-LAST:event_jCutWashKidActionPerformed

    private void jCustPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCustPhoneKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jCustPhoneKeyTyped

    private void jCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCustNameActionPerformed

    private void jCustNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCustNameFocusLost
        
    }//GEN-LAST:event_jCustNameFocusLost

    private void jCustNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCustNameFocusGained
        
    }//GEN-LAST:event_jCustNameFocusGained

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
            java.util.logging.Logger.getLogger(FormBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormBookingToHome;
    private javax.swing.JButton btnNextToOrderSummary;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jBeardMoustTrim;
    private javax.swing.JCheckBox jBleachColor;
    private javax.swing.JTextField jCustName;
    private javax.swing.JTextField jCustPhone;
    private javax.swing.JCheckBox jCutWashAdt;
    private javax.swing.JCheckBox jCutWashKid;
    private javax.swing.JCheckBox jHairPerming;
    private javax.swing.JCheckBox jHairShampoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jRebondSmooth;
    private javax.swing.JComboBox<String> jServiceTime;
    private javax.swing.JCheckBox jStylePomade;
    // End of variables declaration//GEN-END:variables
}
