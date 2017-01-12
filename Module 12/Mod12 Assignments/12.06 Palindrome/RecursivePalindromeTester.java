
/**
 * This tests the palindrome class
 * 
 * @Catherine Zeng
 * @1-2-13
 */
import java.util.Scanner;
public class RecursivePalindromeTester
{
    public static void main (String args[])
    {
     RecursivePalindrome newWord= new RecursivePalindrome();
     Scanner scan = new Scanner(System.in);
     String word="";
     while (!word.equals("IQUIT"))
     {
     System.out.println("Enter word tested for being a palindrome (type IQUIT to quit):");
     word= scan.nextLine();
     if (word.equals("IQUIT"))
     System.out.println("GOODBYE");
     else
     newWord.isPalindrome(word);
    }
}
}
