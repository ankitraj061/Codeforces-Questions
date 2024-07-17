import java.util.*;

public class D_Fast_search {

    public static int countInRange(int[] a, int l, int r) {
        int lb = lowerBound(a, l);
        int ub = upperBound(a, r);
        return ub - lb;
    }

    public static int lowerBound(int[] a, int l) {
        int low = 0;
        int high = a.length;
        
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] >= l) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int[] a, int r) {
        int low = 0;
        int high = a.length;
        
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] > r) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            System.out.print(countInRange(a, l, r) + " ");
        }
    }
}
