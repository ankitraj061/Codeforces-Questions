import java.util.Scanner;

public class Pleasant_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int count;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();

            }
            count = 0;
            for (int k = 0; k < n; k++) {

                for (int l = k + 1; l < n; l++) {
                    if (k < l && arr[k] * arr[l] == k + 1 + l + 1) {
                        count++;
                    }
                }

            }
            System.out.println(count);

        }

    }
}
