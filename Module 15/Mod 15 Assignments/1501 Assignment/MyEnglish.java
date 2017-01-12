
/**
 *Math Homework setter
 * 
 * @Catherine Zeng
 * @3-4-14
 */
public class MyEnglish extends Homework
{
    public MyEnglish(int pagesRead, String typeHomework)
    {
        super(pagesRead,typeHomework);
    }
    
    public void createAssignment(int p)
    {
        pagesRead=p;
        typeHomework="English";
    }
    
    public String toString()
    {
        return typeHomework+" - must read "+pagesRead+" pages.";
    }
        
    
}
