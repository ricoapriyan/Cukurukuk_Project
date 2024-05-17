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

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        jUsernameField1.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordField1.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUsernameField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnLoginToSignUp = new javax.swing.JButton();
        btnLoginToHome = new javax.swing.JButton();
        btnCloseLoginToFirstUI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUsernameField1.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jUsernameField1.setForeground(new java.awt.Color(191, 17, 114));
        jUsernameField1.setBorder(null);
        getContentPane().add(jUsernameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 320, 40));

        jPasswordField1.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(191, 17, 114));
        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 320, 40));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 17, 114));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnLoginToSignUp.setBackground(new java.awt.Color(242, 84, 103));
        btnLoginToSignUp.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnLoginToSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginToSignUp.setText("Sign Up?");
        btnLoginToSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginToSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginToSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 160, 60));

        btnLoginToHome.setBackground(new java.awt.Color(242, 84, 103));
        btnLoginToHome.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnLoginToHome.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginToHome.setText("Log In");
        btnLoginToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 120, 60));

        btnCloseLoginToFirstUI.setText("close");
        btnCloseLoginToFirstUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseLoginToFirstUIActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloseLoginToFirstUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 90, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnLoginToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginToHomeActionPerformed
        String username = jUsernameField1.getText();
        String password = jPasswordField1.getText();
        
        File userDataFile = new File("userdata.txt");
        if (!userDataFile.exists()) {
            JOptionPane.showMessageDialog(null, "Username Belum Terdaftar!",
                    "Warning", JOptionPane.OK_OPTION);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("userdata.txt"))) {
            String line;
            boolean usernameFound = false, passwordCorrect = false;

            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length >= 2 && details[0].equals(username)) {
                    usernameFound = true;

                    if (details[1].equals(password)) {
                        passwordCorrect = true;
                        break;
                    }
                }
            }

            Nama nama = Nama.getInstance();
            nama.setUsername(username);

            if ("admincukurukuk".equals(username) && "admnckrk".equals(password)) {
                AdminHome loginAdminSuccess = new AdminHome();
                loginAdminSuccess.setVisible(true);
                dispose();
            } else if (!usernameFound) {
                JOptionPane.showMessageDialog(null, "Username Belum Terdaftar!", "Warning", JOptionPane.OK_OPTION);
            } else if (!passwordCorrect) {
                JOptionPane.showMessageDialog(null, "Password Salah!", "Warning", JOptionPane.OK_OPTION);
            } else {
                LoginSuccess loginToLoginSuccess = new LoginSuccess();
                loginToLoginSuccess.setVisible(true);
                dispose();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginToHomeActionPerformed
    
    private void btnLoginToSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginToSignUpActionPerformed
        SignUp logintosignup = new SignUp();
        logintosignup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginToSignUpActionPerformed

    private void btnCloseLoginToFirstUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseLoginToFirstUIActionPerformed
        FirstUI closelogintofirstui = new FirstUI();
        closelogintofirstui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseLoginToFirstUIActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseLoginToFirstUI;
    private javax.swing.JButton btnLoginToHome;
    private javax.swing.JButton btnLoginToSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jUsernameField1;
    // End of variables declaration//GEN-END:variables
}
