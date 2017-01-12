
/**
 * Catherine Zeng 11-13-13
 * 
 * this java file calculates y according to x
 * 
 */
public class PointsOnACircleV1
{
    public static void main(String[ ] args)
    {
        
        System.out.println(" Points on a circle of radius 1.0");
        System.out.println();
        System.out.println("x1              y1");
        System.out.println("======================");
        
        double radius = 1;
        double x = -1.0;
        double y=0.0;
        
        for (x=-1.0;x<=1.0;x+=0.1)
        {
            y=Math.abs(Math.sqrt((1-Math.pow(x,2))));
            System.out.printf("%1.2f %13.2f\n" ,x,y);
        }
       x=-1.0;
        for (x=-1.0;x<=1.0;x+=0.1)
        {
            y=-(Math.abs(Math.sqrt((1-Math.pow(x,2)))));
            System.out.printf("%1.2f %13.2f\n" ,x,y);
        }
        
         
    }//end of main method
}//end of class
