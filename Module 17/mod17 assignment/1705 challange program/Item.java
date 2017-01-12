
/**
 * Item class
 * 
 * @Catherine Zeng
 * @4-9-14
 */
public class Item
{
    // instance variables - replace the example below with your own
    String itemID;
    String itemName;
    int inStore;
    double Price;

    /**
     * Constructor for objects of class Item
     */
    public Item(String itemID, String itemName, int inStore, double Price)
    {
        this.itemID=itemID;
        this.itemName=itemName;
        this.inStore=inStore;
        this.Price=Price;
    }

    public String toString()
    {
        System.out.printf("%8s %16s %8d %8.2f",getItemID(),getItemName(),getInStore(),getPrice());
        return "";
    }
    
    public String getItemID()
    {
        return itemID;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    
    public int getInStore()
    {
        return inStore;
    }
    
    public double getPrice()
    {
        return Price;
    }
}
