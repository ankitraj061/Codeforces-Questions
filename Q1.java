import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[3];
        int sum[] = new int[3];
        sum[0] = 0;
        sum[1] = 0;
        sum[2] = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 3; j++) {
                if (arr[j] <= 100 && arr[j] >= -100) {
                    arr[j] = sc.nextInt();
                    sum[j] += arr[j];
                }

            }

        }

        if (sum[0] == 0 && sum[1] == 0 && sum[2] == 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }

}