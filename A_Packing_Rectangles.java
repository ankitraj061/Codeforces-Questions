import java.util.*;
public class A_Packing_Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        long low = 0;
        long high = (long) Math.max(w, h) * n;
        
        
        while (low < high) {
            long mid = low + (high - low) / 2;
            if ((long)(mid / w) * (long)(mid / h) >= n) {
                
                high = mid ;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low);
    }
}
