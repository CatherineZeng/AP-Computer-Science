
/**
 * This program demonstrates the creation of two objects, each containing
 * its own private instance data.
 * 
 * @author B. Jordan
 * @version 05/31/07
 */
public class ShapesV7Tester
{
	public static void main(String[] args)
    {
        //declaration of variables
        int side1A, side2A, side1B, side2B, side1C, side2C; 
        double hypoteneuseA, triAreaA, hypoteneuseB, triAreaB , hypoteneuseC, triAreaC;
        
        //initialization of variables
        side1A = 10; side2A = 5; triAreaA = 0.0; hypoteneuseA = 0.0;
        side1B = 7; side2B = 13; triAreaB = 0.0; hypoteneuseB = 0.0;
        side1C = 342; side2C = 1234; triAreaC = 0.0; hypoteneuseC = 0.0;
        
        //create object
        ShapesV7 shapes1 = new ShapesV7(side1A, side2A);
        ShapesV7 shapes2 = new ShapesV7(side1B, side2B);
        ShapesV7 shapes3=new ShapesV7(side1C, side2C);
        
        //call methods
        triAreaA = shapes1.calcTriArea();
        hypoteneuseA = shapes1.calcHypoteneuse();
        triAreaB = shapes2.calcTriArea();
        hypoteneuseB = shapes2.calcHypoteneuse();
        triAreaC = shapes3.calcTriArea();
        hypoteneuseC = shapes3.calcHypoteneuse();
        
        //print results
        System.out.println("        Side 1      Side 2    Hypoteneuse     Area");
        
        System.out.printf("%12d %11d %13.2f %11.2f%n", side1A, side2A, hypoteneuseA, triAreaA);
        System.out.printf("%12d %11d %13.2f %11.2f%n", side1B, side2B, hypoteneuseB, triAreaB);
        System.out.printf("%12d %11d %13.2f %11.2f%n", side1C, side2C, hypoteneuseC, triAreaC);
    }
}

