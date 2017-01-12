
/**
 * Write a description of class CO2Footprint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CO2Footprint
{
     // instance variables - replace the example below with your own
    private double myGals;
    private double myMonthlyBill;
    private double myMonthlyPrice;
    private int myNumPeople;
    private boolean myPaper;
    private boolean myPlastic;
    private boolean myGlass;
    private boolean myCans;
    private int myNumBulbsReplaced;
    
    private double myCO2Gas;
    private double myCO2Electricity;
    private double myCO2Waste;
    private double myCO2Recycling;
    private double myCO2NewBulb;
    private double myNetCO2;

    /**
     * Constructor for objects of class CO2FootprintV1
     * @param gals annual prediction of gallons used
     */
    public CO2Footprint(double gals, 
                        double monthlyBill, double monthlyPrice,
                        int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, 
                        int numBulbsReplaced)
    {
        // initialise instance variables
        myGals=gals;
        myMonthlyBill=monthlyBill;
        myMonthlyPrice=monthlyPrice;
        myNumPeople=numPeople;
        myPaper=paper;
        myPlastic=plastic;
        myGlass=glass;
        myCans=cans;
        myNumBulbsReplaced=numBulbsReplaced;
    }

    
    /**
     * Method for calculating pounds of CO2 released from gallons used of gas
     * @return total pounds
     */public void calcPoundsCO2()
    {
        myCO2Gas=myGals*8.78*Math.pow(10,-3)*2000;
    }
    


   public void calcElectricityCO2 ()
   {
        myCO2Electricity= (myMonthlyBill/myMonthlyPrice)*1.37*12;
   }

   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcWasteEmission()
   {
       myCO2Waste= myNumPeople*1018;
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       double reduction=0.0;
       if(myPaper)
       {
           reduction += (184.0 * myNumPeople);
       }
       
       if(myPlastic)
       {
           reduction+=(25.6*myNumPeople);
        }
        if(myGlass)
        {
                reduction+=(46.6*myNumPeople);
        }
        if(myCans)
        {
                reduction+=(165.8*myNumPeople);
        }

      myCO2Recycling= reduction;

   }
   public void calcLightBulbChangeReduction()
   {
       myCO2NewBulb= myNumBulbsReplaced * 1.37 * 73;
    }
    
    public void calcNetCO2()
    {
       myNetCO2= myCO2Gas+myCO2Electricity+myCO2Waste-myCO2Recycling-myCO2NewBulb;
   }
   
   public double getNetCO2()
   {
       return myNetCO2;
    }
   public double getCO2Gas()
   {
       return myCO2Gas;
    }
    public double getCO2Electricity()
    {
        return myCO2Electricity;
    }
    public double getCO2Waste()
    {
        return myCO2Waste;
    }
    public double getCO2Recycling()
    {
        return myCO2Recycling;
    }
    public double getCO2NewBulbs()
    {
        return myCO2NewBulb;
    }
    
  }  
