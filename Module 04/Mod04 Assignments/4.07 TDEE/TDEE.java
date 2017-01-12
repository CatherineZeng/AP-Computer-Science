/**Catherine Zeng 8-28-13
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @author
 * @version
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR:" );
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();

        

       if( choice.equalsIgnoreCase("A"))
        {
          double activityFactor=1.0;
           // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
        else if( choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            double activityFactor=1.3;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
         else if( choice.equalsIgnoreCase("C") && gender.equalsIgnoreCase("m")) //condition for choice B goes in the parentheses
        {
            double activityFactor=1.6;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("C") && gender.equalsIgnoreCase("f")) //condition for choice B goes in the parentheses
        {
            double activityFactor=1.5;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("D") && gender.equalsIgnoreCase("m")) //condition for choice B goes in the parentheses
        {
            double activityFactor=1.7;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("D") && gender.equalsIgnoreCase("f")) //condition for choice B goes in the parentheses
        {
            double activityFactor=1.6;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("E") && gender.equalsIgnoreCase("m")) //condition for choice B goes in the parentheses
        {
            double activityFactor=2.1;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("E") && gender.equalsIgnoreCase("f")) //condition for choice B goes in the parentheses
        {
            double activityFactor=1.9;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("F") && gender.equalsIgnoreCase("m")) //condition for choice B goes in the parentheses
        {
            double activityFactor=2.4;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
           else if( choice.equalsIgnoreCase("F") && gender.equalsIgnoreCase("f")) //condition for choice B goes in the parentheses
        {
            double activityFactor=2.2;
             // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        }
        else //default choice for an invalid entry
        {
        
            System.out.println("You did not choose a valid entry!");
            
        }
       

    }
}

