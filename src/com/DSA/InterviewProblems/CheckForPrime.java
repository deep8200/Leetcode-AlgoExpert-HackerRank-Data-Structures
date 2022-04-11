package com.DSA.InterviewProblems;

public class CheckForPrime
{
    public static void main(String[] args) {
        int num = 127;
        System.out.println(ifItsAPrime(num));
    }

    private static boolean ifItsAPrime(int num)
    {
        boolean flag = true;
        int count = 0;
        for (int i = 2; i*i <= num ; i++)
        {
            if (num%i == 0)
            {
                count++;
                flag = false;
                break;
            }


        }
        return flag;
    }
}
