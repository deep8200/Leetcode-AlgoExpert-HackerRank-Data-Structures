package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixExpression
{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infix = scanner.nextLine();


        Stack<Character>myOperators = new Stack<>();
        Stack<Integer>myOperands = new Stack<>();

        for (int i = 0; i < infix.length() ; i++) {

            char ch = infix.charAt(i);
            if(ch == '(')
            {
                myOperators.push(ch);
            }else if(ch == ')')
            {
               while (myOperators.peek() != '(')
               {
                   /*
                   1 pop for operator and 2 pop for operands
                   then,,do the operation and push the value
                   in operands

                   another pop for opening bracket
                    */
                   char op = myOperators.pop();
                   int v2 = myOperands.pop();
                   int v1 = myOperands.pop();
                   int res = perform_operation(v1,v2,op);
                   myOperands.push(res);

               }
               //this one for the opening bracket
               myOperators.pop();

            }else if(Character.isDigit(ch))
            {
                //this is required to convert the char into int value as 0 in char
                // has 48 ascii code..
                myOperands.push(ch - '0');

            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {

                while (myOperators.size() >0

                        && myOperators.peek() != '('
                        //jo operator aa raha hai vo apne se badi priority
                        //jo stack.peek me hai usko pop karaega choto ko nhi..
                        //khud chota hona chahaiye
                        &&  precedence(ch) <= precedence(myOperators.peek()))
                {
                    char op = myOperators.pop();
                    int v2 = myOperands.pop();
                    int v1 = myOperands.pop();
                    int res = perform_operation(v1,v2,op);
                    myOperands.push(res);
                }
                myOperators.push(ch);
            }
        }

        while (myOperators.size() != 0)
        {
            char op = myOperators.pop();
            int v2 = myOperands.pop();
            int v1 = myOperands.pop();
            int res = perform_operation(v1,v2,op);
            myOperands.push(res);
        }

        System.out.println(myOperands.peek());



    }

    private static int precedence(char operator)
    {
        if (operator == '+' ||  operator == '-')
        {
            return  1;

        }else  if(operator == '*' || operator == '/')
        {
            return 2;
        }else {
            return  0;
        }

    }


    private static int perform_operation(int v1,int v2,char operator)
    {
        if (operator == '+' )
        {
            return  v1 + v2;

        }else  if(operator == '*' )
        {
            return v1 * v2;
        }else if( operator == '-')
        {
            return  v1 -v2;
        } else if(operator == '/')
        {
            return v1 / v2;
        }else {
            return  -1;
        }
    }
}
