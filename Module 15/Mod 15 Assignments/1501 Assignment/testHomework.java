
/**
 * Testing homework
 * 
 * @Catherine Zeng
 * @3-4-14
 */
import java.util.ArrayList;
public class testHomework
{
    public static void main(String[] args)
    {
        ArrayList<Homework> boo=new ArrayList<Homework>();
        
        boo.add(new MyMath(4,"Math"));
        boo.add(new MyScience(6,"Science"));
        boo.add(new MyEnglish(10,"English"));
        boo.add(new MyJava(5,"Java"));
        
        
        for (int i=0;i<boo.size();i++)
        System.out.println(boo.get(i));
    }
}
