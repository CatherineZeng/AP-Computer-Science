
/**
 * This deciphers a coded message
 * 
 * @Catherine Zeng
 * @2-19-14
 */
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class CatherineZengDecipher
{
    public static String decipher() throws IOException
    {
        String alphabet[]={"a","b","c","d","e","f","g","h","i","j","k","l",
                           "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
         
        String cAlphabet[]=new String[26];
        Scanner inFile=new Scanner(new File("cAlphabet.txt"));
        while(inFile.hasNext())
        {
            for(int i=0; i<26; i++)
            cAlphabet[i]=inFile.next();
        }
        inFile.close();
        
        
        Scanner inFile2=new Scanner(new File("SecretMessage.txt"));
        String encryption= inFile2.next();
        inFile2.close();
        
        String encryptionLetters[]=new String[encryption.length()];
        for(int i=0;i<encryption.length();i++)
        encryptionLetters[i]=encryption.substring(i,i+1);
        
        String rMessage="";
        for(int i=0;i<encryption.length();i++)
        {
            for (int n=0;n<26;n++)
            {
                if (encryptionLetters[i].equals(cAlphabet[n]))
                 rMessage+=alphabet[n];
            }
        }
        
        System.out.println("The decoded message is: "+rMessage);
        return rMessage;
    }
}
