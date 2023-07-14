package com.recursion;

public class LastIndexOfOccurenceFirst
{
    public static void main(String[] args) {

        int[] arr = {2,3,6,9,8,3,2,3,6,4};

        System.out.println(findLastindexFirst(arr,arr.length-1,3));
    }

    private static int findLastindexFirst(int[] arr, int eIndex, int num)
    {
        if(eIndex < 0)
            return -1;

        if(arr[eIndex] == num)
            return  eIndex;
        else
        {
            int tempIndex = findLastindexFirst(arr,eIndex-1,num);
            return tempIndex;
        }

    }
}
