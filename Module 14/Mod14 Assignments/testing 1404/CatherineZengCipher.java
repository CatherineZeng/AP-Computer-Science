
/**
 * Write a description of class CatherineZengCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
public class CatherineZengCipher
{
    public static String cipher(String message) throws IOException
    {
        int z=1;
        Random rn=new Random();
        String letter="";
        String alphabet[]={"a","b","c","d","e","f","g","h","i","j","k","l",
                           "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String cAlphabet[]=new String[26];
        for (int i=0;i<26;i++)
        {
            while(z==1)
            {
                letter=Character.toString((char)(rn.nextInt(26)+65));
                z=0;
                    for(int n=0;n<i;n++)
                    {
                        if (cAlphabet[n].equals(letter))
                        z=1;
                    }
            }
            cAlphabet[i]=letter;
            z=1;
        }
        
        PrintWriter outFile= new PrintWriter(new File("cAlphabet.txt"));
        for (int i=0;i<26;i++)
        {
             outFile.println(cAlphabet[i]);
        }
        outFile.close();
        
        String messageLetters[]=new String[message.length()];
        for(int i=0;i<message.length();i++)
        messageLetters[i]=message.substring(i,i+1);
        
        String secretMessage="";
        for(int i=0;i<message.length();i++)
        {
            for (int n=0;n<26;n++)
            {
                if (messageLetters[i].equals(alphabet[n]))
                 secretMessage+=cAlphabet[n];
            }
        }
        PrintWriter outFile2= new PrintWriter(new File("SecretMessage.txt"));
        outFile2.print(secretMessage);
        outFile2.close();
        System.out.println("The encoded message is: "+secretMessage);
        return secretMessage;
    }
}
