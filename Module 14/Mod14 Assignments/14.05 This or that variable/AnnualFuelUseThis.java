
/**
 * Catherine Zeng 12-21-13
 * This program forms the class blueprint for car data
 * 
 */
public class AnnualFuelUseThis
{
    private int eMiles;
    private int sMiles;
    private double gals;
    private double PPG;
    private int days;
    
    AnnualFuelUseThis()
    {
    }
    
    //constructor with 3 parameters
    public AnnualFuelUseThis( int days,int eMiles, int sMiles, double gals, double PPG )
    {
        this.days=days;
        this.eMiles=eMiles;
        this.sMiles=sMiles;
        this.gals=gals;
        this.PPG=PPG;
    }
   
    //calculate distance
   public double calcMPG()
   {
       return (this.eMiles-this.sMiles)/this.gals;
    }

    //calculate MPG
   public double totalCost()
   {
       return this.gals*this.PPG;
    }
    
    public int getDays() 
    {   
      return this.days; 
    } 
    
    public int getStartMiles() 
    {   
      return this.sMiles; 
    } 
    
    public int getEndMiles() 
    {   
      return this.eMiles; 
    } 
    
    public double getGals() 
    {   
      return this.gals; 
    } 
    public double getPPG() 
    {   
      return this.PPG; 
    } 
   
   
    
}
