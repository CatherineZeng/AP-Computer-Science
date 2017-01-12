
/**
 * This program finds all the prime numbers in a range
 * 
 * @Catherine Zeng 
 * @2-24-14
 */
public class PrimeNumber
{
   public static int limit(int limit)
   {
       int range[]= new int[limit];
       int numOfPrime=0;
       for (int n=1;n<=limit;n++)
       {
           range[n-1]=n;
        }
        
        for(int n=0;n<limit;n++)
        {
            for(int i=2;i<limit;i++)
            {
                if (range[n]==1 || range[n]!=i&&range[n]%i==0)
                {
                    range[n]=-1;
                }
            }
        }
        
        System.out.println("The prime numbers in your range are: ");
        for (int n=0;n<limit;n++)
        {
            if (range[n]!=-1)
            {
                System.out.println(range[n]);
                numOfPrime++;
            }
        }
        System.out.println("There are "+numOfPrime+" prime numbers in the range.");
        return numOfPrime;
    }
        
        
}
