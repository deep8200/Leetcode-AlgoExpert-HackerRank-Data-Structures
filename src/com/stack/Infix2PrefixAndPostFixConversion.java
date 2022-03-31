package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix2PrefixAndPostFixConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();


        Stack<Character> myoperator = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);
            if (ch == '(') {
                myoperator.push(ch);
            } else if (ch == ')') {
                while (myoperator.peek() != '(') {
              /*
              operator me 1 pop
              prefix me 2 pop
              postfix me 2 pop
              result push in prefix
              rsult push in postfix

              end me ek extra pop for opening bracket


              also
              for prefix = operator v1 v2
              for postfix = v1 v2 operator
               */


                    perform_operations(myoperator,prefix,postfix);


                }
                myoperator.pop();

            } else if (ch == '+' ||
                    ch == '-' ||
                    ch == '*' ||
                    ch == '/')
            {

                while (myoperator.size() >0
                        && myoperator.peek() != '('
                        // current operator khud chota hona chahiye stack.peek() se
                         && precedence(ch) <= precedence(myoperator.peek()))
                {
                    perform_operations(myoperator,prefix,postfix);
                }
                myoperator.push(ch);


            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {

                prefix.push(ch+"");
                postfix.push(ch+"");

            }

        }

        while (myoperator.size() !=0)
        {
            perform_operations(myoperator,prefix,postfix);
        }
        System.out.println(prefix.peek());
        System.out.println(postfix.peek());
    }


    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0;
        }
    }


    public static void perform_operations(Stack<Character> myoperator
            ,Stack<String> prefix
            ,Stack<String>postfix )
    {
        char op = myoperator.pop();
        String v2 = prefix.pop();
        String v1 = prefix.pop();
        String res = op + v1 + v2;
        prefix.push(res);

        String p2 = postfix.pop();
        String p1 = postfix.pop();
        String pos_res = p1 + p2 + op;
        postfix.push(pos_res);
    }
}
