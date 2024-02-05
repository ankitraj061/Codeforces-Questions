import java.util.Scanner;

public class recursion {
    static int printN(int n) {

        if (n < 10 && n >= 0)
            return n;
        return n % 10 + printN(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = printN(n);
        System.out.println(x);
    }
}




jifa
