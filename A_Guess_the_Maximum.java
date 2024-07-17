import java.util.*;

public class A_Guess_the_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int maxTwo[]=new int[n-1];
            for (int j = 0; j < n - 1; j++) {
                maxTwo[j] = Math.max(a[j], a[j + 1]);
            }
            Arrays.sort(maxTwo);
            System.out.println(maxTwo[0]-1);
        }
    }
}