package com.recursion;

public class LogarithmicPowerXofN
{
    public static void main(String[] args) {

        double x = 2.00000;
        int n = -2147483648;

        System.out.println(logPower(x,n));
    }

    private static double logPower(double x, int n)
    {
        if(n <= Integer.MIN_VALUE || n >= Integer.MAX_VALUE)
            return 0;
        double halfPower = 1;
        double res = 1;
        if(n == 0)
            return 1;
        if(n <0)
        {
            n = -n;
            x = 1/x;
        }
        halfPower = logPower(x,n/2);
        res = halfPower * halfPower;
        if(n %2 == 1)
        {
            res = res * x;

        }
        return res;
    }
}
