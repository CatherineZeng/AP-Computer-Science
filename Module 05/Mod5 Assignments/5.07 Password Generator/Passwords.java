/**
 *Catherine Zeng 9-22-13 
 *This program generates a random password
 *
 */

import java.util.Random;
import java.util.Scanner;

public class Passwords
{
    public static void main(String[] args) 
    {
      Scanner in= new Scanner(System.in);
      System.out.println("          Password Generation Menu");
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.println("^[1] Lowercase Letters                               ^^");
      System.out.println("^[2] Lowercase & Uppercase Letters                   ^^");
      System.out.println("^[3] Lowercase, Uppercase, and Numbers               ^^");
      System.out.println("^[4] Lowercase, Uppercase, Numbers, and Punctuation  ^^");
      System.out.println("^[5] Quit                                            ^^");
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.print("Enter Selection (1-5): ");
      int selection=in.nextInt();
       if (selection==5)
       {
          System.out.println("Wow you don't want to do this program? You suck");
        }
      else
      {
      System.out.print("Password Length (1-14): ");
      int length=in.nextInt();
      Random randNum = new Random();
      int character=0;
      int characterCounter=0;
      System.out.print("Password: ");
      for(characterCounter=1; characterCounter<=length; characterCounter++)
      {
       if (selection==1)
       {
          character = randNum.nextInt( 123 );
          while ( !(character>=97 && character<=122))
          {
            character = randNum.nextInt( 123 );
        } 
        System.out.print((char)(character));
        }
        
       if (selection==2)
       {
          character = randNum.nextInt( 123 );
          while ( !(character>=97 && character<=122) && !(character>=65 && character <=90))
          {
            character = randNum.nextInt( 123 );
        } 
        System.out.print((char)(character));
        }
        
      if (selection==3)
       {
          character = randNum.nextInt( 123 );
          while ( !(character>=97 && character<=122) && !(character>=65 && character <=90) && !(character>=48 && character<=57))
          {
            character = randNum.nextInt( 123 );
        } 
        System.out.print((char)(character));
        }
        
      if (selection==4)
       {
          character = randNum.nextInt( 127 );
          while ( !(character>=21 && character<=126))
          {
            character = randNum.nextInt( 127 );
        } 
        System.out.print((char)(character));
        }
    }
}
}
       }
        