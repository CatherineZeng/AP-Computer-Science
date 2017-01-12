
/**
 * Write a description of class CO2FootprintTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class CO2FootprintTester
{
    public static void main(String[] args)
    {
        ArrayList<CO2Footprint> CO2= new ArrayList <CO2Footprint>();
        CO2.add(new CO2Footprint(20.0, 
                        120.0, 0.12,
                        3, true, true, false, false, 
                        2));
        CO2.add(new CO2Footprint(16.0, 
                        125.0, 0.11,
                        5, true, false, false, false, 
                        1));
                        
       for(CO2Footprint dataRecord : CO2)
       {
           dataRecord.calcPoundsCO2();
           dataRecord.calcElectricityCO2();
           dataRecord.calcWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcLightBulbChangeReduction();
           dataRecord.calcNetCO2();
       }
        
       
       System.out.println("|                       Pounds of CO2                      |             Pounds of CO2             |");
       System.out.println("|                       Emitted From                       |             Reduced From              |");
       System.out.println("|     Gas        |  Electricity        | Waste             |  Recycling |  New Bulbs  |CO2Footprint|");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2Footprint dataRecord;

       for(int index = 0; index < CO2.size(); index ++)
       {
           dataRecord = CO2.get(index);
           System.out.printf("|   %1.1f        |   %-5.1f           |  %-5.1f           |  %8.1f  |   %7.1f   |   %8.1f |%n", 
           dataRecord.getCO2Gas(), dataRecord.getCO2Electricity(), dataRecord.getCO2Waste(), dataRecord.getCO2Recycling(), dataRecord.getCO2NewBulbs(), dataRecord.getNetCO2());
       }             
}
}
