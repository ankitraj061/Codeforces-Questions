import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        int large = 0;
        int p = -1, q = 0;
        for (int i = 0; i < n; i++) {
            if (large < arr[i]) {
                large = arr[i];
                p = i;

            }
        }

        int temp;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[0] != arr[p]) {
                temp = arr[p];
                arr[p] = arr[p - 1];
                arr[p - 1] = temp;
                p--;
                count++;

            }

        }
        for (int i = 0; i < n; i++) {
            if (small >= arr[i]) {
                small = arr[i];
                q = i;
            }

        }

        for (int i = 0; i < n; i++) {
            if (arr[n - 1] != arr[q]) {
                temp = arr[q];
                arr[q] = arr[q + 1];
                arr[q + 1] = temp;
                q++;
                count++;

            }
        }

        System.out.println(count);
    }
}
