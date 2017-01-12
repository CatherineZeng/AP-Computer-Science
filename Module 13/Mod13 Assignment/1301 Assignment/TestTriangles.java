
/**
 * Tests triangles
 * 
 * @Catherine Zeng
 * @1/10/14
 */
public class TestTriangles
{
   public static void main( String[] args )
  {
  Triangle hi=new Triangle(3,4,5);
  System.out.println("Triangle has sides A="+hi.getSideA()+" B= "+hi.getSideB()+" C= "+hi.getSideC());
  
  Equilateral hello= new Equilateral(3);
  System.out.println("Equilateral Triangle has sides A="+hello.getSideA()+" B= "+hello.getSideB()+" C= "+hello.getSideC());
 
  IsoscelesRight boo= new IsoscelesRight(3);
  System.out.println("Isosceles Right Triangle has sides A="+boo.getSideA()+" B= "+boo.getSideB()+" C= "+boo.getSideC());
  }
}
