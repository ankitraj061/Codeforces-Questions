import java.util.Scanner;

public class A_Balanced_Problemset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char[] st=new char[a*b];
            int count=0;
            String s = "abcdefghijklmnopqrstuvwxyz";
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {
                    st[count]=s.charAt(j);
                    count++;
                }

            }
            for(int j=0;j<count-1;j++){
                
            }
            System.out.println();
        }
    }
}
