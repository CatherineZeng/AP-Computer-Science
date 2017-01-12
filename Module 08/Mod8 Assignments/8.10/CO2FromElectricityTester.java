/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Catherine Zeng
 * @version: 12-25-13
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
       	CO2FromElectricity CO2 = new CO2FromElectricity();

       	ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
       	ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);

       	monthlyBill.add(0,120.0);
       	monthlyBill.add(1,108.0);
       	monthlyBill.add(2,132.0);
       	
       	monthlyPrice.add(0,0.12);
       	monthlyPrice.add(1,0.11);
       	monthlyPrice.add(2,0.13);


       double avgBill = CO2.calcAverageBill(monthlyBill);
       double avgPrice = CO2.calcAveragePrice(monthlyPrice);

       double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
   }
}

