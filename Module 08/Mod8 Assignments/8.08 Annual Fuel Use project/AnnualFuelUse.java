
/**
 * Catherine Zeng 12-21-13
 * This program forms the class blueprint for car data
 * 
 */
public class AnnualFuelUse
{
    private int myeMiles;
    private int mysMiles;
    private double myGals;
    private double myPricePerGallon;
    private int myDays;
    
    AnnualFuelUse()
    {
    }
    
    //constructor with 3 parameters
    public AnnualFuelUse( int days,int eMiles, int sMiles, double gals, double PPG )
    {
        myDays=days;
        myeMiles=eMiles;
        mysMiles=sMiles;
        myGals=gals;
        myPricePerGallon=PPG;
    }
   
    //calculate distance
   public double calcMPG()
   {
       return (myeMiles-mysMiles)/myGals;
    }

    //calculate MPG
   public double totalCost()
   {
       return myGals*myPricePerGallon;
    }
    
    public int getDays() 
    {   
      return myDays; 
    } 
    
    public int getStartMiles() 
    {   
      return mysMiles; 
    } 
    
    public int getEndMiles() 
    {   
      return myeMiles; 
    } 
    
    public double getGals() 
    {   
      return myGals; 
    } 
    public double getPPG() 
    {   
      return myPricePerGallon; 
    } 
   
   
    
}
