import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t;
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            t = arr[i];

            for (long j = 3; j <= t; j += 2) {
                if (t % j == 0) {
                    arr[i] = 1;

                } else {
                    arr[i] = 0;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
