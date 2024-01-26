import java.util.Scanner;
import java.lang.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countSmall = 0, countCap = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 122 && s.charAt(i) >= 97) {
                countSmall++;
            } else {
                countCap++;
            }
        }
        int index;
        if (countCap == countSmall) {
            System.out.println(s.toLowerCase());
        } else if (countCap > countSmall) {
            System.out.println(s.toUpperCase());
        } else
            System.out.println(s.toLowerCase());

    }
}
