
/**
 * Class for stuff
 * 
 * @Catherine Zeng 
 * @4=5=14
 */

public class Movie2
{
     String title;
     int year;
     String studio;
    
    public Movie2 (String title, int year, String studio)
    {
    this.title=title;
    this.year=year;
    this.studio=studio;
    }
    
    public String toString()
    {
        return title+", "+year+", "+studio;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getStudio()
    {
        return studio;
    }
}

