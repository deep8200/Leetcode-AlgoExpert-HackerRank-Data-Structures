package com.learningExercises;

public class KiloMetersToMiles
{

    public static void main(String[] args) {

       double totalKilometers = 1000;
       long totalMiles = new KiloMetersToMiles().toMilesPerHour(totalKilometers);
       new KiloMetersToMiles().messageAfterConversion(Math.round(totalKilometers),totalMiles);

    }


    public void messageAfterConversion(double totalKilometers, long convertedMiles){
        if (convertedMiles == -1L)
            System.out.println("Please Provide a Valid Value for Conversion");
        else
        System.out.println("The Converted Miles for "+ totalKilometers +"Kilometers are:"+ (convertedMiles));
    }

  public long  toMilesPerHour( double kilometerPerHour){
    long milesCount ;
    double kilometersPerMile = 1.60934d;
    if (kilometerPerHour<0.0d)
        milesCount = -1L;
    else
        milesCount =   Math.round( kilometerPerHour / kilometersPerMile);


     return milesCount;
  }
}
