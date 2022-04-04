package com.leetCode.ChallengeCOntest;

public class MaximumCandiesAllocatedto_K_Children
{
    public static void main(String[] args) {
        int[] num = {5,8,6};
        int k = 3;
        System.out.println(maximumCandies(num,k));
    }

    private static int maximumCandies(int[] num, int k)
    {
        //todo
        //it's incomplete ..need to complete first
        
        int count = 0;
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] /k < 1 || num[i]/k <k)
            {
                count++;
            }

        }
        return count;
    }
}
