
/**
 * Write a description of class NumericArrayDemo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumericArrayDemo3
{
    public static void main(String [] args)
    {
        double [][] doubleValues = new double [3][3];
       
        int column=0;
        int row=0;
        Scanner in = new Scanner(System.in);

        for(row=0; row <= 2; row++)
        {
            column=0;
           for(column=0; column<=2; column ++)
           {
               System.out.println("Enter the double for array ["+row+"]["+column+"]: ");
               doubleValues[row][column] = in.nextDouble();
           }
        }
        column=0;
        row=0;
        for(row=0; row <= 2; row++)
        {
            column=0;
           for(column=0; column<=2; column ++)
           {
               System.out.println("Double value [" +row + "][" +column + "] is:"
                                  +doubleValues[row][column]);
           }
        }
        System.out.println("goodbye");
    }
}
