package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracketsInExpression
{
    public static void main(String[] args)
    {
        boolean flag = false;

        Scanner scanner = new Scanner(System.in);
        Stack<Character> myString = new Stack<>();
        String expression = scanner.nextLine();
        for (int i = 0; i < expression.length() ; i++)
        {
            char chr = expression.charAt(i);
            if (chr ==  ')')
            {
                if (myString.peek() == '(')
                {

                    flag = true;
                    break;
                }else {
                    while (myString.peek() != '(')
                    {
                        myString.pop();
                    }
                    //for that opening bracket also
                    myString.pop();
                }

            }else {
                myString.push(chr);
            }

        }
        if (flag)
        {
            System.out.println("YES Duplicate Brackets");
        }else {
            System.out.println("NO Duplicate Brackets");
        }
    }
}
