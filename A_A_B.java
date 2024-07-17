import java.util.*;

public class A_A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            
            String s=sc.next();
            if(s.length()==1){
                System.out.println(s);
            }
            else{
                char a=s.charAt(0);
                char b=s.charAt(2);
                int digit1=a-'0';
                int digit2=b-'0';
                System.out.println(digit1+digit2);
            }
        }
    }
}