import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int r = 0, i = 0;
        int sum = 0;
        while (n > 0) {
            r = (int) n % 10;
            sum = sum + r * (int) Math.pow(2, i);
            n /= 10;
            i++;
        }
        System.out.println(sum);
    }
}
//binary to decimal