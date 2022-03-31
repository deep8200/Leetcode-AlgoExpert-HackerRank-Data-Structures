package com.algoExpert.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetValidationWithSequenceInArray
{
    public static void main(String[] args) {
       // int[] main_arr = {5, 1, 22, 25, 6, -1, 8, 10};
        //int[] seq_arr = {25};
        ArrayList<Integer>main_arr =  new ArrayList<>();
        main_arr.add(5);
        main_arr.add(1);
        main_arr.add(22);
        main_arr.add(25);
        main_arr.add(6);
        main_arr.add(-1);
        main_arr.add(8);
        main_arr.add(10);

        ArrayList<Integer> seq_arr = new ArrayList<>();
        seq_arr.add(5);
        seq_arr.add(1);
        seq_arr.add(22);
        seq_arr.add(25);
        seq_arr.add(6);
        seq_arr.add(-1);
        seq_arr.add(8);
        seq_arr.add(10);
        seq_arr.add(12);
//5, 1, 22, 25, 6, -1, 8, 10, 12
        System.out.println(isVAlidatedSequence(main_arr,seq_arr));
    }

    private static boolean isVAlidatedSequence(List<Integer> main_arr, List<Integer> seq_arr)
    {
        int indx= 0;
        int i = 0;
        int j = 0;
        boolean isValidated  = false;
        while (i< main_arr.size())
        {
            if(main_arr.get(i).equals(seq_arr.get(j)))
            {
                indx++;
                i++;
                if (indx == seq_arr.size())
                {
                    isValidated = true;
                    break;
                }
                j++;


            }else {
                i++;
            }
        }
        if (indx == seq_arr.size())
        {
            isValidated = true;
        }
        return isValidated;
    }
}

