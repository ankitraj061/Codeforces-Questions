import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s[]=new String[5];
        for (int i = 0; i < 5; i++) {
            s[i] = sc.next();
        }
        System.out.println(s[0]);
    }
}
