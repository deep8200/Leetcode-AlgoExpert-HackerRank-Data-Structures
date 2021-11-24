package com.HackerRank.Strings;

import java.util.Scanner;

public class PalidromeOfString
{
    public static void main(String[] args) {

        Scanner scanner
                 = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean oflag = whetherPallindromeOrNot(input);
        if(oflag)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static boolean whetherPallindromeOrNot(String input)
    {
        boolean flag;
        String output = "";
        for(int i = input.length()-1;i>=0;i--)
        {
            output  += input.charAt(i);
        }
        flag = input.equalsIgnoreCase(output);
        return flag;
    }


}
