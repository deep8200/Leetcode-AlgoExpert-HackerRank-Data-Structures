package com.leetCode.numberSystem;

public class SqrtUsingBinarySearchRecursive {
    public static void main(String[] args) {

        int number = 144;
        System.out.println(mySqrtTwo(1, number / 2, number,0));

    }

    public static int mySqrtTwo(int sp, int ep, int number,int res)
    {
        if(number == 0 || number == 1)
            return number;
        if (ep >= sp && ep <= number/2)
        {
            int mid = (sp + ep) / 2;
            if (mid * mid == number) {
                return mid;
            } else if (mid * mid > number) {
                return mySqrtTwo(sp, mid - 1, number,res);
            } else {
                return mySqrtTwo(mid + 1, ep, number,mid);

            }
        }
        return res;
    }



    int maxRootPossible = 46341;
    public int mySqrt(int x) {
        //return binarySearch(x,maxRootPossible/2,1,maxRootPossible);
        return binarySearch(1,x/2,x,0);
    }

    public int binarySearch(int sp, int ep, int number, int res){
        if(sp <= ep || ep <= number/2)
        {
            if(number == 0 || number == 1)
                return number;
            int mid = (sp+ep)/2;
            if(mid * mid == number)
                return  mid;
            else if(mid * mid > number)
                return binarySearch(sp,mid-1,number,res);
            else
                return binarySearch(mid+1,ep,number,mid);
        }
        return res;
    }
}
