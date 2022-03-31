package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluationAndConversion2Infix_n_Postfix
{

    // -+2/*6483

    /*
    most important points
    1. start picking digits or char from left most end
    2. v1 will be top most value not like other case where
     v1 was the lower one
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();

        Stack<Integer> evalutaion = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length()-1; i >=0 ; i--)
        {

            char ch = exp.charAt(i);
          if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
          {
              int v1 = evalutaion.pop();
              int v2 = evalutaion.pop();
              int res = perform_operation(v1,v2,ch);
              evalutaion.push(res);


               // ( v1 op v2 )
              String i1 = infix.pop();
              String i2 = infix.pop();
              String res_Infix = "("+ i1 + ch + i2 + ")";
              infix.push(res_Infix);


              //v1 v2 op
              String p1 = postfix.pop();
              String p2 = postfix.pop();
              String res_postfix = p1 + p2 + ch;
              postfix.push(res_postfix);


          }else if(Character.isDigit(ch))
          {
              evalutaion.push(ch - '0');
              infix.push(ch+"");
              postfix.push(ch+"");
          }

        }
        System.out.println(infix.peek());
        System.out.println(evalutaion.peek());
        System.out.println(postfix.peek());
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
