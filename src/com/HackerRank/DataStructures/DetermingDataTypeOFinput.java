package com.HackerRank.DataStructures;

import java.util.Scanner;

public class DetermingDataTypeOFinput
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputTimes = scanner.nextInt();
        for(int i = 0;i< inputTimes; i++)
        {
            try {
                long data = scanner.nextLong();
                System.out.println(data+" can be fitted in: ");
                if(data>=-128 && data<=127)
                {
                    System.out.println("* byte");
                }if(data>=Short.MIN_VALUE && data<=Short.MAX_VALUE)
                {
                    System.out.println("* short");
                }
                if(data>=Integer.MIN_VALUE && data<=Integer.MAX_VALUE)
                {
                    System.out.println("* int");
                }
                System.out.println("* long");
            }catch (Exception e)
            {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }

        }
    }
}
