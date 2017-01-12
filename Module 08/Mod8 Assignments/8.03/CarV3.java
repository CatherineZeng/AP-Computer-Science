
/**
 * Catherine Zeng 12-14-13
 * This program calculates distance car traveled and MPG
 * 
 */
public class CarV3
{
    // instance variables - replace the example below with your own
    CarV3()
    {
    }

   public int calcDistance(int eMiles, int sMiles)
   {
       return eMiles-sMiles;
    }
   
   public double calcMPG(int dis, double gals)
   {
       return (double)dis/gals;
    }
   
    public static void main(String [] args)
    {
        int eMiles1, eMiles2,eMiles3;
        int sMiles1, sMiles2,sMiles3;
        int dis1,dis2,dis3;
        double gals1, gals2, gals3;
        double MPG1,MPG2,MPG3;
        
        CarV3 calc= new CarV3 ();
        eMiles1=142; sMiles1=56; gals1=2;
        dis1=calc.calcDistance(eMiles1,sMiles1);
        MPG1=calc.calcMPG(dis1,gals1);
       
        eMiles2=270; sMiles2=142; gals2=3.05;
        dis2=calc.calcDistance(eMiles2,sMiles2);
        MPG2=calc.calcMPG(dis2,gals2);
       
        eMiles3=396; sMiles3=270; gals3= 2.86;
        dis3=calc.calcDistance(eMiles3,sMiles3);
        MPG3=calc.calcMPG(dis3,gals3);
        
        String type= "crapiola toyodaola";
        
        System.out.printf("%30s\n", "Gas Mileage Calculations");
        System.out.printf("%15s %15s %15s %15s %15s %15s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal");
        System.out.printf("%15s %7d %17d %15d %17.2f %15.2f\n" , type, sMiles1, eMiles1, dis1, gals1, MPG1);
        System.out.printf("%15s %7d %17d %15d %17.2f %15.2f\n" , type, sMiles2, eMiles2, dis2, gals2, MPG2);
        System.out.printf("%15s %7d %17d %15d %17.2f %15.2f\n" , type, sMiles3, eMiles3, dis3, gals3, MPG3);
        
    
}
}
