/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logbook;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.Timer;

/**
 *
 * @author mico
 */
public final class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form userLogIn
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
        SCISLogo = new javax.swing.JLabel();
        headTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel3.setBackground(java.awt.Color.lightGray);
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idNumber.setBackground(new java.awt.Color(102, 102, 102));
        idNumber.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel3.add(idNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 330, 40));

        logInButton.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        logOutButton.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.setToolTipText("");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 110, -1));

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password:");
        jPanel3.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 110, 20));

        IDLabel.setBackground(new java.awt.Color(255, 255, 255));
        IDLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(51, 51, 51));
        IDLabel.setText("ID Number:");
        jPanel3.add(IDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, 20));

        userPassword.setBackground(new java.awt.Color(102, 102, 102));
        userPassword.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel3.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 330, 40));

        SCISLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logbook/IMAGES/SCIS Logo.png"))); // NOI18N
        jPanel3.add(SCISLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 310));

        headTitle.setFont(new java.awt.Font("Bebas", 0, 48)); // NOI18N
        headTitle.setText("SCIS Student Logbook");
        jPanel3.add(headTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jPanel1.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 320, 200));

        dateLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        dateLabel.setText("Date:");
        jPanel3.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        timeLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        timeLabel.setText("Time: ");
        jPanel3.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        String button = "login";
        int id = 0;

        try {
            id = Integer.parseInt(this.idNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid ID number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String pass = this.userPassword.getText();
        try {
            validator(id, pass, button);

        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_logInButtonActionPerformed

    private void logInConfirmActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        String button = "logout";
        int id = 0;

        try {
            id = Integer.parseInt(this.idNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid ID number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String pass = this.userPassword.getText();

        try {
            validator(id, pass, button);
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void idNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberActionPerformed

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    private void idNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNumberMouseClicked

    }//GEN-LAST:event_idNumberMouseClicked

    private void userPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPasswordMouseClicked

    }//GEN-LAST:event_userPasswordMouseClicked

    public void validator(int id, String pass, String button) throws SQLException {
        ResultSet rs = null;
        Statement stmt = null;
        CallableStatement callsp = null;
        Connection con = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

            String conStr = "jdbc:mysql://localhost:3306/logbook?user=root&password=";
            con = DriverManager.getConnection(conStr);
            String query = "select idnumber, password from student;";
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (rs.next()) {
            int idnumber = rs.getInt(1);
            String password = rs.getString("password");
            if (idnumber == id) {
                if (password.equals(pass)) {
                    if (button.equals("login")) {
                        rs = validateLogIn(idnumber, rs, stmt, id, con);
                    } else {
                        Date now = new Date();
                        String secondQuery = "select * from log where "
                                + " idnumber = " + idnumber + " ORDER by logid desc LIMIT 1;";
                        rs = stmt.executeQuery(secondQuery);
                        rs.beforeFirst();
                        String time_out = "";
                        while (rs.next()) {
                            time_out = rs.getString("time_out");
                        }
                        if (time_out != null) {
                            JOptionPane.showMessageDialog(this, "You haven't Log in yet");
                        } else if (time_out == null) {
                            rs = timeOut(idnumber, rs, stmt, now);
                            JOptionPane.showMessageDialog(this, "Logout Complete");
                            idNumber.setText("");
                            userPassword.setText("");
                        }
                    }
                }
                if (idnumber == id && password.equals(pass)) {
                    LogInPopUp loginPopUp = new LogInPopUp();
                    loginPopUp.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public ResultSet timeOut(int idnumber, ResultSet rs, Statement stmt, Date now) throws SQLException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd h:m:s");
        Date time = new Date();
        String timeOutQuery = "select * from log where time_out is null "
                + "AND idnumber = " + idnumber + " limit 1";
        rs = stmt.executeQuery(timeOutQuery);

        rs.beforeFirst();
        while (rs.next()) {
            String date = rs.getString("date");
            String timeIn = rs.getString("time_in");
            String timeOut = rs.getString("time_out");
            int idnum = rs.getInt(5);
            rs.first();
            rs.absolute(1);
            timeOut = dateFormat.format(now);
            rs.updateString(4, timeOut);
            rs.updateRow();
        }
        return rs;
    }

    public ResultSet validateLogIn(int idnumber, ResultSet rs, Statement stmt, int id, Connection con) throws SQLException, HeadlessException {
        String secondQuery = "select * from log where "
                + " idnumber = " + idnumber + " ORDER by logid desc LIMIT 1;";
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String time_out = "";
        while (rs.next()) {
            time_out = rs.getString("time_out");
        }
        if (idnumber == id) {
            if (time_out == null) {
                JOptionPane.showMessageDialog(this, "You are already log in");
            } else if (time_out != null) {
                rs = timeIn(rs, stmt, con, id);
                JOptionPane.showMessageDialog(this, "Log In Success!");
                idNumber.setText("");
                userPassword.setText("");

            }
        }
        return rs;
    }

    public ResultSet timeIn(ResultSet rs, Statement stmt, Connection con, int id) throws SQLException {
        CallableStatement callsp;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd h:m:s");
        Date now = new Date();
        String secondQuery = "select date, time_in, time_out, idnumber from log;";
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String time_in = dateFormat.format(now);
        dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String date = dateFormat.format(now);
        String callLog = "{call log(?,?,?)}";
        callsp = con.prepareCall(callLog);
        callsp.setString(1, date);
        callsp.setString(2, time_in);
        callsp.setInt(3, id);
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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    private javax.swing.JTextField idNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logInButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables
}
