package com.learningExercises;

import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to check If it's a Leap Year..");
        int year = sc.nextInt();
        System.out.println("answer is : "+ new LeapYearCalculator().isLeapYear(year)  );

    }

    public boolean  isLeapYear(int yearNumber)
    {
        boolean  isCorrect = false;
        if(yearNumber < 1 ||  yearNumber >9999)
            System.out.println("Please Provide A valid Number to check !!");
        else {
           if(yearNumber % 4 == 0 )
           {
               if(yearNumber % 100 ==0)
               {
                   if (yearNumber % 400 == 0)
                   {
                       System.out.println("This is a Leap Year !!..Good Work !!");
                       isCorrect = true;
                   }else
                       callNegativeMethod();

               }else
                   callNegativeMethod();
           }else
               callNegativeMethod();


        }

        return  isCorrect;
    }
    public  void  callNegativeMethod()
    {
        System.out.println("Not A Leap Year ...!!! Try Again !!");
    }



}
