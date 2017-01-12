
/**
 * Sorting items
 * 
 * @Catherine Zeng
 * @4-9-14
 */
public class TestItem
{
    public static void main(String[] args)
	{
	    Item[] hardware= new Item[6];
	    hardware[0]=new Item("1011","Air Filters",200,10.5);
	    hardware[1]=new Item("1034","Door Knobs",60,21.5);
	    hardware[2]=new Item("1101","Hammers",90,9.99);
	    hardware[3]=new Item("1600","Levels",80,19.99);
	    hardware[4]=new Item("1500","Ceiling Fans",100,59);
	    hardware[5]=new Item("1201","Wrench Sets",55,80);
	    
	    System.out.println("Original Array:");
	    printInventory(hardware);
	    
	    System.out.println("Sorted by ID:");
	    sortID(hardware);
	    printInventory(hardware);
	    
	    System.out.println("Sorted by Name:");
	    sortName(hardware);
	    printInventory(hardware);
	    
	    System.out.println("Sorted by inStore:");
	    sortInStore(hardware);
	    printInventory(hardware);
	    
	    System.out.println("Sorted by price:");
	    sortPrice(hardware);
	    printInventory(hardware);
	   }
	   
	 public static void printInventory(Item[] hardware)
    {
        System.out.printf("%8s %16s %8s %8s \n","itemID","itemName","inStore","price");
        for (int i=0;i<hardware.length;i++)
        System.out.println(hardware[i]);
       System.out.println("\n");
    }
    
    public static void sortName(Item[] boo)
    {
        int i,k,posmax;
        Item temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getItemName().compareTo(boo[posmax].getItemName())<0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }
    
    public static void sortInStore(Item[] boo)
    {
        int i,k,posmax,posmin;
        Item temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getInStore()>boo[posmax].getInStore())
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
        
    }
    
    public static void sortPrice(Item[] boo)
    {
        int i,k,posmax,posmin;
        Item temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getPrice()<boo[posmax].getPrice())
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
        
    }
    
    public static void sortID(Item[] boo)
    {
        int i,k,posmax,posmin;
        Item temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getItemID().compareTo(boo[posmax].getItemID())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }
}
