import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s1 = new char[5];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'h' && i + 1 < s.length() && s.charAt(i + 1) != 'h' && count == 0) {
                s1[0] = 'h';
                count = 1;

            } else if (s.charAt(i) == 'e' && i + 1 < s.length() && s.charAt(i + 1) != 'e' && count == 1) {
                s1[1] = 'e';
                count = 2;

            } else if (((s.charAt(i) == 'l' && i + 2 < s.length() && s.charAt(i + 1) == 'l' && s.charAt(i + 2) != 'l')
                    || (s.charAt(i) == 'l' && i + 1 < s.length() && s.charAt(i + 1) != 'l')) && count == 2) {
                s1[2] = 'l';

                count = 3;

            } else if (((s.charAt(i) == 'l' && i + 2 < s.length() && s.charAt(i + 1) == 'l' && s.charAt(i + 2) != 'l')
                    || (s.charAt(i) == 'l' && i + 1 < s.length() && s.charAt(i + 1) != 'l')) && count == 3) {
                s1[3] = 'l';
                count = 4;

            } else if (s.charAt(i) == 'o' && count == 4) {
                s1[4] = 'o';
            }
        }
        String s3 = new String(s1);
        // System.out.println(s3);
        if (s3.equals("hello")) {
            System.out.println("YES");
        } else
            System.out.println("NO");

    }
}
