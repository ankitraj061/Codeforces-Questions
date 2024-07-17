import java.util.Scanner;

public class D_Payment_Without_Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i=0;i<t;i++){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long n = scanner.nextLong();
            long s = scanner.nextLong();
            long d=0;
           for(int j=(int)n;j<=a*n;j+=n){
            
            if(j<=s){
                d=j;
            }
            if(j>s){
                break;
            }
           }
           
            if(d+b>=s ){
            
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
               
          
        }
        
    
    }
}
