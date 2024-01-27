import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();

        }
        int lastScore = s[k - 1];
        for (int i = 0; i < n; i++) {
            if (s[i] >= lastScore && s[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
