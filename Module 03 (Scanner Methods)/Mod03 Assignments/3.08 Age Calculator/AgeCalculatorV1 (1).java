/**
 * The purpose of this program is to calculate your age in minutes
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 06/01/08
 */
import java.util.Scanner;                       
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {       
        String firstName;           //user input as String
        double doubleValue;         //String converted to double     
        double doubleAnswer = 0;    //answer to calculation with doubleValue
        
        int intValue;               //String converted to int
        int intAnswer;              //answer to calculation with int
        
        
        
        Scanner in = new Scanner(System.in);    
        
        System.out.print("Please enter your name (first last): ");
        firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");
        
        System.out.print("Please your age in years: ");
        String userAge = in.next();
        
        double approxAgeInDays = ageInYears * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.substring(0,2);
        String capsLastName = lastName.ToUpperCase();
        String name = firstInitial + capsLastName;
        
        System.out.println("Name: " + name);       
        System.out.print("\tab\tab Age in Minutes: " + ageInMinutes + "/n");       
    }
}