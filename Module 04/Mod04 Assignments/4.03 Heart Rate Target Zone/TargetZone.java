
/**
 *This will see if your heart rate in exercise is within a target zone.
 * 
 * Catherine Zeng 7-22-13
 *
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String target = "within";
        Scanner in = new Scanner(System.in);
        
        //Prompt user for input
        String yearsOld;
        int age;
        String restingHeartRateEntered;
        int restingHeartRate;
        String heartRateAfterExercisingEntered;
        int heartRateAfterExercising;
        
        System.out.print("Please enter your age: ");            //prompt user for input            
        yearsOld = in.next();                                   //read input from keyboard as a String
        age = Integer.parseInt(yearsOld);
        System.out.print("Please enter your resting heart rate: ");            //prompt user for input            
        restingHeartRateEntered = in.next();                                   //read input from keyboard as a String
        restingHeartRate = Integer.parseInt(restingHeartRateEntered);
        System.out.print("Please enter your heart rate after exercising: ");            //prompt user for input            
        heartRateAfterExercisingEntered = in.next();                                   //read input from keyboard as a String
        heartRateAfterExercising = Integer.parseInt(heartRateAfterExercisingEntered);
        
        
        //Calculate heart rate target zone min and max
        int maximumHeartRate= 220- age;
        int heartRateReserve= maximumHeartRate - restingHeartRate;
        double highEndDouble= (double)heartRateReserve*0.85+(double)restingHeartRate;
        int highEnd= (int)highEndDouble;
        double lowEndDouble= (double)heartRateReserve*0.5+(double)restingHeartRate;
        int lowEnd= (int)lowEndDouble;
        
        //Determine if heart rate after exercise is between the min and max
        boolean isHeartRateBelowLow = heartRateAfterExercising <= lowEnd; 
        boolean isHeartRateAboveHigh = heartRateAfterExercising >= highEnd;
      
        
        //If the heart rate is below, change the value of target to "below".
       String keyword;
       
        if(isHeartRateBelowLow)                                             //evalueate if boolean is true or not
           target = "below";
       
       //If the heart rate is above, change the value of target to "above".
       
        if(isHeartRateAboveHigh)                                             //evalueate if boolean is true or not
           target = "above";
        
        
        //Print two output statements
        System.out.println("Your heart rate target zone is between " + lowEnd + " and " +highEnd);
        System.out.println("After just exercising, your heart rate is " + target + " your target zone.");
        
        
        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. The variable "target" will have a value of within, above or below
        
         
    } //end main
}//end class TargetZone