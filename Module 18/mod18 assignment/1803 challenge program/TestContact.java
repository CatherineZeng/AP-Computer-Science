
/**
 * This sorts random info
 * @Catherine Zeng
 * @4-14-14
 */
import java.util.ArrayList;
public class TestContact
{
    public static void main(String[] args)
	{
	    Contact[] myContacts = new Contact[6];
	    
	    myContacts[0] = new Contact("John Carter", "brother", "Mar 3","(342)555-7069","jcarter@carter.com");
	    myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19","(342)555-7011","carterMom@carter.com");
	    myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10","(342)555-8102","ecarter@carter.com");
	    myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9","(341)555-9182","susieE@hotmail.com");
	    myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1","(342)555-7011","carterDad@carter.com");
	    myContacts[5] = new Contact("Johnnie", "friend", "Jan 21","(341)555-7789","jDawg5555@yahoo.com");
	   
	    printContacts(myContacts);
	    
	    System.out.println("Find Name-Johnnie");
	    SelectionSortName(myContacts);
	    int test=findByName(myContacts, "Johnnie");
	    if (test != -1)
           System.out.println("Found: " + myContacts[test]+"\n");
        else
           System.out.println("Not found. \n" );
        
        System.out.println("Find Name- Sam Parker");
        test=findByName(myContacts, "Sam Parker");
	    if (test != -1)
           System.out.println("Found: " + myContacts[test]+"\n");
        else
           System.out.println("Not found. \n" );
           
        System.out.println("Find Relation -friend");
        findByRelation(myContacts, "friend");
        
         System.out.println("Find Relation - aunt");
        findByRelation(myContacts, "aunt");
        
         System.out.println("Find Bday - May");
        findByBMonth(myContacts, "May");
        
         System.out.println("Find Bday - March");
        findByBMonth(myContacts, "March");
        
        System.out.println("Find Phone - (342)555-8989");
        findByPhone(myContacts, "(342)555-8989");
        
        System.out.println("Find Phone - (342)555-7011");
        findByPhone(myContacts, "(342)555-7011");
        
        System.out.println("Find Email- rgoodman@hotmail.com");
        test=findByEmail(myContacts, "rgoodman@hotmail.com");
	    if (test != -1)
           System.out.println("Found: " + myContacts[test]+"\n");
        else
           System.out.println("Not found. \n" );
           
           System.out.println("Find Email- susieE@hotmail.com");
        test=findByEmail(myContacts, "susieE@hotmail.com");
	    if (test != -1)
           System.out.println("Found: " + myContacts[test]+"\n");
        else
           System.out.println("Not found. \n" );
	}
	
	public static void printContacts(Contact[] boo)
    {
        System.out.printf("%16s%16s%16s%16s%25s\n","Name","Relation","Birthday","Phone","Email");
        for (int i=0;i<boo.length;i++)
        System.out.println(boo[i]);
       System.out.println("\n");
    }
    
    public static void SelectionSortName(Contact[] boo)
    {
        int i,k,posmax;
        Contact temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
             
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getName().compareTo(boo[posmax].getName())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }
    
    public static int findByName(Contact[] boo, String name)
    {
        int high = boo.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( boo[probe].getName().compareTo(name) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (boo[low].getName().compareTo(name) == 0 ))
        return low;
        else
        return -1;
    }
    
     public static void findByRelation(Contact[] boo, String relation)
    {
        int found=-1;
         ArrayList<Integer> position=new ArrayList<Integer>();
        
        for(int i=0;i<boo.length;i++)
                if(boo[i].getRelation().compareTo(relation)==0)
                {
                    found=i;
                    position.add(found);
                    

                }
        if( found !=-1)
        {
            for (int n=0;n<position.size();n++)
            System.out.println(boo[position.get(n)]);
           System.out.println("There are "+position.size()+" listings for "+relation);
        }
        else
        System.out.println("There are no listings for "+relation);
        
        System.out.println("\n");
    }
    
    public static void findByBMonth(Contact[] boo, String month)
    {
        int found=-1;
         ArrayList<Integer> position=new ArrayList<Integer>();
        
        for(int i=0;i<boo.length;i++)
                if(boo[i].getBday().substring(0,3).compareTo(month.substring(0,3))==0)
                {
                    found=i;
                    position.add(found);
                    

                }
        if( found !=-1)
        {
            for (int n=0;n<position.size();n++)
            System.out.println(boo[position.get(n)]);
           System.out.println("There are "+position.size()+" listings for "+month);
        }
        else
        System.out.println("There are no listings for "+month);
        
        System.out.println("\n");
    }
    
     public static void findByPhone(Contact[] boo, String phone)
    {
        int found=-1;
         ArrayList<Integer> position=new ArrayList<Integer>();
        
        for(int i=0;i<boo.length;i++)
                if(boo[i].getPhone().compareTo(phone)==0)
                {
                    found=i;
                    position.add(found);
                    

                }
        if( found !=-1)
        {
            for (int n=0;n<position.size();n++)
            System.out.println(boo[position.get(n)]);
           System.out.println("There are "+position.size()+" listings for "+phone);
        }
        else
        System.out.println("There are no listings for "+phone);
        
        System.out.println("\n");
    }
    
    public static void SelectionSortEmail(Contact[] boo)
    {
        int i,k,posmax;
        Contact temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
             
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getEmail().compareTo(boo[posmax].getEmail())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }
    
    public static int findByEmail(Contact[] boo, String email)
    {
        int high = boo.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( boo[probe].getEmail().compareTo(email) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (boo[low].getEmail().compareTo(email) == 0 ))
        return low;
        else
        return -1;
    }
}
