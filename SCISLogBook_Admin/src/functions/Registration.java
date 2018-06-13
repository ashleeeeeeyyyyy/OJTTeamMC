package functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.AdminMain;
import validation.JTextFieldLimit;
import validation.Validator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Earl
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     *
     * @throws java.sql.SQLException
     */
    public Registration() throws SQLException {
//        setUndecorated(true);

        this.setTitle("SCIS Admin");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        headTitle = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        pwordLabel = new javax.swing.JLabel();
        pwordLabel1 = new javax.swing.JLabel();
        pwordField = new javax.swing.JPasswordField();
        confPwordLabel = new javax.swing.JLabel();
        confPwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1024, 680));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(550, 620));

        headTitle.setFont(new java.awt.Font("Bebas", 0, 48)); // NOI18N
        headTitle.setForeground(new java.awt.Color(51, 51, 51));
        headTitle.setText("aDMIN    registration");

        fNameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        fNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        fNameLabel.setText("First Name:");

        fNameTextField.setDocument(new validation.JTextFieldLimit(20));
        fNameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        fNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextFieldActionPerformed(evt);
            }
        });

        lNameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lNameLabel.setText("Last Name:");

        lNameTextField.setDocument(new validation.JTextFieldLimit(12));
        lNameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextFieldActionPerformed(evt);
            }
        });

        pwordLabel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        pwordLabel.setText("Username:");

        UsernameTextField.setDocument(new validation.JTextFieldLimit(15));
        UsernameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        pwordLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pwordLabel1.setForeground(new java.awt.Color(51, 51, 51));
        pwordLabel1.setText("Password: ");

        pwordField.setDocument(new validation.JTextFieldLimit(20));
        pwordField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        pwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordFieldActionPerformed(evt);
            }
        });

        confPwordLabel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        confPwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        confPwordLabel.setText("Confirm Password:");

        confPwordField.setDocument(new validation.JTextFieldLimit(20));
        confPwordField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        confPwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confPwordFieldActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        registerButton.setForeground(new java.awt.Color(51, 51, 51));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/left-arrow.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(confPwordLabel)
                        .addGap(28, 28, 28)
                        .addComponent(confPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(pwordLabel)
                                    .addGap(26, 26, 26)
                                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lNameLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(pwordLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(headTitle)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(fNameLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(39, 39, 39)
                .addComponent(headTitle)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwordLabel))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwordLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confPwordLabel)
                    .addComponent(confPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(registerButton)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Connection con;
        PreparedStatement ps;
        String query;
        try {
            con = jdbc.connection.DBConnection.connectDB();
            if (!isFilledOut()) {
                JOptionPane.showMessageDialog(this, "Fill out all fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Validator.checkWhitespace(UsernameTextField.getText()) || Validator.checkWhitespace(fNameTextField.getText())
                    || Validator.checkWhitespace(lNameTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Entries should not start with a whitespace", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!pwordField.getText().equals(confPwordField.getText())) {
                JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
                pwordField.setText("");
                confPwordField.setText("");
            } else if (!Validator.passwordValidator(pwordField.getText())) {
                JOptionPane.showMessageDialog(this, "Password should contain\n"
                        + "1. At least 8 characters.\n"
                        + "2. At least 1 uppercase and 1 lowercase\n"
                        + "    character.\n"
                        + "3. At least 1 numeric character.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                query = "INSERT into admin (admin_fname, admin_lname, admin_uname, admin_password) VALUES (?, ?, ?, aes_encrypt(?,'scis2018'))";
                ps = con.prepareStatement(query);
                ps.setString(1, fNameTextField.getText());
                ps.setString(2, lNameTextField.getText());
                ps.setString(3, UsernameTextField.getText());
                ps.setString(4, pwordField.getText());
                ps.executeUpdate();
                resetFields();
                JOptionPane.showMessageDialog(this, "Registered Successfully");
                Registration.this.dispose();
                new Registration().setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Fill out all Fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void pwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwordFieldActionPerformed

    private void fNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextFieldActionPerformed

    private void lNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextFieldActionPerformed

    private void confPwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confPwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confPwordFieldActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        try {
            new AdminMain().setVisible(true);
            this.dispose();
            resetFields();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void resetFields() {
        UsernameTextField.setText("");
    }

    public void close() {
        Registration.this.dispose();
    }

    private boolean isFilledOut() {
        boolean res = true;
        if (UsernameTextField.getText().equals("")) {
            res = false;
        }
        return res;
    }

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Registration().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static final javax.swing.JTextField UsernameTextField = new javax.swing.JTextField();
    private javax.swing.JPasswordField confPwordField;
    private javax.swing.JLabel confPwordLabel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel headTitle;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JPasswordField pwordField;
    private javax.swing.JLabel pwordLabel;
    private javax.swing.JLabel pwordLabel1;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables

}