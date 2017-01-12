
/**
 * Catherine Zeng 8-22-13
 * 
 * This programs calculates the bmi of a person and states the category of it.
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        String letterGrade = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name (first last): ");
        String first = in.next();
        String last = in.next();
        System.out.println("Enter your weight in pounds (e.g. 175): ");
        String weight = in.next();
        System.out.println("Enter your height in feet and inches (e.g. 5 11): ");
        String heightInFeet = in.next();
        String heightInches = in.next();
        
        double heightInFeet2=Double.parseDouble(heightInFeet);
        double heightInches2=Double.parseDouble(heightInches);
        double heightInInches=heightInFeet2*12+heightInches2;
        double heightInMeters=0.0254*heightInInches;
        
        double weightInPounds=Double.parseDouble(weight);
        double weightInKilograms=weightInPounds*0.453582;
        
        double bmi=weightInKilograms/(heightInMeters*heightInMeters);
        String weightStatus;
        
        if(bmi <= 18.5)
            weightStatus="Underweight";
        else if(bmi <= 24.9)
            weightStatus="Normal";
        else if(bmi<29.9)
            weightStatus="Overweight";
        else
            weightStatus="Obese";
            
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: "+first+" "+last);
        System.out.println("Height (m): "+heightInMeters);
        System.out.println("Weight (kg): "+weightInKilograms);
        System.out.println("BMI: "+bmi);
        System.out.println("Category: "+weightStatus);
        
    }
}
