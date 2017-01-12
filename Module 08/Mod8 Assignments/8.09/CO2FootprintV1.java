
/**
 * This program calculates how much CO2 is released per galloon of gas used
 * 
 * @author Catherine Zeng 
 * @version 12/24/13
 */
public class CO2FootprintV1
{
    // instance variables - replace the example below with your own
    private double myGallonsUsed;
    private double myTonsCO2;
    private double myPoundsCO2;

    /**
     * Constructor for objects of class CO2FootprintV1
     * @param gals annual prediction of gallons used
     */
    public CO2FootprintV1(double gals)
    {
        // initialise instance variables
        myGallonsUsed=gals;
    }

    /**
     * Method for calculating tons of CO2 released from gallons used of gas
     * @return total tons
     */
    public double calcTonsCO2()
    {
        // put your code here
        return myGallonsUsed*8.78*Math.pow(10,-3);
    }
    
    /**
     * Method for calculating pounds of CO2 released from gallons used of gas
     * @return total pounds
     */public double convertTonsToPoundsCO2()
    {
        myTonsCO2=myGallonsUsed*8.78*Math.pow(10,-3);
        return myTonsCO2*2000;
    }
    
    /**
     * Getter method to return value of total gas gallons used annually
     * @return total gas
     */public double getGals()
    {
        return myGallonsUsed;
    }
    
}
