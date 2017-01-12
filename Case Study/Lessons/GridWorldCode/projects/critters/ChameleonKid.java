
/**
 * Write a description of class ChameleonKid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter
{
    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> actors=new ArrayList<Actor>();
        int[] directions={Location.AHEAD, Location.HALF_CIRCLE};
        for (Location loc:getLocationFromDirections(directions))
        {
            Actor a=getGrid().get(loc);
            if(a!=null)
            actors.add(a);
        }
        return actors;
    }
    
    public ArrayList<Location> getLocationFromDirections(int[] direction)
    {
        ArrayList<Location> locs=new ArrayList<Location>();
        Grid gr=getGrid();
        Location loc=getLocation();
        
        for (int a:direction)
        {
            Location neighborLoc=loc.getAdjacentLocation(getDirection()+a);
            if (gr.isValid(neighborLoc))
            locs.add(neighborLoc);
        }
        return locs;
    }
}
