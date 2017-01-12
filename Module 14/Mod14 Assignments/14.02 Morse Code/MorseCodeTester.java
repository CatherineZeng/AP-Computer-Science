
/**
 * This program allows the user to input a string of words/sentances and converts it to morse code
 * 
 * @Catherine Zeng 
 * @2-17-14
 */
import java.io.IOException;
import java.util.Scanner;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your message (no punctuations and no capitalization):");
        String word=in.next();
        MorseCode.code(word);
   }
}
