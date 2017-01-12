
/**
 * Cash Register
 * 
 * @Catherine Zeng
 * @4-19-14
 */
public class CashRegister
{
    int cashOnHand;
    
    CashRegister()
    {cashOnHand=500;}
    
    CashRegister(int cashOnHand)
    {
        String msg="Values assigned were not appropriate";
        if (cashOnHand<0)
        throw new IllegalArgumentException(msg);
        this.cashOnHand=cashOnHand;
    }
    
    public void acceptAmount(int value)
    {
        String msg="Values to add was not appropriate";
    if (value<0)
        throw new IllegalArgumentException(msg);
    cashOnHand+=value;
   }
   
   public int getCashOnHand()
   {return cashOnHand;}
 
}
