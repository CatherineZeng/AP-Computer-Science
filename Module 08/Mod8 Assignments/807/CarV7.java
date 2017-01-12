
/**
 * Catherine Zeng 12-21-13
 * This program calculates a bunch of stuff
 * 
 */
public class CarV7
{
    private int myeMiles;
    private int mysMiles;
    private double myGals;
    private double mypricePerGallon;
    private String mycarType;
    
    CarV7()
    {
    }
    
    //constructor with 3 parameters
    public CarV7( String type,int eMiles, int sMiles, double gals, double PPG )
    {
        myeMiles=eMiles;
        mysMiles=sMiles;
        myGals=gals;
        mypricePerGallon=PPG;
        mycarType=type;
    }
   
    //calculate distance
   public double calcGPM()
   {
       return myGals/(double)(myeMiles-mysMiles);
    }

    //calculate MPG
   public double totalCost()
   {
       return myGals*mypricePerGallon;
    }
    
    public String getType() 
    {   
      return mycarType; 
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
      return mypricePerGallon; 
    } 
   
   
    
}
