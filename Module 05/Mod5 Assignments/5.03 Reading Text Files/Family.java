
/**
 *Catherine Zeng 9-7-13
 *This programs counts the number of families with two boys, two girls, or one boy and one girl.
 *
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[]args) throws IOException
    {
        String token= "";
        Scanner inFile= new Scanner(new File("MaleFemaleInFamily.txt"));
        int twoBoys=0;
        int twoGirls=0;
        int oneGirlOneBoy=0;
        int sampleSizeCounter=0;
        while (inFile.hasNext())
        {
            token=inFile.next();
            String family=token;
            sampleSizeCounter++;
            if (family.equals("BB"))
            {  
                twoBoys++;
            }
            
            else if (family.equals("GG"))
            {
                twoGirls++;
            }
            
            else
            {
                oneGirlOneBoy++;
            }
        }
        System.out.println ("Sample Size: "+sampleSizeCounter);
        System.out.println ("Two Boys: Total: "+twoBoys +" Percentage: "+(double)twoBoys/sampleSizeCounter);
        System.out.println ("One Boy One Girl: Total: "+oneGirlOneBoy +" Percentage: "+(double)oneGirlOneBoy/sampleSizeCounter);
        System.out.println ("Two Girls: Total: "+twoGirls +" Percentage: "+(double)twoGirls/sampleSizeCounter);
        
        
        inFile.close();
    }//end of main method
}//end of class