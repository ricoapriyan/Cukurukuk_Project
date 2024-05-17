/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.table.JTableHeader;

/**
 *
 * @author nadya
 */
public class OrderSummary extends javax.swing.JFrame {

    /**
     * Creates new form OrderSummary
     */
    public OrderSummary() {
        initComponents();
        jCustName.setEditable(false);
        jCustPhone.setEditable(false);
        jTotalOrder.setEditable(false);
        jCustName.setBackground(new java.awt.Color(0,0,0,1));
        jCustPhone.setBackground(new java.awt.Color(0,0,0,1));
        jTotalOrder.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    public void setCustomerInfo(String name, String phone, String time, int total, String kode){
        jCustName.setText(name);
        jCustPhone.setText(phone);
        jTotalOrder.setText(String.valueOf(total));
        setCustomerServices(kode);
        setName(name);
        setTime(time);
        setKode(kode);
        
    }
    
    String name, time, kode;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setCustomerServices(String orderCode){
        DefaultTableModel tabel = (DefaultTableModel)jServiceTable.getModel();
        try (BufferedReader reader = new BufferedReader(new FileReader("service_details.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elemen = line.split("\\|");
                if(elemen[0].trim().equals(orderCode)){
                    String sp = elemen[4].trim();
                    String[] servicePrice = sp.split("/");
                    for (String serviceHarga : servicePrice) {
                        String[] parts = serviceHarga.split(",");
                        String service = parts[0].trim();
                        String harga = parts[1].trim();
                        tabel.addRow(new Object[]{service, harga});
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTotalOrder = new javax.swing.JTextField();
        jCustName = new javax.swing.JTextField();
        jCustPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jServiceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnOrderToOrderSuccess = new javax.swing.JButton();
        btnPreviousToFormBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTotalOrder.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jTotalOrder.setForeground(new java.awt.Color(191, 17, 114));
        jTotalOrder.setBorder(null);
        getContentPane().add(jTotalOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 360, 40));

        jCustName.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jCustName.setForeground(new java.awt.Color(191, 17, 114));
        jCustName.setBorder(null);
        jCustName.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCustNameComponentShown(evt);
            }
        });
        jCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustNameActionPerformed(evt);
            }
        });
        getContentPane().add(jCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 700, 40));

        jCustPhone.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jCustPhone.setForeground(new java.awt.Color(191, 17, 114));
        jCustPhone.setBorder(null);
        jCustPhone.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCustPhoneComponentShown(evt);
            }
        });
        jCustPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(jCustPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 700, 40));

        jServiceTable.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Services", "Price"
            }
        ));
        jServiceTable.setRowHeight(30);
        jServiceTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jServiceTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jServiceTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 910, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/10.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnOrderToOrderSuccess.setText("Order");
        btnOrderToOrderSuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderToOrderSuccessActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrderToOrderSuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 190, 60));

        btnPreviousToFormBooking.setText("Previous");
        btnPreviousToFormBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousToFormBookingActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreviousToFormBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 170, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousToFormBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousToFormBookingActionPerformed
        String serviceTable = "service_details.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(serviceTable));
                BufferedWriter bw = new BufferedWriter(new FileWriter("tempFile.txt", true));
                PrintWriter pw = new PrintWriter(bw)) {

               String currentLine;
               while ((currentLine = br.readLine()) != null) {
                   String[] elements = currentLine.split("\\|");
                   String kode = elements[0].trim();

                   if (!kode.equals(getKode())) {
                       pw.println(currentLine);
                   }
               }
            } catch (IOException ex) {
                ex.printStackTrace();
        }

        File originalFile = new File(serviceTable);
        File tempFileObj = new File("tempFile.txt");
        originalFile.delete();
        tempFileObj.renameTo(originalFile);

        FormBooking previoustoformbooking = new FormBooking();
        previoustoformbooking.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPreviousToFormBookingActionPerformed
    
    private void btnOrderToOrderSuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderToOrderSuccessActionPerformed
        OrderSuccess ordertoordersuccess = new OrderSuccess();
        ordertoordersuccess.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderToOrderSuccessActionPerformed
    
    private void jCustPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustPhoneActionPerformed
        
    }//GEN-LAST:event_jCustPhoneActionPerformed

    private void jCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustNameActionPerformed
       
    }//GEN-LAST:event_jCustNameActionPerformed

    private void jCustNameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCustNameComponentShown
        
    }//GEN-LAST:event_jCustNameComponentShown

    private void jCustPhoneComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCustPhoneComponentShown

    }//GEN-LAST:event_jCustPhoneComponentShown

    private void jServiceTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jServiceTableComponentShown
        
    }//GEN-LAST:event_jServiceTableComponentShown

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
            java.util.logging.Logger.getLogger(OrderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderSummary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderToOrderSuccess;
    private javax.swing.JButton btnPreviousToFormBooking;
    private javax.swing.JTextField jCustName;
    private javax.swing.JTextField jCustPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jServiceTable;
    private javax.swing.JTextField jTotalOrder;
    // End of variables declaration//GEN-END:variables
}
