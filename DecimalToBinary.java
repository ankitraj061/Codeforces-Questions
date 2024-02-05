import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        boolean arr[] = new boolean[n];
        int i = 0;
        while (n > 0) {
            if (n % 2 == 1)
                arr[i] = true;
            else
                arr[i] = false;
            n /= 2;

            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            if (arr[j] == true) {
                System.out.print(1);
            } else
                System.out.print(0);
        }

    }
}
