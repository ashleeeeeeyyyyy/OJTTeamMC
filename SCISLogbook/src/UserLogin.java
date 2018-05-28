
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
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

    private final String office = "Open Laboratory (D424)";

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
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
        subjectComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        SCISLogo = new javax.swing.JLabel();
        headTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1024, 600));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
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
        jPanel3.add(idNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 330, 40));

        logInButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        logInButton.setForeground(new java.awt.Color(51, 51, 51));
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 160, -1));

        logOutButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(51, 51, 51));
        logOutButton.setText("Log Out");
        logOutButton.setToolTipText("");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 150, -1));

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password:");
        jPanel3.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 110, 20));

        IDLabel.setBackground(new java.awt.Color(255, 255, 255));
        IDLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(51, 51, 51));
        IDLabel.setText("ID Number:");
        jPanel3.add(IDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 130, 20));

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
        jPanel3.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 330, 40));

        dateLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 51, 51));
        dateLabel.setText("Date:");
        jPanel3.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        timeLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setText("Time: ");
        jPanel3.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        purposeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        purposeLabel.setText("Subject:");
        jPanel3.add(purposeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        subjectComboBox.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Practicum 1", "IT Project" }));
        subjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(subjectComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 220, -1));
        subjectComboBox.setSelectedIndex(-1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        SCISLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SCIS Logo.png"))); // NOI18N

        headTitle.setFont(new java.awt.Font("Bebas", 0, 80)); // NOI18N
        headTitle.setForeground(new java.awt.Color(204, 204, 204));
        headTitle.setText("scis");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("STUDENT LOGBOOK");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Create an Account");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(SCISLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headTitle)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headTitle)
                    .addComponent(SCISLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 690));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNumberMouseClicked

    }//GEN-LAST:event_idNumberMouseClicked

    private void idNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        try {
            if (!validateAccount(idNumber.getText(), userPassword.getText(), subjectComboBox.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Invalid " + subjectComboBox.getSelectedItem().toString() + " Account", "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
            } else if (checkIfLoggedIn(idNumber.getText())) {
                JOptionPane.showMessageDialog(this, "You are already logged in.", "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
            } else {
                recordTimeIn(idNumber.getText(), subjectComboBox.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Successfully Logged In.");
                resetFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        try {
            if (!validateAccount(idNumber.getText(), userPassword.getText(), subjectComboBox.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Invalid " + subjectComboBox.getSelectedItem().toString() + " Account", "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
            } else if (!checkIfLoggedIn(idNumber.getText())) {
                JOptionPane.showMessageDialog(this, "You haven't logged in yet.", "Error", JOptionPane.ERROR_MESSAGE);
                resetFields();
            } else {
                recordTimeOut(idNumber.getText(), subjectComboBox.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Successfully Logged Out.");
                resetFields();
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

    private void subjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectComboBoxActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Registration reg = null;
        try {
            reg = new Registration();
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private Boolean validateAccount(String id, String password, String subject) throws SQLException {
        boolean res = false;
        Connection con;
        PreparedStatement ps;

        con = jdbc.connection.DBConnection.connectDB();
        String query = "SELECT idnumber, password, subject from accounts natural "
                + "join students where idnumber = ? and password = aes_encrypt(?,'scis2018') and subject = ?";
        ps = con.prepareStatement(query);

        ps.setString(1, id);
        ps.setString(2, password);
        ps.setString(3, subject);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            res = true;
        }

        rs.close();
        ps.close();
        con.close();

        return res;
    }

    private String getAccountID(String idnumber, String subject) throws SQLException {
        String account_id = null;

        Connection con;
        PreparedStatement ps;

        con = jdbc.connection.DBConnection.connectDB();
        String query = "select account_id from accounts where idnumber = ? and subject = ?";
        ps = con.prepareStatement(query);

        ps.setString(1, idnumber);
        ps.setString(2, subject);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            account_id = rs.getString("account_id");
        }

        rs.close();
        ps.close();
        con.close();

        return account_id;
    }

    private Boolean checkIfLoggedIn(String idnumber) {
        Connection con;
        PreparedStatement ps;
        Boolean result = false;
        String time_out = "";
        try {
            con = jdbc.connection.DBConnection.connectDB();
            String query = "SELECT idnumber, time_out from accounts natural join logs where idnumber = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, idnumber);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                time_out = rs.getString("time_out");
            }

            if (time_out == null) {
                result = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private void recordTimeIn(String idnumber, String subject) throws SQLException {
        Connection con;
        PreparedStatement ps;
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        Time time_in = new java.sql.Time(now.getTime());
        String date = dateFormat.format(now);

        con = jdbc.connection.DBConnection.connectDB();
        String query = "INSERT into logs (account_id, time_in, date, office) VALUES (?,?,?,?)";
        ps = con.prepareStatement(query);

        ps.setInt(1, Integer.parseInt(getAccountID(idnumber, subject)));
        ps.setTime(2, time_in);
        ps.setString(3, date);
        ps.setString(4, office);

        ps.executeUpdate();
    }

    private void recordTimeOut(String idnumber, String subject) throws SQLException {
        Connection con;
        PreparedStatement ps;
        Date now = new Date();
        Time time_out = new java.sql.Time(now.getTime());
        Time time_in = null;

        con = jdbc.connection.DBConnection.connectDB();

        String query = "SELECT time_in from logs natural join accounts where account_id = ? order by log_id desc limit 1";
        ps = con.prepareStatement(query);
        ps.setString(1, getAccountID(idnumber, subject));
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            time_in = rs.getTime("time_in");
        }
        ps.close();

        query = "UPDATE logs SET time_out = ?, hours_rendered = TIMEDIFF(?,time_in) where account_id = ? and time_in = ? order by log_id desc limit 1";
        ps = con.prepareStatement(query);

        ps.setTime(1, time_out);
        ps.setTime(2, time_out);
        ps.setString(3, getAccountID(idnumber, subject));
        ps.setTime(4, time_in);

        ps.executeUpdate();
        ps.close();
    }

    private void resetFields() {
        idNumber.setText("");
        userPassword.setText("");
        subjectComboBox.setSelectedIndex(-1);
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
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logInButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel purposeLabel;
    public static javax.swing.JComboBox<String> subjectComboBox;
    private javax.swing.JLabel timeLabel;
    public static javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables
}
