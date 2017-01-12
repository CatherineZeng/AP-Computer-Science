/**
 *Catherine Zeng 9-22-13 
 *This program calculates average number of caps that need to be opened to win a prize
 *
 */

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
      Scanner in= new Scanner(System.in);
      System.out.print("Please enter the number of trials: ");
      int trials=in.nextInt();
      Random randNum = new Random();
      int trialCounter = 0;
      int match = 1;
      int capNumber = 0;
      boolean noMatch= true;
      int bottleCounter=0;
      double probability = 0.0;
      double aveNumBottlesNum=0.0;
      PrintWriter outFile=new PrintWriter(new File("trialrecords.txt"));
       
        for(trialCounter=1; trialCounter<=trials; trialCounter++)
        {
            noMatch=true;
            bottleCounter=0;
             while(noMatch)
             { 
                 bottleCounter++;
                 capNumber = randNum.nextInt( 5 ) +1;

                      if ( capNumber == match )
                      {
                         noMatch=false;
                         outFile.println("Trial " + trialCounter + " took " + bottleCounter + " bottles.");
                      }
                  
        }
        aveNumBottlesNum+=bottleCounter;
     }
     double aveNumBottles= aveNumBottlesNum/(double)trials;
     System.out.println("The average number of caps opened to earn a prize was "+aveNumBottles);
     outFile.close();
}
}