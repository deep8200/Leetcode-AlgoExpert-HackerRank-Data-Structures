package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class SmallestNumberOfParticularPattern
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();

        /*
        steps:
        0. take num = 1;
        1. for d -
           push num in stack
           num++

        2. for i -
         push num in stack
         num++;
         pop everything from stack

         */
        Stack<Integer> smallestNumber = new Stack<>();
        int num = 1;
        for (int i = 0; i <pattern.length() ; i++)
        {
            char ch = pattern.charAt(i);
            if (ch == 'd')
            {
                smallestNumber.push(num);
                num++;

            }else {
               smallestNumber.push(num);
               num++;
               //  now pop everything
                while (smallestNumber.size() !=0)
                {
                    System.out.print(smallestNumber.pop());
                }

            }

        }
        //coz after loop still there will be values in stack.
        //stack needs to be cleared
        smallestNumber.push(num);
        while (smallestNumber.size() !=0)
        {
            System.out.print(smallestNumber.pop());
        }


    }
}
