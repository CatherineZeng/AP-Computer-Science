
/**
 * This program translates a word into morse code
 * 
 * @Catherine Zeng
 * @2-17-14
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode
{
    private String myCode;
    public static String code(String word) throws IOException
    {
        String morseCode[]= new String[36];
        Scanner inFile=new Scanner(new File("morsecode.txt"));
        while(inFile.hasNext())
        {
            for(int i=0; i<morseCode.length; i++)
            morseCode[i]=inFile.next();
        }
        inFile.close();
   
        String alphabet[]=new String[36];
        Scanner inFile2=new Scanner(new File("alphabet.txt"));
        while(inFile2.hasNext())
        {
            for (int i=0; i<alphabet.length;i++)
            alphabet[i]=inFile2.next();
        }
        
        inFile2.close();
    
        String wordLetters[]=new String[word.length()];
        String code=" ";
        for(int i=0;i<word.length();i++)
        wordLetters[i]=word.substring(i,i+1);
        
        for(int i=0;i<word.length();i++)
        {
            for (int n=0;n<36;n++)
            {
                if (wordLetters[i].equals(alphabet[n]))
                 code+=morseCode[n];
            }
        }
        System.out.println("The morse code translation is: \n"+code);
        return code;
   }
  
}
