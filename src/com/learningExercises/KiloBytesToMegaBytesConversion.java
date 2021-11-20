package com.learningExercises;

import java.util.Scanner;

public class KiloBytesToMegaBytesConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Kilos: ");
        int inputKilos = sc.nextInt();
        if (inputKilos <0)
        {
            System.out.println("Invalid Kilos to Convert");
        }else
        {
            int[] totalMbs = new KiloBytesToMegaBytesConversion().kiloByteToMegaByte(inputKilos);
            System.out.println("Megabytes are:  "+ totalMbs[0]+"  total Kilos are "+ totalMbs[1] );

        }


    }

    public int[] kiloByteToMegaByte(int kilos){
           int[] data = new int[2];
           data[0] = kilos / 1024;
           data[1] = kilos % 1024 ;
            return  data;
    }
}
