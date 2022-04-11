package com.DSA.InterviewProblems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromAString
{
    public static void main(String[] args) {
        String a = "aaaaaaaaaadeepbdvtwstrsmjvfdu jfhh";
        System.out.println(showOnlyUnique(a));
    }

    private static String showOnlyUnique(String a)
    {
        String str = "";
        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i <= a.length()-1; i++)
        {
            if(!mySet.contains(a.charAt(i)))
            {
                mySet.add(a.charAt(i));
                str = str + a.charAt(i);
            }

        }
        return str;
    }


}
