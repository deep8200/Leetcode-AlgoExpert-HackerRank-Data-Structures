package com.recursion;

public class FactorialUsingRecursion
{
    public static void main(String[] args) {
        int num = 0;

        System.out.println(findingFactorialRecursiveCall(num));
    }

    private static int findingFactorialRecursiveCall(int num)
    {
        int factorial = 1;
        if(num == 0)
            return 1;
        factorial =   num * findingFactorialRecursiveCall(num-1);
        return factorial;

    }
}
