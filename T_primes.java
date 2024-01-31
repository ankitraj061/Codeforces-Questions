import java.util.Scanner;

public class T_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int checkPrime;
        int count;
        int arr[]=new int[n];
        for(int i=0;i<n;i++ ) arr[i]=sc.nextInt();
        for (int i = 0; i < n; i++) {
            checkPrime = sc.nextInt();
            count = 0;
            for (int j = 2; j <= Math.sqrt(checkPrime); j++) {
                if (checkPrime % j == 0) {
                    count++;
                }

            }
            if (count == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
