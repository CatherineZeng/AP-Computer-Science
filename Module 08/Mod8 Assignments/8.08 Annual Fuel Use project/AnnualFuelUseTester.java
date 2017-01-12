
/**
 * Catherine Zeng 12-23-13
 * 
 * This program calculates car data
 */
public class AnnualFuelUseTester
{
    public static void main(String[] args)
    {
        //declaration of variables
        
        //initialization of array of objects
        AnnualFuelUse[] car1 = {new AnnualFuelUse(1,142,56,2.00,3),
                                new AnnualFuelUse(2,270,142,3.05,3),
                                new AnnualFuelUse(3,396,270,2.86,3) };
        
        //call methods
        for(int index = 0; index < car1.length; index++)
        {
            car1[index].getDays();
            car1[index].calcMPG();
        }
                
        //print results
        System.out.printf("%13s %13s %13s %13s %13s %14s %13s %13s %13s \n ",
                          "Fill Up", "Days", "Start Miles", "End Miles", "Distance", "Gallons Used", "MPG", "Price", "Cost");
        for(int index = 0; index < car1.length; index++)
        {
            System.out.printf("%13d %13d %13d %13s %13s %13.1f %13.1f %13.2f %13.2f \n", 
                      index+1,  car1[index].getDays(),car1[index].getStartMiles(),car1[index].getEndMiles(),  
                      car1[index].getEndMiles()-car1[index].getStartMiles(), car1[index].getGals(), car1[index].calcMPG(),
                      car1[index].getPPG(), car1[index].totalCost());
        }
        
        //calculating minimum data
        int minDis=car1[0].getEndMiles()-car1[0].getStartMiles();
        for(int index = 1; index < car1.length; index++)
        {
            if (car1[index].getEndMiles()-car1[index].getStartMiles()<minDis)
            minDis=car1[index].getEndMiles()-car1[index].getStartMiles();
        }
        
        double minMPG=car1[0].calcMPG();
        for(int index = 1; index < car1.length; index++)
        {
            if (car1[index].calcMPG()<minMPG)
            minMPG=car1[index].calcMPG();
        }
        
        double minPPG=car1[0].getPPG();
        for(int index = 1; index < car1.length; index++)
        {
            if (car1[index].getPPG()<minPPG)
            minPPG=car1[index].getPPG();
        }
        
        //calculating maximum data
        
        int maxDis=car1[0].getEndMiles()-car1[0].getStartMiles();
        for(int index = 1; index < car1.length; index++)
        {
            if (car1[index].getEndMiles()-car1[index].getStartMiles()>maxDis)
            maxDis=car1[index].getEndMiles()-car1[index].getStartMiles();
        }
        
        double maxMPG=car1[0].calcMPG();
        for(int index = 1; index < car1.length; index++)
        {
            if (car1[index].calcMPG()>maxMPG)
            maxMPG=car1[index].calcMPG();
        }
        
        double maxPPG=car1[0].getPPG();
        for(int index = 1; index < car1.length; index++)
        {
            if (car1[index].getPPG()>maxPPG)
            maxPPG=car1[index].getPPG();
        }
        System.out.printf("\n\n%8s %59d %29.1f %13.2f \n","Minumum", minDis,minMPG,minPPG);
        System.out.printf("%8s %59d %29.1f %13.2f \n","Maximum", maxDis,maxMPG,maxPPG);
        
        //finding totals
        int totalDis=0;
        for(int index = 0; index < car1.length; index++)
        {
        totalDis+=car1[index].getEndMiles()-car1[index].getStartMiles();
            
        }
        
        double totalGal=0;
        for(int index = 0; index < car1.length; index++)
        {
        totalGal+=car1[index].getGals();
            
        }
        
        double totalCost=0;
        for(int index = 0; index < car1.length; index++)
        {
        totalCost+=car1[index].totalCost();
            
        }
        
        System.out.printf("%8s %59d %14.1f %42.2f \n","Totals", totalDis,totalGal,totalCost);
        //annual projections
        double totalMPG=0;
        for(int index = 0; index < car1.length; index++)
        {
        totalMPG+=car1[index].calcMPG();
            
        }
         System.out.printf("%8s %53.1f %12.1f %12.1f %26.1f\n","Annual projections", ((double)totalDis/(double)car1[car1.length-1].getDays())*365,
                                                                               (totalGal/(double)car1[car1.length-1].getDays())*365,
                                                                                (totalMPG/car1.length),
                                                                                (totalCost/(double)car1[car1.length-1].getDays())*365);
        
    }
}
