import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    break;

                }
            }
        }
        if ((s.length() - count) % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else
            System.out.println("IGNORE HIM!");
    }
}
