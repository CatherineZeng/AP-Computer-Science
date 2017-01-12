/**
 * A cube
 * 
 * @Catherine Zeng
 * @2-8-14
 */
public class Cube3 extends Box3
{
	// instance variables 

	/**
	 * Constructor for objects of class box
	 */
	public Cube3(int l)
	{
		// call superclass
		super(l, l, l);
	    // initialise instance variables
	}


	public String toString()
	{
	    return "Cube - " + getLength() + " X " + getWidth() + " X " + height;
	}

}
