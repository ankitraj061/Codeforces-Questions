import java.util.*;
public class BinarySearch {

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }   
        return false;
            }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int q = sc.nextInt();
        int query[]=new int[q];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            query[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            if(binarySearch(arr,query[i])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
