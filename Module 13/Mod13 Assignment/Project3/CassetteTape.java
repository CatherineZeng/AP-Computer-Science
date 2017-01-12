
/**
 * Write a description of class CassetteTape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CassetteTape extends MusicMedia
{
    /**
     * Constructor for objects of class CassetteTape
     */
    public CassetteTape( String title, String artist, String sku)
    {
        super(title, artist, sku);
    }

    public String getMediaType()
    {
        return "Cassette";
    }
    
    public String toString()
    {
        return getMediaType()+" - "+getTitle()+ " ("+getArtist()+")";
    }
   
}
