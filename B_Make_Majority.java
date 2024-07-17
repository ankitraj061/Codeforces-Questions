import java.util.Scanner;

public class B_Make_Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        StringBuilder output = new StringBuilder();
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String sequence = scanner.nextLine().trim();
            
            if (sequence.equals("1")) {
                output.append("YES\n");
                continue;
            }
            
            // Reduce the sequence until it becomes "1" or cannot be reduced further
            while (sequence.length() > 1) {
                StringBuilder newSequence = new StringBuilder();
                int i = 0;
                
                while (i < sequence.length()) {
                    char currentChar = sequence.charAt(i);
                    int start = i;
                    
                    // Find the end of the current segment of the same characters
                    while (i < sequence.length() && sequence.charAt(i) == currentChar) {
                        i++;
                    }
                    
                    // Determine the majority of the segment [start, i-1]
                    if (currentChar == '0') {
                        newSequence.append('0');
                    } else {
                        newSequence.append('1');
                    }
                }
                
                sequence = newSequence.toString();
                
                if (sequence.equals("1")) {
                    output.append("YES\n");
                    break;
                }
            }
            
            if (!sequence.equals("1")) {
                output.append("NO\n");
            }
        }
        
        // Print all results at once
        System.out.print(output.toString());
        
        scanner.close();
    }
}
