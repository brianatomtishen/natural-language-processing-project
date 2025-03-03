import java.util.ArrayList;
import java.util.Scanner;

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
