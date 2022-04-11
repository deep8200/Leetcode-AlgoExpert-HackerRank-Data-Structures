package com.DSA.InterviewProblems;

public class PallandromeUsingRecursion
{
    public static void main(String[] args) {
        String s1 = "peep";
        System.out.println(isRecursivePallandrome(s1));
    }

    private static boolean isRecursivePallandrome(String s1)
    {
        if (s1.length() == 0 || s1.length()==1)
            return true;
        if (s1.charAt(0) == s1.charAt(s1.length()-1))
            return isRecursivePallandrome(s1.substring(1,s1.length()-1));
        return false;
    }
}
