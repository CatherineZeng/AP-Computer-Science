
/**
 * Music class
 * 
 * @Catherine Zeng
 * @4-10-14
 */
public class Music
{
    String title;
    int year;
    String singer;
    
    Music (String title, int year, String singer)
    {
        this.title=title;
        this.year=year;
        this.singer=singer;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getSinger()
    {
        return singer;
    }
    
    public String toString()
    {
        return getTitle()+", "+getYear()+", "+getSinger();
    }
}
