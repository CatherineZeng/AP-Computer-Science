
/**
 * Write a description of class CatherineZengTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.util.Scanner;
public class CatherineZengTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a plaintext message:");
        String message=in.next();
        CatherineZengCipher.cipher(message);
        CatherineZengDecipher.decipher();
    }
    
    
    
}
