/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        BoxBug alice = new BoxBug(6);
        alice.setColor(Color.ORANGE);
        BoxBug bob = new BoxBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
        CircleBug lice = new CircleBug(2);
        lice.setColor(Color.GREEN);
        world.add(new Location(5, 3), lice);
        SpiralBug lices = new SpiralBug(1);
        lices.setColor(Color.BLUE);
        world.add(new Location(2, 3), lices);
        
        ZBug slices = new ZBug(2);
        slices.setColor(Color.PINK);
        world.add(new Location(6, 5), slices);
        
        int[] turns={2,2,1,3};
        DancingBug splices = new DancingBug(turns);
        splices.setColor(Color.PINK);
        world.add(new Location(6, 3), splices);
        world.show();
    }
}