
/**
 * Write a description of class NumericArrayDemo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumericArrayDemo1
{
   public static void main(String [] args) 
 { 
 int [] intValues; 
 int intNum=0;
 intValues = new int[10]; 
 Scanner in= new Scanner (System.in);
 intValues[0]=23;
 intValues[1]=32;
 intValues[2]=43;
 intValues[3]=53;
 intValues[4]=63;
 intValues[5]=73;
 intValues[6]=83;
 intValues[7]=93;
 intValues[8]=103;
 intValues[9]=113;
 
 while (intNum<=10)
 {
     System.out.print("Enter a number from 1-10 (11 to quit): ");
     intNum= in.nextInt ();
     
     if(intNum<=10)
     {
         System.out.println ("Integer number " + intNum + " is: " 
                             + intValues[intNum-1] 
                             + ". It is in array position "
                             + (intNum-1) +".");
 } 
 else
 {
     System.out.println("Thank you good bye");
    }
} 
}
}
