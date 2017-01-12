
/**
 * This encrypts a message
 * 
 * @Catherine Zeng
 * @2-17-14
 */
public class CaesarShiftEncryption
{
   public static String encryption(String message, int shift)
   {
       String encryption="";
       final String alphabet[]={"a","b","c","d","e","f","g","h","i","j","k","l",
                           "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       
       String letterBreakdown[]=new String[message.length()];
       for (int i=0;i<message.length();i++)
       letterBreakdown[i]=message.substring(i,i+1);
       
       for (int i=0; i<message.length();i++)
       {
           for (int n=0; n<26;n++)
           {
             if (letterBreakdown[i].equals(alphabet[n]))
             encryption+=alphabet[(n+shift)%26];
            }
        }
        System.out.println("The encrypted message is:\n"+encryption);
        System.out.println("");
        return encryption;
}
}
