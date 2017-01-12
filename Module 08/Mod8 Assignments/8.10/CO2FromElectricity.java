/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author:Catherine Zeng
 * @version:12-25-13
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
   CO2FromElectricity()
   {
   	//default constructor to be used
   }

   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       double sum=0;
       for (int i=0;i<monthlyBill.size();i++)
       {
           sum+=monthlyBill.get(i);
       }
       return sum/monthlyBill.size();
    }

   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
        double sum=0;
       for (int i=0;i<monthlyPrice.size();i++)
       {
           sum+=monthlyPrice.get(i);
       }
       return sum/monthlyPrice.size();
   }

   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
        return (avgBill/avgPrice)*1.37*12;
   }
}

