package com.HackerRank.DataStructures;

import java.util.Scanner;

public class Static_initialization_blocks
{
    static boolean flag;
    static int a,b;
    static {

        Scanner scanner  = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a>0 && b >0)
            flag = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    public static void main(String[] args) {

        if (flag)
        {
            int result  = a * b;
            System.out.println(result);
        }



    }
}
