import java.util.Scanner;

public class Beautiful_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1000 && n <= 9000) {
            for (int i = n + 1; i != 0; i++) {
                if (i % 10 != (i / 10) % 10 && i % 10 != ((i / 10) / 10) % 10
                        && (i / 10) % 10 != ((i / 10) / 10) % 10 && i % 10 != (((i / 10) / 10) / 10) % 10
                        && (i / 10) % 10 != (((i / 10) / 10) / 10) % 10
                        && ((i / 10) / 10) % 10 != (((i / 10) / 10) / 10) % 10) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
