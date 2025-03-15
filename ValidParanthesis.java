/*
20. Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/
import java.util.*;


public class ValidParanthesis {
    public static boolean isValid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else if(!stack.isEmpty() && ((ch==')' && stack.peek()=='(') || (ch=='}' && stack.peek()=='{') || (ch==']' && stack.peek()=='[')))
            {
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(isValid(s));
    }
}
