import java.util.Scanner;

public class sievePrimePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime[] = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    if (prime[j] == false) {
                        prime[j] = true;
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }
}
