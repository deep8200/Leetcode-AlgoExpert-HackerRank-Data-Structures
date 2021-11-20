package com.learningExercises;

import java.util.Scanner;

public class BarkingDogProblem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Is Dog Barking ?");
        boolean bark = sc.nextBoolean();
        if(bark)
        {
            System.out.println("What Time of Day it is ?");
            int timeOfDay = sc.nextInt();
            if(timeOfDay <0 || timeOfDay > 23)
                System.out.println("Alarm has gone Mad !! I am Not waking up  ");
            else
            {
                boolean needToWakeUp = new BarkingDogProblem().shouldWakeUp(bark,timeOfDay);
                if (needToWakeUp)
                    System.out.println(" Come-on Dog is Barking !! Need to wake-up ");
                else
                    System.out.println(" Dog is Barking in Day Time..Seriously Man");
            }

        }
        else
            System.out.println(" Dog is Sleeping !! So Am I ");
    }

    public  boolean shouldWakeUp( boolean isDogBarking, int hourOfDay){

       return   (isDogBarking && (hourOfDay <8 || hourOfDay >22));
    }
}
