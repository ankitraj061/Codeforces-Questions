import java.util.Scanner;

public class HCF {
    public static int findHCF(int n, int m) {

        int max;
        if (n > m)
            max = n;
        else
            max = m;
        for (int i = max / 2; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                return i;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = findHCF(n, m);
        System.out.println(result);
    }
}
