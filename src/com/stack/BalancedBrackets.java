package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> myStack = new Stack<>();
        String myExp = scanner.nextLine();
        boolean flag = false;

        // [(a+b)+{(c+d *(e/f)}]
        for (int i = 0; i <  myExp.length(); i++)
        {
            char ch = myExp.charAt(i);
            if (ch == ')'|| ch == '}'  || ch == ']')
            {
                if ( myStack.size() > 0)
                {
                    if (((ch == ')' &&  myStack.peek() == '(') ||
                        (ch == '}' &&  myStack.peek() == '{') ||
                        (ch == ']' &&  myStack.peek() == '[') ))
                    {
                        myStack.pop();
                        flag = true;
                    }else {
                        flag = false;
                       // System.out.println("unbalance bracekt as it mismatched");
                        break;
                    }
                }else {
                    flag = false;
                   // System.out.println("there is nothing in stack,,unbalanced bracket");
                    break;
                }

            }else {
                if (ch == '('|| ch == '{'  || ch == '[')
                {
                    myStack.push(ch);
                }

            }

        }
        if(myStack.size()>0)
        {
            flag = false;
        }
        if (flag)
        {
            System.out.println("Balanced bracekt");
        }else {
            System.out.println("UNBalanced bracekt");
        }
    }
}
