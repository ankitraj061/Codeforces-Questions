import java.util.Scanner;

public class Prime_factors_btw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int arr[] = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
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
        int count = 0;
        for (int i = 2; i < m; i++) {
            if (arr[i] == 1)
                count++;
        }
        System.out.println(count);
    }
}
