import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg = 0;
        for (int i = 0; i < n; i++) {
            double d = sc.nextFloat();
            avg += d;
        }
        System.out.printf("%.12f%n", avg / n);
    }
}