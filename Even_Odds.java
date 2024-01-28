import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long count = 0;
        for (long i = 1; i <= n; i += 2) {
            count++;
            if (count == k) {
                System.out.println(i);
                break;
            }
        }
        for (long i = 2; i <= n; i += 2) {
            count++;
            if (count == k) {
                System.out.println(i);
                break;
            }
        }

    }
}
