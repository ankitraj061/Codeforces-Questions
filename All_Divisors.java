import java.util.Scanner;

public class All_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = new boolean[n + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (arr[i] == false && n % i == 0) {
                arr[i] = true;
                for (int j = i + i; j <= n; j += i) {
                    if (arr[j] == false && n % j == 0) {
                        arr[j] = true;
                    }
                }

            }
        }
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }

    }

}
//All divisors including n and 1