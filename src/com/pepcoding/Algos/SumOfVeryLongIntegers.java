package com.pepcoding.Algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfVeryLongIntegers
{

    public static void main(String[] args) {
        Scanner scanner
                = new Scanner(System.in);
        List<Long>  alice = new ArrayList<>();
        alice.add(1000000001L);
        alice.add(1000000002L);
        alice.add(1000000003L);
        alice.add(1000000004L);
        alice.add(1000000005L);


        long res = aVeryBigSum(alice);
        System.out.println(Long.toString(res));


    }
    public static long aVeryBigSum(List<Long> ar)
    {
        long result = 0;
        for(int i = 0;i< ar.size();i++)
        {
            result+= ar.get(i);
        }
        return result;
    }
}
