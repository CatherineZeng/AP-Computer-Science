
/**
 * This program calculates the distance of shoots with regard o MPH and angle degree
 * 
 * @Catherine Zeng
 * @12-29-13
 */
import java.util.ArrayList;
public class CatapultTester
{
   public static void main(String[] args)
   {
    
       //declare variables
    int mphData[]={20,25,30,35,40,45,50};
    int angleData[]={25,30,35,40,45,50};
    ArrayList <Catapult> data= new ArrayList <Catapult>();
   
    //add calculated data to arraylist data
   for(int i=0; i< angleData.length;i++)
   {
       for (int n=0; n<mphData.length;n++)
       {
           data.add(new Catapult(mphData[n],angleData[i]));
        }
   }
   
   for(Catapult dataRecord : data)
       {
           dataRecord.calcDistance();
       }
        
   System.out.printf("%40s \n", "Projectile Distance(ft)");
   System.out.printf("%1s %15s %15s %15s %15s %15s %15s \n","MPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
   for (int n=0; n<mphData.length;n++)
   {
   System.out.printf("%1d %15.1f %15.1f %15.1f %15.1f %15.1f %15.1f\n",mphData[n], data.get(6*n+0).getDistance(), data.get(6*n+1).getDistance(), data.get(6*n+2).getDistance(), 
                     data.get(6*n+3).getDistance(), data.get(6*n+4).getDistance(), data.get(6*n+5).getDistance());
  }
}
}
   
   
