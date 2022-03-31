package com.DSA2.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicatesFromString
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(removeDuplicates(sc.nextLine()));
    }

    private static String removeDuplicates(String nextLine)
    {
        String resultStr = "";
        char[] mylocalChar = nextLine.toCharArray();
        int maxLength = nextLine.length();
        HashMap<Character,Integer> myHashMap = new HashMap<>();
        for (int i = 0; i <=maxLength-1 ; i++)
        {
            if (!myHashMap.containsKey(mylocalChar[i]))
            {
                resultStr += mylocalChar[i]+"";
                myHashMap.put(mylocalChar[i],1);
            }

        }
        return  resultStr;
    }
}
