package com.leetCode.arrays;

public class SortedSquareArray
{
    public static void main(String[] args) {

        int[] num1 = {-7,-3,2,3,11};
        for (int num:sortedSquaredArray(num1)) {
            System.out.print(num+" ");
        }
    }

    private static int[] sortedSquaredArray(int[] num)
    {
        int i = 0;
        int j = num.length-1;
        int[] res = new int[num.length];
        int ls = res.length-1;
        while (i<= j)
        {
            //1, 2, 3, 5, 6, 8, 9
            //int[] num = {-7,-3,2,3,11};
            //int[] num1 = {-4,-1,0,3,10};
            if(num[i] * num[i] < num[j]* num[j])
            {
                res[ls] = num[j]* num[j];
                ls--;
                j--;
            }else {
                res[ls] = num[i] * num[i];
                ls--;
                i++;
            }
        }
        return  res;

    }
}
