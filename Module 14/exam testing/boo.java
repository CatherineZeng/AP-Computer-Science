
/**
 * Write a description of class boo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class boo extends hi
{
 private int number = 542;

public void subtractNumbers (int number)
{
number = number - this.number;
System.out.println("The local variable is: " + this.number);
System.out.println("The instance variable is: " + number);
}
    
    public static void main(String[] args)
   {
       boo a=new boo();
       a.subtractNumbers(8); 
  }
}
