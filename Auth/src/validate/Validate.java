/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.regex.Pattern;

/**
 *
 * @author laboradagr_sd2022
 */
public class Validate {

    private String username;
    private String password;
    public String status;
    //private String confirmPassword;

    public boolean regValidator(String username, String password, String ConfirmPass, String age) {
        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");
        boolean state = true;
        int Age = Integer.valueOf(age);
        if(Age < 18){
            status = "underage";
            state = false;
        }
        if(username == null || " ".equals(username)){
            status = "Username field must be filled!";
            state = false;
        }
        if (!password.equals(ConfirmPass)) {
            status = "password and confirm password does not match";
            state = false;
        }
        if (password.length() < 8) {
            status = "Password length must have alleast 8 character !!";
            state = false;
        }
        if (!specailCharPatten.matcher(password).find()) {
            status = "Password must have atleast one special character !!";
            state = false;
        }
        if (!UpperCasePatten.matcher(password).find()) {
            status = "Password must have atleast one uppercase character !!";
            state = false;
        }
        if (!lowerCasePatten.matcher(password).find()) {
            status = "Password must have atleast one lowercase character !!";
            state = false;
        }
        if (!digitCasePatten.matcher(password).find()) {
            status = "Password must have atleast one digit character !!";
            state = false;
        }

        return state;
    }
    
}
