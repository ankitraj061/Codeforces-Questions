import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        boolean flag = false;
        int orig = n;
        while (n > 0) {
            r = n % 10;
            if (r != 4 && r != 7) {
                flag = true;

                break;

            }
            n /= 10;

        }
        if (orig % 4 == 0 || orig % 7 == 0 || flag == false || orig % 47 == 0) {
            System.out.println("YES");
        } else if (flag == true)
            System.out.println("NO");
        // System.out.println(47 % 10);
    }

}
