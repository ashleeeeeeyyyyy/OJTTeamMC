/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Earl
 */
public class DBConnection {

    private static Connection con = null;

    public static Connection connectDB() {
        String dbDriver = "com.mysql.jdbc.Driver";
        String connStr = "jdbc:mysql://localhost:8889/scislog?user=root&pwd=";
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(connStr);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
