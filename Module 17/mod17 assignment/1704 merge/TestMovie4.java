
/**
 * This arranges movies based on merge algorithm
 * 
 * @Catherine Zeng
 * @4-7-14
 */
public class TestMovie4
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
        
        System.out.println("Sorted by Title-ascending:");
        sortTitles(boo,0,boo.length-1);
        printMovies(boo);
        
        System.out.println("Sorted by year -descending");
        sortYears(boo,0,boo.length-1);
        printMovies(boo);
        
        System.out.println("Sorted by Studio- ascending");
        sortStudios(boo,0,boo.length-1);
        printMovies(boo);
        
	}
	
	public static void printMovies(Movie2[] boo)
    {
        for (int i=0;i<boo.length;i++)
        System.out.println(boo[i]);
       System.out.println("\n");
    }
    public static void mergeTitles(Movie2[] boo, int low, int mid, int high)
    {
        Movie2[] temp=new Movie2[high-low+1];
        int i=low, j=mid+1, n=0;
        
        while(i<=mid || j<=high)
        {
            if(i>mid)
            {
                temp[n]=boo[j];
                j++;
            }
            else if (j>high)
            {
                temp[n]=boo[i];
                i++;
            }
            else if (boo[i].getTitle().compareTo(boo[j].getTitle())<0)
            {
                temp[n]=boo[i];
                i++;
            }
            else
            {
                temp[n]=boo[j];
                j++;
            }
            n++;
        }
        
        for (int k=low;k<=high;k++)
        boo[k]=temp[k-low];
    }
    
    public static void sortTitles(Movie2[] boo,int low, int high)
    {
        if (low==high)
        return;
        
        int mid=(low+high)/2;
        sortTitles(boo,low,mid);
        sortTitles(boo,mid+1,high);
        mergeTitles(boo,low,mid,high);
    }
    
    public static void mergeYears(Movie2[] boo, int low, int mid, int high)
    {
        Movie2[] temp = new Movie2[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = boo[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = boo[ i ];
                i++;
            }
            else if ( boo[ i ].getYear() > boo[ j ].getYear() )
            {
                temp[ n ] = boo[ i ];
                i++;
            }
            else
            {
                temp[ n ] = boo[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            boo[ k ] = temp[ k - low ];
        }
    
    
    public static void sortYears(Movie2[] boo,int low, int high)
    {
        if (low==high)
        return;
        
        int mid=(low+high)/2;
        sortYears(boo,low,mid);
        sortYears(boo,mid+1,high);
        mergeYears(boo,low,mid,high);
    }
    
    public static void mergeStudios(Movie2[] boo, int low, int mid, int high)
    {
        Movie2[] temp=new Movie2[high-low+1];
        int i=low, j=mid+1, n=0;
        
        while(i<=mid || j<=high)
        {
            if(i>mid)
            {
                temp[n]=boo[j];
                j++;
            }
            else if (j>high)
            {
                temp[n]=boo[i];
                i++;
            }
            else if (boo[i].getStudio().compareTo(boo[j].getStudio())<0)
            {
                temp[n]=boo[i];
                i++;
            }
            else
            {
                temp[n]=boo[j];
                j++;
            }
            n++;
        }
        
        for (int k=low;k<=high;k++)
        boo[k]=temp[k-low];
    }
    
    public static void sortStudios(Movie2[] boo,int low, int high)
    {
        if (low==high)
        return;
        
        int mid=(low+high)/2;
        sortStudios(boo,low,mid);
        sortStudios(boo,mid+1,high);
        mergeStudios(boo,low,mid,high);
    }
    }

