
/**
 * This arranges movies based on selection algorithm
 * 
 * @Catherine Zeng
 * @4-5-14
 */
public class TestMovie3
{
   public static void main(String[] args)
	{
	    Movie2[] boo=new Movie2[10];
        boo[0]=new Movie2("The Muppets Take Manhattan",2001,"Columbia Tristar");
        boo[1]=new Movie2("Mulan Special Edition",2004, "Disney");
        boo[2]=new Movie2("Shrek 2",2004,"Dreamworks");
        boo[3]=new Movie2("The Incredibles",2004,"Pixar");
        boo[4]=new Movie2("Nanny McPhee",2006,"Universal");
        boo[5]=new Movie2("The Curse of the Were-Rabbit",2006,"Aardman");
        boo[6]=new Movie2("Ice Age",2002, "20th Century Fox");
        boo[7]=new Movie2("Lilo & Stitch",2002,"Disney");
        boo[8]=new Movie2("Robots",2005,"20th Century Fox");
        boo[9]=new Movie2("Monsters Inc",2001,"Pixar");   
        
	    System.out.println("Before Sorting:");
        printMovies(boo);
        
        System.out.println("Sort by Title- ascending:");
        sortTitles(boo,1);
        printMovies(boo);

        
        System.out.println("Sorted by Year- descending");
        sortYears(boo,2);
        printMovies(boo);
        
        System.out.println("Sorted by Studio-ascending:");
        sortStudios(boo,1);
        printMovies(boo);
        
        
	}
	
	public static void printMovies(Movie2[] boo)
    {
        for (int i=0;i<boo.length;i++)
        System.out.println(boo[i]);
       System.out.println("\n");
    }
    
    public static void sortYears(Movie2[] boo,int way)
    {
        int i,k,posmax,posmin;
        Movie2 temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
            posmin=0;
            if(way==1)
            {
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getYear()>boo[posmax].getYear())
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
           }
           
           if(way==2)
            {
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getYear()<boo[posmin].getYear())
                    posmin=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmin];
            boo[posmin]=temp;
           }

        }
    }
    
    public static void sortStudios(Movie2[] boo,int way)
    {
        int i,k,posmax,posmin;
        Movie2 temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
            posmin=0;
            if(way==1)
            {
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getStudio().compareTo(boo[posmax].getStudio())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
           }
           
           if(way==2)
            {
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getStudio().compareTo(boo[posmin].getStudio())<0)
                    posmin=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmin];
            boo[posmin]=temp;
           }

        }
    }
    
    public static void sortTitles(Movie2[] boo,int way)
    {
        int i,k,posmax,posmin;
        Movie2 temp;
        
        for (i=boo.length-1;i>=0;i--)
        {
            posmax=0;
            posmin=0;
            if(way==1)
            {
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getTitle().compareTo(boo[posmax].getTitle())>0)
                    posmax=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmax];
            boo[posmax]=temp;
           }
           
           if(way==2)
            {
               
            for(k=0;k<=i;k++)
            {
                    if (boo[k].getTitle().compareTo(boo[posmin].getTitle())<0)
                    posmin=k;   
            }
            
            temp=boo[i];
            boo[i]=boo[posmin];
            boo[posmin]=temp;
           }

        }
    }
}
