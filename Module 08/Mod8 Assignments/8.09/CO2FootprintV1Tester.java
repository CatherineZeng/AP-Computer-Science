
/**
 * This class tests the CO2FootprintV1 class.
 * 
 * @author Catherine Zeng
 * @version 12-14-13
 */
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
      //initialization of object
      CO2FootprintV1 car1=new CO2FootprintV1 (962.4);
      
      //print results
      System.out.println("CO2 Emissions");
      System.out.printf("%25s %25s %25s \n","Gallons of Gas", "Pounds from Gas", "Tons from Gas");
      System.out.printf("%25.1f %25.2f %25.3f", car1.getGals(),car1.convertTonsToPoundsCO2(),car1.calcTonsCO2());  
}
}
