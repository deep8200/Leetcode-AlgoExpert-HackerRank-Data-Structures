package com.DSA.InterviewProblems;

import java.util.Arrays;

public class StringAnagramCheck
{
    public static void main(String[] args) {
        String s1 = "anagrampou";
        String s2 = "grgrdpo";

        System.out.println(isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s1, String s2)
    {
        boolean flag = false;
        if (s1.length() == s2.length())
        {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            int fp = 0;
            int sp = 0;
            while (fp < c1.length-1)
            {
                if (c1[fp] != c2[sp])
                {
                    flag = false;
                    break;
                }
                flag = true;
                fp++;
                sp++;
            }

        }
        return flag;

    }


}

