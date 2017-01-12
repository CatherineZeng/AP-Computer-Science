
/**
 * Write a description of class QuickCrab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;
import java.awt.Color;
public class QuickCrab extends CrabCritter
{
   public QuickCrab()
   {
       setColor(Color.CYAN);
    }
    
    public ArrayList<Location> getMoveLocation()
    {
        ArrayList<Location> locs=new ArrayList<Location>();
        Grid g=getGrid();
        
        addTwoOutMove(locs,getDirection()+Location.LEFT);
        addTwoOutMove(locs,getDirection()+Location.RIGHT);
        
        if(locs.size()==0)
        return super.getMoveLocations();
        return locs;
    }
    
    public void addTwoOutMove(ArrayList<Location> locs, int dir)
    {
        Grid gr=getGrid();
        Location loc=getLocation();
        Location temp=loc.getAdjacentLocation(dir);
        
        if(gr.isValid(temp)&& gr.get(temp)==null)
        {
            Location loc2=temp.getAdjacentLocation(dir);
            if (gr.isValid(loc2)&&gr.get(loc2)==null)
            locs.add(loc2);
        }
    }
    
}
