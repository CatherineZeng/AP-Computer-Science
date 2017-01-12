
/**
 * Tools class
 * 
 * @Catherine Zeng 
 * @3-12-14
 */
public class Tool implements Product, Comparable<Tool>
{
    public String name;
    public double cost;
    public Tool(String name, double cost)
    {
        this.name=name;
        this.cost=cost;
    }

    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int compareTo(Tool boo)
    {
        if (cost<boo.cost)
        return -1;
        else if (cost==boo.cost)
        return 0;
        else
        return 1;
    }
}
