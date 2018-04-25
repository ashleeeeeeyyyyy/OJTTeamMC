/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Earl
 */
public class Student {
    int ID;
    String fName;
    String lName;
    String subject;
    String code;
    String adviser;

    public Student(int ID, String fName, String lName, String subject, String code, String adviser) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
        this.code = code;
        this.adviser = adviser;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public int getID() {
        return ID;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getSubject() {
        return subject;
    }

    public String getCode() {
        return code;
    }

    public String getAdviser() {
        return adviser;
    }
}
