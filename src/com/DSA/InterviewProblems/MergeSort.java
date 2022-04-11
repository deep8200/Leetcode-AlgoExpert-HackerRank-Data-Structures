package com.DSA.InterviewProblems;

public class MergeSort
{
    public static void main(String[] args) {
        int[] num = {7,5,1,90,85123,-12,11};
        int[] res = sortMeMerge(num,0,num.length-1);

        for (int a:res
        ) {
            System.out.print(a+" ");
        }
    }

    private static int[] sortMeMerge(int[] num, int start, int end)
    {
        if (start == end)
        {
            int[] base = new int[1];
            base[0] = num[start];
            return base;
        }

        int mid = (start+end)/2;
        int[] f_half = sortMeMerge(num,start,mid);
        int[] s_half = sortMeMerge(num,mid+1,end);
        return merge2SortedArrays(f_half,s_half);
    }

    private static int[] merge2SortedArrays(int[] f_half, int[] s_half)
    {
        int[] result = new int[f_half.length+ s_half.length];
        int fp = 0;
        int sp = 0;
        int rp = 0;
        while (fp <= f_half.length-1 && sp <= s_half.length-1)
        {
            if (f_half[fp] < s_half[sp])
            {
                result[rp] = f_half[fp];
                rp++;
                fp++;
            }else {
                result[rp] = s_half[sp];
                rp++;
                sp++;
            }
        }

        while(fp <= f_half.length-1)
        {
            result[rp] = f_half[fp];
            rp++;
            fp++;
        }
        while ( sp <= s_half.length-1)
        {
            result[rp] = s_half[sp];
            rp++;
            sp++;
        }

        return result;
    }
}
