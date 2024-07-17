import java.util.*;

public class C_Good_Prefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            long prefix=0;
            int count = 0;
            long max=0;
            for (int j = 0; j < n; j++) {
               prefix=prefix+a[j];
               max=Math.max(max,a[j]);
               if(prefix== max *2){
                   count++;
               }
            }
            System.out.println(count);
        }
    }
}