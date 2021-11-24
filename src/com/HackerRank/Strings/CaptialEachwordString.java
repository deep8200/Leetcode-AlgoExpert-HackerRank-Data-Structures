package com.HackerRank.Strings;

import java.util.Scanner;

public class CaptialEachwordString
{

    public static void main(String[] args) {

        Scanner scanner
                  = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        System.out.println(sumOfLength(one,two));
        if(orderIndectionary(one,two))
        System.out.println("Yes");
        else
            System.out.println("No");
        String a = one.substring(0, 1).toUpperCase() + one.substring(1);
        String b = two.substring(0, 1).toUpperCase() + two.substring(1);
        System.out.print(a.concat(" "+ b));

    }

    private static int sumOfLength(String nextLine, String nextLine1)
    {
        int sum;
        if (nextLine.length() >0 && nextLine1.length()>0)
        {
            sum = nextLine.length() + nextLine1.length();
        }
        else
            sum = 0;
        return sum;
    }

    private static boolean orderIndectionary(String a, String b)
    {
        boolean flag;
        if(a.compareTo(b) <= 0)
        {
          flag = false;
        }else {
            flag = true;
        }


        return  flag;
    }
}
