import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = s.toLowerCase();
        char[] s1 = s2.toCharArray();
        for (int i = 0; i < s1.length; i++) {

            if (s1[i] != 'a' && s1[i] != 'A' && s1[i] != 'E' && s1[i] != 'e' && s1[i] != 'i' && s1[i] != 'I'
                    && s1[i] != 'o' && s1[i] != 'O' && s1[i] != 'u' && s1[i] != 'U' && s1[i] != 'Y' && s1[i] != 'y') {
                System.out.print(".");
                System.out.print(s1[i]);

            }
        }
    }
}