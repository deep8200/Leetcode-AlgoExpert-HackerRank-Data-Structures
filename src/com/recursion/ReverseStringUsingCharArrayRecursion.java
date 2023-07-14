package com.recursion;

import java.util.Arrays;

public class ReverseStringUsingCharArrayRecursion
{
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        //Character[] arr = {'H','a','n','n','a','h'};
         char[] res = new char[arr.length];
        reverseStringChar(arr.length-1,arr,res,0);
        System.out.println(Arrays.toString(res));

    }

    private static void reverseStringChar(int lastIndex,char[] arr,char[] res,int resPointer)
    {
        if(lastIndex == -1)
            return;
        res[resPointer] = arr[lastIndex];
        reverseStringChar(lastIndex-1,arr,res,resPointer+1);
    }
}
