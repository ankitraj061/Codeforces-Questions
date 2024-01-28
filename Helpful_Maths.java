import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        char[] s2 = s1.toCharArray();
        char temp;
        for (int i = 0; i < s2.length; i += 2) {
            for (int j = i + 2; j < s2.length; j += 2) {
                if (s2[i] > s2[j]) {
                    temp = s2[j];
                    s2[j] = s2[i];
                    s2[i] = temp;
                }
            }
        }
        System.out.println(new String(s2));
    }
}