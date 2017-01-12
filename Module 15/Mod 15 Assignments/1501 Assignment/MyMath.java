
/**
 * Math Homework
 * 
 * @Catherine Zeng
 * @3-4-14
 */
public class MyMath extends Homework
{
    public MyMath(int pagesRead, String typeHomework)
    {
        super(pagesRead,typeHomework);
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p); 
        setTypeHomework("Math"); 
    }
    
    public String toString()
    {
        return getTypeHomework()+" - must read "+getPagesRead()+" pages.";
    }
        
    
}
