package com.leetCode.two_pointer_approach;

public class BestTime2Buy_N_Sell_Stocks
{
    public static void main(String[] args) {

        int[] num = {7,2,5,1,3,6,4};
        //output  = 5;
        System.out.println(check4MaxProfit(num));
    }

    private static int check4MaxProfit(int[] num)
    {
        if (num == null || num.length <=1 ) return 0;

        int fp = 0;
        int lp = 1;
        int maxProfit = 0;
        int smallestPrice = 0;
        while (lp<=num.length-1)
        {
            //7,2,5,1,6,4
            if(num[fp] > num[lp])
            {
                smallestPrice = num[lp];
                fp = lp;
            }  else {
                if (maxProfit < num[lp] - smallestPrice)
                maxProfit = num[lp] - num[fp];
            }
            lp++;
        }
        return maxProfit;
    }
}
