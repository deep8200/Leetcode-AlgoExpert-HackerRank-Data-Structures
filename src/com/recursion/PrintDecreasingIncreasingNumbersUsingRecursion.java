package com.recursion;

public class PrintDecreasingIncreasingNumbersUsingRecursion
{
    public static void main(String[] args) {
        int num  = 5;
         recursiveCall(num);

    }

    private static void recursiveCall(int num)
    {
        if(num == 0)
            return;
        System.out.println(num);
        recursiveCall(num-1);
        System.out.println(num);
    }
}
