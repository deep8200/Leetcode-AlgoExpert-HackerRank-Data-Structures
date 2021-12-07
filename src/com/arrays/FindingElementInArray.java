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


        System.out.println("****************************");
        ifNumberAvailable(loc,toFind);

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
    private static void  ifNumberAvailable(int[] arr,int tofind )
    {
    boolean ifFound = false;
    int poistion = 0;
        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] == tofind)
            {
                ifFound = true;
              //  System.out.println("number found at index : "+ i);
                poistion = i;
                break;
            }else {
                ifFound = false;
            }

        }
        if(ifFound)
            System.out.println("number found at index : "+ poistion);
        else
            System.out.println("number Not found");
    }
}
