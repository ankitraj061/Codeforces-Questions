import java.util.Scanner;

public class PowerOf2 {
    static boolean checkPowOf2(int n) {
        int checkN = n;
        if (n % 2 == 1)
            return false;
        int count = 0;
        while (n > 1) {
            count++;
            n /= 2;
        }

        if ((int) Math.pow(2, count) == checkN) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowOf2(n));
    }
}