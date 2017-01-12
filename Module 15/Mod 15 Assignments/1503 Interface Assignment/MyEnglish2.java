
/**
 * English homework
 * 
 * @Catherine Zeng
 * @3-8-14
 */
public class MyEnglish2 extends Homework2
{
   public MyEnglish2()
    {
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p); 
        setTypeHomework("English"); 
    }
    
    public void doReading()
    {
        pagesRead-=1;
    }
       
    public String toString()
    {
        return getTypeHomework()+" - must read "+getPagesRead()+" pages.";
    }
}
