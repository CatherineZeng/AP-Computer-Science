
/**
 * This tests many of the landscape Terrains
 * 
 * @Catherine Zeng 
 * @1-12-14
 */
public class TestTerrain
{
   public static void main( String[] args )
{
  Mountain hi = new Mountain( 300, 400, 25);
  WinterMountain hello=new WinterMountain(500,600,15,10.0);
  Forest boo=new Forest(100,200,100);
 
  System.out.println( hi.MountainInfo()  );
  System.out.println( hello.WinterMountainInfo());
  System.out.println( boo.ForestInfo());
}
}
