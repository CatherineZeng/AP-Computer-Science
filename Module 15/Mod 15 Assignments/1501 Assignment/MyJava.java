
/**
 * Java homework setter
 * 
 * @Catherine Zeng
 * @3-4-14
 */
public class MyJava extends Homework
{
    public MyJava(int pagesRead, String typeHomework)
    {
        super(pagesRead,typeHomework);
    }
    
    public void createAssignment(int p)
    {
        pagesRead=p;
        typeHomework="Java";
    }
    
    public String toString()
    {
        return typeHomework+" - must read "+pagesRead+" pages.";
    }
        
    
}
