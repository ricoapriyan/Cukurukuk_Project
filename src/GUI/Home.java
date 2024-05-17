package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        btnHomeToAboutUs = new javax.swing.JButton();
        btnHomeToService = new javax.swing.JButton();
        btnLogoutHomeToFirstUI = new javax.swing.JButton();
        btnBookNowHomeToFormBooking = new javax.swing.JButton();
        btnYourOrderHomeToOrderSuccess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/6.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnHomeToAboutUs.setText("About Us");
        btnHomeToAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeToAboutUsActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomeToAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 140, 50));

        btnHomeToService.setText("Services");
        btnHomeToService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeToServiceActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomeToService, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 140, 50));

        btnLogoutHomeToFirstUI.setBackground(new java.awt.Color(242, 84, 103));
        btnLogoutHomeToFirstUI.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnLogoutHomeToFirstUI.setForeground(new java.awt.Color(255, 255, 255));
        btnLogoutHomeToFirstUI.setText("Log Out");
        btnLogoutHomeToFirstUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutHomeToFirstUIActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogoutHomeToFirstUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 250, 60));

        btnBookNowHomeToFormBooking.setBackground(new java.awt.Color(242, 84, 103));
        btnBookNowHomeToFormBooking.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnBookNowHomeToFormBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnBookNowHomeToFormBooking.setText("Book Now!");
        btnBookNowHomeToFormBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNowHomeToFormBookingActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookNowHomeToFormBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 250, 60));

        btnYourOrderHomeToOrderSuccess.setBackground(new java.awt.Color(242, 84, 103));
        btnYourOrderHomeToOrderSuccess.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnYourOrderHomeToOrderSuccess.setForeground(new java.awt.Color(255, 255, 255));
        btnYourOrderHomeToOrderSuccess.setText("Your Order!");
        btnYourOrderHomeToOrderSuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYourOrderHomeToOrderSuccessActionPerformed(evt);
            }
        });
        getContentPane().add(btnYourOrderHomeToOrderSuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 250, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeToServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeToServiceActionPerformed
        Service hometoservice = new Service();
        hometoservice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeToServiceActionPerformed

    private void btnHomeToAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeToAboutUsActionPerformed
        AboutUs hometoaboutus = new AboutUs();
        hometoaboutus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeToAboutUsActionPerformed

    private void btnBookNowHomeToFormBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNowHomeToFormBookingActionPerformed
        try (BufferedReader br = new BufferedReader(new FileReader("service_details.txt"))) {
            String line;
            String username = Nama.getInstance().getUsername();
            boolean usernameFound = false;

            while ((line = br.readLine()) != null) {
                String[] details = line.split("\\|");
                if (details.length >= 2 && details[1].equals(username)) {
                    usernameFound = true;
                    break;
                }
            }

            if (usernameFound) {
                JOptionPane.showMessageDialog(null, "Anda sudah memesan layanan ini sebelumnya.",
                        "Warning", JOptionPane.OK_OPTION);
            } else {
                FormBooking booknowhometoformbooking = new FormBooking();
                booknowhometoformbooking.setVisible(true);
                this.dispose();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnBookNowHomeToFormBookingActionPerformed

    private void btnLogoutHomeToFirstUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutHomeToFirstUIActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to LOG OUT?", "Select", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            FirstUI hometofirstui = new FirstUI();
            hometofirstui.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutHomeToFirstUIActionPerformed

    private void btnYourOrderHomeToOrderSuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYourOrderHomeToOrderSuccessActionPerformed
        try (BufferedReader br = new BufferedReader(new FileReader("service_details.txt"))) {
            String line;
            String username = Nama.getInstance().getUsername();
            boolean usernameFound = false;

            while ((line = br.readLine()) != null) {
                String[] details = line.split("\\|");
                if (details.length >= 2 && details[1].equals(username)) {
                    usernameFound = true;
                    break;
                }
            }

            if (!(usernameFound)) {
                JOptionPane.showMessageDialog(null, "Anda belum melakukan pemesanan.",
                        "Warning", JOptionPane.OK_OPTION);
            } else {
                OrderSuccess yourorderhometoordersuccess = new OrderSuccess();
                yourorderhometoordersuccess.OrderConfirmed();
                yourorderhometoordersuccess.setVisible(true);
                this.dispose();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnYourOrderHomeToOrderSuccessActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookNowHomeToFormBooking;
    private javax.swing.JButton btnHomeToAboutUs;
    private javax.swing.JButton btnHomeToService;
    private javax.swing.JButton btnLogoutHomeToFirstUI;
    private javax.swing.JButton btnYourOrderHomeToOrderSuccess;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
