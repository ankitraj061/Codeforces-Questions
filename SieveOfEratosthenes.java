import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[100010];

        sieve(prime);

        long nprime = 0, yprime = 0;

        if (n < 3)
            System.out.println("1");
        else
            System.out.println("2");

        for (int i = 2; i <= n + 1; i++) {
            if (prime[i])
                System.out.print("1 ");
            else
                System.out.print("2 ");
        }
        System.out.println();
    }

    static void sieve(boolean[] prime) {
        for (int i = 0; i < 100010; i++) {
            prime[i] = true;
        }

        prime[0] = false;
        prime[1] = false;

        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }

        for (int i = 3; i < 100010; i += 2) {
            if (prime[i]) {
                for (int j = i * 2; j < 100010; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}
