package drugstore;


import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bustamantecr_sd2022
 */
public class Validate {
    private String name;
    private String username;
    private String password;
    //private String confirmPassword;

    public boolean regValidator(String name, String username, String password, String ConfirmPass) {
        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");
        boolean state = true;
        if(username == null || " ".equals(username)){
            System.out.println("Username field must be filled!");
            state = false;
        }
        if (!password.equals(ConfirmPass)) {
            System.out.println("password and confirm password does not match");
            state = false;
        }
        if (password.length() < 8) {
            System.out.println("Password length must have alleast 8 character !!");
            state = false;
        }
        if (!specailCharPatten.matcher(password).find()) {
            System.out.println("Password must have atleast one special character !!");
            state = false;
        }
        if (!UpperCasePatten.matcher(password).find()) {
            System.out.println("Password must have atleast one uppercase character !!");
            state = false;
        }
        if (!lowerCasePatten.matcher(password).find()) {
            System.out.println("Password must have atleast one lowercase character !!");
            state = false;
        }
        if (!digitCasePatten.matcher(password).find()) {
            System.out.println("Password must have atleast one digit character !!");
            state = false;
        }

        return state;
    }
}
