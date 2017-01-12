/**
 *Catherine Zeng
 *6/30/13
 *This program converts selected units of measurements
 *
 * 〧LVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: (Catherine Zeng)
 * Date: (6/30/13)
 */
public class MeasurementConverter_V1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers
        double pounds;                  //weight in pounds
        double kilograms;               //weight in kilograms
        double liters;                  //volume in liters
        double gallons;                 //voluume in gallons
        double quarts;                  //volume in quarts
        double cups;                    //volume in cups
        double cupsPerQuart=4;          //numer of cups per quart
        double gallonsPerLiter=0.264172;          //number of gallons per liter
        double kilogramsPerPound=0.453592;       //nmber of kilograms per pound
        double kilometersPerMile=1.60934;//number of kilometers per mile
        double feetPerMile = 5280;      //number of feet per 1 mile
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable

        //Intro
        System.out.println("This program converts selected units of measurements");
        System.out.println("----------------------------------------------------");
        System.out.println(" ");
        
        //convert feet to miles
        System.out.println("Convert feet to miles");
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        System.out.println(" ");
        System.out.println(" ");
      
        //convert miles to feet
         System.out.println("Convert miles to feet");
        miles = 1.179;
        feet=miles*(feetPerMile);
        System.out.println(miles + " mi. = " + feet + " ft.");
        System.out.println(" ");
        System.out.println(" ");
     
        //convert miles to kilometers
         System.out.println("Convert miles to kilometers");
        miles=3;
        kilometers=miles*kilometersPerMile;
        System.out.println(miles + " mi. = " + kilometers + " km.");
         System.out.println(" ");
        System.out.println(" ");
        
        //convert kilometers to miles
         System.out.println("Convert kilometers to miles");
        kilometers=24;
        miles=kilometers/kilometersPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        System.out.println(" ");
        System.out.println(" ");
        
        //convert pounds to kilograms
         System.out.println("Convert pounds to kilograms");
        pounds=3;
        kilograms=pounds*kilogramsPerPound;
        System.out.println(pounds + " lb. = " + kilograms + " kg.");
         System.out.println(" ");
        System.out.println(" ");
     
        //convert kilograms to pounds
        System.out.println("Convert kilograms to pounds");
        kilograms=3;
        pounds=kilograms/kilogramsPerPound;
        System.out.println(kilograms + " kg. = " + pounds + " lb.");
        System.out.println(" ");
        System.out.println(" ");
        
        //convert gallons to liters
        System.out.println("Convert gallons to liters");
        gallons=3;
        liters=gallons/gallonsPerLiter;
        System.out.println(gallons + " gal. = " + liters + " l.");
        System.out.println(" ");
        System.out.println(" ");
        
        //convert liters to gallons
        System.out.println("Convert liters to gallons");
        liters=3;
        gallons=liters*gallonsPerLiter;
        System.out.println(liters + " l. = " + gallons + " gal.");
        System.out.println(" ");
        System.out.println(" ");
        
        //convert quarts to cups
        System.out.println("Convert quarts to cups");
        quarts=2;
        cups=quarts*4;
        System.out.println(quarts + " qts. = " + cups + " c.");
        System.out.println(" ");
        System.out.println(" ");

        //convert cups to quarts
        System.out.println("Convert cups to quarts");
        cups=16;
        quarts=cups/4;
        System.out.println(cups + " c. = " + quarts + " qt.");
        System.out.println(" ");
        System.out.println(" ");



    }//end of main method
}//end of class

