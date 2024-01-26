import java.util.Scanner;

public class Almost_Prime {

    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag;
        int count = 0;

        for (int i = 2; i <= n; i++) {

            flag = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && isPrime(j)) {
                    ;
                    flag++;

                }
            }
            if (flag == 2) {
                count++;

            }

        }
        System.out.println(count);

    }
}
