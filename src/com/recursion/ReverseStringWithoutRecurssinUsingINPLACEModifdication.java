package com.recursion;

import java.util.Arrays;

public class ReverseStringWithoutRecurssinUsingINPLACEModifdication
{
    public static void main(String[] args) {

        char[] arr = {'h','e','l','l','o'};

        inplaceModification(arr);


    }

    private static void inplaceModification(char[] arr)
    {
        int sp = 0;
        int ep = arr.length-1;
        while (ep > sp)
        {
            char temp = arr[ep];
            arr[ep] = arr[sp];
            arr[sp] = temp;
            sp++;
            ep--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
