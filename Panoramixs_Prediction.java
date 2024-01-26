import java.util.Scanner;

public class Panoramixs_Prediction {
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
        int m = sc.nextInt();
        int t = 0;
        for (int i = n + 1; i != 0; i++) {
            if (isPrime(i)) {
                t = i;
                break;

            }
        }
        if (t == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
