
/**
 * This shows some info about a Winter Mountain
 * 
 * @Catherine Zeng
 * @1-12-14
 */
public class WinterMountain extends Mountain
{
    // instance variables - replace the example below with your own
    private double myTemperature;

    /**
     * Constructor for objects of class WinterMountain
     */
    public WinterMountain(int l, int w, int numMount, double temp)
    {
       super(l,w,numMount);
       myTemperature=temp;
    }

   
    public String WinterMountainInfo()
    {
        return "Winter "+MountainInfo()+" and has temperature "+myTemperature;
    }
}
