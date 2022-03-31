package com.leetCode.SearchAlgo;

public class SquareRootWithoutBinarySearch
{

    public static void main(String[] args) {


        int ans = 1;
        int num = 4;
        while (ans * ans <= num)
        {
            ans++;

        }
        System.out.println(ans-1);
    }
}
