import java.util.ArrayList;
import java.util.Scanner;

public class PasswordStrengthChecker {
    private ArrayList<String> passwords;

    // Constructor
    public PasswordStrengthChecker(String filename) {
        this.passwords = FileReader.toStringList(filename);
    }

    // Check if a password is strong based on length and character variety
    public String checkStrength(String password) {
        int length = password.length();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSymbol = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (!Character.isLetterOrDigit(c)) hasSymbol = true;
        }

        if (length >= 7 && hasUpper && hasLower && hasDigit && hasSymbol) {
            return "Strong";
        } else if (length >= 4 && ((hasUpper && hasLower) || (hasDigit && hasSymbol))) {
            return "Medium";
        } else {
            return "Weak";
        }
    }

    // Analyze all passwords in the file
    public void analyzePasswords() {
        for (String password : passwords) {
            System.out.println(password + " -> " + checkStrength(password));
        }
    }

    
}
