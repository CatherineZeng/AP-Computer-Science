/**
 * Description for 5.05 Dice Probability project
 *
 * @author (Your Name)
 * @version (The Date)
 *
 * All the code for this project is provided. Your task is to rearrange it and put it in the correct order.
 * The final program should be indented properly and each section documented.
 *
 */

import java.util.Random;
import java.util.Scanner;
public class DICE2
{
    public static void main(String[] args)
    {
       Scanner in= new Scanner(System.in);
       System.out.print("Please enter the number of sides on a die: ");
       int sides= in.nextInt();
       System.out.print("Please enter the number of rolls: ");
       int rolls= in.nextInt();
       System.out.print("\n Sum of dice \t Probability \n");
       Random randNumList = new Random(); 
       int diceNum1=0;
       int diceNum2=0;
       
       for(diceNum1 = 1; diceNum1 <= rolls; diceNum1++) 
       for(diceNum2=1; diceNum2 <=rolls; diceNum2++)
         f
       } 
        
       diceNum1 = randNumList.nextInt(7);
        int randNum = 0; 
        Random randNumList = new Random(); 
 
       for(int n = 1; n <= 10; n++) 
       { 
        randNum = randNumList.nextInt(7); 
        System.out.println(randNum + " "); 
       } 
        
    	//Declare and initialize variables and objects

        //Input: ask user for number of rolls and number of sides on a die

        //Print heading for output table


        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        //Loop to increment through the possible sums of the dice
        	//Loop to throw dice given number of times
        		//Randomly generate values for two dice
            	//Check if the sum of dice is equal to the given sum
            //After all throws, calculate percentage of throws that resulted in the given sum
            //Print results



    // Use the code below to complete the program. All statements are complete and when placed in the proper order, the program will work!
    // Be sure to indent code properly and include documation for each section..
    System.out.println("    " + sum + "\t\t" + probability );
    System.out.print("Please enter the number of sides on a die: ");
    int sides= in.nextInt();
    System.out.print("Please enter the number of rolls: ");
    int rollss= in.nextInt();
    System.out.print("\n Sum of dice \t Probability \n");
    Scanner in = new Scanner(System.in);
    Random randNum = new Random();
    probability = (double)match / numRolls * 100;
    numSides = in.nextInt();
    numRolls = in.nextInt();
    match++;
    match = 0;
    int sum = 0;
    int numSides = 0;
    int numRolls = 0;
    int match = 0; //Number of times sum of dice matches the current sum
    int die2 = 0;
    int die1 = 0;
    double probability = 0.0;
    die2 = randNum.nextInt( numSides ) +1;
    die1 = randNum.nextInt( numSides ) +1;

    if ( die1 + die2 == sum )
   {
   } // end if

   for( sum = 2; sum <= (numSides * 2); sum++ )
   {
   } //end for

      for( int roll  = 0; roll < numRolls; roll++ )
   {
   } //end for


    } //end main
}//end class DiceProbability
