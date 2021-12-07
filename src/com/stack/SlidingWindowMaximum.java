package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
           steps to follow
           1. find an array of NGE for the input values
           2. loop  til (arr.length - k) k is window for max number.
           3. create another pointer -J to  check for max number in window
           4. if j is left behind then update j to i

         */

         int windowSize = scanner.nextInt();
        int arrSize = scanner.nextInt();
        int[] valueArray = new int[arrSize];
        for (int i = 0; i < valueArray.length ; i++)
        {
            valueArray[i] = scanner.nextInt();

        }


        // step 1 find NGE

        int[] nge = new int[valueArray.length];
        Stack<Integer> mylocalStack = new Stack<>();
        nge[nge.length -1] = valueArray.length;
        mylocalStack.push(valueArray.length-1);

        for (int i = valueArray.length-2; i >= 0 ; i--)
        {
            while (mylocalStack.size() >0 && valueArray[i] >= valueArray[mylocalStack.peek()])
            {
                mylocalStack.pop();
            }

            if (mylocalStack.size() == 0)
            {
                nge[i] = valueArray.length;
            }else {
                nge[i] = mylocalStack.peek();
            }
            mylocalStack.push(i);
        }



        // step 2 looping till length -4 ;

        // pointer for next max value in or outside the window
        int j = 0;
        for (int i = 0; i <= valueArray.length-windowSize ; i++)
        {
            if(j< i)
            {
                j = i;
            }

            // jb tk nge element mil raha hai  window k andar tb tk move karna hai
            // else wahi pointer ko rok dena hai
            while (nge[j] < i+ windowSize)
            {
                j = nge[j];
            }

            System.out.println(valueArray[j]);
        }
    }
}
