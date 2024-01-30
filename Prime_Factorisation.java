import java.util.Scanner;

public class Prime_Factorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                for (int j = 2 * i; j < n; j += i) {
                    if (arr[j] == 1) {
                        arr[j] = i;

                    }

                }
            }

        }
        int arr1[] = new int[n + 1];
        int l = 0;
        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 1) {
                arr1[l] = i;
                l++;
            }
        }
        // for (int i = 0; i < l; i++) {
        // System.out.println(arr1[i]);
        // }
        int count = 0;
        for (int i = 5; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j] + arr1[j + 1] + 1) {
                    count++;
                }
            }
        }
        if (count >= k) {
            System.out.println("YES");
        } else
            System.out.println("NO");

    }
}
