package com.leetCode.Strings;

import java.util.Stack;

public class ReverseAStringWithWords
{
    public static void main(String[] args) {
        String s = "a good   example";

        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s)
    {

        int i = 0;
        Stack<StringBuilder> myStack = new Stack<>();
        StringBuilder str = new StringBuilder();
        StringBuilder res = new StringBuilder();
       while (i<= s.length()-1)
        {
            if (s.charAt(i) == ' ' )
            {
                // String s = "the sky is blue";
              if (str.length()>0)
              {
                  StringBuilder s1 = new StringBuilder(str);
                 myStack.push(s1);
                 str.delete(0,str.length());
              }

            }else
            {
                str.append(s.charAt(i));
                if (i == s.length()-1)
                {
                    if (str.length()>0)
                    {
                        StringBuilder s1 = new StringBuilder(str);
                        myStack.push(s1);
                        str.delete(0,str.length());
                    }
                }

            }
            i++;

        }
        while (!myStack.isEmpty()){

            res.append(myStack.pop());
            if(myStack.size()>=1)
            res.append(' ');
        }

       return res.toString();
    }
}
