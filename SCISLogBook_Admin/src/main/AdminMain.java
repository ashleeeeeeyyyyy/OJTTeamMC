/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form AdminMain
     */
    public AdminMain() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        jLabel1.setText("SCIS Student Logbook");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel2.setText("Admin Module");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Generate Excel Files");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("Add/Remove Subjects");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel5.setText("Add/Remove Faculty");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT Project Log", "Practicum Log", "Student List(Practicum 1)", "Student List(IT Project)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Generate Excel File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn;
        try {
            conn = jdbc.connection.DBConnection.connectDB();
            Statement stmt = conn.createStatement();
            //Filtering for the Log of IT Project
            if (jComboBox1.getSelectedItem().toString() == "IT Project Log") {
                HSSFWorkbook new_workbook = new HSSFWorkbook(); //create a blank workbook object
                HSSFSheet sheet = new_workbook.createSheet("Logbook_Report");  //create a worksheet with caption score_details
                /* Define the SQL query */
                String[] headers = new String[]{"ID NUMBER","First Name","Last Name","ADVISER", "OFFICE", "CLASS CODE", "DATE", "TIME IN", "TIME OUT",};
                int rownumber = 0;
                Row r = sheet.createRow(rownumber);
                for (int rn = 0; rn < headers.length; rn++) {
                    Cell cell = r.createCell(rn);
                    cell.setCellValue((String) headers[rn]);
                }
                ResultSet query_set = stmt.executeQuery("SELECT idnumber,fname,lname, adviser, office, code, date,"
                    + " time_in, time_out FROM logs natural join accounts natural join students where subject = 'IT Project';");
                /* Create Map for Excel Data */
                Map<String, Object[]> excel_data = new HashMap<>(); //create a map and define data
                int row_counter = 0;
                /* Populate data into the Map */
                while (query_set.next()) {
                    row_counter = row_counter + 1;
                    String idnum = query_set.getString("idnumber");
                    String fname = query_set.getString("fname");
                    String lname = query_set.getString("lname");
                    String adviser = query_set.getString("adviser");
                    String office = query_set.getString("office");
                    String class_code = query_set.getString("code");
                    String date = query_set.getString("date");
                    String time_in = query_set.getString("time_in");
                    String time_out = query_set.getString("time_out");
                    excel_data.put(Integer.toString(row_counter), new Object[]{idnum,fname,lname, adviser, office, class_code, date, time_in, time_out});
                }
                /* Close all DB related objects */
                query_set.close();
                stmt.close();
                conn.close();

                /* Load data into logical worksheet */
                Set<String> keyset = excel_data.keySet();
                int rownum = 1;
                for (String key : keyset) { //loop through the data and add them to the cell

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

                FileOutputStream output_file = new FileOutputStream(new File("Excel Files/ITProject_Logs.xls")); //create XLS file
                new_workbook.write(output_file);//write excel document to output stream
                output_file.close(); //close the file
            }

            // Filtering the log for the practicum
            if (jComboBox1.getSelectedItem().toString() == "Practicum Log") {
                HSSFWorkbook new_workbook = new HSSFWorkbook(); //create a blank workbook object
                HSSFSheet sheet = new_workbook.createSheet("Logbook_Report");  //create a worksheet with caption score_details
                /* Define the SQL query */
                String[] headers = new String[]{"ID NUMBER","First Name","Last Name","ADVISER", "OFFICE", "CLASS CODE", "DATE", "TIME IN", "TIME OUT"};
                int rownumber = 0;
                Row r = sheet.createRow(rownumber);
                for (int rn = 0; rn < headers.length; rn++) {
                    Cell cell = r.createCell(rn);
                    cell.setCellValue((String) headers[rn]);
                }
                ResultSet query_set = stmt.executeQuery("SELECT idnumber,fname,lname, adviser, office, code,date, time_in, time_out FROM logs natural join accounts natural join students where subject = 'Practicum 1';");
                /* Create Map for Excel Data */
                Map<String, Object[]> excel_data = new HashMap<>(); //create a map and define data
                int row_counter = 0;
                /* Populate data into the Map */
                while (query_set.next()) {
                    row_counter = row_counter + 1;
                    String idnum = query_set.getString("idnumber");
                    String fname = query_set.getString("fname");
                    String lname = query_set.getString("lname");
                    String adviser = query_set.getString("adviser");
                    String office = query_set.getString("office");
                    String code = query_set.getString("code");
                    String date = query_set.getString("date");
                    String time_in = query_set.getString("time_in");
                    String time_out = query_set.getString("time_out");
                    excel_data.put(Integer.toString(row_counter), new Object[]{idnum,fname,lname, adviser, office, code, date, time_in, time_out});
                }
                /* Close all DB related objects */
                query_set.close();
                stmt.close();
                conn.close();

                /* Load data into logical worksheet */
                Set<String> keyset = excel_data.keySet();
                int rownum = 1;
                for (String key : keyset) { //loop through the data and add them to the cell

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

                FileOutputStream output_file = new FileOutputStream(new File("Excel Files/Practicum_Logs.xls")); //create XLS file
                new_workbook.write(output_file);//write excel document to output stream
                output_file.close(); //close the file
            }

            // Filtering the List of Student Enrolled in Practicum 1
            if (jComboBox1.getSelectedItem().toString() == "Student List(Practicum 1)") {
                HSSFWorkbook new_workbook = new HSSFWorkbook(); //create a blank workbook object
                HSSFSheet sheet = new_workbook.createSheet("Logbook_Report");  //create a worksheet with caption score_details
                /* Define the SQL query */
                String[] headers = new String[]{"ID NUMBER", "NAME", "COURSE AND YEAR",
                    "SUBJECT", "CODE", "ADVISER"};
                int rownumber = 0;
                Row r = sheet.createRow(rownumber);
                for (int rn = 0; rn < headers.length; rn++) {
                    Cell cell = r.createCell(rn);
                    cell.setCellValue((String) headers[rn]);
                }
                ResultSet query_set = stmt.executeQuery("SELECT idnumber, CONCAT(lname, ', ', fname) AS 'name', course_year, subject, code, adviser FROM accounts natural join students WHERE subject = 'Practicum 1'");
                /* Create Map for Excel Data */
                Map<String, Object[]> excel_data = new HashMap<>(); //create a map and define data
                int row_counter = 0;
                /* Populate data into the Map */
                while (query_set.next()) {
                    row_counter = row_counter + 1;
                    String idnum = query_set.getString("idnumber");
                    String name = query_set.getString("name");
                    String course_year = query_set.getString("course_year");
                    String subject = query_set.getString("subject");
                    String code = query_set.getString("code");
                    String adviser = query_set.getString("adviser");
                    excel_data.put(Integer.toString(row_counter), new Object[]{idnum, name, course_year,
                        subject, code, adviser});
            }
            /* Close all DB related objects */
            query_set.close();
            stmt.close();
            conn.close();

            /* Load data into logical worksheet */
            Set<String> keyset = excel_data.keySet();
            int rownum = 1;
            for (String key : keyset) { //loop through the data and add them to the cell
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

            FileOutputStream output_file = new FileOutputStream(new File("Excel Files/StudentList_Practicum.xls")); //create XLS file
            new_workbook.write(output_file);//write excel document to output stream
            output_file.close(); //close the file
        }
        if (jComboBox1.getSelectedItem().toString() == "Student List(IT Project)") {
            HSSFWorkbook new_workbook = new HSSFWorkbook(); //create a blank workbook object
            HSSFSheet sheet = new_workbook.createSheet("Logbook_Report");  //create a worksheet with caption score_details
            /* Define the SQL query */
            String[] headers = new String[]{"ID NUMBER", "NAME", "COURSE AND YEAR",
                "SUBJECT", "CODE", "ADVISER"};
            int rownumber = 0;
            Row r = sheet.createRow(rownumber);
            for (int rn = 0; rn < headers.length; rn++) {
                Cell cell = r.createCell(rn);
                cell.setCellValue((String) headers[rn]);
            }
            ResultSet query_set = stmt.executeQuery("SELECT idnumber, CONCAT(lname, ', ', fname) AS 'name', course_year, subject, code, adviser FROM accounts natural join students WHERE subject = 'IT Project';");
            /* Create Map for Excel Data */
            Map<String, Object[]> excel_data = new HashMap<>(); //create a map and define data
            int row_counter = 0;
            /* Populate data into the Map */
            while (query_set.next()) {
                row_counter = row_counter + 1;
                String idnumber = query_set.getString("idnumber");
                String name = query_set.getString("name");
                String course_year = query_set.getString("course_year");
                String subject = query_set.getString("subject");
                String code = query_set.getString("code");
                String adviser = query_set.getString("adviser");
                excel_data.put(Integer.toString(row_counter), new Object[]{idnumber, name, course_year,
                    subject, code, adviser});
        }
        /* Close all DB related objects */
        query_set.close();
        stmt.close();
        conn.close();

        /* Load data into logical worksheet */
        Set<String> keyset = excel_data.keySet();
        int rownum = 1;
        for (String key : keyset) { //loop through the data and add them to the cell
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

        FileOutputStream output_file = new FileOutputStream(new File("Excel Files/StudentList_ITproject.xls")); //create XLS file
        new_workbook.write(output_file);//write excel document to output stream
        output_file.close(); //close the file
        }
        JOptionPane.showMessageDialog(this, "Excel File Generated Successfully.");
        } catch (SQLException x) {
            x.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
