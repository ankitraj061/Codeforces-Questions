
import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        long count = 0;
        long count2 = 0;
        if (n % a == 0) {
            count = n / a;

        } else if (n % a != 0) {
            count = n / a + 1;
        }
        if (m % a == 0) {
            count2 = m / a;
        } else if (m % a != 0) {
            count2 = m / a + 1;

        }
        System.out.println(count * count2);

    }
}
