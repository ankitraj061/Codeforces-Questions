import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        char[] newStr = s.toCharArray();
        char temp;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (newStr[j] == 'B' && newStr[j + 1] == 'G') {
                    temp = newStr[j];
                    newStr[j] = newStr[j + 1];
                    newStr[j + 1] = temp;
                    j++;
                }
            }
        }

        System.out.println(new String(newStr));
    }
}
