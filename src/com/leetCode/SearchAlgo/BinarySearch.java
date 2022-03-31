package com.leetCode.SearchAlgo;

public class BinarySearch
{
    public static void main(String[] args) {

        int[] num = {-1,0,3,5,9,12};
        int digit2Find = 0;
        System.out.println("index of "+ digit2Find+ " "+ performBinarySearch(num,0, num.length-1, digit2Find));

    }

    private static int performBinarySearch(int[] num,int start,int end,int tobefound)
    {

        if(end >= start && end <= num.length-1)
        {
            int mid = (start+end)/2;
        /*
          int[] num = {-1,0,3,5,9,12};
        int digit2Find = 9;
         */
            if (num[mid] > tobefound)
            {
                return performBinarySearch(num,start,mid-1,tobefound);

            }else if (num[mid]< tobefound)
            {
                return   performBinarySearch(num,mid+1,end,tobefound);

            }else if(num[mid] == tobefound) {
                return mid;

            }else {
                return  -1;
            }
        }
        return -1;

    }
}
