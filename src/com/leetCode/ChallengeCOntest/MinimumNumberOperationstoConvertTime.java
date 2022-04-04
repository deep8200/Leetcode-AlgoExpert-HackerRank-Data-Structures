package com.leetCode.ChallengeCOntest;

public class MinimumNumberOperationstoConvertTime
{
    public static void main(String[] args)
    {
        String current = "09:41";
        String correct = "10:34";
        System.out.println(convertTime(current,correct));
    }

    private static int convertTime(String current, String correct)
    {


        String s1 = current.substring(0,2);
        String s2 = current.substring(3);
        int sth = Integer.parseInt(s1);
        int stm  = Integer.parseInt(s2);

        String e1 = correct.substring(0,2);;
        String e2 = correct.substring(3);
        int eth = Integer.parseInt(e1);
        int etm  = Integer.parseInt(e2);
        if(etm < stm)
        {
            etm += 60;
            eth = eth- 1;
        }
        int basecount = eth - sth;
        int diff = etm-stm;
        return basecount+ countingSteps(diff);
    }

    private static int countingSteps(int diff)
    {
        int count = 0;
        while (diff < 60  && diff >= 15)
        {
            count += diff /15;
            diff = diff- (15*(diff /15));
        }
        while (diff < 15  && diff >= 5)
        {
            count += diff /5;
            diff = diff- (5*(diff /5));
        }
        if ( diff >0 && diff < 5)
        {
            count += diff;
        }
        return count;
    }
}
