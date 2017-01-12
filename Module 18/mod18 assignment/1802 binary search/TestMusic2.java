
/**
 * Tests music class by sequential search
 * 
 * @Catherine Zeng
 * @4-10-14
 */
import java.util.ArrayList;
public class TestMusic2
{
   public static void main(String[] args)
	{
	    Music[] myMusic = new Music[10];
	    
	    myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
	    myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
	    myMusic[2] = new Music("What If It's You", 1995, "Reba McEntire");
	    myMusic[3] = new Music("Misunderstood",2001, "Pink");
	    myMusic[4] = new Music("Laundry Service",2001, "Shakira");
	    myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
	    myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
	    myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
	    myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
	    myMusic[9] = new Music("White Flag", 2004, "Dido");
	    
	    printMusic(myMusic);
	    
	    System.out.println("Search - Title - Misunderstood");
	    SelectionSortTitles(myMusic);
	    int test=searchTitle(myMusic, "Misunderstood");
	    if (test != -1)
           System.out.println("Found: " + myMusic[test]+"\n");
        else
           System.out.println("Not found. \n" );
           
        System.out.println("Search - Title - Under Paid");
        test=searchTitle(myMusic, "Under Paid");
	    if (test != -1)
           System.out.println("Found: " + myMusic[test]+"\n");
        else
           System.out.println("Not found. \n" );
        
        SelectionSortYears(myMusic);
        System.out.println("Search - Year - 2005");
        test=searchYear(myMusic, 2005);
	    if (test != -1)
           System.out.println("Found: " + myMusic[test]+"\n");
        else
           System.out.println("Not found. \n" );
           
        System.out.println("Search - Year - 2006");
        test=searchYear(myMusic, 2006);
	    if (test != -1)
           System.out.println("Found: " + myMusic[test]+"\n");
        else
           System.out.println("Not found. \n" );
           
        SelectionSortSinger(myMusic);
        System.out.println("Search - Singer - Darth Maul");
        test=searchSinger(myMusic, "Darth Maul");
	    if (test != -1)
           System.out.println("Found: " + myMusic[test]+"\n");
        else
           System.out.println("Not found. \n" );
           
        System.out.println("Search - Singer - Dido");
        test=searchSinger(myMusic, "Dido");
	    if (test != -1)
           System.out.println("Found: " + myMusic[test]+"\n");
        else
           System.out.println("Not found. \n" );
	    
	}
	
	public static void printMusic(Music[] boo)
    {
        System.out.printf("Music Library:\n");
        for (int i=0;i<boo.length;i++)
        System.out.println(boo[i]);
       System.out.println("\n");
    }
    
    
    public static void SelectionSortTitles(Music[] boo)
    {
        int i,k,posmax;
        Music temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
             
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getTitle().compareTo(boo[posmax].getTitle())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }
    
     public static void SelectionSortSinger(Music[] boo)
    {
        int i,k,posmax;
        Music temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
             
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getSinger().compareTo(boo[posmax].getSinger())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }
    
     public static void SelectionSortYears(Music[] boo)
    {
        int i,k,posmax;
        Music temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
             
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getYear()<boo[posmax].getYear())
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
        }
    }

     public static int searchTitle(Music[] boo, String title)
    {
        int high = boo.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( boo[probe].getTitle().compareTo(title) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (boo[low].getTitle().compareTo(title) == 0 ))
        return low;
        else
        return -1;
    }
    
    public static int searchSinger(Music[] boo, String singer)
    {
        int high = boo.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( boo[probe].getSinger().compareTo(singer) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (boo[low].getSinger().compareTo(singer) == 0 ))
        return low;
        else
        return -1;
    }
    
    public static int searchYear(Music[] boo, int year)
    {
       int high = boo.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( boo[probe].getYear()<year)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (boo[low].getYear()==year ))
        return low;
        else
        return -1;
    }

}
