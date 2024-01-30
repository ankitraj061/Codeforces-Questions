import java.util.Scanner;

public class Prime_factors_btw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (arr[i] == 1) {
                for (int j = i * i; j < m; j += i) {
                    if (arr[j] == 1) {
                        arr[j] = i;

                    }

                }
            }

        }
        for (int i = n; i < m; i++) {
            if (arr[i] == 1)
                System.out.println(i);
        }

    }
}
