/**
 * Catherine Zeng 9-5-13
 * This programs picks a random number and lets the user decide the range in which it is picked.
 */
import java.util.Scanner;
public class GuessingGameV2
{
	public static void main(String[] args)
	{
	     Scanner in = new Scanner(System.in);
	    System.out.println("You can now pick the range of your guessing number!!!");
	    System.out.print("Please input the range separated by a space e.g.( 45 234): ");
	    int lowRange=in.nextInt();
	    int highRange=in.nextInt();
	    double randNum = 0;
	    randNum = Math.random();
	    int numberPicked= (((int)(randNum*100))%(highRange-lowRange))+lowRange;
	    int numberOfGuesses=0;
	    System.out.println("");
	   
	  
	    
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
	            numberOfGuesses++;
	           
	        }
	        else
	        {
	            System.out.println("Your number is too high");
	            System.out.println("");
	            System.out.println("Enter your guess: ");
	            System.out.print("");
	            guess=in.nextInt();
	            numberOfGuesses++;
	           }
	       
	    }

	    System.out.println("Congratulations! You've correctly guessed the number of "+numberPicked+" in "+numberOfGuesses+" tries!");
	    
	}
}
