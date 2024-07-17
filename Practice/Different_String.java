import java.util.Arrays;
import java.util.Scanner;
public class Different_String{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuffer s = new StringBuffer(sc.next());
            Arrays.sort(s.toString().toCharArray());

            if(s.toString().equals(s.reverse().toString())){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(s);
            }

        }

    }
     
}