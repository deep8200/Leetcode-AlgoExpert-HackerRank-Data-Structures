package com.leetCode.Strings;

import java.util.Stack;

public class ReverseStringWithReversedWords
{
    public static void main(String[] args) {

        /*
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"
         */

        String s = "God Ding";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s)
    {
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbR = new StringBuilder();
        Stack<StringBuilder> mStack = new Stack<>();
         while (i>=0)
         {
             if (s.charAt(i) == ' ')
             {
                 if (sb.length()>0)
                 {
                     StringBuilder s1 = new StringBuilder(sb);
                     mStack.add(s1);
                     sb.delete(0,sb.length());
                 }

             }else
             {
                 sb.append(s.charAt(i));
                 if (i == 0)
                 {
                     if (sb.length()>0)
                     {
                         StringBuilder s1 = new StringBuilder(sb);
                         mStack.add(s1);
                         sb.delete(0,sb.length());
                     }
                 }

             }
             i--;
             //sb.delete(0,sb.length());
         }
        while (!mStack.isEmpty()){

            sbR.append(mStack.pop());
            if(mStack.size()>=1)
                sbR.append(' ');
        }

        return sbR.toString();
    }
}
