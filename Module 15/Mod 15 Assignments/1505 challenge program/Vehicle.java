
/**
 * Abstract vehicle
 * 
 * @Catherine Zeng 
 * @3-12-14
 */
public abstract class Vehicle implements Product
{
    // instance variables - replace the example below with your own
    public String name;
    public double cost;
    
    public Vehicle(String name, double cost)
    {
        this.name=name;
        this.cost=cost;
    }

    public double getCost()
    {
        return cost;
    }
    
    public String getName()
    {
        return name;
    }
    
}
