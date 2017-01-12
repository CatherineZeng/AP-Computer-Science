
/**
 * Write a description of class RockHound here.
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
public class RockHound extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a:actors)
        {
            if (a instanceof Rock)
            a.removeSelfFromGrid();
        }
    }
}
