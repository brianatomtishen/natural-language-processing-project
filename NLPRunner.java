import java.util.ArrayList;
import java.util.Scanner;

/**
 *  instantiates checker to run through "passwords.txt"
 *  then starts printing them in console log 
 *  once done it promts the user to print their own password to be checked
 */
    public class NLPRunner {
    public static void main(String[] args) {
    PasswordStrengthChecker checker = new PasswordStrengthChecker("passwords.txt");
        
        System.out.println("Analyzing passwords from file...");
        checker.analyzePasswords();
      
        ArrayList<String> userPasswords = new ArrayList<>();
        UserPasswordChecker checking = new UserPasswordChecker(userPasswords);
        System.out.println("\nWould you like to check your password? yes or no");
        checking.checkUserPassword();

    }
}
