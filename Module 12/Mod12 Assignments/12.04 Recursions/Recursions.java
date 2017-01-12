
/**
 * This program demonstrates recursions by piecewise functions
 * 
 * @Catherine Zeng 
 * @12-30-13
 */
public class Recursions
{
    // instance variables - replace the example below with your own
    Recursions ()
    {
    }
    
    public int firstPieceWise(int x)
    {
        if (x<=10)
        return -7;
        else
        return firstPieceWise(x-4)+2;
    }
    
    public double secondPieceWise(double x)
    {
        if (x<=25)
        return 20;
        else
        return secondPieceWise(x/12.+5)-3;
    }
    
    public int fourthPieceWise(int x)
    {
        if (x>20)
        return -100;
        else
        return fourthPieceWise(2*x)-4;
    }
    
    public static void main (String args[])
    {
        Recursions trial= new Recursions ();
        
        System.out.println("The answer to question 1 is "+trial.firstPieceWise(25));
        System.out.println("The answer to question 2 is "+trial.secondPieceWise(30));
        System.out.println("The answer to question 4 is "+trial.fourthPieceWise(500));
    }
}
