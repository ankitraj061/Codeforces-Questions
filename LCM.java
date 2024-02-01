import java.util.Scanner;

public class LCM {
    static int findLCM(int a, int b) {
        int max = Math.max(a, b);

        for (int i = max; i <= a * b; i += max) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLCM(a, b));
    }
}
