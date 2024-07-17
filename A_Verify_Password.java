import java.util.*;

public class A_Verify_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();  
            String password = sc.nextLine();
            
        
            StringBuilder digits = new StringBuilder();
            StringBuilder letters = new StringBuilder();
            boolean valid = true;

            
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digits.append(ch);
                } else if (Character.isLetter(ch)) {
                    letters.append(ch);
                }
            }
            
            
            for (int j = 0; j < digits.length() - 1; j++) {
                if (digits.charAt(j) > digits.charAt(j + 1)) {
                    valid = false;
                    break;
                }
            }
            
            
            for (int j = 0; j < letters.length() - 1; j++) {
                if (letters.charAt(j) > letters.charAt(j + 1)) {
                    valid = false;
                    break;
                }
            }
            

            boolean foundLetter = false;
            for (char ch : password.toCharArray()) {
                if (Character.isLetter(ch)) {
                    foundLetter = true;
                } else if (foundLetter && Character.isDigit(ch)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
