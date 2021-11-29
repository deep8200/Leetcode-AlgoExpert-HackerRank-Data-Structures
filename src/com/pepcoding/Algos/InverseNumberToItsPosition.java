package com.pepcoding.Algos;

import java.util.ArrayList;
import java.util.Scanner;

public class InverseNumberToItsPosition
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nu = scanner.nextInt();
        int[] numInnverse = inverseTheNumber(nu);
        for (Integer a:numInnverse
             ) {
            System.out.println(a);
        }

    }

    private static int[] inverseTheNumber(int nu)
    {
        ArrayList<Integer> list_num = new ArrayList<>();
       int nod = 0;
        while (nu >0)
        {
            list_num.add(nu % 10);
            nu = nu/10;
            nod++;
        }
        int[] arr_num = new int[nod];
        int pointerIndex= 0;
        while (pointerIndex < list_num.size())
        {

            int temp;
            temp = list_num.get(pointerIndex);
            if(pointerIndex == 0)
            {
                pointerIndex =1;
            }
            if(temp >= arr_num.length)
            {
                temp = temp-1;
            }

            arr_num[temp] = pointerIndex;
            //list_num1.add(temp,pointerIndex);
            pointerIndex++;
        }

         return arr_num;
    }


}
