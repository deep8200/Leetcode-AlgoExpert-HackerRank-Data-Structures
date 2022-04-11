package com.DSA.InterviewProblems;

public class StringPallandromecheck
{
    public static void main(String[] args) {
        String s1 = "deep";
        System.out.println(ifPallandrome(s1));

    }

    private static boolean ifPallandrome(String s1)
    {
        String str = "";
        for (int i = s1.length()-1; i >=0 ; i--)
        {
            str = str+ s1.charAt(i);
        }
        if (s1.equalsIgnoreCase(str))
            return true;
        else
            return false;
    }
}
