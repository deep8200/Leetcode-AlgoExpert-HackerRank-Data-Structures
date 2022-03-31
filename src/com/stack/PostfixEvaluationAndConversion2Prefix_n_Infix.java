package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluationAndConversion2Prefix_n_Infix
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();


        Stack<Integer> evaluation = new Stack<>();
        Stack<String>infix = new Stack<>();
        Stack<String>prefix = new Stack<>();

        for (int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch))
            {
                evaluation.push(ch - '0');
                infix.push(ch+"");
                prefix.push(ch+"");
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                /*
                pop 2 from all 3 stacks
                do the operation and push back the result in all 3 stacks
                for evaluation  push result
                for infix push v1 op v2
                for prefix op v1 v2
                 */
                int v2 = evaluation.pop();
                int v1 = evaluation.pop();
                int res = perform_operation(v1,v2,ch);
                evaluation.push(res);

                // v1 op v2
                String i2 = infix.pop();
                String i1 = infix.pop();
                String iR = "( " + i1 + ch + i2+ " )";
                infix.push(iR);

                // op v1 v2
                String p2 = prefix.pop();
                String p1 = prefix.pop();
                String pR = ch + p1 + p2;
                prefix.push(pR);
            }

        }
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
    }

    private static int perform_operation(int v1, int v2, char operator)
    {
        if(operator == '+' )
        {
         return  v1 + v2;
        }else if(operator == '-')
        {
            return  v1 - v2;
        }else if(operator == '*')
        {
            return  v1 * v2;
        }else if(operator == '/')
        {
            return  v1 / v2;
        }else {
            return  -1;
        }
    }
}
