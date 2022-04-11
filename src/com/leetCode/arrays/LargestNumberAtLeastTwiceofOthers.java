package com.leetCode.arrays;

public class LargestNumberAtLeastTwiceofOthers
{
    public static void main(String[] args) {
        int[] num = {3,6,1,0};
        /*int[] num = {1,2,3,4};
        int[] num = {3,6,1,0};*/

        System.out.println(dominantIndex(num));
    }

    private static int dominantIndex(int[] num)
    {
        int[] temp;
        temp = sortArray(num,0,num.length-1);
        int i = 0;
        int count = 0;
        count = findPosition(num,temp[temp.length-1]);
        while (i < temp.length-1)
        {
            if(temp[i] * 2 > temp[temp.length-1])
            {
                count = -1;
                break;
            }else {

                i++;
            }

        }
        return count;
    }

    private static int findPosition(int[] num, int i)
    {
        for (int j = 0; j < num.length ; j++)
        {
            if (i == num[j])
            {
                return j;
            }

        }
        return -1;
    }


    private static int[] sortArray(int[] num,int start,int end)
    {
        if (start == end)
        {
            int[] base = new int[1];
            base[0] = num[start];
            return base;
        }
        int mid = (start+end)/2;
        int[] f_half = sortArray(num,start,mid);
        int [] s_half = sortArray(num,mid+1,end);
        return merge2SortedArray(f_half,s_half);
    }

    private static int[] merge2SortedArray(int[] f_half, int[] s_half)
    {
        int[] resArr = new int[f_half.length + s_half.length];
        int fp = 0;
        int sp = 0;
        int rp = 0;
        while (fp <= f_half.length-1  && sp <= s_half.length-1)
        {
            if(f_half[fp] < s_half[sp])
            {
                resArr[rp] = f_half[fp];
                fp++;
                rp++;

            }else {
                resArr[rp] = s_half[sp];
                sp++;
                rp++;

            }
        }
        while (fp <= f_half.length-1 )
        {
            resArr[rp] = f_half[fp];
            fp++;
            rp++;
        }
        while (sp <= s_half.length-1)
        {
            resArr[rp] = s_half[sp];
            sp++;
            rp++;
        }
        return resArr;
    }


}
