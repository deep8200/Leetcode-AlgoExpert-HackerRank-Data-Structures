package com.leetCode.SearchAlgo;

public class BInarySearchWithoutRecurssion
{
    public static void main(String[] args) {
         int[] num = {-1,0,3,5,9,12};
        int digit2Find = -9;
        System.out.println(searchBinary(num,digit2Find));
    }

    private static int searchBinary(int[] num, int digit2Find)
    {
        int sp = 0;
        int ep = num.length-1;
        while (sp <= ep)
        {
            int mid = (sp+ep)/2;
            if (num[mid] > digit2Find)
            {
              ep = mid-1;

            }else if(num[mid] < digit2Find)
            {
            sp = mid+1;
            }else if(num[mid] == digit2Find)
            {
            return mid;
            }else {
              return  -1;
            }

        }
        return -1;
    }
}

