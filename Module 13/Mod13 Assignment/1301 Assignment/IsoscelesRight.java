
/**
 * Creates an Isosceles triangle
 * 
 * @Catherine Zeng 
 * @1/11/14
 */
public class IsoscelesRight extends Triangle
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class IsoscelesRight
     */
    public IsoscelesRight(double A)
    {
        // initialise instance variables
        super(A,A,Math.sqrt(2*Math.pow(A,2)));

    }

}
