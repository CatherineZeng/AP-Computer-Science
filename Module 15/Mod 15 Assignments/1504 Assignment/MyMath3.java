
/**
 * Math Homework
 * @Catherine Zeng
 * @3-8-14
 */
public class MyMath3 extends Homework3
{
   public MyMath3()
    {
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p); 
        setTypeHomework("Math"); 
    }
    
    public void doReading()
    {
        pagesRead-=2;
    }
       
    public String toString()
    {
        return getTypeHomework()+" - must read "+getPagesRead()+" pages.";
    }
}
