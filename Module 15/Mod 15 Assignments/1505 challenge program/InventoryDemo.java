
/**
 * Testing all the classes
 * 
 * @Catherine Zeng
 * @3-12-14
 */
import java.util.ArrayList;
public class InventoryDemo
{
    public static void takeInventory(String name, ArrayList<Product> boo)
    {
        int quantity=0;
        double totalCost=0.0;
        for (int n=0;n<boo.size();n++)
        {
           
           if (name.equals( ( (boo.get(n)  ).getName() )))
           {
               quantity++;
               totalCost+=(boo.get(n)).getCost();
            }
            
        }
    System.out.println(name+": Quantity = "+ quantity+ ", Total cost = "+totalCost);
    }
        
        
    public static void main(String[] args)
    {
        ArrayList<Product> boo=new ArrayList<Product>();
        
        boo.add(new Car("Jaguar",100000.00));
        boo.add(new Tool("Neon",17000.00));
        boo.add(new Tool("Jigsaw",149.18));
        boo.add(new Car("Jaguar",110000.00));
        boo.add(new Tool("Neon",17500.00));
        boo.add(new Tool("Neon",17875.32));
        boo.add(new Tool("RAM",35700.00));
        boo.add(new Tool("CircularSaw",200.00));
        boo.add(new Tool("CircularSaw",150.00));
        
        takeInventory("Jigsaw",boo);
        takeInventory("Neon",boo);
        takeInventory("Jaguar",boo);
        takeInventory("RAM",boo);
        takeInventory("CircularSaw",boo);
        
        Tool saw1=new Tool("Saw1",150);
        Tool saw2=new Tool("Saw2",250);
        if (saw1.compareTo(saw2)<0)
        System.out.println("The second Saw is more expensive");
        if (saw1.compareTo(saw2)==0)
        System.out.println("The Saws are of the same price");
        if (saw1.compareTo(saw2)>0)
        System.out.println("The second saw is less expensive");
    }
}

