
/**
 * Write a description of class boo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 

public class Director extends Rock
{
    public Director()
    {
        setColor(Color.RED);
    }
    
    public void act()
    {
        if(getColor().equals(Color.GREEN))
        {
            turnObjects();
            setColor(Color.RED);
        }
        
        else if(getColor().equals(Color.RED))
        {
            setColor(Color.GREEN);
        }
    }
    
    public void turnObjects()
    {
        Grid<Actor> gr=getGrid();
        ArrayList<Actor> actors=gr.getNeighbors(getLocation());
        for (Actor a:actors)
        {
            a.setDirection(a.getDirection()+Location.RIGHT);
        }
        
    }
    
}
