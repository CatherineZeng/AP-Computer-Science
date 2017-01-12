
/**
 * Description for 7.03 Gravity
 *
 * @author (Your Name)
 * @version (The Date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravity
{
	// calcGravity returns an array of doubles containing teh gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass
	public static double[] calcGravity(double[] radius, double[] mass)
	{
		double[] gravity=new double[radius.length];
	    for (int n=0;n<radius.length;n++)
		gravity[n]=((6.67*Math.pow(10,-11)*mass[n])/(Math.pow(radius[n],2)))/10;
		return gravity;
	    // fill in code here
		// The formula to calculate gravity is:
		// 6.67E-17 times the massOfPlanet divided by the radius of the planet squared
	}

	// printResults will print the table to output screen
	// return type is voide because no values are returned
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
		for(int n=0;n<radius.length;n++)
		System.out.printf("%10s %35.1e %35.1e %35.3f \n" ,name[n], radius[n], mass[n], gravity[n]);	
	    // fill in code here
	}

	//print the gravity values to text file
	public static void printToFile(double[] gravity)throws IOException
	{
		PrintWriter outFile = new PrintWriter(new File("gravity1.txt"));   

        for (int n=0;n<gravity.length;n++)
         outFile.println(gravity[n]);
     
        outFile.close ( );    //close the file when finished 

	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double[] radii = {2.4397E6, 6.051E6, 6.378E6, 3.402E6, 7.1492E7, 6.0270E7, 2.5562E7, 2.4774E7};
		double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26)};
        // or using big E notation:
		double [] mass = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26}; // See IMACS double lesson for big E notation

		// Processing
		double[] gravities = calcGravity(radii, masses);

		// Output
		printResults(names, radii, masses, gravities);
		printToFile(gravities);


    } //end main
}//end class