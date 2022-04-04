package com.leetCode.arrays;

public class ReplaceElementsWithGreatestElementOnRightSide
{
    public static void main(String[] args) {
        int[] num  = {17,18,5,4,6,1};
        for (int k : replaceElements(num))
        {
            System.out.print(k+" ");
        }



    }

    private static int[] replaceElements(int[] num)
    {
        int temp = 0;
        int temp2 = 0;
        int i = 0;
        temp = num[num.length-1];
        num[num.length-1] = -1;
        int lp = num.length-2;
        while (lp>=0)
        {
            if (temp > num[lp+1])
            {
                temp2 = num[lp];
                num[lp] = temp;
                temp = temp2;
            }else {
                temp2 = num[lp];
                num[lp] = num[lp+1];
                temp = temp2;
            }
            lp--;
        }

        return num;
    }
}
