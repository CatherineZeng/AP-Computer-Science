/**
 * The purpose of this program is to calculate your age in minutes
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 06/01/08
 */
import java.util.Scanner;                       
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {       
        Scanner in = new Scanner(System.in);    
        
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");
        
        System.out.print("Please your age in years: ");
        double userAge = in.nextDouble();

        
        double approxAgeInDays = userAge * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.substring(0,2);
        String capsLastName = lastName.substring(0,2);
        String name = firstName+lastName;
        
        System.out.println("Name: " + name);       
        System.out.print("Age in Minutes: " + ageInMinutes + "\n");       
    }
}