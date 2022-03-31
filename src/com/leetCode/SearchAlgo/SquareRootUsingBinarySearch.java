package com.leetCode.SearchAlgo;

public class SquareRootUsingBinarySearch
{
    /*
       nxn  = m
       n <=  m/2;

       eg
       6x 6 = 36
       n <= 18;

     */
    int delta;
    public static void main(String[] args)
    {

        int num = 2147395599;
        if (findingSquareRoot(num) == -1)
        {
            System.out.println("not a valid squareRoot");
        }else{
            System.out.println(findingSquareRoot(num));
        }


    }

    private static int findingSquareRoot(int num)
    {
        if(num == 0 || num == 1)
        {
            return num;
        }
        int sp = 1;
        int ans = 0;
        int ep = num/2;
       while (sp<= ep)
       {
           int mid = (sp+ep)/2;
           if(mid * mid < num )
           {
               sp = mid+1;
               ans = mid;
           }else if (mid * mid >num)
           {
               ep = mid-1;

           }else if(mid * mid == num)
           {
               return mid;

           }else {
               return -1;
           }
       }
       return ans;
    }

   /* private static int findingSquareRoot(int num)
    {
        if(num == 0 || num == 1)
            return num;
        int answ = 0;
        int sp = 1;
        int end = num/2;
        while (sp<= end)
        {
            int mid = (sp+end)/2;
            if(mid * mid > num )
            {
               end = mid-1;
            }else if(mid * mid < num)
            {
                answ = mid;
                sp = mid+1;

            }else if(mid * mid == num)
            {
               return (int)mid;
            }else {
                return -1;
            }
        }
        return answ;
    }*/



}
