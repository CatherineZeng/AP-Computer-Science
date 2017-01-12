
/**
 * This program shows the center circular shape thingies
 * 
 * @Catherine Zeng
 * @1-30-14
 */

    import java.util.ArrayList;       
public class TestPoly2

{
	public static void showCenter(Circle2 e)
	{
	    System.out.println("For " + e + " "+ e.center());


	}
    
    public static void main (String []args)
	{
	    ArrayList<Circle2> hi = new ArrayList<Circle2>(); 

       hi.add( new Circle2( 2,4,2 ) ); 
       hi.add( new Cylinder2( 10,15,2,3) ); 
       hi.add( new Oval2( 25,10,3,4 )); 
       hi.add( new OvalCylinder2( 40,10,3,2,3 )); 
    
       for ( Circle2 a : hi )
    {
        showCenter(a); 
        System.out.println(  );
    }
	}
    
    
}
