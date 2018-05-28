
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Earl
 */
public class IDRegistration extends javax.swing.JFrame {

    /**
     * Creates new form IDRegistration
     */
    public IDRegistration() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        IDNumberLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        yearLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        pwordField = new javax.swing.JPasswordField();
        pwordLabel = new javax.swing.JLabel();
        confPwordLabel = new javax.swing.JLabel();
        confPwordField = new javax.swing.JPasswordField();
        registerID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        jLabel1.setFont(new java.awt.Font("Bebas", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register  SLU  ID  Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        IDTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        IDNumberLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        IDNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
        IDNumberLabel.setText("ID Number: ");

        fNameLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        fNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        fNameLabel.setText("First Name:");

        fNameTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        fNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextFieldActionPerformed(evt);
            }
        });

        lNameLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        lNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lNameLabel.setText("Last Name:");

        lNameTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextFieldActionPerformed(evt);
            }
        });

        courseLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(51, 51, 51));
        courseLabel.setText("Course:");

        courseComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "BSCS", "BSMATH", "BLIS" }));

        yearLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(51, 51, 51));
        yearLabel.setText("Year:");

        yearComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        pwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordFieldActionPerformed(evt);
            }
        });

        pwordLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        pwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        pwordLabel.setText("Password: ");

        confPwordLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        confPwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        confPwordLabel.setText("Confirm Password:");

        confPwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confPwordFieldActionPerformed(evt);
            }
        });

        registerID.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        registerID.setText("Register");
        registerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDNumberLabel)
                        .addGap(18, 18, 18)
                        .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(courseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(yearLabel)
                                .addGap(18, 18, 18)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fNameLabel)
                                    .addComponent(lNameLabel))
                                .addGap(24, 24, 24)
                                .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(confPwordLabel)
                                    .addComponent(pwordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerID)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNumberLabel)
                    .addComponent(IDTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lNameTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(courseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseComboBox)
                    .addComponent(yearLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwordLabel)
                    .addComponent(pwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confPwordLabel)
                    .addComponent(confPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registerID)
                .addGap(68, 68, 68))
        );

        courseComboBox.setSelectedIndex(-1);
        yearComboBox.setSelectedIndex(-1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextFieldActionPerformed

    private void lNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextFieldActionPerformed

    private void pwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwordFieldActionPerformed

    private void confPwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confPwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confPwordFieldActionPerformed

    private void registerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerIDActionPerformed
        Connection con;
        PreparedStatement ps;
        String query;

        try {
            con = jdbc.connection.DBConnection.connectDB();
            
            if (!isFilledOut()) {
                JOptionPane.showMessageDialog(this, "Fill out all fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!pwordField.getText().equals(confPwordField.getText())) {
                JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
                pwordField.setText("");
                confPwordField.setText("");
            } else if (!idValidator(IDTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Not a valid SLU ID Number", "Error", JOptionPane.ERROR_MESSAGE);
                IDTextField.setText("");
            } else if (idNumberExists(IDTextField.getText())) {
                JOptionPane.showMessageDialog(this, "ID Number is already Existing", "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
            } else {
                query = "INSERT into students (idnumber, fname, lname, course_year, password) VALUES (?, ?, ?, ?, aes_encrypt(?,'scis2018'))";
                ps = con.prepareStatement(query);
                ps.setString(1, IDTextField.getText());
                ps.setString(2, fNameTextField.getText());
                ps.setString(3, lNameTextField.getText());
                ps.setString(4, courseComboBox.getSelectedItem().toString() + "-" + yearComboBox.getSelectedItem().toString());
                ps.setString(5, pwordField.getText());
                ps.executeUpdate();
                resetFields();
                JOptionPane.showMessageDialog(this, "Registered Successfully");
                IDRegistration.this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerIDActionPerformed

    private Boolean idNumberExists(String idnumber) {
        boolean res = false;

        Connection con;
        Statement stmt;
        ResultSet rs;
        String query;

        try {
            con = jdbc.connection.DBConnection.connectDB();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            query = "SELECT idnumber from students where idnumber = " + idnumber;

            rs = stmt.executeQuery(query);
            if (rs.next()) {
                res = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    private Boolean idValidator(String id) {
        boolean flag = false;
        int digitCount = 0;

        for (int i = 0; i < id.length(); i++) {
            if (Character.isDigit(id.charAt(i))) {
                digitCount++;
            }
        }

        if (digitCount == 7 && id.charAt(0) == '2') {
            return true;
        }

        return flag;
    }

    private Boolean isFilledOut() {
        boolean res = true;

        if (IDTextField.getText().equals("") || fNameTextField.getText().equals("")
                || lNameTextField.getText().equals("") || courseComboBox.getSelectedItem().toString().equals("")
                || yearComboBox.getSelectedItem().toString().equals("") || pwordField.getText().equals("")
                || confPwordField.getText().equals("")) {
            res = false;
        }

        return res;
    }

    private void resetFields() {
        IDTextField.setText("");
        confPwordField.setText("");
        courseComboBox.setSelectedIndex(-1);
        fNameTextField.setText("");
        lNameTextField.setText("");
        pwordField.setText("");
        yearComboBox.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(IDRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDNumberLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JPasswordField confPwordField;
    private javax.swing.JLabel confPwordLabel;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JPasswordField pwordField;
    private javax.swing.JLabel pwordLabel;
    private javax.swing.JButton registerID;
    private javax.swing.JComboBox<String> yearComboBox;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
