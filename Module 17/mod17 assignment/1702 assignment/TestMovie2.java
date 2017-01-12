
/**
 * This sorts movies according to title year or studio
 * 
 * @Catherine Zeng
 * @4-5-14
 */

public class TestMovie2 
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
        boo=sortTitles(boo,1);
        printMovies(boo);
        
        System.out.println("Sorted by Year- descending");
        boo=sortYears(boo,2);
        printMovies(boo);
        
        System.out.println("Sorted by Studio-ascending:");
        boo=sortStudios(boo,1);
        printMovies(boo);
        
        
    }
    
    public static void printMovies(Movie2[] boo)
    {
        for (int i=0;i<boo.length;i++)
        System.out.println(boo[i]);
       System.out.println("\n");
    }

    public static Movie2[] sortStudios(Movie2[] boo, int way)
    {
        Movie2[] dest=new Movie2[boo.length];
      
        
        for (int i=0;i<boo.length;i++)
        {
            Movie2 next=boo[i];
            int insertindex=0;
            int k=i;
             
               while (k>0 && insertindex==0 && way==1)
               {
                    if ( (next.getStudio()).compareToIgnoreCase(  dest[k-1].getStudio() )   >0)
                    {
                       insertindex=k;
                    }
                    else 
                    {
                    dest[k]=dest[k-1];
                   }
                   k--;
               }
                
               while (k>0 && insertindex==0 && way==2)
               {
                    if ((next.getStudio()).compareTo(  dest[k-1].getStudio() ) <0)
                    {
                       insertindex=k;
                    }
                    else 
                    {
                    dest[k]=dest[k-1];
                   }
                   k--;
                }
             dest[insertindex]=next;
           }
           return dest;
        }
        
    public static Movie2[] sortTitles(Movie2[] boo, int way)
    {
        Movie2[] dest=new Movie2[boo.length];
      
        
        for (int i=0;i<boo.length;i++)
        {
            Movie2 next=boo[i];
            int insertindex=0;
            int k=i;
             
               while (k>0 && insertindex==0 && way==1)
               {
                    if ( (next.getTitle()).compareToIgnoreCase(  dest[k-1].getTitle() )   >0)
                    {
                       insertindex=k;
                    }
                    else 
                    {
                    dest[k]=dest[k-1];
                   }
                   k--;
               }
                
               while (k>0 && insertindex==0 && way==2)
               {
                    if ((next.getTitle()).compareTo(  dest[k-1].getTitle() ) <0)
                    {
                       insertindex=k;
                    }
                    else 
                    {
                    dest[k]=dest[k-1];
                   }
                   k--;
                }
             dest[insertindex]=next;
           }
           return dest;
        }
        
     public static Movie2[] sortYears(Movie2[] boo, int way)
     {
         Movie2[] dest=new Movie2[boo.length];
      
        
        for (int i=0;i<boo.length;i++)
        {
            Movie2 next=boo[i];
            int insertindex=0;
            int k=i;
             
               while (k>0 && insertindex==0 && way==1)
               {
                    if ( next.getYear()>dest[k-1].getYear() )
                    {
                       insertindex=k;
                    }
                    else 
                    {
                    dest[k]=dest[k-1];
                   }
                   k--;
               }
                
               while (k>0 && insertindex==0 && way==2)
               {
                    if (next.getYear()<dest[k-1].getYear() )
                    {
                       insertindex=k;
                    }
                    else 
                    {
                    dest[k]=dest[k-1];
                   }
                   k--;
                }
             dest[insertindex]=next;
           }
           return dest;
    }
}
    
    

