
/**
 * This program sees if a word is a palindrome or not
 * 
 * @Catherine Zeng 
 * @1-2-13
 */
public class RecursivePalindrome
{
    RecursivePalindrome()
    {
    }
    
    public boolean isPalindrome(String entered)
    {
        entered=entered.replaceAll("\\W", "");
        if (entered.length()==1||entered.length()==0)
        {
            System.out.println("It is a Palindrome!");
            return true;
        }
        
        else 
        {
            if (entered.substring(0,1).equalsIgnoreCase(entered.substring(entered.length()-1)))
            {
                entered=entered.substring(1,entered.length()-1);
                return isPalindrome(entered);
            }
            else
            System.out.println("It is NOT a Palindrome!");
            return false;
        }
    }
    
   }
