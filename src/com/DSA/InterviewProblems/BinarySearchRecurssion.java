package com.DSA.InterviewProblems;

import java.util.Arrays;

public class BinarySearchRecurssion
{
    public static void main(String[] args) {
        int[] num = {7,5,1,90,123,-12,11};
        Arrays.sort(num);
        int toBeFound = -12;
        System.out.println(findMeThroughBinary(num,0,num.length-1,toBeFound));
    }

    private static int findMeThroughBinary
            (int[] num,int start,int end, int toBeFound)
    {
        if(end>= start && end <= num.length-1)
        {
            int mid = (start +end)/2;
            if (num[mid] == toBeFound)
            {
                return mid;
            }else if(num[mid]> toBeFound)
            {
                return findMeThroughBinary(num,start,mid-1,toBeFound);
            }else {
                return findMeThroughBinary(num,mid+1,end,toBeFound);
            }
        }
return  -1;
    }
}
