
/**
 * Java Homework
 * 
 * @Catherine Zeng
 * @3-8-14
 */
public class MyJava2 extends Homework2
{
   public MyJava2()
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
