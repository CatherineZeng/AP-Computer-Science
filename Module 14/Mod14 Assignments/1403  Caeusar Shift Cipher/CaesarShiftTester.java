
/**
 * This tests the enryption and decryption
 * 
 * @Catherine Zeng
 * @2-17-14
 */
import java.util.Scanner;
public class CaesarShiftTester
{
   public static void main(String[] args)
   {
       Scanner in=new Scanner(System.in);
       String response="";
       String message="";
       int shift=0;
       while (!response.equals("q"))
       {
           System.out.println( "If you want to: \n"+ 
                               "Encrypt a message:    Press e \n"+
                               "Decrypt a message:    Press d \n"+
                               "Quit:                 Press q " );
           
           response=in.next();
           
           if (response.equals("e") || response.equals("d"))
           {
               System.out.println("Please enter your message:");
               message=in.next();
               System.out.println("Please enter the shift:");
               shift=in.nextInt();
               
               if(response.equals("e"))
               CaesarShiftEncryption.encryption(message,shift);
               
               if (response.equals("d"))
               CaesarShiftDecryption.decryption(message,shift);
            }
    }
}
}
