/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
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
        btnLoginSignUpToLogin = new javax.swing.JButton();
        btnCreateAccountToSignUpSuccess = new javax.swing.JButton();
        btnCloseSignUpToFirstUI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUsernameField1.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jUsernameField1.setForeground(new java.awt.Color(191, 17, 114));
        jUsernameField1.setBorder(null);
        getContentPane().add(jUsernameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 320, 40));

        jPasswordField1.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(191, 17, 114));
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnLoginSignUpToLogin.setBackground(new java.awt.Color(242, 84, 103));
        btnLoginSignUpToLogin.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnLoginSignUpToLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginSignUpToLogin.setText("Log In?");
        btnLoginSignUpToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSignUpToLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginSignUpToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 160, 60));

        btnCreateAccountToSignUpSuccess.setBackground(new java.awt.Color(242, 84, 103));
        btnCreateAccountToSignUpSuccess.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCreateAccountToSignUpSuccess.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAccountToSignUpSuccess.setText("Create Account");
        btnCreateAccountToSignUpSuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountToSignUpSuccessActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateAccountToSignUpSuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 240, 60));

        btnCloseSignUpToFirstUI.setText("close");
        btnCloseSignUpToFirstUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseSignUpToFirstUIActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloseSignUpToFirstUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 90, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountToSignUpSuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountToSignUpSuccessActionPerformed
        String username = jUsernameField1.getText();
        String password = jPasswordField1.getText();

        boolean usernameExists = false;

        try (BufferedReader br = new BufferedReader(new FileReader("userdata.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length >= 1 && details[0].equals(username)) {
                    usernameExists = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (usernameExists) {
            JOptionPane.showMessageDialog(null, "Username Sudah Terdaftar!", 
                    "Warning", JOptionPane.OK_OPTION);
        } else {
            try {
                File userDataFile = new File("userdata.txt");
                if (!userDataFile.exists()) {
                    userDataFile.createNewFile();
                }
            try {
                File serviceFile = new File("service_details.txt");
                if (!serviceFile.exists()) {
                    serviceFile.createNewFile();
                }
        

                try (PrintWriter pw = new PrintWriter(new FileWriter(userDataFile, true))) {
                    pw.println(username + "," + password);
                }

                SignUpSuccess createaccounttosignupsuccess = new SignUpSuccess();
                createaccounttosignupsuccess.setVisible(true);
                this.dispose();
            } catch (IOException ex) {
            ex.printStackTrace();
            }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCreateAccountToSignUpSuccessActionPerformed

    private void btnLoginSignUpToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSignUpToLoginActionPerformed
        Login loginsignuptologin = new Login();
        loginsignuptologin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginSignUpToLoginActionPerformed

    private void btnCloseSignUpToFirstUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseSignUpToFirstUIActionPerformed
        FirstUI closesignuptofirstui = new FirstUI();
        closesignuptofirstui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseSignUpToFirstUIActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseSignUpToFirstUI;
    private javax.swing.JButton btnCreateAccountToSignUpSuccess;
    private javax.swing.JButton btnLoginSignUpToLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jUsernameField1;
    // End of variables declaration//GEN-END:variables
}
