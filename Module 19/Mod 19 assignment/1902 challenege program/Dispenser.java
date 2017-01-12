
/**
 * Candy basket to sell
 * 
 * @Catherine Zeng
 * @4-19-14
 */
public class Dispenser
{
   int numberOfItems;
   int cost;
   
   Dispenser()
   {
       numberOfItems=50;
       cost=50;
    }
    
   Dispenser(int numberOfItems, int cost)
   {
       this.numberOfItems=numberOfItems;
       this.cost=cost;
    }
    
   public int getCount()
   { return numberOfItems;}
   public int getProductCost()
   {return cost;}
   public void makeSale()
   {numberOfItems-=1;}
    
}
