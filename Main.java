import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        StringBuilder output = new StringBuilder();
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            scanner.nextLine(); 
            String sequence = scanner.nextLine().trim();
            String s=trimZeroes(sequence);
            if (canReduceToOne(s)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }
        
        System.out.print(output.toString());
        
        scanner.close();
    }
    
    private static boolean canReduceToOne(String s) {
        int n = s.length();
        if(s.charAt(0)=='1' && s.charAt(n-1)=='1') return true;

        
        int count1=0;
        int count0=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                count1++;
            }
            else
            {
                count0++;
            }
            
        }
        
        if(count1>count0)
        {
            return true;
        }
        return false;
    }
    
    private static String trimZeroes(String s) {
        
        int index1=0;
        int index2=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                index1=i;
                break;
            }

        }

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                index2=i;
                break;
            }

        }

        StringBuffer sb=new StringBuffer();
        if(index1==0 && index2==s.length()-1)
        {
            return s;
            
        }
        else if(index1==0)
        {
            sb.append(s.substring(index1,index2+1));
            sb.append("0");
            return sb.toString();
        }
        else if(index2==s.length()-1)
        {
            sb.append("0");
            sb.append(s.substring(index1,index2+1));
            return sb.toString();
        }
        else
        {
            sb.append(s.substring(index1,index2+1));
            sb.append("0");
            sb.insert(0,"0");
            return sb.toString();

        }
    }

}
