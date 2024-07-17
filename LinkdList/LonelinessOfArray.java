import java.util.Scanner;

public class LonelinessOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int caseNum = 0; caseNum < t; caseNum++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.println(findLoneliness(a, n));
        }

        scanner.close();
    }

    private static int findLoneliness(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }

        int result = 0;
        for (int num : a) {
            result ^= num; // Efficiently find lonely element using XOR
        }

        // Handle cases where all elements appear twice (except one) or no lonely element
        if (result == 0) {
            return -1; // No lonely element or all elements appear twice
        }

        return result; // Return the lonely element identified by XOR
    }
}
