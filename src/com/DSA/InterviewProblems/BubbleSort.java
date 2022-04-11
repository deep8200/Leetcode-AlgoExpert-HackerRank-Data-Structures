package com.DSA.InterviewProblems;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] num = {7,5,1,90,123,-12,11};
        for (int a:sortMeBubble(num)
             ) {
            System.out.print(a+" ");
        }
    }

    private static int[] sortMeBubble(int[] num)
    {
        for (int i = num.length-1; i >0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (num[j] > num[j+1])
                {
                    swapMyPosition(num,j,j+1);
                }

            }

        }
        return num;
    }

    private static void swapMyPosition(int[] num, int j, int i)
    {
        if(j!= i)
        {
            int temp;
            temp = num[j];
            num[j] = num[i];
            num[i] = temp;
        }
    }
}
