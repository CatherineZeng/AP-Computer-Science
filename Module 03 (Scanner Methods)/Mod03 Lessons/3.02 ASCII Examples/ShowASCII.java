
/**
 * This program prints the ASCII characters that correspond to ASCII values, and
 * prints the ASCII values that correspond to specific ASCII characters.
 * 
 * Notice that (int) is used to cast a character literal to its corresponding ASCII value, and
 * that (char) is used to cast an ASCII value to its corresponding character literal.
 * 
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 */
public class ShowASCII
{
    public static void main(String[ ] args)
    {   
        //cast a character literal to its integer ASCII value
        System.out.println("The ASCII code for " + '8' + " is " + (int)'8');
        System.out.println("The ASCII code for " + '2' + " is " + (int)'2');
        System.out.println();
        
        //cast an integer ASCII value to its corresponding character literal
        System.out.println("93 is the ASCII code for " + (char)93);
        System.out.println("173 is the ASCII code for " + (char)173);
        System.out.println();
        
        char letterA = 'A';
        char aDash = '-';
        char blankSpace = ' '; //there is a blank space between quotes
        char eighthDigit = '8';
        System.out.println(letterA);
        
        System.out.println("");
        System.out.println("");
        
        System.out.print((char)83);
        System.out.print((char)101);
        System.out.print((char)110);
        System.out.print((char)100);
        System.out.print((char)32);
        System.out.print((char)121);
        System.out.print((char)111);
        System.out.print((char)117);
        System.out.print((char)114);
        System.out.print((char)32);
        System.out.print((char)116);
        System.out.print((char)101);
        System.out.print((char)97);
        System.out.print((char)99);
        System.out.print((char)104);
        System.out.print((char)101);
        System.out.print((char)114);
        System.out.print((char)32);
        System.out.print((char)97);
        System.out.print((char)110);
        System.out.print((char)32);
        System.out.print((char)101);
        System.out.print((char)109);
        System.out.print((char)97);
        System.out.print((char)105);
        System.out.print((char)108);
        System.out.print((char)32);
        System.out.print((char)116);
        System.out.print((char)111);
        System.out.print((char)100);
        System.out.print((char)97);
        System.out.print((char)121);

        
    }//end of main method
}//end of class
