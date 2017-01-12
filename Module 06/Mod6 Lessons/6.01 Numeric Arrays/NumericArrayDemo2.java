
/**
 * Write a description of class NumericArrayDemo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumericArrayDemo2
{
   public static void main(String [] args)
   {
       int [][] intValues = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};
      
       int intNum1=0;
       int intNum2=0;
      
       Scanner in= new Scanner (System.in);
       
       while (intNum1<=3 && intNum2 <=3)
       {
           System.out.print ("Enter two numbers from 1-3 (4 4 to quit): ");
           intNum1= in.nextInt();
           intNum2= in.nextInt();
           
           if (intNum1<=3 && intNum2<=3)
           {
               System.out.println("Integer is: " + intValues[intNum1-1][intNum2-1]
                                  + ". It is in array position row " + intNum1
                                  + " and column " + intNum2 + ".");
               
           }
           else
           {
               System.out.println("goodbye");
            }
    }
}
}
