import java.util.Scanner;

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[100];
        int i = 0;
        while (n > 0) {
            int r = n % 2;
            arr[i] = r;
            i++;
            n /= 2;

        }
        int count = 0;
        for (int j = 0; j <= i - 1; j++) {

            if (arr[j] == 1) {
                System.out.println(count);
                break;
            }
            count++;

        }
    }
}
//position of right most setBit