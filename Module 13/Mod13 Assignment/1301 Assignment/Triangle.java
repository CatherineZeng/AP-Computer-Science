
/**
 * Creates triangle
 * 
 * @Catherine Zeng
 * @1/10/14
 */
public class Triangle
{
	// instance variables 
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Triangle(double A, double B, double C)
	{
		// initialise instance variables
		sideA = A;
		sideB = B;
		sideC = C;
	}

	// return the height
	public double getSideA()
	{
		return sideA;
	}
	public double getSideB()
	{
	    return sideB;
	}
	public double getSideC()
	{
	    return sideC;
	}
}
