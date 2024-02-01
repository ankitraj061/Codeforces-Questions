import java.util.Scanner;

public class T_primes {
    public static boolean isPrime(long n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long arr[] = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        for (int i = 0; i < n; i++) {
            if (arr[i] == (long) Math.pow((long) Math.sqrt(arr[i]), 2) && isPrime((long) Math.sqrt(arr[i]))) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }

        }
    }
}
