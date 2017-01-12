
/**
 * This tests the prime number program
 * 
 * @Catherine Zeng
 * @2-24-14
 */
import java.util.Scanner;
public class PrimeNumberTester
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the range to search for prime numbers:");
        int limit=in.nextInt();
        PrimeNumber.limit(limit);
    }
}
