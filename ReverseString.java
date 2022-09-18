import java.util.Stack;

public class ReverseString
{
    public static String revString(String s)
    {
        Stack<Character>st=new Stack<>();
        int index=0;
        while(index<s.length())
        {
            st.push(s.charAt(index));
            index++;
        }

        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty())
        {
            char curr=st.pop();
            sb.append(curr);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String result=revString("MYNameisLakhan");
        System.out.println(result);
    }
}