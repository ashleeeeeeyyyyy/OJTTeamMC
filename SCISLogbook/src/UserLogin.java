
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Earl
 */
public final class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        initComponents();
        showDate();
        showTime();
    }

    void showDate() {
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MMMM dd, yyyy");
        dateLabel.setText(s.format(date));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
                timeLabel.setText(s.format(date));
            }

        }
        ).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        idNumber = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        userPassword = new javax.swing.JPasswordField();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        purposeLabel = new javax.swing.JLabel();
        purposeComboBox = new javax.swing.JComboBox<>();
        SCISLogo = new javax.swing.JLabel();
        headTitle = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setMinimumSize(new java.awt.Dimension(1336, 768));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        idNumber.setForeground(new java.awt.Color(51, 51, 51));
        idNumber.setBorder(null);
        idNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idNumberMouseClicked(evt);
            }
        });
        idNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberActionPerformed(evt);
            }
        });
        jPanel3.add(idNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 330, 40));

        logInButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        logInButton.setForeground(new java.awt.Color(51, 51, 51));
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 160, -1));

        logOutButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(51, 51, 51));
        logOutButton.setText("Log Out");
        logOutButton.setToolTipText("");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 150, -1));

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password:");
        jPanel3.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 20));

        IDLabel.setBackground(new java.awt.Color(255, 255, 255));
        IDLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(51, 51, 51));
        IDLabel.setText("ID Number:");
        jPanel3.add(IDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 130, 20));

        userPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        userPassword.setForeground(new java.awt.Color(51, 51, 51));
        userPassword.setBorder(null);
        userPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPasswordMouseClicked(evt);
            }
        });
        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 330, 40));

        dateLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 51, 51));
        dateLabel.setText("Date:");
        jPanel3.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        timeLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setText("Time: ");
        jPanel3.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        purposeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        purposeLabel.setText("Subject:");
        jPanel3.add(purposeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        purposeComboBox.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        purposeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Practicum 1", "IT Project" }));
        purposeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purposeComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(purposeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, -1));
        purposeComboBox.setSelectedIndex(-1);

        SCISLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SCIS Logo.png"))); // NOI18N
        jPanel3.add(SCISLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 100));

        headTitle.setFont(new java.awt.Font("Bebas", 0, 55)); // NOI18N
        headTitle.setForeground(new java.awt.Color(204, 204, 204));
        headTitle.setText("SCIS Student logbook");
        jPanel3.add(headTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        registerButton.setText("Create an Account");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel3.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNumberMouseClicked

    }//GEN-LAST:event_idNumberMouseClicked

    private void idNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        Connection con;
        Statement stmt;
        ResultSet rs;
        PreparedStatement ps;
        try {
            String conStr = "jdbc:mysql://localhost:3306/scislog?user=root&password=";
            con = DriverManager.getConnection(conStr);
            ps = con.prepareStatement("SELECT `idnumber`, `password` FROM `student_practicum` WHERE `idnumber` = ? AND `password` = ?");
            ps.setString(1, idNumber.getText());
            ps.setString(2, String.valueOf(userPassword.getPassword()));
            ResultSet result = ps.executeQuery();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if (result.next()) {
                if ("Practicum 1".equals(purposeComboBox.getSelectedItem().toString())) {
                    if (checkIfLoggedIn(Integer.parseInt(idNumber.getText()))) {
                        JOptionPane.showMessageDialog(this, "You are still logged in", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        LogInPopUp liPopUp = new LogInPopUp(Integer.parseInt(idNumber.getText()), String.valueOf(userPassword.getPassword()), purposeComboBox.getSelectedItem().toString());
                        liPopUp.setVisible(true);
                    }
                } else {
                    rs = stmt.executeQuery("select * from student_itproject");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username Or Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                resetFields();
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
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
                pracLogValidator(Integer.parseInt(idNumber.getText()), String.valueOf(userPassword.getPassword()), stmt, rs);
            } else {
                rs = stmt.executeQuery("select * from student_itproject");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void userPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPasswordMouseClicked

    }//GEN-LAST:event_userPasswordMouseClicked

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    private void purposeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purposeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purposeComboBoxActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Registration reg = new Registration();
        reg.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private Boolean checkIfLoggedIn(int id) {
        Connection con;
        PreparedStatement ps;
        Boolean result = false;
        String time_out = "";
        try {
            String conStr = "jdbc:mysql://localhost:3306/scislog?user=root&password=";
            con = DriverManager.getConnection(conStr);
            ps = con.prepareStatement("SELECT * FROM `log_practicum` WHERE `idnumber` = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                time_out = rs.getString("time_out");

                if (time_out == null) {
                    result = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private void pracLogValidator(int id, String pass, Statement stmt, ResultSet rs) throws SQLException {
        while (rs.next()) {
            int idnumber = rs.getInt(1);
            String password = rs.getString("password");
            if (idnumber == id) {
                if (password.equals(pass)) {
                    rs = validateLogOut(id, idnumber, stmt);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private ResultSet validateLogOut(int idnumber, int id, Statement stmt) throws SQLException, HeadlessException {
        ResultSet rs;
        String secondQuery = "select * from log_practicum where "
                + " idnumber = " + id + " ORDER by logid desc LIMIT 1;";
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String time_out = "";
        while (rs.next()) {
            time_out = rs.getString("time_out");
        }
        if (idnumber == id) {
            if (time_out == null) {
                rs = timeOut(idnumber, rs, stmt);
                JOptionPane.showMessageDialog(this, "Logout Complete");
                resetFields();
            } else {
                JOptionPane.showMessageDialog(this, "You haven't logged in yet", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return rs;
    }

    private void resetFields() {
        idNumber.setText("");
        userPassword.setText("");
        purposeComboBox.setSelectedIndex(-1);
    }

    private ResultSet timeOut(int idnumber, ResultSet rs, Statement stmt) throws SQLException {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd h:m:s");
        String timeOutQuery = "select * from log_practicum where time_out is null "
                + "AND idnumber = " + idnumber + " limit 1";
        rs = stmt.executeQuery(timeOutQuery);

        rs.beforeFirst();
        String timeOut;
        rs.first();
        timeOut = dateFormat.format(now);
        rs.updateString(4, timeOut);
        rs.updateRow();
        return rs;
    }

    /*
    private ResultSet timeOut(int id, Statement stmt, Connection con) throws SQLException {
        CallableStatement callsp;
        ResultSet rs;
        Date now = new Date();
        String secondQuery = "select * from log_practicum where "
                + " idnumber = " + id + " ORDER by logid desc LIMIT 1;";
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String time_out = "";
        while (rs.next()) {
            time_out = rs.getString("time_out");
        }
        if (time_out != null) {
            JOptionPane.showMessageDialog(this, "You haven't Log in yet");
        } else if (time_out == null) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("MMMM dd, yyyy hh:mm:ss");
            time_out = timeFormat.format(now);
            String callLog = "{call timeOutPrac(?)}";
            callsp = con.prepareCall(callLog);
            callsp.setString(1, time_out);
            callsp.executeUpdate();

            JOptionPane.showMessageDialog(this, "Logout Complete");
        }
        return rs;
    }
     */
    private ResultSet recordPracLog(int id, String office, Statement stmt, Connection con) throws SQLException {
        CallableStatement callsp;
        ResultSet rs;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        Date now = new Date();
        String secondQuery = "select * from log_practicum;";
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String time_in = timeFormat.format(now);
        String date = dateFormat.format(now);
        String callLog = "{call addPracLog(?,?,?,?)}";
        callsp = con.prepareCall(callLog);
        callsp.setString(1, date);
        callsp.setString(2, time_in);
        callsp.setInt(3, id);
        callsp.setString(4, office);
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
            java.util.logging.Logger.getLogger(UserLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel SCISLogo;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel headTitle;
    public static javax.swing.JTextField idNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logInButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel passwordLabel;
    public static javax.swing.JComboBox<String> purposeComboBox;
    private javax.swing.JLabel purposeLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel timeLabel;
    public static javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables
}
