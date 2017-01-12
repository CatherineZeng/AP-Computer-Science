
/**
 * Homework class
 * 
 * @Catherine Zeng
 * @3-8-14
 */
public abstract class Homework2 implements Processing
{
    public int pagesRead=0;
    public String typeHomework="none";
    
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
