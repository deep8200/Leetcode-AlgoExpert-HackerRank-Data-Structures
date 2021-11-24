package com.HackerRank.Strings;

import java.util.Scanner;

public class SubstringOfString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if(start <0 || end >= inputString.length())
            System.out.println("invalid input to substring");
        else
        {
            String substring =  returnSubString(inputString,start,end);
            System.out.println(substring);
        }

    }

    private static String returnSubString(String inputString, int start, int end)
    {
        /*String subs = "";
        for(int i = start;i<end;i++)
        {
            subs += inputString.charAt(i)+"";
        }
        return subs.trim();*/

        return inputString.substring(start,end);

    }


}
