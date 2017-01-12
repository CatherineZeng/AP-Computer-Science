import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;

public class RetroBugRunner
{
  public static void main(String[] args)
  {
    // Example 1:
    ActorWorld world = new ActorWorld();
    world.add(new Location(0, 0), new Director());
    world.add(new Location(0, 3), new Rock());
    world.add(new Location(1, 2), new Rock());
    world.add(new Location(1, 1), new Flower());
    world.add(new Location(2, 1), new RetroBug());
    world.show();

  }
}
