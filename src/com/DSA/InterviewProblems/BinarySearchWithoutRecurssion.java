package com.DSA.InterviewProblems;

import java.util.Arrays;

public class BinarySearchWithoutRecurssion
{
    public static void main(String[] args) {
        int[] num = {7,5,1,90,123,-12,11};
        Arrays.sort(num);
        int toBeFound = 90;
        System.out.println(findMeThroughBinaryNonRecursive(num,toBeFound));

    }

    private static int findMeThroughBinaryNonRecursive
            (int[] num, int toBeFound)
    {
        int sp = 0;
        int ep = num.length-1;
        while (sp<= ep)
        {
            int mid = (sp+ep)/2;
            if (num[mid] == toBeFound)
            {
                return mid;
            }else if(num[mid]> toBeFound)
            {
                ep = mid-1;
            }else {
                sp = mid+1;
            }
        }
        return -1;
    }
}
