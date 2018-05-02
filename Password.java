import javax.swing.*;
import java.util.*;
import java.util.regex.Pattern;

public class Password {

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a given  password : ");
    String password = in.nextLine();
    List<String> errorList = new ArrayList<>();

    while (!isValid(password, confirmpassword, errorList)) {
    System.out.print("Please re-enter the password to confirm : ");
    String confirmpassword = in.nextLine();

        System.out.println("The password entered here  is invalid");
        for (String error : errorList) {
            System.out.println(error);
        }

        System.out.print("Please enter a given  password : ");
        password = in.nextLine();
        System.out.print("Please re-enter the password to confirm : ");
        confirmpassword = in.nextLine();
    }
    System.out.println("your password is: " + password);

}

public static boolean isValid(String password, String confirmpassword, List<String> errorList) {

    Pattern specialChar = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    Pattern UpperCase = Pattern.compile("[A-Z ]");
    Pattern lowerCase = Pattern.compile("[a-z ]");
    Pattern digitCase = Pattern.compile("[0-9 ]");
    errorList.clear();

    boolean flag=true;

    if (!password.equals(confirmpassword)) {
        errorList.add("password and confirm password does not match");
        flag=false;
    }
    if (password.length() < 8) {
        errorList.add("Password lenght must have alleast 8 character !!");
        flag=false;
    }
    if (!specialChar.matcher(password).find()) {
        errorList.add("Password must have atleast one special character !!");
        flag=false;
    }
    if (!UpperCase.matcher(password).find()) {
        errorList.add("Password must have atleast one uppercase character !!");
        flag=false;
    }
    if (!lowerCase.matcher(password).find()) {
        errorList.add("Password must have atleast one lowercase character !!");
        flag=false;
    }
    if (!digitCase.matcher(password).find()) {
        errorList.add("Password must have atleast one digit character !!");
        flag=false;
    }

    return flag;

}
}
