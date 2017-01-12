/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */
public class Calculations_v5
{
    public static void main(String[ ] args)
    {
        int iNum1=25;
        int iNum2=9;
        
        double dNum1=43.21;
        double dNum2=3.14;
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1+"plus"+iNum2+"=");
        System.out.println( iNum1+iNum2 );
        System.out.print(dNum1+"plus"+dNum2+"=");
        System.out.println(dNum1+dNum2);
        System.out.println();
       
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum1+"minus"+iNum2+"=");
        System.out.println(iNum1-iNum2);
        System.out.print(dNum1+"minus"+dNum2+"=");
        System.out.println(dNum1-dNum2);
        System.out.println();
    
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print( iNum1+"times"+iNum2+"="); 
        System.out.println(iNum1*iNum2);
        System.out.print(dNum1+"times"+dNum2+"=");
        System.out.println(dNum1*dNum2);
        System.out.println();
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum1+"divided by"+iNum2+"=");
        System.out.println(iNum1/iNum2);
        System.out.print(dNum1+"divided by"+dNum2+"=");
        System.out.println(dNum1/dNum2);
        System.out.println();
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print( iNum1+"modulus"+iNum2+"=");
        System.out.println( iNum1%iNum2);
        System.out.print(dNum1+"modulus"+dNum2+"=");
        System.out.println(dNum1%dNum2);
        System.out.println();
        //System.out.println();
        
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
        // 234 minus (234 divided by 6 modulus 12) + 3
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class