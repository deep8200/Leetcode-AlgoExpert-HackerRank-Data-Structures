package com.leetCode.arrays;

public class MovingZeros
{
    public static void main(String[] args) {

        int[] num = {2,1};
        for (int a:removeArray(num))
        {
            System.out.print(a+" ");
        }
    }

    private static int[] removeArray(int[] num)
    {
        int i = 0;
        int j = 0;
        int temp = 0;
        while (j<= num.length-1 && i<= num.length-1)
        {
            if (num[i] == 0 )
            {
                temp = num[i];
            }else
            {
                temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                j++;
            }
            i++;


        }
         return  num;
    }
}
