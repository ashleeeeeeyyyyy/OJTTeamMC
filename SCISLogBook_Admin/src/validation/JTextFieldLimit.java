package validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.text.*;

/**
 *
 * @author Earl
 */
public class JTextFieldLimit extends PlainDocument {

    public int limit;
    // optional uppercase conversion
    public boolean toUppercase = false;

    public JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }
    

    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {
            if (toUppercase) {
                str = str.toUpperCase();
            }
            super.insertString(offset, str, attr);
        }
    }

    public static void main(String args[]) {
      
    }
}
