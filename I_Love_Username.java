import java.util.Scanner;

public class I_Love_Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int large = arr[0];
        int small = arr[0];

        for (int i = 1; i < n; i++) {

            if (large < arr[i]) {

                large = arr[i];
                // System.out.println(i + 1);
                count++;

            } else if (small > arr[i]) {
                small = arr[i];
                count++;
                // System.out.println(i + 1);
            }
        }
        System.out.println(count);
    }
}
