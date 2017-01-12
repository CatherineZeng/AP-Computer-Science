
/**
 * Tests music class by sequential search
 * 
 * @Catherine Zeng
 * @4-10-14
 */
import java.util.ArrayList;
public class TestMusic
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
	    
	    System.out.println("Search - Title - Let Go");
	    searchTitle(myMusic,"Let Go");
	    
	    System.out.println("Search - Title - Some Day");
	    searchTitle(myMusic,"Some Day");
	    
	    System.out.println("Search - Year - 2001");
	    searchYear(myMusic,2001);
	    
	    System.out.println("Search - Year - 2003");
	    searchYear(myMusic,2003);
	    
	    System.out.println("Search - Singer - Avril Lavigne");
	    searchSinger(myMusic, "Avril Lavigne");
	    
	     System.out.println("Search - Singer - Tony Curtis");
	    searchSinger(myMusic, "Tony Curtis");
	}
	
	public static void printMusic(Music[] boo)
    {
        System.out.printf("Music Library:");
        for (int i=0;i<boo.length;i++)
        System.out.println(boo[i]);
       System.out.println("\n");
    }
    
    public static void searchTitle(Music[] boo, String title)
    {
        int found=-1;
        
        
        for(int i=0;i<boo.length;i++)
                if(boo[i].getTitle().compareTo(title)==0)
                {
                    found=i;
                    break;
                }
        if( found !=-1)
        {
            System.out.println("We have found "+title+" in the library:");
            System.out.println(boo[found]+"\n");
        }
        else
        System.out.println(title+" is not found in the library \n");
    }
    
    public static void searchSinger(Music[] boo, String singer)
    {
        int found=-1;
         ArrayList<Integer> position=new ArrayList<Integer>();
        
        for(int i=0;i<boo.length;i++)
                if(boo[i].getSinger().compareTo(singer)==0)
                {
                    found=i;
                    position.add(found);
                    

                }
        if( found !=-1)
        {
            for (int n=0;n<position.size();n++)
            System.out.println(boo[position.get(n)]);
           System.out.println("There are "+position.size()+" listings for "+singer);
        }
        else
        System.out.println("There are no listings for "+singer);
        
        System.out.println("\n");
    }
    
    public static void searchYear(Music[] boo, int year)
    {
        int found=-1;
        ArrayList<Integer> position=new ArrayList<Integer>();
        System.out.println("Find Results");
        for(int i=0;i<boo.length;i++)
                if(boo[i].getYear()==year)
                {
                    found=i;
                    position.add(found);
                }
        if( found !=-1)
        {
            for (int n=0;n<position.size();n++)
            System.out.println(boo[position.get(n)]);
            
            System.out.println("There are "+position.size()+" listings for "+year);
        }
        else
        System.out.println("There are no listings for "+year);
        
        System.out.println("\n");
    }

}
