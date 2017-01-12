
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test
{
    public static void main( String[] args)
    {

        /*ArrayList<MusicMedia> catalog= MakeMusicCatalog(100);
        for ( MusicMedia m:catalog)
           System.out.println(m);
           
        /*ArrayList<Bin> warehouse= new ArrayList<Bin>();
        Bin a=new Bin("A");
        Bin b=new Bin("B");
        warehouse.add(a);
        warehouse.add(b);
        a.add( new BinItem("1234-0",500));
        a.add( new BinItem("1234-1", 25));
        a.add( new BinItem("1234-2", 7720));
        a.add( new BinItem("1234-3", 1000));
        
        for ( Bin bn : warehouse)
        System.out.println(bn);
        */
       
       /* ArrayList<MusicMedia> catalog= MakeMusicCatalog(10);
        BinItem a= new BinItem("1234-3",500);
        BinItem b= new BinItem("9999-9", 2400);
        System.out.println(lookupMedia(catalog, a.getSKU()));
        System.out.println(lookupMedia(catalog, b.getSKU()));
        */
        
        ArrayList<MusicMedia> catalog = MakeMusicCatalog( 10 );
        ArrayList<Bin> warehouse = new ArrayList<Bin>();
        Bin a = new Bin( "A" );
        Bin b = new Bin( "B" );
        warehouse.add( a );
        warehouse.add( b );
        a.add( new BinItem( "1234-0", 500 ) );
        a.add( new BinItem( "1234-1", 25 ) );
        a.add( new BinItem( "1234-2", 7720 ) );
        b.add( new BinItem( "1234-3", 1000 ) );
        
        System.out.println(detailedInventory(catalog, warehouse));
        
        
    }
    
    public static String detailedInventory( ArrayList<MusicMedia> catalog, 
    ArrayList<Bin> warehouse )
    {
      String s = "";
       for (Bin b:warehouse)
       {
           s+="Bin"+b.getName()+":\n";
           for (int i=0; i<=(catalog.size()-1); i++)
           {
               s+=catalog.get(i).toString()+", "+catalog.get(i).getSKU() +": "+b.getContents().get(i)+"\n";
            }
            s+="\n";
        }
      return s;
    } 

    
     public static String lookupMedia( ArrayList<MusicMedia> catalog, String sku)
    {
        for (MusicMedia m:catalog)
        {
            if (m.getSKU().equals(sku))
            {
                return m.getMediaType();
            }
        }
        return "SKU not in catalog";
    }
    
    
    public static ArrayList<MusicMedia> MakeMusicCatalog( int size)
    {
        String[] titles=
        {
            "Greatest Hits Volume 1", "Greatest Hits Volume 2",
            "The Best Of", "Love Songs",
            "The Early Years", "The Later Years"
        };
        
        String[] artists=
        {
            "Michael Jackson", "Eminem",
            "The Beatles", "Shania Twain",
            "Limp Bizkit"
        };
        
        ArrayList<MusicMedia> a= new ArrayList<MusicMedia>();
        Random rn=new Random();
        
        for (int i=0;i<size;i++)
        {
            MusicMedia m;
            
            int mediatype= rn.nextInt(3);
            String title= titles[rn.nextInt(titles.length)];
            String artist= artists[rn.nextInt(artists.length)];
            String sku ="1234-"+i;
            if ( mediatype==0)
                m= new CompactDisk(title, artist, sku);
            else if ( mediatype==1)
                m= new DigitalVideoDisk(title, artist, sku);
            else
                m= new CassetteTape( title, artist, sku);
            
            a.add(m);
        }
        return a;
    }
}
