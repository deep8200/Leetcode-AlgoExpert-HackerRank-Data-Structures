package com.two_DArrays;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem
{

    /*
    celebrity problem:

    1 . everyone knows him
    2. he knows nobody
    3. there cannot be more than 1 celebrity
    4. there can be no celebrity at all

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // consider them both as same row n column
        int totalPeople = scanner.nextInt();
        int[][] crowd = new int[totalPeople][totalPeople];
        for (int i = 0; i < totalPeople; i++)
        {
            for (int j = 0; j <  totalPeople; j++)
            {
                crowd[i][j] = scanner.nextInt();

            }
        }

        //show crowd
        for (int i = 0; i < crowd.length ; i++)
        {
            for (int j = 0; j < crowd[i].length; j++)
            {
                System.out.print(crowd[i][j]+ " ");
            }
            System.out.println();
        }



        //celebrity check
        Stack<Integer> isCelebrity = new Stack<>();
        for (int i = 0; i < crowd.length ; i++)
        {
            isCelebrity.push(i);

        }

        while (isCelebrity.size()>=2)
        {
            int i = isCelebrity.pop();
            int j = isCelebrity.pop();
            //i janta hai j ko,matlb i to celebrity nhi hai
            //coz celebrity kisi ko nhi janta
            // push karo j ko ,coz potential candidate hai j hai i nhi
            if(crowd[i][j] == 1){
                isCelebrity.push(j);
            }else {
                isCelebrity.push(i);
            }
        }

        int finalPotentialCandidate = isCelebrity.pop();
        for (int i = 0; i < crowd.length; i++)
        {
            if ( i != finalPotentialCandidate)
            {
                if(crowd[i][finalPotentialCandidate] == 0 || crowd[finalPotentialCandidate][i] == 1)
                /*
                agar koi i potenCandidate ko nhi janta ,iska matlb candinate celebrity nhi hai
                coz ..celebrity ko sab jante hai
                 ||

                agar candidate kisi i ko janta hai,matlb candiate celebrity nhi hai
                coz.. celebrity kisi ko nhi janta
                 */
                {

                    System.out.println("none is celebrity");
                    return;
                }
            }

        }
        System.out.println(finalPotentialCandidate + "is a celebrity");

    }
}
