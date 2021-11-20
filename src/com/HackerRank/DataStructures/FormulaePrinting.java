package com.HackerRank.DataStructures;

import java.util.Scanner;

public class FormulaePrinting
{
    public static void main(String[] args) {


        //a+2^0*b, a+2^0*b+2^1*b--------
        Scanner scanner = new Scanner(System.in);
        int query = scanner.nextInt();
        for(int j = 0;j<query;j++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int toThePower = scanner.nextInt();
            int res = a;
            for(int k = 0;k<toThePower;k++)
            {
                res+= (Math.pow(2,k)*b);
                System.out.print(res+" ");
            }

            System.out.println();
        }
        /*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        in.close();*/
    }
}
