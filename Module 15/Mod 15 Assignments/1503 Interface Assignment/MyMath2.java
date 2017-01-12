
/**
 * Math Homework
 * @Catherine Zeng
 * @3-8-14
 */
public class MyMath2 extends Homework2
{
   public MyMath2()
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
