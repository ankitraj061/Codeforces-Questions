import java.util.Scanner;

public class Prime_Divisors {

    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime(i)) {

                while (n % i == 0) {
                    System.out.println(i);
                    n /= i;

                }
            }
        }
        if (n > 1)
            System.out.println(n);
    }
}
