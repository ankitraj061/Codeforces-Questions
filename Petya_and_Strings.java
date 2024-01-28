import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(0);

        } else {
            if (s1.compareToIgnoreCase(s2) > 0) {
                System.out.println(1);

            } else
                System.out.println(-1);
        }
    }
}
