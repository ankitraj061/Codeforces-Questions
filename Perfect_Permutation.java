import java.util.Scanner;

public class Perfect_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1) {
                System.out.println(-1);
                break;

            } else {
                if (i % 2 == 1) {
                    System.out.print(i + 1);
                    if (i < n)
                        System.out.print(" ");

                } else {
                    System.out.print(i - 1);
                    if (i < n)
                        System.out.print(" ");
                }
            }
        }
    }
}
