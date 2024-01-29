import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        int check = 0, sumb = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sumb = sumb + b - a;
            if (check < sumb) {
                check = sumb;
            }

        }
        System.out.println(check);
    }
}
