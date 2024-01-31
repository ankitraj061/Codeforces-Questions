import java.util.Scanner;

public class Sherlock_and_his_girlfriend {
    public static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = n - 1;
        int arr[] = new int[n];
        for (int i = 0; i <= index; i++) {
            arr[i] = i + 2;

        }
        int check;
        for (int i = 0; i <= Math.sqrt(n + 1); i++) {
            if (isPrime(arr[i]) && arr[i] != 0) {
                check = arr[i];

                for (int j = i; j <= index; j += check) {
                    if (n > 5)
                        arr[j] = 0;
                    else if (n == 1 || n == 2) {

                    } else if (n == 3 || n == 4) {
                        arr[0] = 0;
                        arr[2] = 0;
                    }

                }
            }
        }
        int count = 0;
        for (int i = 0; i <= index; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
        int t = 0;
        for (int i = 0; i <= index; i++) {
            if (arr[i] == 0) {
                t++;
                System.out.print(t);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            } else {
                System.out.print(1);
                if (i < n - 1) {
                    System.out.print(" ");
                }

            }
        }
    }
}
