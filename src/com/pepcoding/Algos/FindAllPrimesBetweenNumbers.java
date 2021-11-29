package com.pepcoding.Algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllPrimesBetweenNumbers
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start number");
        int sN = scanner.nextInt();
        System.out.println("end Number");
        int eN = scanner.nextInt();

        List<Integer> loc_Arr = getMeAllPrimes(sN,eN);
        System.out.println("all avaialble primes");
        for (Integer integer : loc_Arr) {
            System.out.println(integer);

        }
    }

    private static List<Integer> getMeAllPrimes(int sN, int eN)
    {
        List<Integer> primes = new ArrayList<>();

        for (int actualNumber = sN; actualNumber <= eN ; actualNumber++)
        {
            int count = 0;
            for (int j = 2; j * j <= actualNumber ; j++)
            {
                if (actualNumber % j == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                primes.add(actualNumber);
                System.out.println("is prime"+ actualNumber);
            }

        }



        return primes;
    }
}
