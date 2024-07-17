import java.util.*;

public class C_Closest_to_the_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[q];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int low = 0;    
            int high = n - 1;
            boolean found = false;
            while(low<=high){
                int mid = (low + high) / 2;
                if( mid >0 && mid==n-1 && a[mid]>=b[i] && a[mid-1]<b[i]){
                    System.out.println(n);
                    found = true;
                    break;
                }
                else if(  mid==0 && a[mid]>=b[i] ){
                    System.out.println(1);
                    found = true;
                    break;
                }
                else if( mid >0 && a[mid] >= b[i] && a[mid - 1] < b[i] ){
                    System.out.println(mid+1);
                    found = true;
                    break;
                }
                else if(a[mid] < b[i]){
                    low = mid + 1;
                }
                else{
                    high=mid-1;
                }
            }
            if(!found){
                System.out.println(n+1);
            }
            
        }
    }
}