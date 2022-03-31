package com.leetCode.arrays;

public class FIndingEvenDigitedNUmberFromAnArray
{
    public static void main(String[] args) {

        int[] num = {12,345,2,6,7896};
        int[] num1 = {555,901,482,1771};
        FIndingEvenDigitedNUmberFromAnArray b = new FIndingEvenDigitedNUmberFromAnArray();
        int res = b.findNumbers(num1);
        System.out.println(res);

    }

    private  int findNumbers(int[] num)
    {
        int counter = 0;
        for (int i = 0; i <num.length ; i++) {
            if( calculateDigits(num[i]) % 2 == 0)
            {
                counter++;
            }
        }
        return counter;
    }

    private static int calculateDigits(int num)
    {
        int digitCount = 0;
        int remainder = 0;
        int temp = num;
        while (temp >0)
        {
            remainder = temp %10;
            digitCount++;
            temp = temp/10;
        }

        return digitCount;
    }
}
