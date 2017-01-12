
/**
 * Testing homework
 * 
 * @Catherine Zeng
 * @3-8-14
 */
import java.util.ArrayList;
public class testHomework3
{
    public static void main(String[] args)
    {
        ArrayList<Homework3> boo=new ArrayList<Homework3>();
        
        boo.add(new MyMath3());
        boo.get(0).createAssignment(4);
        boo.add(new MyScience3());
        boo.get(1).createAssignment(6);
        boo.add(new MyEnglish3());
        boo.get(2).createAssignment(4);
        boo.add(new MyJava3());
        boo.get(3).createAssignment(5);
        
        
        
     for (int i=0;i<boo.size();i++)
      {  
            System.out.println(boo.get(i));
      }
        
         for (int i=0;i<boo.size();i++)
        { 
        for (int n=i+1;n<boo.size();n++)
             {
                 if(  ((boo.get(i)  .compareTo( boo.get(n) )==0)))
                 {
                     Homework3 a= boo.get(i);
                     Homework3 b=boo.get(n);
                 System.out.println("The homework for "+(a.toString()).substring(0,((a.toString()).indexOf(" ")))+" and "
                                    +(b.toString()).substring(0,((b.toString()).indexOf(" ")))
                                    +" are the same number of pages");
               }

          
       }
    }
}
}
