
/**
 * Catherine Zeng 11-28-13
 * 
 * this java file calculates the average pi of many dart throws for many trials.
 * 
 */
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
public class Darts
{
    public static double [] getXCoordinate(int darts)
    {
      double [] Xcoordinates=new double [darts];
      for (int n=0;n<darts;n++)
      Xcoordinates [n]=Math.random()-0.5;
      return Xcoordinates;
    }
    
    public static double [] getYCoordinate(int darts)
    {
      double [] Ycoordinates=new double [darts];
      for (int n=0;n<darts;n++)
      Ycoordinates [n]=Math.random()-0.5;
      return Ycoordinates;
    }
    
    public static double estimatePi(double Xcoordinates[],double Ycoordinates[],int darts, int trials)
    {
       int hitCount=0;
      for (int i=0; i<darts;i++)
      {
          if (Math.pow(Xcoordinates[i],2)+Math.pow(Ycoordinates[i],2)<=0.25)
          hitCount++;
          
      }
      
      double estimatePi=4*(double)hitCount/(double)darts;
     
      return estimatePi;
    }
    
    public static void printTrials(double [] trialPi)
    {
        for (int n=0;n<trialPi.length;n++)
        System.out.println("Trial ["+(n+1)+"]:pi= "+trialPi[n]);
    }
    
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many darts/trials?");
        int darts=in.nextInt();
        System.out.println("How many trials?");
        int trials=in.nextInt();
        
         double [] trialPi=new double[trials];
        for (int n=0; n<trials;n++)
         {
             double Xcoordinates []=getXCoordinate(darts);
             double Ycoordinates []=getYCoordinate(darts);
             double estimatePi=estimatePi(Xcoordinates,Ycoordinates, darts, trials);
             trialPi[n]=estimatePi;
        }
         
        printTrials(trialPi);
     
    }
    }//end of main method
//end of class
