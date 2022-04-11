package com.leetCode.arrays;

public class NumberPLusOne
{


    public static void main(String[] args) {

        /*

         */
         int[] digits = {9,9,9};
     //   int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        for (int a:plusOne( digits)) {
            System.out.print(a+" ");
        }

    }

    private static int[] plusOne(int[] digits)
    {
         int numOb = 0;

        for (int i = digits.length-1; i>=0 ; i--)
        {
            int remainder = digits[i];
             remainder++;
             if (remainder == 10)
             {
                 digits[i] = 0;
             }else {
                 digits[i] = remainder;
                 return digits;
             }

        }
        int[] res = new int[digits.length+1];
         res[0]  =1;
         return res;
    }


}
