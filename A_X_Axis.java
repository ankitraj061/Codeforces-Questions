import java.util.*;

public class A_X_Axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int a[] = new int[3];

            for (int j = 0; j < 3; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(Math.abs(a[0] - a[1]) + Math.abs(a[1] - a[2]));
        }
    }
}