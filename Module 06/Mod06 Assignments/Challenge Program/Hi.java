/**
 * Hurricane description:
 *
 * @author:
 * @version:
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Hi
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables


		int arrayLength = 1;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        double [] wind = new double[arrayLength];



        File fileName = new File("test.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            wind[index] = inFile.nextDouble();
            
            index++;
        }
        inFile.close();
    }
}