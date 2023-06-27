package com.leetCode.numberSystem;

public class SqrtUsingBinarySearch
{
    public static void main(String[] args) {

        int x = 36;
        System.out.println(mySqrt(x));


    }
    public static int mySqrt(int number)
    {


        if(number == 0 || number == 1)
            return number;

        int pointerStart = 1;
        int res = 0;
        int pointerEnd = number/2;
        while(pointerStart <= pointerEnd)
        {
            int mid = (pointerStart +  pointerEnd) /2;
            if(mid * mid  == number)
            {
                return  mid;
            }else if(number > mid * mid )
            {
                pointerStart = mid + 1;
                res = mid;
            }else {
                pointerEnd = mid - 1;
            }
        }
        return  res;
    }
}
