
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     */
    public Registration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subjectLabel = new javax.swing.JLabel();
        purposeComboBox = new javax.swing.JComboBox<>();
        adviserLabel = new javax.swing.JLabel();
        adviserComboBox = new javax.swing.JComboBox<>();
        classCodeLabel = new javax.swing.JLabel();
        codeTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        fNameLabel = new javax.swing.JLabel();
        idNumberTextField = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idNumberLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subjectLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        subjectLabel.setText("Subject:");

        purposeComboBox.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        purposeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Practicum 1", "IT Project" }));
        purposeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purposeComboBoxActionPerformed(evt);
            }
        });

        adviserLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        adviserLabel.setText("Adviser:");

        adviserComboBox.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        adviserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ma. Concepcion Clemente", "Cecilia Mercado", "Jonathan Ramirez", "Ria Andrea Nana", "Gerry Paul Genove", "Randy Domantay", "Bench Bacani", "Jo Montes", "Alodia Rei Leung", "Landley Bernardo" }));
        adviserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adviserComboBoxActionPerformed(evt);
            }
        });

        classCodeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        classCodeLabel.setText("Class Code");

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        passwordLabel.setText("Password");

        fNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        fNameLabel.setText("First Name:");

        lNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lNameLabel.setText("Last Name:");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        jLabel1.setText("Create an Account");

        idNumberLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        idNumberLabel1.setText("ID Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectLabel)
                                    .addComponent(purposeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adviserLabel)
                                    .addComponent(adviserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(idNumberLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codeTextField)
                                    .addComponent(classCodeLabel))
                                .addGap(107, 107, 107)
                                .addComponent(registerButton))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNameLabel)
                                    .addComponent(passwordLabel))))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(fNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNumberLabel1)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adviserLabel)
                        .addGap(101, 101, 101)
                        .addComponent(registerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subjectLabel)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purposeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adviserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(classCodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(195, 195, 195))
        );

        purposeComboBox.setSelectedIndex(-1);
        adviserComboBox.setSelectedIndex(-1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purposeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purposeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purposeComboBoxActionPerformed

    private void adviserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adviserComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adviserComboBoxActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            String conStr = "jdbc:mysql://localhost:3306/scislog?user=root&password=";
            con = DriverManager.getConnection(conStr);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if ("Practicum 1".equals(purposeComboBox.getSelectedItem().toString())) {
                rs = stmt.executeQuery("select * from student_practicum");
                registerPracAccount(Integer.parseInt(idNumberTextField.getText()), fNameTextField.getText(),
                        lNameTextField.getText(), purposeComboBox.getSelectedItem().toString(),
                        codeTextField.getText(), adviserComboBox.getSelectedItem().toString(), passwordField.getText(), rs, con);
            } else {
                rs = stmt.executeQuery("select * from student_itproject");
                registerITProjAccount(Integer.parseInt(idNumberTextField.getText()), fNameTextField.getText(),
                        lNameTextField.getText(), purposeComboBox.getSelectedItem().toString(),
                        adviserComboBox.getSelectedItem().toString(), passwordField.getText(), rs, con);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private ResultSet registerPracAccount(int ID, String fName, String lName, String subject, String code,
            String adviser, String password, ResultSet rs, Connection con) throws SQLException {
        CallableStatement callsp;
        rs.beforeFirst();
        String callLog = "{call regPracAccount(?,?,?,?,?,?,?)}";
        callsp = con.prepareCall(callLog);
        callsp.setInt(1, ID);
        callsp.setString(2, fName);
        callsp.setString(3, lName);
        callsp.setString(4, subject);
        callsp.setString(5, code);
        callsp.setString(6, adviser);
        callsp.setString(7, password);
        callsp.executeUpdate();
        return rs;
    }

    private ResultSet registerITProjAccount(int ID, String fName, String lName, String subject,
            String adviser, String password, ResultSet rs, Connection con) throws SQLException {
        CallableStatement callsp;
        rs.beforeFirst();
        String callLog = "{call regITProjAccount(?,?,?,?,?,?)}";
        callsp = con.prepareCall(callLog);
        callsp.setInt(1, ID);
        callsp.setString(2, fName);
        callsp.setString(3, lName);
        callsp.setString(4, subject);
        callsp.setString(5, adviser);
        callsp.setString(6, password);
        callsp.executeUpdate();
        return rs;
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
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adviserComboBox;
    private javax.swing.JLabel adviserLabel;
    private javax.swing.JLabel classCodeLabel;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel idNumberLabel1;
    private javax.swing.JTextField idNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> purposeComboBox;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel subjectLabel;
    // End of variables declaration//GEN-END:variables
}
