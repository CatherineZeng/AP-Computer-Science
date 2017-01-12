
/**
 *This calculates the range an item is projected to shoot given initial velocity and angle of shoot
 * 
 * @Catherine Zeng 
 * @12-29-13
 */
public class Catapult
{
    // instance variables - replace the example below with your own
    private int myMPH;
    private int myAngleDegree;
    private double myDistance;
    
    /**
     * Default constructor for objects of type Catapult
     */
    public Catapult (int MPH, int angleDegree)
    {
     myMPH=MPH;
     myAngleDegree=angleDegree;
    }
    
    
    /**
     * Accessor method to calculate the distance item is projected to shoot
     * @param myMPH miles per hour of shoot
     * @param myAngleDegree angle degree of shoot
     */
    public void calcDistance()
    {
        myDistance= (Math.pow(((double)myMPH*(5280./3600)),2)*Math.sin(2.0*Math.toRadians((double)myAngleDegree)))/32.0;
    }
    
    /**
     * Getter method to return the distance shoot traveled
     */
    public double getDistance()
    {
        return myDistance;
    }
}
