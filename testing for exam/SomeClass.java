
/**
 * Write a description of class df here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SomeClass 
{
            private int x, y;

            public SomeClass (int xValue, int yValue) 
               {
                        x = xValue;
                        y = yValue;
            }                       
            public void m1()
              {
                        x = 30;
                        System.out.print((y + 1) + " ");
            }
            public void m2() 
              {
                        m1();
                        System.out.print(x + " ");
            }

            public static void main (String[] args) 
               {
                        int x = 10;
                        int y = 20;
                        SomeClass z = new SomeClass(y, x);
                        z.m2();
                        z.m1();
            }
}