
/**
 * This shows some info about a Forest
 * 
 * @Catherine Zeng 
 * @1-12-14
 */
public class Forest extends Terrain
{
    // instance variables - replace the example below with your own
    private int numTrees;

    /**
     * Constructor for objects of class Forest
     */
    public Forest(int l, int w, int numTree)
    {
        super (l,w);
        numTrees=numTree;
    }

    
    public String ForestInfo()
    {

        return "Forest "+terrainSize()+" and has "+numTrees+" trees";
    }
}
