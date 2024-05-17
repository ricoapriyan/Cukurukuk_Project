/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nadya
 */
public class AdminQueue extends javax.swing.JFrame {

    /**
     * Creates new form AdminQueue
     */
    public AdminQueue() {
    initComponents();
    DefaultTableModel tabel = (DefaultTableModel)jQueueTable.getModel();
    showQueue(tabel);
    }
    
    String serviceTable = "service_details.txt";
    
    public void showQueue(DefaultTableModel tabel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(serviceTable))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elemen = line.split("\\|");
                String nama = elemen[1].trim();
                String phone = elemen[2].trim();
                String time = elemen[3].trim();
                String sp = elemen[4].trim();
                String[] servicePrice = sp.split("/");
                String kode = elemen[0].trim();
                String total = elemen[5].trim();

                StringBuilder serviceStringBuilder = new StringBuilder();

                for (String serviceHarga : servicePrice) {
                    String[] parts = serviceHarga.split(",");
                    String service = parts[0].trim();
                    String harga = parts[1].trim();
                    serviceStringBuilder.append(service).append(", ");
                }

                if (serviceStringBuilder.length() > 0) {
                    serviceStringBuilder.setLength(serviceStringBuilder.length() - 2);
                }

                Object[] row = new Object[]{
                    kode,
                    nama,
                    phone,
                    serviceStringBuilder.toString(),
                    total,
                    time
                };

                tabel.addRow(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jQueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteFromQueue = new javax.swing.JButton();
        btnHomeAdminQueueToAdminHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jQueueTable.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jQueueTable.setForeground(new java.awt.Color(191, 17, 114));
        jQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Code", "Name", "Phone No.", "Order(s)", "Payment", "Time"
            }
        ));
        jQueueTable.setRowHeight(30);
        jScrollPane1.setViewportView(jQueueTable);
        if (jQueueTable.getColumnModel().getColumnCount() > 0) {
            jQueueTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            jQueueTable.getColumnModel().getColumn(1).setPreferredWidth(12);
            jQueueTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            jQueueTable.getColumnModel().getColumn(3).setPreferredWidth(350);
            jQueueTable.getColumnModel().getColumn(4).setPreferredWidth(10);
            jQueueTable.getColumnModel().getColumn(5).setPreferredWidth(6);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 1020, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/13.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnDeleteFromQueue.setText("Delete From Queue");
        btnDeleteFromQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFromQueueActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteFromQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, 210, 60));

        btnHomeAdminQueueToAdminHome.setText("Home");
        btnHomeAdminQueueToAdminHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAdminQueueToAdminHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomeAdminQueueToAdminHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeAdminQueueToAdminHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAdminQueueToAdminHomeActionPerformed
        AdminHome homeadminqueuetoadminhome = new AdminHome();
        homeadminqueuetoadminhome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeAdminQueueToAdminHomeActionPerformed

    private void btnDeleteFromQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFromQueueActionPerformed
        int selectedRow = jQueueTable.getSelectedRow();

        if (selectedRow != -1) { 
            String orderCode = jQueueTable.getValueAt(selectedRow, 0).toString();

            try (BufferedReader br = new BufferedReader(new FileReader(serviceTable));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("tempFile.txt", true));
                 PrintWriter pw = new PrintWriter(bw)) {

                String currentLine;
                while ((currentLine = br.readLine()) != null) {
                    String[] elements = currentLine.split("\\|");
                    String kode = elements[0].trim();

                    if (!kode.equals(orderCode)) {
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

            // Refresh the table
            DefaultTableModel tabel = (DefaultTableModel) jQueueTable.getModel();
            tabel.setRowCount(0);
            showQueue(tabel);
        }
    }//GEN-LAST:event_btnDeleteFromQueueActionPerformed

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
            java.util.logging.Logger.getLogger(AdminQueue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminQueue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminQueue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminQueue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminQueue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteFromQueue;
    private javax.swing.JButton btnHomeAdminQueueToAdminHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jQueueTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
