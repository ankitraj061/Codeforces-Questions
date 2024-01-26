import java.util.Scanner;
import java.lang.String.*;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.charAt(0) >= 97) {
            System.out.print(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                System.out.print(s.charAt(i));

            }

        } else {
            System.out.println(s);
        }

    }
}
