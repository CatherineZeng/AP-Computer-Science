/**
 * This displays dimensions of rectangular objects and tests to see if two different rectangular 
 * objects are the same
 * 
 * �
 * @Catherine Zeng 
 * @2-8-14
 */
public class testNew
{
	public static void main(String []args)
	{
           Rectangle3 a = new Rectangle3(5, 20);
           Box3 b = new Box3(4, 4, 4);
           Box3 c= new Box3(4, 10, 5);
           Cube3 d=new Cube3(4);
	   
	      showEffectBoth(a);
	      showEffectBoth(b);
	      showEffectBoth(c);
	      showEffectBoth(d);
	      
	      equals2(b,d);
	      equals2(c,d);
	      
	 }
	 
	 public static void showEffectBoth(Rectangle3 r)
	 {
	     System.out.println(r);
	 }
	 
	 public static void equals2(Object a, Object b)
	 {
	     if (a.equals(b))
	        {System.out.println( a+ " is same size as "+ b);}
	       else
	        {System.out.println( a +" is NOT the same size as "+b);}
     }
    }