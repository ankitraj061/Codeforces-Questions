import java.math.BigInteger;
import java.util.*;

public class C_Again_Twenty_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        BigInteger base = BigInteger.valueOf(5);
        BigInteger exponent = BigInteger.valueOf(n);
        
        BigInteger result = base.modPow(exponent, BigInteger.valueOf(100)); 

        System.out.println(result);
    }
}
