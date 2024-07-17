import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();
            int value3 = scanner.nextInt();

            int totalSum = value1 + value2 + value3;

            if (totalSum % 2 != 0) {
                System.out.println(-1);
            } else {
                int largestValue = Math.max(value1, Math.max(value2, value3));
                int sumOfOtherTwo = totalSum - largestValue;

                if (sumOfOtherTwo <= largestValue) {
                    System.out.println(sumOfOtherTwo);
                } else {
                    System.out.println(sumOfOtherTwo - (sumOfOtherTwo - largestValue) / 2);
                }
            }
        }

        scanner.close();
    }
}
