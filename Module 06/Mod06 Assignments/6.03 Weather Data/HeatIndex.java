/**
 *Catherine Zeng 8-13-13
 *
 *This program calculates heat indexes with given temperature and humidity
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars

        String location = "Key West, Florida";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

		double t = 0.0;
		int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  ) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
            	t = temperature[n];
            	h = humidity[n];

                hI[n] = -42.379
                	    + 2.04901523 * t
                	    +10.14333127 * h
                	    -0.22475541 * t * h
                	    -6.83783E-3 * t*t
                	    - 5.481717E-2 * h*h
                	    +1.22874E-3 *t*t*h
                	    +8.5282E-4 *t*h*h
                	    -1.99E-6 *t*t*h*h; 	//complete formula found in lecture notes
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
        {
        	tempSum += temperature[n];
        }

        double tempAvg = tempSum/temperature.length;
        n=0;
         for(n = 0; n < humidity.length; n++)
        {
        	humidSum += humidity[n];
        }

        double humidAvg = humidSum/humidity.length;
        
         n=0;
         for(n = 0; n < hI.length; n++)
        {
        	hISum += hI[n];
        }

        double hIAvg = hISum/hI.length;



        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println();


        System.out.printf("  %60s \n    ","Months ");
        System.out.print("       ");
        for(String m : month)
        {
            System.out.printf("   %7.3s", m);
        }


        System.out.printf("   %7.3s\n", "Avg");
        System.out.println("***********************************************************************************************************************************************");


        System.out.print("Temp (F)    ");
        for(double b : temperature)
        {
            System.out.printf("   %7.4s", b);
        }
         System.out.printf("   %7.4s", tempAvg);
         //for:each loop to print temperature

		//print average
        System.out.println();

        System.out.print("Humidity (%)");
        for(int x : humidity)
        {
            System.out.printf("   %7.4s", x);
        }
        System.out.printf("   %7.4s", humidAvg);
        //for:each loop to print humidity
        System.out.println();

        System.out.print("HI (F)      ");
        for(double s : hI)
        {
            System.out.printf("   %7.4s", s);
        }
        System.out.printf("   %7.4s", hIAvg);
        //for:each loop to print HI

        System.out.println();
    } //end main()
}//end HeatIndex
