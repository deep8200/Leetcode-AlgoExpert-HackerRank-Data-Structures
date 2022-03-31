package com.DSA.PRACTICE;

public class Pattern2
{
    public static void main(String[] args) {
        int lines =4;
        for (int i = lines; i >=1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }

}
