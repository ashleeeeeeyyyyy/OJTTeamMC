/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Earl
 */
public class Validator {

    public static Boolean checkDigit(String text) {
        boolean res = false;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                res = true;
            }
        }
        return res;
    }
    
    public static Boolean passwordValidator(String password) {
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

    public static Boolean checkWhitespace(String text) {
        boolean res = false;

        if (Character.isWhitespace(text.charAt(0))) {
            res = true;
        }

        return res;
    }

    public static Boolean checkSymbols(String text) {
        boolean res = false;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetterOrDigit(text.charAt(i))) {
                res = true;
            }
        }
        return res;
    }

    public static Boolean codeValidator(String code) {
        boolean flag = false;

        if ((code.length() == 5 || code.length() == 4) && code.charAt(0) == '9') {
            return true;
        }

        return flag;
    }

    public static Boolean registeredAlready(String id, String subject) {
        boolean res = false;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String query;

        try {
            con = jdbc.connection.DBConnection.connectDB();

            query = "SELECT * from `accounts` natural join `subject` where `idnumber` = ? and `subj_title` = ?";

            ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, subject);

            rs = ps.executeQuery();
            if (rs.next()) {
                res = true;
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public static Boolean idNumberExists(String idnumber) {
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
            Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public static Boolean idValidator(String id) {
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
}
