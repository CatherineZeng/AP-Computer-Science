
/**
 * Write a description of class RandomMethodDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RandomMethodDemo
{
    public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
        double randomNumber;
        int counter =0;
        System.out.println("Please enter how many numbers you want: ");
        int howMany=in.nextInt();
        
        while(counter <howMany)
        {
            randomNumber= Math.random();
            System.out.println(randomNumber);
            counter ++;
        }
    }
}
