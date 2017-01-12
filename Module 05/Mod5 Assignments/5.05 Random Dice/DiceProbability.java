/**
 *Catherine Zeng 9-14-13 
 *This program calculates the probability of a certain sum of two dice and lets the user pick the number of faces and times rolled.
 *
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
      Scanner in= new Scanner(System.in);
      System.out.print("Please enter the number of sides on a die: ");
      int numSides=in.nextInt();
      System.out.print("Please enter the number of rolls: ");
      int numRolls=in.nextInt();
      System.out.print("\n Sum of dice \t Probability \n");
      Random randNum = new Random();
      int sum = 0;
      int match = 0; //Number of times sum of dice matches the current sum
      int die2 = 0;
      int die1 = 0;
      double probability = 0.0;
      int counter=0;

       
        for(sum=2; sum<=2*numSides; sum++)
        {
            match=0;
             for(counter=1; counter<=numRolls; counter++)
             { 
                 
                 die2 = randNum.nextInt( numSides ) +1;
                 die1 = randNum.nextInt( numSides ) +1;
                 int sumTrial= die1+die2;
                      if ( sumTrial == sum )
                      {
                         match++;
                      }
                      
               
              }
            probability = (double)match / (double)numRolls * 100;
            System.out.println("    " + sum + "\t\t" + probability );
        }
     }
}