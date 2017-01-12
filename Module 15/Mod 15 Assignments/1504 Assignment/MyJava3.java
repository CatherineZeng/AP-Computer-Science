
/**
 * Java Homework
 * 
 * @Catherine Zeng
 * @3-8-14
 */
public class MyJava3 extends Homework3
{
   public MyJava3()
    {
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p); 
        setTypeHomework("Java"); 
    }
    
    public void doReading()
    {
        pagesRead-=4;
    }
       
    public String toString()
    {
        return getTypeHomework()+" - must read "+getPagesRead()+" pages.";
    }
}
