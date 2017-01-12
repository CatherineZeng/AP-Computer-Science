import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;

import java.awt.Color;

public class RetroBug extends Bug
{
  private Location prevLocation = null; // Optional: initialized to null by default
  private int prevDirection;

  public RetroBug()
  {
    setColor(Color.RED);  // or: super(); or simply empty braces
  }

  public RetroBug(Color bugColor)
  {
    setColor(bugColor);  // or: super(bugColor);
  }

  public void act()
  {
    prevLocation = getLocation();
    prevDirection = getDirection();
    super.act();
  }

  public void restore()
  {
    if (prevLocation == null) // if act has not been called before
      return;

    Actor neighbor = getGrid().get(prevLocation);
    if (neighbor == null || neighbor instanceof Flower)
      moveTo(prevLocation);

    setDirection(prevDirection);
  }
}
