
/**
 * Write a description of class hi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shapes implements Calculatable
{
 private int area;
 private int perimeter;
 
public void calcRectanguleArea(int length, int width)
{
    area=length*width;
}

public void calcRectanglePerimeter(int length, int width)
{
    perimeter=2*(length+width);
}

public int getArea()
{
    return area;
}

public int getPerimeter()
{
    return perimeter;
}

public abstract double convertMinutes(int minutes);
}
