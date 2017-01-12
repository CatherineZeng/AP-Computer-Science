
/**
 * Catherine Zeng 12-21-13
 * This program calculates a bunch of stuff
 * 
 */
public class CarV5
{
    private int myeMiles;
    private int mysMiles;
    private double myGals;
    private double mypricePerGallon;
    private String mycarType;
    
    CarV5()
    {
    }
    
    //constructor with 3 parameters
    public CarV5( String type,int eMiles, int sMiles, double gals, double PPG )
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
    /*public void printResults()
    {
         System.out.printf("%15s %7d %17d %15d %17.2f %15.2f\n" , myCarType, mysMiles, myeMiles, myeMiles-mysMiles, myGals, mypricePerGallon,total);
    }
    */
   
    public static void main(String [] args)
    {
        CarV5 car1= new CarV5 ("crapiola toyodaola", 396, 56, 7.91, 3);
        
        System.out.printf("%30s\n", "Gas Mileage Calculations");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.printf("%15s %7d %17d %15d %17.2f %15.2f %15.2f %15.2f %15.2f\n" , car1.getType(), car1.getStartMiles(), car1.getEndMiles(),car1.getEndMiles()-car1.getStartMiles(), car1.getGals(), car1.getPPG(), car1.totalCost(), 1/(car1.calcGPM()), car1.calcGPM() );
        
    
}
}
