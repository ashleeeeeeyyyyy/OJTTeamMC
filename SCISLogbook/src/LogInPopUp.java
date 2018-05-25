
import java.awt.HeadlessException;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Earl
 */
public class LogInPopUp extends javax.swing.JFrame {

    private int idNumber;
    private String passwd;
    private String subj;

    public LogInPopUp(int usr, String pas, String sub) {
        initComponents();
        this.idNumber = usr;
        this.passwd = pas;
        this.subj = sub;
        
        showNameCourseYear();
        //define the components here
    }

    /**
     * Creates new form LogInPopUp
     */
    public LogInPopUp() {
        initComponents();
    }

    void showNameCourseYear() {
        Connection con;
        Statement stmt;
        ResultSet rs;
        String secondQuery = null;
        String fName = "";
        String lName = "";
        String courseYear = "";

        switch (subj) {
            case "Practicum 1":
                secondQuery = "select * from student_practicum where "
                        + " idnumber = " + idNumber + ";";
                break;
            case "IT Project":
                secondQuery = "select * from student_itproject where "
                        + " idnum = " + idNumber + ";";
                break;
            default:
        }
        try {
            String conStr = "jdbc:mysql://localhost:3306/scislog?user=root&password=";
            con = DriverManager.getConnection(conStr);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(secondQuery);
            rs.beforeFirst();
            while (rs.next()) {
                fName = rs.getString("fName");
                lName = rs.getString("lName");
                courseYear = rs.getString("course_year");
            }
            
            nameLabel.setText("Name: "+lName+", "+fName);
            courseYearLabel.setText("Course & Year: "+courseYear);
           
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        officeLabel = new javax.swing.JLabel();
        officeComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        courseYearLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        officeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        officeLabel.setText("Office:");

        officeComboBox.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        officeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Knowledge Center 1", "Knowledge Center 2", "ICTR Lab", "Consultation Room" }));
        officeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officeComboBoxActionPerformed(evt);
            }
        });

        confirmButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        nameLabel.setText("Name:");

        courseYearLabel.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        courseYearLabel.setText("course_year:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(officeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(officeLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseYearLabel)
                            .addComponent(nameLabel))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseYearLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(officeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(officeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(confirmButton)
                .addGap(23, 23, 23))
        );

        officeComboBox.setSelectedIndex(-1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void officeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officeComboBoxActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Connection con;
        Statement stmt;
        ResultSet rs;
        String secondQuery;
        try {
            String conStr = "jdbc:mysql://localhost:3306/scislog?user=root&password=";
            con = DriverManager.getConnection(conStr);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            if ("Practicum 1".equals(subj)) {
                rs = stmt.executeQuery("select * from student_practicum where"
                        + " idnumber = " + idNumber + ";");
                rs.beforeFirst();
                if (rs.next()) {
                    secondQuery = "select * from log_practicum where "
                            + " idnumber = " + idNumber + " ORDER by logid desc LIMIT 1;";
                    rs = validateLogIn(idNumber, secondQuery, stmt, con);
                    LogInPopUp.this.dispose();
                }
            } else if ("IT Project".equals(subj)) {
                rs = stmt.executeQuery("select * from student_itproject where"
                        + " idnum = " + idNumber + ";");
                rs.beforeFirst();
                if (rs.next()) {
                    secondQuery = "select * from log_itproject where "
                            + " idnum = " + idNumber + " ORDER by logid desc LIMIT 1;";
                    rs = validateLogIn(idNumber, secondQuery, stmt, con);
                    LogInPopUp.this.dispose();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void resetFields() {
        UserLogin.idNumber.setText("");
        UserLogin.userPassword.setText("");
        UserLogin.subjectComboBox.setSelectedIndex(-1);
    }

    private ResultSet validateLogIn(int id, String secondQuery, Statement stmt, Connection con) throws SQLException, HeadlessException {
        ResultSet rs;
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String proc = "";
        switch (subj) {
            case "Practicum 1":
                secondQuery = "select * from log_practicum;";
                proc = "addPracLog";
                break;
            case "IT Project":
                secondQuery = "select * from log_itproject;";
                proc = "addITProjLog";
                break;
            default:
        }
        rs = recordLog(id, officeComboBox.getSelectedItem().toString(), secondQuery, proc, stmt, con);
        JOptionPane.showMessageDialog(this, "Log In Success!");

        resetFields();
        return rs;
    }

    private ResultSet recordLog(int id, String office, String secondQuery, String proc, Statement stmt, Connection con) throws SQLException {
        CallableStatement callsp;
        ResultSet rs;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        Date now = new Date();
        rs = stmt.executeQuery(secondQuery);
        rs.beforeFirst();
        String time_in = timeFormat.format(now);
        String date = dateFormat.format(now);
        String callLog = "{call " + proc + "(?,?,?,?)}";
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
            java.util.logging.Logger.getLogger(LogInPopUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPopUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPopUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPopUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel courseYearLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> officeComboBox;
    private javax.swing.JLabel officeLabel;
    // End of variables declaration//GEN-END:variables
}
