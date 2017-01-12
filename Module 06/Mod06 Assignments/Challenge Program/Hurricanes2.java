/**
 Catherine Zeng 10-24
 This program displays the year month pressre wind speed and name of hurricanes and exports this information to a file called summary
 
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables


		int arrayLength = 59;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        double [] wind = new double[arrayLength];
        String [] name = new String[arrayLength];



        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            wind[index] = inFile.nextDouble();
            name[index]=inFile.next();
            
            index++;
        }
        inFile.close();


		//PROCESSING - calculate and convert values
		int n=0;
		
		// convert windspeed from knots to MPH
		for (n=0;n<wind.length;n++)
		    wind[n]=wind[n]*1.15078;
		// determine category
		int [] category= new int [arrayLength];
		for (n=0; n<wind.length;n++)
		{
		    if (wind [n] >=74)
		    category[n]=1;
		    if (wind [n] >=96)
		    category[n]=2;
		    if (wind [n] >=111)
		    category[n]=3;
		    if (wind [n] >=130)
		    category[n]=4;
		    if (wind[n]>=157)
		    category[n]=5;
		   
		  }
		  

		
		// count number of each category
		double pressureSum=0.0;
		double pressureAve=0.0;
        for(n = 0; n < pressure.length; n++)
        {
            pressureSum += pressure[n];        
        }
        pressureAve=pressureSum/pressure.length;
        
        double windSum=0.0;
		double windAve=0.0;
        for(n = 0; n < wind.length; n++)
        {
            windSum += wind[n];        
        }
        windAve=windSum/wind.length;
        
        int categorySum=0;
		int categoryAve=0;
        for(n = 0; n < category.length; n++)
        {
            categorySum += category[n];        
        }
        categoryAve=categorySum/category.length;

        //Find min, max and average for category, windspeed and pressure
        Integer pressureMin = Integer.MAX_VALUE;
        for(n = 0; n < pressure.length; n ++)
        {
            if (pressure[n] < pressureMin)
                pressureMin = pressure[n];
        }

        Integer pressureMax = Integer.MIN_VALUE;
        for(n = 0; n < pressure.length; n ++)
        {
            if (pressure[n] > pressureMax)
                pressureMax = pressure[n];
        }

        Double windMin = Double.MAX_VALUE;
        for(n = 0; n < wind.length; n ++)
        {
            if (wind[n] < windMin)
                windMin = wind[n];
        }

        Double windMax = Double.MIN_VALUE;
        for(n = 0; n < wind.length; n ++)
        {
            if (wind[n] > windMax)
                windMax = wind[n];
        }
        
        int categoryMin = Integer.MAX_VALUE;
        for(n = 0; n < category.length; n ++)
        {
            if (category[n] < categoryMin)
                categoryMin = category[n];
        }

        int categoryMax = Integer.MIN_VALUE;
        for(n = 0; n < category.length; n ++)
        {
            if (category[n] > categoryMax)
                categoryMax = category[n];
        }

        //Output - print table using printf to format the columns


        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for(n = 0; n < year.length; n ++)
        {
             System.out.printf("%d %13s %8d %15d %16.1f\n" ,year[n],name[n],category [n], pressure[n], wind [n]);
        }
        System.out.println("=====================================================================");
        
        
        PrintWriter outFile = new PrintWriter(new File("summary.txt"));   

        outFile.println("                      Hurricanes 1980 - 2006");
        outFile.println();
        outFile.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        outFile.println("=====================================================================");
        for(n = 0; n < year.length; n ++)
        {
             outFile.printf("%d %13s %8d %15d %16.1f" ,year[n],name[n],category [n], pressure[n], wind [n]);
             outFile.println("");
        }
        outFile.println("=====================================================================");
        outFile.close ( );    //close the file when finished 



    }//end main()
}//end Hurricanes2

