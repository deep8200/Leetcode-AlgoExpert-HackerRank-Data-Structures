package com.leetCode.SearchAlgo;

public class BinarySearchRecursive
{
    public static void main(String[] args) {

        int[] num = {-1,0,3,5,9,12};
        int digit2Find = 12;

        System.out.println(indexOfgivenDigit(num,0,num.length-1,digit2Find));
    }

    private static int indexOfgivenDigit(int[] num, int start,int end,int digit2Find)
    {
        /*
         int[] num = {-1,0,3,5,9,12};
        int digit2Find = 0;
         */

        if(end>= start && end <= num.length-1)
        {
            int mid = (start+end)/2;
            if(num[mid]> digit2Find)
            {
                return  indexOfgivenDigit(num,start,mid-1,digit2Find);
            }else if(num[mid]< digit2Find)
            {
                return indexOfgivenDigit(num,mid+1,end,digit2Find);

            }else if(num[mid] == digit2Find)
            {
                return mid;
            }else {
                return -1;
            }
        }

        return -1;
    }
}
