/**
 * Catherine Zeng 10-6-13
 * Annual Climate description:
 *This displays the temperature and precipitation of an area
 */

import java.util.Scanner;
class AnnualClimate
{

    Scanner in = new Scanner(System.in);
   	public static void main (String [ ] args)
	{

		//Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Apalachicola";
		String state = "Florida";

		String month [] ={"Jan", "Feb", "Mar" ,"Apr", "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec" };
		double temperature [] ={52.7,55.3,60.7,66.8,74.1,80.0,81.9,81.7,79.1,70.2,62.0,55.2}; 		//initialize with Fahrenheit values
		double precipitation [] ={4.9,3.8,5.0,3.0,2.6,4.3,7.3,7.3,7.1,4.2,3.6,3.5}; 	//initialize with inches values

		String tempLabel = "(F)";   //initialize to F
		String precipLabel = "(in)"; //initialize to cm


		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				temperature [index]=(temperature[index] -  32)  *  5.0/9 ;
			}

		}

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";
			
			for( int index2 = 0; index2< precipitation.length; index2++)
			{
				precipitation[index2]= (precipitation[index2]* 2.54);
			}

		}

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();
		for( int index = 0; index<=11; index++)
			{
				System.out.printf("%s%18.1f%22.1f\n",month[index],temperature[index],precipitation[index]);
			}
	
		
		double sumTem=0.0;
		double sumPre=0.0;
        for (int index = 0; index < temperature.length; index++) 
         sumTem += temperature[index]; 
         
        for (int index2 = 0; index2 < precipitation.length; index2++) 
         sumPre += precipitation[index2];
        double average=sumTem/temperature.length;
        double annual=sumPre/precipitation.length;
        System.out.printf("%18s","Average: ");
        System.out.printf("%1.1f",average);
        System.out.printf("%15s","Annual: ");
        System.out.printf("%1.1f\n",annual);
	
	}//end main
}//end Annual Climate