package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementInArray
{
    /*
    original array = {2,5 9 3 1 12 6 8 7}
    next greater element = { 5  9  12  12  12  -1   8  -1  -1}

    process shd be
    1 -for last element consider max value as -1 and also in nge array move it t last
    position
    2 - loop from 2nd last position to 0
    and check while this is true   [ st.size> 0  && arr[i] >= st.peek()]
    st.pop();

    if(st.size()== 0)
    nge[i] = -1;
    else
    nge[i] = st.peek();

   st.push(arr[i]);

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = scanner.nextInt();

        }

        callingNextGreaterElementMethod(arr);
    }

    private static void callingNextGreaterElementMethod(int[] arr)
    {
        int[] finalArr = new int[arr.length];
        Stack<Integer> myStack = new Stack<>();

        myStack.push(arr[arr.length-1]);
        finalArr[finalArr.length-1] = -1;
        for (int i = arr.length-2; i >=0 ; i--) {
            while (myStack.size() >0 && arr[i]>= myStack.peek())
            {
                myStack.pop();
            }
            if (myStack.size() == 0)
            {
                finalArr[i] = -1;

            }else {
                finalArr[i] = myStack.peek();
            }
            myStack.push(arr[i]);
        }

        for (int a:finalArr) {
            System.out.println(a);
        }
    }

}
