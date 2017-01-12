
/**
 * Tests cube class
 * 
 * @Catherine Zeng
 * @1/10/14
 */
public class TestCube
{
  public static void main( String[] args )
  {
  Rectangle hi=new Rectangle(2,4);
  System.out.println("One's dimensions are "+hi.getLength()+" X "+hi.getWidth());
  
  Cube hello= new Cube(5);
  System.out.println("Cube's dimensions are "+hello.getLength()+" X "+hello.getWidth()+" X "+hello.getHeight());

  }
}
