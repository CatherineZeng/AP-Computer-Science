/**
 * Catherine Zeng 9-14-13
 * 
 * This program lets the user guess 3 lottery numbers
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your three numbers (e.g. 342)");
        int numberPickedInt= in.nextInt();
        
        String digitPicked1=(Double.toString(numberPickedInt)).substring(0,1);
        String digitPicked2=(Double.toString(numberPickedInt)).substring(1,2);
        String digitPicked3=(Double.toString(numberPickedInt)).substring(2,3);
        
        String lotteryNumberPicked="";
        
        for (int counter=1; counter<=3; counter++)
        {
          int lotteryNumInt= (int)(10*Math.random());
          String lotteryDigit=Integer.toString(lotteryNumInt);
          lotteryNumberPicked=lotteryNumberPicked+lotteryDigit;
        }
        
        String lotteryPicked1=lotteryNumberPicked.substring(0,1);
        String lotteryPicked2=lotteryNumberPicked.substring(1,2);
        String lotteryPicked3=lotteryNumberPicked.substring(2,3);
        
        System.out.println("Winner: "+lotteryNumberPicked);
        if (digitPicked1.equals(lotteryPicked1) && digitPicked2.equals(lotteryPicked2) && digitPicked3.equals(lotteryPicked3))
        {
            System.out.println("Congratulations, both pairs matched");
        }
        else if (digitPicked1.equals(lotteryPicked1) && digitPicked2.equals(lotteryPicked2))
        {
            System.out.println("Congratulations, the front pair matched");
        }
        else if (digitPicked2.equals(lotteryPicked2) && digitPicked3.equals(lotteryPicked3))
        {
            System.out.println("Congratulations, the end pair matched");
        }
       
        else
        {
           System.out.println("Sorry, no matches. You only had one chance out of 100 to win anyway.");
        }
        
        

        
    } //end main
}//end class Lottery