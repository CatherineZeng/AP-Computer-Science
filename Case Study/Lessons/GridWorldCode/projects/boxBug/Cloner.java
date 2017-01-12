
/**
 * Write a description of class ClonerBug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloner extends Actor
{
    public Cloner()
    {
        setColor(Color.BLACK);
    }
    
    public void act()
    {
        Grid<Actor> gr=getGrid();
        ArrayList<Actor> actors=gr.getNeighbors(getLocation());
        for (Actor a:actors)
        {
            Location loc=a.getLocation();
            int dir=loc.getDirectionToward(getLocation());
            Location final1=loc.getAdjacentLocation(dir);
            Location final2=final1.getAdjacentLocation(dir);
            Bug buggy=new Bug(a.getColor());
            buggy.putSelfInGrid(gr,final2);
        }
    }
}
