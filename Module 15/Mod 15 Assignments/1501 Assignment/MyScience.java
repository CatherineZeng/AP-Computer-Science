
/**
 * Science setter
 * 
 * @Catherine Zeng
 * @3-4-14
 */
public class MyScience extends Homework
{
    public MyScience(int pagesRead, String typeHomework)
    {
        super(pagesRead,typeHomework);
    }
    
    public void createAssignment(int p)
    {
        pagesRead=p;
        typeHomework="Science";
    }
    
    public String toString()
    {
        return typeHomework+" - must read "+pagesRead+" pages.";
    }
        
    
}
