import java.util.Scanner;

public class Bit__ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.charAt(0) == '+') {
                ++count;

            } else if (s.charAt(0) == '-') {
                --count;
            } else {
                if (s.charAt(1) == '+') {
                    count++;
                } else
                    count--;
            }

        }
        System.out.println(count);
        sc.close();
    }
}
