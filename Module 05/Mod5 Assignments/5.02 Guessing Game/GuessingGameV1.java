/**
 * Catherine Zeng 9-5-13
 * This programs picks a random number and lets the user guess it.
 */
import java.util.Scanner;
public class GuessingGameV1
{
	public static void main(String[] args)
	{
	    double randNum = 0;
	    randNum = Math.random();
	    int numberPicked= (int)(randNum*100);
	    System.out.println("");
	    Scanner in = new Scanner(System.in);
	  
	    
	    System.out.print("Enter your guess: ");
	    int guess=in.nextInt();
	   
	    while(guess!=numberPicked)
	    {
	        
	        if(guess<numberPicked)
	        {
	            System.out.println("Your number is too low");
	            System.out.println("");
	            System.out.print("Enter your guess: ");
	            guess=in.nextInt();
	        }
	        else
	        {
	            System.out.println("Your number is too high");
	            System.out.println("");
	            System.out.println("Enter your guess: ");
	            System.out.print("");
	            guess=in.nextInt();
	           }
	       
	    }

	    System.out.println("Congratulations! You've correctly guessed the number of "+numberPicked);
	    
	}
}
