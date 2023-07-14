package com.recursion;

public class FirstIndexOfoccurence
{
    public static void main(String[] args) {

        int[] arr = {2,3,9,8,7,6,4,12,34,3,8};
        int val = 12;
        int index= 0;
        System.out.println(firstOccurence(index,val,arr)) ;
    }

    private static int firstOccurence(int index, int val, int[] arr)
    {
        if(index >= arr.length)
            return -1;


        if(arr[index] == val)
            return index;
        else
        {
            int tempIndex=    firstOccurence(index+1,val,arr);
            return tempIndex;
        }

    }
}
