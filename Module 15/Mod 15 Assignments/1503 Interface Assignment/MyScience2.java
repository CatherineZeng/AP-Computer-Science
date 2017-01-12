
/**
 * Science Homework
 * 
 * @Catherine Zeng
 * @3-8-14
 */
public class MyScience2 extends Homework2
{
   public MyScience2()
    {
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p); 
        setTypeHomework("Science"); 
    }
    
    public void doReading()
    {
        pagesRead-=3;
    }
       
    public String toString()
    {
        return getTypeHomework()+" - must read "+getPagesRead()+" pages.";
    }
}
