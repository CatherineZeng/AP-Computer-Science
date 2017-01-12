
/**
 * Catherine Zeng 12-23-13
 * This tests the class with 3 different car data
 */
public class CarV7Tester
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
        CarV7 car1= new CarV7 ("crapiola toyodaola", 396, 56, 7.91, 3);
        CarV7 car2= new CarV7 ("dapidydoop scooter", 12345, 11000, 25, 3);
        CarV7 car3= new CarV7 ("honkydonky trunky ", 132, 43, 10, 3);
        
        System.out.printf("%30s\n", "Gas Mileage Calculations");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.printf("%15s %7d %17d %15d %17.1f %15.2f %15.2f %15.1f %15.3f\n" , car1.getType(), car1.getStartMiles(), car1.getEndMiles(),car1.getEndMiles()-car1.getStartMiles(), car1.getGals(), car1.getPPG(), car1.totalCost(), 1/(car1.calcGPM()), car1.calcGPM() );
        System.out.printf("%15s %7d %17d %15d %17.1f %15.2f %15.2f %15.1f %15.3f\n" , car2.getType(), car2.getStartMiles(), car2.getEndMiles(),car2.getEndMiles()-car2.getStartMiles(), car2.getGals(), car2.getPPG(), car2.totalCost(), 1/(car2.calcGPM()), car2.calcGPM() );
        System.out.printf("%15s %7d %17d %15d %17.1f %15.2f %15.2f %15.1f %15.3f\n" , car3.getType(), car3.getStartMiles(), car3.getEndMiles(),car3.getEndMiles()-car3.getStartMiles(), car3.getGals(), car3.getPPG(), car3.totalCost(), 1/(car3.calcGPM()), car3.calcGPM() );        
    
}
}
