
/**
 * The purpose of this program is to illustrate the use of the for loop
 * as a counter.
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 04/02/2007
 */
public class CountingWithForLoops
{
    public static void main(String [] args)
    {
        double theTerminator = 1.453;   //initialize the terminating condition
        
        for(double counter = 1.543; counter > theTerminator; counter-=0.02)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            
        }//end of for loop  
    }//end of main method
}//end of class
