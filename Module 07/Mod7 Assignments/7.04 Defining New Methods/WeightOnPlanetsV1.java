/**
 *THis program calcualtes your weight on different planets catherine zeng 11-28-13
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WeightOnPlanetsV1
{
    // write static methods here
    public static double[] calcWeight(double[] mass, double[] gravity)
    {
        double[] weight=new double [mass.length];
        for (int n=0;n<mass.length;n++)
        weight[n]=mass[n]*gravity[n];
        return weight;
    }
    // Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity

   public static double [] getGravity() throws IOException
    {
       double[] gravity=new double [8];
       int index=0;
	   File fileName = new File("gravity1.txt");
       Scanner inFile = new Scanner(fileName);
       while (inFile.hasNext())
        {
            gravity[index] = inFile.nextDouble();
            index++;
        }
        inFile.close();
        return gravity;
    } 
    
       public static double[] getMass(double earthWeight)
    {
       double[] mass=new double [8];
       for (int n=0;n<8;n++)
       mass [n]=earthWeight;
       return mass;
    } 
    
      
    public static void printResults(String[]names,double[]gravity,double[]weight)
    {
    System.out.println("My Weight on the Planets");
    System.out.printf("%1s  %16s  %16s\n", "Planet", "Gravity","Weight");
    for (int n=0;n<names.length;n++)
    System.out.printf("%-10s  %12.2f  %16.2f\n", names[n], gravity[n],weight[n]);
    } 

    public static void main(String[] args)throws IOException
	{

		// Extension idea... instead of hard codeing the weight, you may propt the user for input.
      
	   double earthWeight = 100.0; // initalize Earth weight to 100 lbs.

		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double[] gravity = getGravity(); 							// static method you write
		double [] mass= getMass(earthWeight);
		double[] weight = calcWeight(mass, gravity);  // static method you write
		printResults(names, gravity, weight); 					// static method you write

    } //end main
}//end class