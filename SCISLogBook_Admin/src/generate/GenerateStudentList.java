/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Earl
 */
public class GenerateStudentList extends javax.swing.JFrame {

    /**
     * Creates new form GenerateLogs
     */
    public GenerateStudentList() throws SQLException {
        setUndecorated(true);
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        subjectDropdown.setModel(new javax.swing.DefaultComboBoxModel(subjects()));
        subjectDropdown.setSelectedIndex(-1);
        termDropdown.setModel(new javax.swing.DefaultComboBoxModel(term()));
        termDropdown.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        subjectDropdown = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        termDropdown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subjectDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel1.setText("Generate Student Accounts List");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("Subject: ");

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        termDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Term:");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/left-arrow.png"))); // NOI18N

        jButton3.setText("Generate List Of All Students");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(subjectDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(termDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subjectDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(termDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            HSSFWorkbook new_workbook;
            HSSFSheet sheet;
            Map<String, Object[]> excel_data;
            try (Connection conn = jdbc.connection.DBConnection.connectDB(); Statement stmt = conn.createStatement()) {
                new_workbook = new HSSFWorkbook();
                sheet = new_workbook.createSheet("Logbook_Report");

                String[] headers = new String[]{"ID NUMBER", "NAME", "COURSE AND YEAR",
                    "SUBJECT", "CODE", "ADVISER"};
                int rownumber = 0;
                Row r = sheet.createRow(rownumber);
                for (int rn = 0; rn < headers.length; rn++) {
                    Cell cell = r.createCell(rn);
                    cell.setCellValue((String) headers[rn]);
                }
                try (ResultSet query_set = stmt.executeQuery("SELECT idnumber, CONCAT(lname, ', ', fname) AS 'name', course_year, subj_title, code, adviser "
                        + "FROM accounts natural join students natural join subject WHERE subj_title = '" + subjectDropdown.getSelectedItem() + "' and term = '" + termDropdown.getSelectedItem() + "'")) {

                    excel_data = new HashMap<>();
                    int row_counter = 0;

                    while (query_set.next()) {
                        row_counter = row_counter + 1;
                        String idnum = query_set.getString("idnumber");
                        String name = query_set.getString("name");
                        String course_year = query_set.getString("course_year");
                        String subj_title = query_set.getString("subj_title");
                        String code = query_set.getString("code");
                        String adviser = query_set.getString("adviser");
                        excel_data.put(Integer.toString(row_counter), new Object[]{idnum, name, course_year,
                            subj_title, code, adviser});
                    }

                }
            }

            Set<String> keyset = excel_data.keySet();
            int rownum = 1;
            for (String key : keyset) {
                Row row = sheet.createRow(rownum++);
                Object[] objArr = excel_data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    Cell cell = row.createCell(cellnum++);
                    if (obj instanceof Double) {
                        cell.setCellValue((Double) obj);
                    } else {
                        cell.setCellValue((String) obj);
                    }
                }
            }

            try (FileOutputStream output_file = new FileOutputStream(new File("Excel Files/"+subjectDropdown.getSelectedItem()+"("+termDropdown.getSelectedItem()+").xls"))) {
                new_workbook.write(output_file);
                JOptionPane.showMessageDialog(this, "Excel File Generated Successfully.");
                this.dispose();
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(GenerateStudentList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            HSSFWorkbook new_workbook;
            HSSFSheet sheet;
            Map<String, Object[]> excel_data;
            try (Connection conn = jdbc.connection.DBConnection.connectDB(); Statement stmt = conn.createStatement()) {
                new_workbook = new HSSFWorkbook();
                sheet = new_workbook.createSheet("Logbook_Report");

                String[] headers = new String[]{"ID NUMBER", "NAME", "COURSE AND YEAR"};
                int rownumber = 0;
                Row r = sheet.createRow(rownumber);
                for (int rn = 0; rn < headers.length; rn++) {
                    Cell cell = r.createCell(rn);
                    cell.setCellValue((String) headers[rn]);
                }
                try (ResultSet query_set = stmt.executeQuery("SELECT DISTINCT idnumber, CONCAT(lname, ', ', fname) AS 'name', course_year FROM students natural join subject;")) {

                    excel_data = new HashMap<>();
                    int row_counter = 0;

                    while (query_set.next()) {
                        row_counter = row_counter + 1;
                        String idnum = query_set.getString("idnumber");
                        String name = query_set.getString("name");
                        String course_year = query_set.getString("course_year");
                        excel_data.put(Integer.toString(row_counter), new Object[]{idnum, name, course_year,});
                    }

                }
            }

            Set<String> keyset = excel_data.keySet();
            int rownum = 1;
            for (String key : keyset) {
                Row row = sheet.createRow(rownum++);
                Object[] objArr = excel_data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    Cell cell = row.createCell(cellnum++);
                    if (obj instanceof Double) {
                        cell.setCellValue((Double) obj);
                    } else {
                        cell.setCellValue((String) obj);
                    }
                }
            }

            try (FileOutputStream output_file = new FileOutputStream(new File("Excel Files/AllStudentsList.xls"))) {
                new_workbook.write(output_file);
                JOptionPane.showMessageDialog(this, "Excel File Generated Successfully.");
                this.dispose();
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(GenerateStudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private String[] subjects() throws SQLException {
        Connection con;
        con = jdbc.connection.DBConnection.connectDB();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        String query = "select distinct subj_title from logs natural join subject";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList list = new ArrayList();
        while (rs.next()) {
            list.add(rs.getString("subj_title"));
        }
        String[] subj = new String[list.size()];
        list.toArray(subj);

        return subj;
    }

    private String[] term() throws SQLException {
        Connection con;
        con = jdbc.connection.DBConnection.connectDB();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        String query = "SELECT DISTINCT term FROM logs natural join accounts";
        ResultSet rs = stmt.executeQuery(query);

        ArrayList list = new ArrayList();

        while (rs.next()) {
            list.add(rs.getString("term"));
        }
        String[] term = new String[list.size()];
        list.toArray(term);
        return term;

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
            java.util.logging.Logger.getLogger(GenerateStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GenerateStudentList().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GenerateStudentList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> subjectDropdown;
    private javax.swing.JComboBox<String> termDropdown;
    // End of variables declaration//GEN-END:variables
}
