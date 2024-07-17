import java.util.*;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // consume the newline character
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();  // consume the newline character
            String password = sc.nextLine();
            
            // Initialize parts
            StringBuilder digits = new StringBuilder();
            StringBuilder letters = new StringBuilder();
            boolean valid = true;

            // Separate digits and letters and check mixed order
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digits.append(ch);
                } else if (Character.isLetter(ch)) {
                    letters.append(ch);
                }
            }
            
            // Check if digits are sorted in non-decreasing order
            for (int j = 0; j < digits.length() - 1; j++) {
                if (digits.charAt(j) > digits.charAt(j + 1)) {
                    valid = false;
                    break;
                }
            }
            
            // Check if letters are sorted in non-decreasing order
            for (int j = 0; j < letters.length() - 1; j++) {
                if (letters.charAt(j) > letters.charAt(j + 1)) {
                    valid = false;
                    break;
                }
            }
            
            // Check if any digit appears after any letter in the original password
            boolean foundLetter = false;
            for (char ch : password.toCharArray()) {
                if (Character.isLetter(ch)) {
                    foundLetter = true;
                } else if (foundLetter && Character.isDigit(ch)) {
                    valid = false;
                    break;
                }
            }
            
            // Output result for this test case
            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
