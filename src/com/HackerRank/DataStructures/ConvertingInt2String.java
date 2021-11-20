package com.HackerRank.DataStructures;

import java.util.Scanner;

public class ConvertingInt2String
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            String tempNum = String.valueOf(number);
            if(number == Integer.parseInt(tempNum))
            {
                System.out.println("Good Job");
            }
        }catch (Exception e)
        {
            System.out.println("Worst Job");
        }

    }
}
