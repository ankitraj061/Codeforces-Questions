import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long  arr[]=new long[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            sum+=arr[i];
        } hy
        System.out.println(sum);
	

	}
}
