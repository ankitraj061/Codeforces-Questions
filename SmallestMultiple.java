import java.util.Scanner;

public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    if (arr[j] == 1) {
                        arr[j] = i;
                    }
                }
            }
        }

        long smallestMultiple = 1;
        for (int i = 2; i < n; i++) {
            if (arr[i] == 1) {
                smallestMultiple *= i;
            }
        }

       
    }
}
