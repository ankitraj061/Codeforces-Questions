import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 

        while (t-- > 0) {
            long n = scanner.nextLong(); 

            
            if (hasOddDivisor(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    
    private static boolean hasOddDivisor(long n) {

        return (n & (n - 1)) != 0;
    }
}
