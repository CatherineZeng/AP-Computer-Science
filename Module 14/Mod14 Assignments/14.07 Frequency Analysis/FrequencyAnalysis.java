
/**
 * This sees the frequency with which letters appear for both the normal text and cipher text
 * 
 * @Catherine Zeng
 * @2-25-14
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class FrequencyAnalysis
{
    public static String normalAlphabetFrequency() throws IOException
    {
        ArrayList<String> textWords=new ArrayList<String>();
        ArrayList<String> textLetters=new ArrayList<String>();
        String alphabet[]={"a","b","c","d","e","f","g","h","i","j","k","l",
                           "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int letterCounts[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner inFile=new Scanner(new File("plaintext.txt"));
        while(inFile.hasNext())
        {
            textWords.add(inFile.next());
        }
        
        for(int n=0;n<textWords.size();n++)
        {
           for(int i=0;i<(textWords.get(n)).length();i++)
           textLetters.add(textWords.get(n).substring(i,i+1).toLowerCase());
        }
        
        for (int i=0;i<textLetters.size();i++)
        {
            for( int n=0;n<26;n++)
            {
                if ((textLetters.get(i)).equals(alphabet[n]))
                letterCounts[n]++;
            }
        }
        
        int totalCounts=0;
        for (int i:letterCounts)
        totalCounts+=i;
        
        System.out.println("Alphabet Text Frequencies");
        System.out.printf("%1s %10s %15s\n","Letter","Count", "Frequency");
        for (int i=0;i<26;i++)
        System.out.printf("%1s %15d %15.2f \n",alphabet[i],letterCounts[i],(double)letterCounts[i]/(double)totalCounts);
        
        PrintWriter outFile=new PrintWriter(new File("subsetfreq.txt"));
        for (int i=0;i<26;i++)
        outFile.println(alphabet[i]+" "+letterCounts[i]+" "+(double)letterCounts[i]/(double)totalCounts);
        outFile.close();
        return "hi";
    }
    
    public static String cipherTextFrequency() throws IOException
    {
        ArrayList<String> textWords=new ArrayList<String>();
        ArrayList<String> textLetters=new ArrayList<String>();
        String alphabet[]={"a","b","c","d","e","f","g","h","i","j","k","l",
                           "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int letterCounts[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner inFile=new Scanner(new File("ciphertext.txt"));
        while(inFile.hasNext())
        {
            textWords.add(inFile.next());
        }
        
        for(int n=0;n<textWords.size();n++)
        {
           for(int i=0;i<(textWords.get(n)).length();i++)
           textLetters.add(textWords.get(n).substring(i,i+1).toLowerCase());
        }
        
        for (int i=0;i<textLetters.size();i++)
        {
            for( int n=0;n<26;n++)
            {
                if ((textLetters.get(i)).equals(alphabet[n]))
                letterCounts[n]++;
            }
        }
        
        int totalCounts=0;
        for (int i:letterCounts)
        totalCounts+=i;
        
        System.out.println("Cipher Text Frequencies");
        System.out.printf("%1s %10s %15s\n","Letter","Count", "Frequency");
        for (int i=0;i<26;i++)
        System.out.printf("%1s %15d %15.2f \n",alphabet[i],letterCounts[i],(double)letterCounts[i]/(double)totalCounts);
        
        PrintWriter outFile=new PrintWriter(new File("ciphertextfreq.txt"));
        for (int i=0;i<26;i++)
        outFile.println(alphabet[i]+" "+letterCounts[i]+" "+(double)letterCounts[i]/(double)totalCounts);
        outFile.close();
        return "hi";
    }
}
