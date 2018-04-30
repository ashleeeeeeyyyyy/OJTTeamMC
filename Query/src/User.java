/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invinoveritas
 */
public class User {

    private int idnumber;
    private String fname;
    private String lname;
    private String subject;

    public User(int idnumber, String fname, String lname, String subject) {
        this.idnumber = idnumber;
        this.fname = fname;
        this.lname = lname;
        this.subject = subject;
    }

    public int getId() {
        return idnumber;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getSubject() {
        return subject;
    }

}
