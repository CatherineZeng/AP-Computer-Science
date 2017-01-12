
/**
 * Homework class
 * 
 * @Catherine Zeng
 * @3-8-14
 */
public abstract class Homework3 implements Comparable<Homework3>
{
    public int pagesRead=0;
    public String typeHomework="none";
    
    public int compareTo(Homework3 boo)
    {
        if (pagesRead<boo.pagesRead)
        return -1;
        else if(pagesRead==boo.pagesRead)
        return 0;
        else
        return 1;
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
