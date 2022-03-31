package com.leetCode.arrays;

public class SquaresOfSortedArray
{
    public static void main(String[] args) {

        int[] num = {-7,-3,2,3,11};
        int[] num1 = {-4,-1,0,3,10};
        //int[] resArr = new int[num.length];
        for (int i = 0; i < num.length ; i++)
        {
            int temp = num[i];
            num[i] = performingSquares(temp);


        }
        //resArr = sortInBubbleManner(resArr);
        num = sortInMergeManner(num);

        for (int a:
                num) {
            System.out.print(a+" ");

        }
    }

    private static int[] sortInMergeManner(int[] resArr)
    {
     return recursiveCallForMerge(resArr,0,resArr.length-1);
    }

    private static int[] recursiveCallForMerge(int[] resArr, int low, int high)
    {
        if(low == high)
        {
            int[] baseCase = new int[1];
            baseCase[0] = resArr[low];
            return baseCase;
        }

        int mid = (low + high)/2;
        int[] firshHalf = recursiveCallForMerge(resArr,low,mid);
        int[]  secondHalf = recursiveCallForMerge(resArr,mid+1,high);
        return add2SortedArray(firshHalf,secondHalf);
    }

    private static int[] add2SortedArray(int[] firshHalf, int[] secondHalf)
    {
        int[] final_array = new int[firshHalf.length + secondHalf.length];
        int first_pointer = 0;
        int second_pointer = 0;
        int res_pointer = 0;
        while (first_pointer < firshHalf.length && second_pointer < secondHalf.length)
        {
            if (firshHalf[first_pointer] <= secondHalf[second_pointer])
            {
                final_array[res_pointer] = firshHalf[first_pointer];
                first_pointer++;
            }else {
                final_array[res_pointer] = secondHalf[second_pointer];
                second_pointer++;
            }
            res_pointer++;
        }

        while (first_pointer < firshHalf.length)
        {
            final_array[res_pointer] = firshHalf[first_pointer];
            first_pointer++;
            res_pointer++;
        }
        while (second_pointer < secondHalf.length)
        {
            final_array[res_pointer] = secondHalf[second_pointer];
            second_pointer++;
            res_pointer++;
        }
        return final_array;
    }

    private static int[] sortInBubbleManner(int[] resArr)
    {
        for (int i = resArr.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++)
            {
             if(resArr[j] > resArr[j+1])
             {
                 swappingOfNumbers(resArr,j,j+1);
             }
            }
        }
        return resArr;
    }

    private static void swappingOfNumbers(int[] resArr, int j, int k)
    {
        if(j != k )
        {
            int temp;
            temp = resArr[j];
            resArr[j] = resArr[k];
            resArr[k] = temp;
        }
    }

    private static int performingSquares(int i)
    {
        return  i * i;
    }
}
