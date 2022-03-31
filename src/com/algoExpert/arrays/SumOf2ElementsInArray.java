package com.algoExpert.arrays;

import java.util.Arrays;

public class SumOf2ElementsInArray
{
    public static void main(String[] args) {
        int[] a = {3,5,-4,8,11,1,-1,6};
        int sum = 10;

        for (int af: twoNumberSum(a,sum) ) {
            System.out.print(af+" ");
        }


    }

    private static int[] twoNumberSum(int[] a, int z)
    {
        Arrays.sort(a);
        int s_pointer = 0;
        int e_pointer = a.length-1;
        while (s_pointer<e_pointer)
        {
            int temp = a[s_pointer]+a[e_pointer];
            if(temp == z)
            {
                return new int[] {a[s_pointer],a[e_pointer]};
            }else if(temp<z)
            {
                s_pointer++;
            }else {
                e_pointer--;
            }

        }
        return new  int[0];
    }
}
