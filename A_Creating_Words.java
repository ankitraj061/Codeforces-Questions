import java.util.*;

public class A_Creating_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
           String s = sc.next();
           String w= sc.next();
           System.out.print(w.charAt(0) );
           for(int j=1;j<s.length();j++){
            System.out.print(s.charAt(j));

           }
           System.out.print(" "+s.charAt(0));
           for(int j=1;j<s.length();j++){
            System.out.print(w.charAt(j));

           }
           System.out.println();
        }
    }
}