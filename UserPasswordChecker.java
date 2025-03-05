import java.util.ArrayList;
import java.util.Scanner;

public class UserPasswordChecker {
  
    private ArrayList<String> userPasswords;

    /**
 *  Constuctor of the UserPasswordChecker to check the userPasswords
 * 
 */
    public UserPasswordChecker(ArrayList<String> userPasswords) {
        this.userPasswords = userPasswords;
    }
    /**
 *  Checks if a user password is strong based on length and character variety
 * this uses booleans to check true or false on certain items letters numbers special Chars  
 */
   
    public static String checkPasswordStrength(String password) {
        boolean hasLetters = false;
        boolean hasNumbers = false;
        boolean hasSpecialChars = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLetter(c)) {
                hasLetters = true;
            } else if (Character.isDigit(c)) {
                hasNumbers = true;
            } else {
                hasSpecialChars = true;
            }
        }

        if (hasLetters && hasNumbers && hasSpecialChars) {
            return "Strong";
        } else if ((hasLetters && hasNumbers) || (hasNumbers && hasSpecialChars) || (hasSpecialChars && hasLetters)) {
            return "Medium";
        } else {
            return "Weak"; 
        }
    }
 /**
  // Allow user to input a password for strength checking * 
 */

    public void checkUserPassword() {
      Scanner scanner = new Scanner(System.in);
      String answer = "";
      
      boolean correctInput = true;
      
      while (correctInput) {
        System.out.println("\nWould you like to check your password? yes or no");
        answer = scanner.nextLine().trim().toLowerCase();
        if (answer.equals("yes")) {
          System.out.print("Enter a password to check its strength: ");
          String userPassword = scanner.nextLine();
          System.out.println("Password Strength: " + checkPasswordStrength(userPassword));
        } else if (answer.equals("no")) {
          System.out.println("Goodbye");
          correctInput = false;
        } else {
          System.out.println("We did not understand. Please enter yes/no.");
        }
      }
    }
}
