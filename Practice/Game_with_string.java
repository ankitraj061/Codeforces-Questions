import java.util.*;
class Game_with_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(st.isEmpty() || st.peek() != c)
            {
                st.push(c);
            }
            else
            {
                count++;
                st.pop();
            }
        }
        if(count%2 != 0){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}