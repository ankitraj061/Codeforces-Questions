import java.util.*;

public class Little_Nikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n < m) {
                System.out.println("NO");
            } else if (n == m) {
                System.out.println("YES");
            } else if ((n % 2 == 0 && m % 2 == 0) || (n % 2 == 1 && m % 2 == 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
