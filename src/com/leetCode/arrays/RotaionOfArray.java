package com.leetCode.arrays;

public class RotaionOfArray
{
    public static void main(String[] args) {
        int[] num = {-1};
        int k = 2;
        rotate(num,k);
    }

    private static void rotate(int[] num, int k) {


        if (k <0)
        {
            k = k + num.length;
        }
        k = k % num.length;


        //1st part reverse
        reverseMe(num,0,num.length-k-1);

        //2nd part reverse
        reverseMe(num,num.length-k,num.length-1);

        //whole part reverse
        reverseMe(num,0,num.length-1);

        for (int a:num)
        {
            System.out.print(a+" ");

        }
    }

    private static void reverseMe(int[] num, int i, int j)
    {
        while (i<j)
        {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }

    }
}
