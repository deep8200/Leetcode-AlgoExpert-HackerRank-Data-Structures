package com.arrays;

import java.util.Scanner;

public class FindingElementInArray
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int[] loc = new int[elements];
        for(int i = 0;i< loc.length;i++)
        {
            loc[i] = scanner.nextInt();
        }

        System.out.println("enter the element to find");
        int toFind = scanner.nextInt();
        String flag = isNumberAvailable(loc,toFind);
        if(flag.equalsIgnoreCase("yes"))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    private static String isNumberAvailable(int[] loc, int toFind)
    {
        String res = "no";
        int pointer = 0;
        while (pointer < loc.length)
        {
            if(loc[pointer] == toFind)
            {
                res = "yes";
                return res;
            }
            pointer++;
        }
        return res;
    }
}
