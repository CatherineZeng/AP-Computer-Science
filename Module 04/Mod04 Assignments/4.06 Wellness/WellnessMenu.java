/**
 * Catherine Zeng 8-24-13
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  
 * @version 
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] Healthy Eating");
        System.out.println("[C] Food Pyramid");
        System.out.println("[D] Fitness Training");
        System.out.println("[E] Fast Food");
        System.out.println("Enter A,B,C,D, or E:");
         String choice = in.next();
        // provide menu item for BMR
        // provide menu item for Healthy Eating
        // provide menu item for Food Pyramid
        // provide menu item for Fitness Training
        // prompt user to enter A, B, C, D, or E: ");
        // accept user choice with a Scanner class method
        System.out.println();
        
        if( choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI");
        }
        else if( choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
            System.out.println("Testing: You chose B for Healthy Eating");
        }
        else if ( choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
            System.out.println("Testing: You chose C for Food Pyramid");
        }
        else if ( choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
            System.out.println("Testing: You chose D for Fitness Training");
        }
        else if (choice.equalsIgnoreCase("E") ) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
            System.out.println("Testing: You chose E for Fast Food");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
            System.out.println("You did not choose a valid entry!");
        }
    }
}
