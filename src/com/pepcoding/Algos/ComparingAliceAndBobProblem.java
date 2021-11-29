package com.pepcoding.Algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComparingAliceAndBobProblem
{

    public static void main(String[] args) {

        Scanner scanner
                 = new Scanner(System.in);
        List<Integer>  alice = new ArrayList<>();
        alice.add(91);
        alice.add(3);
        alice.add(6);

        List<Integer>  bob = new ArrayList<>();
        bob.add(4);
        bob.add(3);
        bob.add(9);


        List<Integer>res = compareTriplets(alice,bob);
        System.out.println(res.toString());
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        List<Integer>result = new ArrayList<>();
        int[] aliceArray = new int[a.size()];
        for(int i = 0;i< aliceArray.length;i++)
        {
            aliceArray[i] = a.get(i);
        }

        int[] bobArray = new int[b.size()];
        for(int i = 0;i< bobArray.length;i++)
        {
            bobArray[i] = b.get(i);
        }
           int pointerAlice = 0;
        int pointerBob = 0;
        int ResForAlice = 0;
        int RestForBob = 0;

        while (pointerAlice < aliceArray.length &&  pointerBob < bobArray.length)
        {
            if(aliceArray[pointerAlice] > bobArray[pointerBob])
            {
                ResForAlice++;

            }else if(aliceArray[pointerAlice] < bobArray[pointerBob])
            {
                RestForBob++;
            }
            pointerAlice++;
            pointerBob++;
        }

        result.add(ResForAlice);
        result.add(RestForBob);



    return  result;
    }
}
