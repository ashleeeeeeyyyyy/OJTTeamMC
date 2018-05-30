
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
//        setUndecorated(true);
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

        jPanel2 = new javax.swing.JPanel();
        IDNumberLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        fNameLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        yearLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        pwordLabel = new javax.swing.JLabel();
        pwordField = new javax.swing.JPasswordField();
        confPwordLabel = new javax.swing.JLabel();
        confPwordField = new javax.swing.JPasswordField();
        registerID = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        headTitle1 = new javax.swing.JLabel();
        SCISLogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        headTitle = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(180, 180, 180));

        IDNumberLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        IDNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
        IDNumberLabel.setText("ID Number: ");

        IDTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

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

        pwordLabel.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        pwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        pwordLabel.setText("Password: ");

        pwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordFieldActionPerformed(evt);
            }
        });

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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("INSTRUCTIONS:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("1. Enter your valid SLU ID Number.");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("2. Enter your first and last name.");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("3. Enter your current course and year.");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("4. Enter your password.");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Password should contain:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("a. At least 1 uppercase and lowercase");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("characters");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("b. At least 1 numeric character.");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("c. At least 8 characters in total.");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("5. Confirm password then click on");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("the 'Register' button to finish.");

        headTitle1.setFont(new java.awt.Font("Bebas", 0, 80)); // NOI18N
        headTitle1.setForeground(new java.awt.Color(204, 204, 204));
        headTitle1.setText("scis");

        SCISLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SCIS Logo.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("STUDENT LOGBOOK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(SCISLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headTitle1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel7)))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headTitle1)
                    .addComponent(SCISLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(58, 58, 58))
        );

        headTitle.setFont(new java.awt.Font("Bebas", 0, 48)); // NOI18N
        headTitle.setForeground(new java.awt.Color(51, 51, 51));
        headTitle.setText("register your id number");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Go back to Log in page...");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(IDNumberLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(courseLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(yearLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fNameLabel)
                                                .addComponent(lNameLabel))
                                            .addGap(24, 24, 24)
                                            .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(confPwordLabel)
                                                .addComponent(pwordLabel))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(confPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(headTitle)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(343, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(27, 27, 27)
                .addComponent(headTitle)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNumberLabel)
                    .addComponent(IDTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lNameTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(courseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseComboBox)
                    .addComponent(yearLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwordLabel)
                    .addComponent(pwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confPwordLabel)
                    .addComponent(confPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(registerID)
                .addGap(118, 118, 118))
        );

        courseComboBox.setSelectedIndex(-1);
        yearComboBox.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
            } else if (!passwordValidator(pwordField.getText())) {
                JOptionPane.showMessageDialog(this, "Password should contain\n"
                        + "1. At least 8 characters.\n"
                        + "2. At least 1 uppercase and lowercase\n"
                        + "    characters.\n"
                        + "3. At least 1 numeric character.", "Error", JOptionPane.ERROR_MESSAGE);
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
                new Registration().setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Fill out all Fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerIDActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new UserLogin().setVisible(true);
        this.dispose();
        resetFields();
    }//GEN-LAST:event_jLabel15MouseClicked

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

    private Boolean passwordValidator(String password) {
        boolean res = false;

        int upperCase = 0;
        int lowerCase = 0;
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCase++;
            }
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }

        if (upperCase > 0 && lowerCase > 0 && digitCount > 0 && password.length() > 7) {
            res = true;
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
    private javax.swing.JLabel SCISLogo;
    private javax.swing.JPasswordField confPwordField;
    private javax.swing.JLabel confPwordLabel;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel headTitle;
    private javax.swing.JLabel headTitle1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JPasswordField pwordField;
    private javax.swing.JLabel pwordLabel;
    private javax.swing.JButton registerID;
    private javax.swing.JComboBox<String> yearComboBox;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
