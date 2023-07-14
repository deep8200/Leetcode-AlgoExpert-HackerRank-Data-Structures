package com.recursion;

public class LinearPowerXofN
{
    public static void main(String[] args) {
        //double x = 2;
        double x =   0.00001;
        //int n = 10;
        //int n = -2;
        int n =  2147483647;
        System.out.println(myPow(x,n));



    }
    public static double myPow(double x, int n) {
      double res = 0.0;
      if(n <= -2147483648 || n >= 2147483647)
          return 0;
      if(n== 0)
          return 1;
       if(n == 1)
            return x;
          if(n < 0)
          {

              res = (1/ myPow(x,-n));
              return res;
          }else
          {
              res = x * myPow(x,n-1);
              return res;
          }




    }
}
