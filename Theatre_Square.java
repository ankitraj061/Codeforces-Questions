import java.math.BigInteger;
import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int sum_n = 0;
        int sum_m = 0;
        for (int i = 0; i < n; i += a) {
            sum_n++;

        }
        for (int i = 0; i < m; i += a) {
            sum_m++;

        }
        
        BigInteger bigNumber = new BigInteger("12345678901234567890");
        System.out.println();
    }
}
