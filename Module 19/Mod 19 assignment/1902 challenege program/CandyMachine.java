
/**
 * Candy Machine
 * 
 * @Catherine Zeng 
 * @4-19-14
 */
public class CandyMachine
{
   public static void main (String[] args)
   {
    Dispenser boo= new Dispenser(50,1);
    CashRegister hoo=new CashRegister(100);
    sellProduct(boo,hoo);
    print(boo, hoo);
    
    Dispenser hello=new Dispenser(30,20);
    sellProduct(hello, hoo);
    print(hello, hoo);
    
    Dispenser Error=new Dispenser(-30,20);
    sellProduct(Error,hoo);
    print(Error, hoo);
   }
   
   public static void print( Dispenser boo, CashRegister hoo)
   {
       System.out.println("There are $"+hoo.getCashOnHand()+" dollars in the cash register \n After sale of "
                         +boo.getCount()+" items for $"+boo.getProductCost()+ " each\n");
                        }
   
   public static void sellProduct(Dispenser a, CashRegister b)
   {
       if (a.getCount()*a.getProductCost()<0)
       throw new IllegalArgumentException("The product sells for a negative value!");
       b.acceptAmount(    a.getCount()*a.getProductCost()  );
    }
}