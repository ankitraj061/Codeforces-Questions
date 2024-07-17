import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F_Heads_or_Tails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        List<int[]> pairList = new ArrayList<>();
        
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    int[] pair = {i, j};
                    pairList.add(pair);
                }
            }
        }
        
        System.out.println(pairList.size());
        
        for (int[] pair : pairList) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
