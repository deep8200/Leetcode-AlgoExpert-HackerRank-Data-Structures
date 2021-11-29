package com.pepcoding.Algos;

import java.util.Scanner;

public class FibonnaciSeries
{
    //0 1 1 2 3 5 8 13 21,,.....
    //1st ele  = 0
    //2nd ele = 1
    //and rest of ele = adding last 2 elements


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int endpoint = scanner.nextInt();
         int fib_1st = 0;
         int fib_2nd = 1;
         int fib_next;
        for (int i = 0; i < endpoint; i++)
        {
            System.out.println(fib_1st);
           fib_next = fib_1st + fib_2nd;
            fib_1st  =  fib_2nd;
            fib_2nd = fib_next;


        }
    }
}
