/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojt_xlstojdbc;

import static com.mysql.jdbc.Messages.getString;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author Benz
 */
public class OJT_xlsTojdbc {

    public static void main(String[] args) throws Exception {

        /* Create Connection objects */
        String conStr = "jdbc:mysql://localhost:8889/scislog?user=root&password=";
        Connection conn = DriverManager.getConnection(conStr);
        Statement stmt = conn.createStatement();
        /* Create Workbook and Worksheet objects */
        HSSFWorkbook new_workbook = new HSSFWorkbook(); //create a blank workbook object
        HSSFSheet sheet = new_workbook.createSheet("Logbook_Report");  //create a worksheet with caption score_details
        /* Define the SQL query */
        String[] headers = new String[]{"IDNUM", "DATE", "TIME_IN", "TIME_OUT", "OFFICE"};
        int cellnumB = 0;
        int rownumber= 0;
        for (int rn = 0; rn < headers.length; rn++) {
            Row r = sheet.createRow(rownumber);
            Cell cell = r.createCell(cellnumB++);
            cell.setCellValue((String) headers[rn]);
               
        }
        ResultSet query_set = stmt.executeQuery("SELECT * FROM log_itproject");
        /* Create Map for Excel Data */
        Map<String, Object[]> excel_data = new HashMap<>(); //create a map and define data
        int row_counter = 0;
        /* Populate data into the Map */
        while (query_set.next()) {
            row_counter = row_counter + 1;
            String idnum = query_set.getString("idnum");
            String date = query_set.getString("date");
            String time_in = query_set.getString("time_in");
            String time_out = query_set.getString("time_out");
            String office = query_set.getString("office");
            excel_data.put(Integer.toString(row_counter), new Object[]{idnum, date, time_in, time_out, office});
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

        FileOutputStream output_file = new FileOutputStream(new File("Excel Files/GeneratedReports.xls")); //create XLS file
        new_workbook.write(output_file);//write excel document to output stream
        output_file.close(); //close the file

    }
}
