package Microsoft;
import java .util.*;
public class question150 {
    public static void main(String args[])
    {
        String s[]={"2","1","+","3","*"};
        System.out.println(evalRPN(s));
    }

    public static int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack();
        String operator ="+-*/";
        for(String s:tokens)
        {
            if(operator.contains(s)&& !(stack.isEmpty()))
            {
                int a = stack.pop();
                int b = stack.pop();
                int c=solve(s,a,b);
                stack.push(c);
            }
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
    public static int solve(String s ,int op1,int op2)
    {
        if(s.equals("+"))return op2+op1;
        else if(s.equals("-"))return op2-op1;
        else if(s.equals("/"))return op2/op1;
        return op2*op1;
    }
    
}
