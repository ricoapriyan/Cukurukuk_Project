package GUI;

import javax.swing.JOptionPane;

public class FirstUI extends javax.swing.JFrame {

    public FirstUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFirstToSignUp = new javax.swing.JButton();
        btnFirstToLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cukurukukBG/1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        btnFirstToSignUp.setBackground(new java.awt.Color(242, 84, 103));
        btnFirstToSignUp.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnFirstToSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnFirstToSignUp.setText("Sign Up");
        btnFirstToSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstToSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnFirstToSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 230, 60));

        btnFirstToLogin.setBackground(new java.awt.Color(242, 84, 103));
        btnFirstToLogin.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnFirstToLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnFirstToLogin.setText("Log In");
        btnFirstToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstToLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnFirstToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 230, 60));

        btnExit.setBackground(new java.awt.Color(242, 84, 103));
        btnExit.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setToolTipText("");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, 230, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstToLoginActionPerformed
        Login firsttologin = new Login();
        firsttologin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFirstToLoginActionPerformed

    private void btnFirstToSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstToSignUpActionPerformed
        SignUp firsttosignup = new SignUp();
        firsttosignup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFirstToSignUpActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close CUKURUKUK?", "Select", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FirstUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirstToLogin;
    private javax.swing.JButton btnFirstToSignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
