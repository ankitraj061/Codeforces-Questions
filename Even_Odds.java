import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        if ((n / 2 >= k && n % 2 == 0) || (n % 2 == 1 && (n / 2) + 1 >= k)) {
            System.out.println(2 * k - 1);
        } else {
            if (n % 2 == 0)
                k = k - n / 2;
            else
                k = k - (n / 2) - 1;
            // System.out.println(k);
            System.out.println(2 * k);
        }

    }
}
