
/**
 * The purpose of this program is to calculate the hypoteneuse
 * of a triangle and its area.  All calculations are done within
 * methods.  An object is instantiated and all methods are invoked
 * on the object.
 * 
 * �FLVS 2007
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ShapesV4
{
    //default constructor
    ShapesV4()
    {
    }
    
    //calculate area of a triangle
    public double calcAreaRectangle(int w, int l)
    {
        return w * l;
    }
    //calculate the hypoteneuse of a right triangle
    public int calcRectPerimeter(int w, int l)
    {
        return 2*(w+l);
    }
    
    public double calcCircumference(int r)
    {
        return Math.PI*2*r;
    }
    
    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int w, l, r;
        double RectangleArea,RectanglePerimenter,Circumferencecalc;
        
        //initialization of variables
        w = 10; l = 5;r=4; 
 
        
        ShapesV4 shapes = new ShapesV4();
        
        //call methods
        RectangleArea = shapes.calcAreaRectangle(w, l); 
       RectanglePerimenter = shapes.calcRectPerimeter(w, l);
       Circumferencecalc=shapes.calcCircumference(r);

        //print results
        System.out.printf(" Rectangle Area = %8.2f%n", RectangleArea);
        System.out.printf("   Perimeter = %8.2f%n", RectanglePerimenter);
        System.out.printf("   Circumference = %8.2f%n", Circumferencecalc);
    }
}
