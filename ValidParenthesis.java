
import java.util.*;
public class ValidParenthesis {

    public static boolean isValid(String str)
    {
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[')
            {
                s.push(ch);//stack push is only for the opening parenthesis
            
            }
            else
            {
                //closing
                if(s.isEmpty())//means there is no opening parenthesis in string so no parenthesis will add in stack
                {
                    return false;
                }

                if((s.peek()=='(' && ch==')')
                || (s.peek()=='{' && ch=='}')
                || (s.peek()=='[' && ch==']')
                )
                {
                    s.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        if(s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {
        String str="(({}}))";
        System.out.println(isValid(str));
    }
}
