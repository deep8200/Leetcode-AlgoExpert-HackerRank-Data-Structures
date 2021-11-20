package com.learningExercises;

import java.util.Scanner;

public class Method_Overloading_FeetToCentimeters {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double inputInches = sc.nextDouble();
        System.out.println("CENTIs are:  "+ new Method_Overloading_FeetToCentimeters().convertFeetAndInchesToCentimeters(inputInches));
    }



    public double convertFeetAndInchesToCentimeters(double inches){
        if( (inches <0 )) {
            System.out.println("Invalid Value For Conversion");
            return -1d;
        }else {
            double[] data;
            data=inchesToFeets(inches);

            return convertFeetAndInchesToCentimeters(data[0],data[1]) ;
        }

    }
    public double convertFeetAndInchesToCentimeters(double feets,double inches){
        if(feets <0 || (inches <0 || inches >12))
            return -1d;
        else
            return  feettoCenti(feets) + inchesTocenti(inches);

    }


    public double[] inchesToFeets(double inches)
    {
        System.out.println("TOTAL FEET "+((int)inches/12 )+ " &   Total Inches :"+ inches%12);
        return  new double[] { (int)inches /12,inches %12};
    }

    public  double feettoCenti(double feet){
        return  feet * 12 * 2.54;
    }
    public  double inchesTocenti(double inches){
        return  inches * 2.54;
    }
}
