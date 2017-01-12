
/**
 *This calculates the range an item is projected to shoot given initial velocity and angle of shoot
 * 
 * @Catherine Zeng 
 * @12-29-13
 */
public class CatapultThis
{
    // instance variables - replace the example below with your own
    private int MPH;
    private int angleDegree;
    private double Distance;
    
    /**
     * Default constructor for objects of type Catapult
     */
    public CatapultThis (int MPH, int angleDegree)
    {
     this.MPH=MPH;
     this.angleDegree=angleDegree;
    }
    
    
    /**
     * Accessor method to calculate the distance item is projected to shoot
     * @param myMPH miles per hour of shoot
     * @param myAngleDegree angle degree of shoot
     */
    public void calcDistance()
    {
        Distance= (Math.pow(((double)this.MPH*(5280./3600)),2)*Math.sin(2.0*Math.toRadians((double)this.angleDegree)))/32.0;
    }
    
    /**
     * Getter method to return the distance shoot traveled
     */
    public double getDistance()
    {
        return Distance;
    }
}
