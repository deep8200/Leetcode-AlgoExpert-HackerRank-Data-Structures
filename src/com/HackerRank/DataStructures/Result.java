package com.HackerRank.DataStructures;

import java.util.Scanner;

class Result {

    public static void main(String[] args) {
/*
java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
 */


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf( "%-15s%03d %n", s1, x);
            /*
            "%-15s" means that within 15 blank space,
            the String "s1" will be filled in the left.
            (fill in the blanks from the left)

            "%03d" means that within 3 0s,
            the integer"x" will be filled in the right.
            (fill in the zeros from the right).

             This can only be done by using printf method.
             */
        }
        System.out.println("================================");
    }




    public static int countOfDigits(int number)
    {
        int pointer = 0;
        if(number != 0)
        {
            number = number/10;
            pointer++;
        }
        return  pointer;
    }
    public static String checkNumber(int num)
    {
        String result = "";
        if(num<100)
        {
            result = String.valueOf(num);
           result =  "0"+result;
        }else
            result = String.valueOf(num);
        return  result;
    }
    public static String numberOfSpacesRequired(String part1,/*String part2*/int num)
    {
        String resultString = "";
        if((part1.length()+countOfDigits(num))<18)
        {
            String dummy= " ";
            int spaces1 = 18-(part1.length() + countOfDigits(num));
            for(int i = 2;i<= spaces1;i++)
            {
                dummy = dummy+" ";
            }
            String numR ="";
            if(num<100)
                numR = "0"+num;
            else
                numR = String.valueOf(num);
            resultString = part1+ dummy+ numR;

        }else
        {
            resultString = part1+num;

        }
        return resultString;
    }
}
