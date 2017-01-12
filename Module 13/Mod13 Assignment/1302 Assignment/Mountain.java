
/**
 * This shows some info about a mountain
 * 
 * @Catherine Zeng
 * @1-12-14
 */
public class Mountain extends Terrain
{
    // instance variables - replace the example below with your own
    private int numMountain;

    /**
     * Constructor for objects of class Mountains
     */
    public Mountain(int l, int w, int numMount)
    {
        // initialise instance variables
        super (l,w);
        numMountain=numMount;
    }

    
    public String MountainInfo()
    {
        return "Mountain "+terrainSize()+" and has "+numMountain+" mountains";
    }
}
