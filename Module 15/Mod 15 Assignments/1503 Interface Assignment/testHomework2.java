
/**
 * Testing homework
 * 
 * @Catherine Zeng
 * @3-8-14
 */
import java.util.ArrayList;
public class testHomework2
{
    public static void main(String[] args)
    {
        ArrayList<Homework2> boo=new ArrayList<Homework2>();
        
        boo.add(new MyMath2());
        boo.get(0).createAssignment(4);
        boo.add(new MyScience2());
        boo.get(1).createAssignment(6);
        boo.add(new MyEnglish2());
        boo.get(2).createAssignment(10);
        boo.add(new MyJava2());
        boo.get(3).createAssignment(5);
        
        
        
        for (int i=0;i<boo.size();i++)
        {
            System.out.println("Before Reading-");
            System.out.println(boo.get(i));
            boo.get(i).doReading();
            System.out.println("After Reading-");
            System.out.println(boo.get(i));
       }
    }
}
