
/**
 * Write a description of class CompactDisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompactDisk extends Disk
{

    /**
     * Constructor for objects of class CompactDisk
     */
    public CompactDisk(String title, String artist, String sku)
    {
        super(title, artist, sku);
    }

    public String getMediaType()
    {
        return "CD";
    }
    
    
}
