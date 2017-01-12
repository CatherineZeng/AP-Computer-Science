
/**
 * Write a description of class NumericArrayDemo4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class NumericArrayDemo4
{
   public static void main(String[ ] args) throws IOException
    {
        int index = 0;
        int [ ] intValues = new int[500];
        File fileName = new File("ints.txt");
        Scanner inFile = new Scanner(fileName);
        
        while (inFile.hasNextInt())
        {
            
            intValues[index] = inFile.nextInt();
            index++;
        }
        
        for(int n = 0; n <= 100; n++)
        {
            System.out.println(intValues[index]);
        }  
        
        inFile.close();
        System.out.println("Thank you, all dwarfs are in the array now.");
    }//end of main method
}//end of class 