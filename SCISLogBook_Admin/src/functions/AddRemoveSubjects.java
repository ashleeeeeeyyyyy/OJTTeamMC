/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.AdminMain;
import validation.Validator;

/**
 *
 * @author Earl
 */
public class AddRemoveSubjects extends javax.swing.JFrame {

    /**
     * Creates new form AddRemoveSubjects
     */
    public AddRemoveSubjects() throws SQLException {
        this.setTitle("Add/Remove Subjects");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        SubjectDropDown.setModel(new javax.swing.DefaultComboBoxModel(subjects()));
        SubjectDropDown.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        SubjectTitle = new javax.swing.JTextField();
        AddSubject = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SubjectDropDown = new javax.swing.JComboBox();
        deleteSubjectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel9.setText("Add Subject:");

        SubjectTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        SubjectTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectTitleActionPerformed(evt);
            }
        });

        AddSubject.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        AddSubject.setText("Add");
        AddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel11.setText("Remove Subject:");

        SubjectDropDown.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        SubjectDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectDropDownActionPerformed(evt);
            }
        });

        deleteSubjectButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        deleteSubjectButton.setText("Remove");
        deleteSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubjectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubjectDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(SubjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubjectDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSubjectButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubjectTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectTitleActionPerformed

    private void AddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectActionPerformed
        Connection con;
        PreparedStatement ps;

        con = jdbc.connection.DBConnection.connectDB();
        String query = "INSERT INTO `scislog`.`subject` (`subj_title`) VALUES ('" + SubjectTitle.getText() + "');";
        try {
            if (Validator.checkDigit(SubjectTitle.getText())) {
                JOptionPane.showMessageDialog(this, "Name should not contain numeric characters.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Validator.checkSymbols(SubjectTitle.getText())) {
                JOptionPane.showMessageDialog(this, "Name should not contain unnecessary symbols.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ps = con.prepareStatement(query);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Subject is saved successfully.");
                this.dispose();
                new AdminMain().setVisible(true);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AddSubjectActionPerformed

    private void SubjectDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectDropDownActionPerformed

    private void deleteSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubjectButtonActionPerformed
        try {
            String subjname = SubjectDropDown.getSelectedItem().toString();
            Connection con;
            PreparedStatement ps;
            con = jdbc.connection.DBConnection.connectDB();
            String subjid = "";
            int counter = 0;
            do {
                subjid += subjname.charAt(counter);
                counter++;
            } while (Character.isDigit(subjname.charAt(counter)));

            String query = "DELETE FROM `scislog`.`subject` WHERE `subjid`=?;";
            ps = con.prepareStatement(query);
            ps.setString(1, subjid);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Removed faculty successfully.");
            this.dispose();
            new AdminMain().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteSubjectButtonActionPerformed
    
    public String[] subjects() throws SQLException {
        Connection con;
        con = jdbc.connection.DBConnection.connectDB();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        String query = "select concat (subjid,'. ',subj_title) AS subjs from subject ORDER by 1;";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList list = new ArrayList();
        while (rs.next()) {
            list.add(rs.getString("subjs"));
        }
        String[] subj = new String[list.size()];
        list.toArray(subj);

        return subj;
    }

    public String[] subjects_status() throws SQLException {
        Connection con;
        con = jdbc.connection.DBConnection.connectDB();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        String query = "select distinct subj_title from subject natural join accounts ORDER by 1;";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList list = new ArrayList();
        while (rs.next()) {
            list.add(rs.getString("subj_title"));
        }
        String[] subj = new String[list.size()];
        list.toArray(subj);

        return subj;
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
            java.util.logging.Logger.getLogger(AddRemoveSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRemoveSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRemoveSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRemoveSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddRemoveSubjects().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddRemoveSubjects.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSubject;
    private javax.swing.JComboBox SubjectDropDown;
    private javax.swing.JTextField SubjectTitle;
    private javax.swing.JButton deleteSubjectButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
