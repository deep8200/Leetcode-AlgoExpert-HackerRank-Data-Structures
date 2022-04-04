package com.leetCode.arrays;

public class HeightChecker
{
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};
        System.out.println(returnIndicesOfMismatchedHeight(num));
    }

    private static int returnIndicesOfMismatchedHeight(int[] num)
    {
     int[] temp =    sortArrayIntoNew(num,0,num.length-1);
       int i = 0;
       int counter = 0;
       while (i<= num.length-1)
       {
           if (temp[i] != num[i])
           {
               counter++;

           }
           i++;
       }

     return counter;
    }

    private static int[] sortArrayIntoNew(int[] num,int s,int e)
    {
        if (s == e)
        {
            int[] base = new int[1];
            base[0] = num[s];
            return base;
        }
        int mid = (s+e)/2;
        int[] f_half = sortArrayIntoNew(num,s,mid);
        int[] s_half = sortArrayIntoNew(num,mid+1,e);
        return merge2SortedArray(f_half,s_half);
    }

    private static int[] merge2SortedArray(int[] f_half, int[] s_half) {
    int[] temp = new int[f_half.length + s_half.length];
    int fp = 0;
    int sp = 0;
    int res = 0;
    while (fp <= f_half.length-1 && sp<= s_half.length-1)
    {
        if(f_half[fp] < s_half[sp])
        {
            temp[res] = f_half[fp];
            fp++;

        }else {
            temp[res] = s_half[sp];
            sp++;
        }
        res++;
    }
    while (fp <= f_half.length-1)
    {
        temp[res] = f_half[fp];
        fp++;
        res++;
    }
    while (sp<= s_half.length-1)
    {
        temp[res] = s_half[sp];
        sp++;
        res++;
    }

    return temp;
    }

}
