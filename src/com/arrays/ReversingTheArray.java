package com.arrays;

import java.util.Scanner;

public class ReversingTheArray
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements  in the array");
        int elements   = scanner.nextInt();
        System.out.println("now creating the array");
        int[] createdArray = creatingTheUserArray(elements,scanner);
        for(int k = 0;k< createdArray.length;k++)
        {
            System.out.println(createdArray[k]);
        }
        System.out.println("now reversing the array");
        ReversingTheArray reversingTheArray = new ReversingTheArray();
        int[] reveresedArray = reversingTheArray.reversingTheArray(createdArray);
        for(int i = 0;i< reveresedArray.length;i++)
        {
            System.out.println(reveresedArray[i]);
        }

    }

    public  static  int[] creatingTheUserArray(int elements, Scanner scanner)
    {
        int[] userarray = new int[elements];
        for(int j = 0;j< userarray.length;j++)
        {
            userarray[j] = scanner.nextInt();
        }
        return userarray;
    }
    public int[] reversingTheArray(int[] array)
    {
        //1,2,3,4,5,6
       // int[] reversedArray = new int[array.length];
        int temp;
        for(int k  = 0;k< (array.length)/2;k++)
        {
            temp = array[k];
            array[k] = array[array.length-1 - k];
            array[array.length-1-k] = temp;
            //array.lenght-1 is for maximum index of array
        }
return  array;
    }
}
