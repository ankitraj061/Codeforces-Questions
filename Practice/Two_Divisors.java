import java.util.Scanner;

public class Two_Divisors {
    static long gcd(long a, long b) {
        while (b != 0 && a != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }

    static long LCM(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (LCM(a, b) == b) {
                System.out.println(b * (b / a));
            } else {
                System.out.println(LCM(a, b));
            }
        }
    }
}