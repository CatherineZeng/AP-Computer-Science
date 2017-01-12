
/**
 * This tests the CatherineZengCipher and Decipher class
 * 
 * @Catherine Zeng
 * @2-19-14
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
