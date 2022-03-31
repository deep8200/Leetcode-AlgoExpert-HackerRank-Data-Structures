package com.leetCode.arrays;

public class MergeSortedArrayInFirstArray
{
    public static void main(String[] args) {
       /* int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};*/

        int[] num1 = {0};
        int[] num2 = {1};

        num1 = mergeBothSortedArrayInOne(num1,0,num2,1);
        for (int a:num1) {
            System.out.print(a+" ");
        }
    }

    private static int[] mergeBothSortedArrayInOne(int[] num1, int m, int[] num2, int n)
    {
        int firstpointer = m-1;
        int secondPointer = n-1;
        int resPinter = num1.length-1;

        while (firstpointer >= 0 && secondPointer >= 0)
        {
            if (num2[secondPointer] >= num1[firstpointer] )
            {
                num1[resPinter] = num2[secondPointer];
                secondPointer--;
            }else {
                num1[resPinter] = num1[firstpointer];
                firstpointer--;
            }
            resPinter--;
        }

        while (secondPointer >= 0)
        {
            num1[resPinter] = num2[secondPointer];
            secondPointer--;
            resPinter--;
        }
        return num1;
    }

   /* private static int[] mergeBothSortedArrayInOne(int[] firstArr, int first_Arr_length, int[] secondArr, int second_arr_length)
    {
        int temp[] = new int[first_Arr_length+second_arr_length];
        int f = 0;
        int s = 0;
        int res = 0;
        while ( f < secondArr.length)
        {
            if(firstArr[f] < secondArr[s])
            {
                temp[res] = firstArr[f];
                f++;
            }else {
                temp[res] = secondArr[s];
                s++;
            }
            res++;
        }
        while (s<secondArr.length)
        {
            temp[res] = secondArr[s];
            s++;
            res++;
        }

        return temp;
    }*/
}
