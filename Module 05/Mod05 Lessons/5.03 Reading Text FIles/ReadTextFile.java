import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadTextFile
{
    public static void main(String[] args) throws IOException
    {
        String token= "";
        Scanner inFile=new Scanner(new File("data4.txt"));
        while(inFile.hasNextDouble())
        {
            token=inFile.nextDouble();
            System.out.println(token);
        }
        inFile.close();
    }//end of main method
}//end of class