import java.util.*;

public class short1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((int) Math.min(x, y) + " " + (int) Math.max(x, y));
        }
    }
}
