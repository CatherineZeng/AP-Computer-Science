
/**
 * A Rectangle
 *
 * @Catherine Zeng 
 * @2-8-14
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle - " + length + " X " + width;
	}
	
    public boolean equals( Object b ) 
    { 
    if ( ! (b instanceof Rectangle3) ) 
      return false; 
    
        Rectangle3 t = (Rectangle3)b; 
       return t.getLength() == getLength() && t.getWidth() == getWidth();
    }
    
    } 
