import java.util.Scanner;

public class B_Increase_Decrease_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n + 1];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n + 1; i++) {
                b[i] = sc.nextInt();
            }

            long count = 0;
            boolean flag = true;

            for (int i = 0; i < n; i++) {
                count += Math.abs(a[i] - b[i]);
                if (b[n] < Math.max(a[i], b[i]) && b[n] > Math.min(a[i], b[i])) {
                    flag = false;
                }
            }

            long min = Long.MAX_VALUE;
            if (flag) {
                for (int i = 0; i < n; i++) {
                    min = Math.min(min, Math.abs(a[i] - b[n]));
                }
                for (int i = 0; i < n; i++) {
                    min = Math.min(min, Math.abs(b[i] - b[n]));
                }
                System.out.println(count + min + 1);
            } else {
                System.out.println(count + 1);
            }
        }
    }
}
