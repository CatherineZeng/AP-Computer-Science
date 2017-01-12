
/**
 * Catherine Zeng 8-21-13
 * This program calculates the basal Metabolic Rate of a person based on their weight, height, and age
 */
import java.util.Scanner;                                       //import the Scanner class
public class BMR                                      //class declaration
{
    public static void main(String [] args)                     //beginning of main method
    {
        //entering variables
        
        Scanner in = new Scanner(System.in);                    //create Scanner object to use input methods
        System.out.print("Enter your name: ");            //prompt user for input            
        String name = in.next();                                   //read input from keyboard as a String
        System.out.print("Gender (M or F):");            //prompt user for input            
        String gender = in.next();                                   //read input from keyboard as a String
        char genderTypeChar = gender.charAt(0);
        System.out.print("Age: ");            //prompt user for input            
        String ageString = in.next();                                   //read input from keyboard as a String
        double age=Double.parseDouble(ageString);
        System.out.print("Height (in inches):");            //prompt user for input            
        String height = in.next();                                   //read input from keyboard as a String
        System.out.print("Weight (in pounds):");            //prompt user for input            
        String weight = in.next();                                   //read input from keyboard as a String
        
        double heightInInches=Double.parseDouble(height);
        double weightInPounds=Double.parseDouble(weight);
        
        //measurement converting
        double centimetersPerInch=2.54;
        double heightInCentimeters= heightInInches*2.54;
        double kilogramsPerPound=0.453592;
        double weightInKilograms=weightInPounds*0.453592;
       
        
        boolean genderType = genderTypeChar=='M';     //if person is a child, assign true to boolean variable
        double basalMetabolicRate;
        
        if(genderType)                                             //evalueate if boolean is true or not
           basalMetabolicRate=13.397*weightInKilograms+4.799*heightInCentimeters-5.677*age+88.362;                               
        else
           basalMetabolicRate=9.247*weightInKilograms+3.098*heightInCentimeters-4.330*age+447.593;                                 
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Calculate Your Basal Metabolism");
        System.out.println("");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Weight (kg): "+weightInKilograms);
        System.out.println("Height (cm): "+heightInCentimeters);
        System.out.println("Basal Metabolic Rate: "+basalMetabolicRate+" calories per day");
       }                                                        //end of main method
    }                                                           //end of class
