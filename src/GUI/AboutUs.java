package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AboutUs extends javax.swing.JFrame {

    public AboutUs() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAboutUsToHome = new javax.swing.JButton();
        btnAboutUsToService = new javax.swing.JButton();
        btnBookNowAboutUsToFromBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/8.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnAboutUsToHome.setText("home");
        btnAboutUsToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAboutUsToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 100, 50));

        btnAboutUsToService.setText("service");
        btnAboutUsToService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsToServiceActionPerformed(evt);
            }
        });
        getContentPane().add(btnAboutUsToService, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 140, 50));

        btnBookNowAboutUsToFromBooking.setText("booknow");
        btnBookNowAboutUsToFromBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNowAboutUsToFromBookingActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookNowAboutUsToFromBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, 240, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutUsToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsToHomeActionPerformed
        Home aboutustohome = new Home();
        aboutustohome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAboutUsToHomeActionPerformed

    private void btnAboutUsToServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsToServiceActionPerformed
        Service aboutustoservice = new Service();
        aboutustoservice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAboutUsToServiceActionPerformed

    private void btnBookNowAboutUsToFromBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNowAboutUsToFromBookingActionPerformed
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
                FormBooking booknowaboutustoformbooking = new FormBooking();
                booknowaboutustoformbooking.setVisible(true);
                this.dispose();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnBookNowAboutUsToFromBookingActionPerformed

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUsToHome;
    private javax.swing.JButton btnAboutUsToService;
    private javax.swing.JButton btnBookNowAboutUsToFromBooking;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
