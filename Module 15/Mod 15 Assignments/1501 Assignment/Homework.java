
/**
 * Homework setter.
 * 
 * @Catherine Zeng
 * @3-4-14
 */
public abstract class Homework
{
    public int pagesRead=0;
    public String typeHomework="none";
    
    public Homework(int pagesRead, String typeHomework)
    {
        this.pagesRead=pagesRead;
        this.typeHomework=typeHomework;
    }
    
    public void setPagesRead(int read)
    {
        pagesRead=read;
    }
    
    public int getPagesRead()
    {
        return pagesRead;
    }
    
    public void setTypeHomework(String hw)
    {
        typeHomework=hw;
    }
    
    public String getTypeHomework()
    {
        return typeHomework;
    }
    
    public abstract void createAssignment(int p);

}
