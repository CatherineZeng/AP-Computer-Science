
/**
 * This program calculates the nth number of any fibonacci sequence
 * 
 * @Catherine Zeng
 * @1-1-13
 */
import java.util.Scanner;
public class FibonacciNumbers
{
    FibonacciNumbers()
    {
    }
    
    public int calcNum(int n)
    {
        if (n==0)
        return 0;
        if (n==1)
        return 1;
        else
        return calcNum(n-1)+calcNum(n-2);
    }

    
    public static void main(String args[])
    {
     int entered=1;
     FibonacciNumbers trial= new FibonacciNumbers();
     Scanner scan = new Scanner(System.in);
     while (entered>=0)
     {
     System.out.println("Please enter the nth number you wish to calculate of the fibonacci sequence \n(type any negative number to quit):");
     entered= scan.nextInt();
     if (entered>=0)
     System.out.println("The "+entered+" number is "+trial.calcNum(entered)+"\n");
     else
     System.out.println("Thanks bye");
    }
    }
    }
