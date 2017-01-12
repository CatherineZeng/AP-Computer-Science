
/**
 * Prints random information using arraylist
 * 
 * @Catherine Zeng
 * @3-17-14
 */
import java.util.ArrayList;
public class TestCandidate8
{
    public static void main(String[] args)
    {
        ArrayList<Candidate> boo= new ArrayList<Candidate>();
        boo.add(new Candidate("John Smith", 5000));
        boo.add(new Candidate("Mary Miller", 4000));
        boo.add(new Candidate("Michael Duffy", 6000));
        boo.add(new Candidate("Tim Robinson", 2500));
        boo.add(new Candidate("Joe Ashtony", 1800));
        boo.add(new Candidate("Mickey Jones",3000));
        boo.add(new Candidate("Rebecca Morgan", 2000));
        boo.add(new Candidate("Kathleen Turner", 8000));
        boo.add(new Candidate("Tory Parker", 500));
        boo.add(new Candidate("Ashton Davis", 10000));
        
        System.out.println("Original results: \n");
        printResults(boo);
        System.out.println("Deleted location 6: \n");
        deleteByLoc(boo,6);
        printResults(boo);
        System.out.println("Deleted Kathleen Turner \n");
        deleteByName(boo,"Kathleen Turner");
        printResults(boo);
    }
    
    public static void deleteByLoc(ArrayList<Candidate> boo, int location)
    {
        boo.remove(location);
    }
    
    public static void deleteByName(ArrayList<Candidate> boo, String name)
    {
        int location=0;
        int i;
        
        for (i=0; i<boo.size(); i++)
        {
            if (boo.get(i).getName().equals(name))
            {
                location=i;
                break;
            }
        }
        
        if (i!=boo.size())
        boo.remove(location);
    }
    
     public static void insertPosition(ArrayList<Candidate> boo, int position, String name, int votes)
    {
        boo.add(position, new Candidate(name, votes));
    }
    
    public static void insertCandidate(ArrayList<Candidate> boo, String findName, String name, int votes)
    {
        int location=0;
        for (int i=0;i<boo.size();i++)
        {
            if (boo.get(i).getName().equals(findName))
            location=i;
        }
        
        boo.add(location, new Candidate(name, votes));
        }
    
    public static void replaceName(ArrayList<Candidate> boo, String name, String replace)
    {
        for (int i=0;i<boo.size();i++)
        if(boo.get(i).getName().equals(name))
        boo.get(i).setName(replace);
    }
    
    public static void replaceVotes(ArrayList<Candidate> boo, String name, int replacedVotes)
    {
        for(int i=0;i<boo.size();i++)
        if (boo.get(i).getName().equals(name))
        boo.get(i).setVotes(replacedVotes);
    }
    
      public static void replaceCandidate(ArrayList<Candidate> boo, String name, String replacementName, int replacementVotes)
    {
        for (int i=0;i<boo.size();i++)
        {
           if (boo.get(i).getName().equals(name))
        {
            boo.get(i).setName(replacementName);
            boo.get(i).setVotes(replacementVotes);
        
        }
      }
   }
    
    public static void printVotes(ArrayList<Candidate> boo)
    {
        for (int n=0; n<boo.size();n++)
        System.out.println(boo.get(n));
    }
    
    public static int getTotal(ArrayList<Candidate> boo)
    {
        int n=0;
        for (int i=0; i<boo.size();i++)
        n+=(boo.get(i)).getNumVotes();
        return n;
    }
    
    public static void printResults(ArrayList<Candidate> boo)
    {
        System.out.printf("%20s %20s %28s \n","Candidate", "Total", "Percentage of Total Votes");
        for (int i=0; i<boo.size();i++)
        {
           System.out.printf("%20s %20d %13.2f\n",(boo.get(i)).getName(), 
                                                (boo.get(i)).getNumVotes(),
                                                 (double) (   (  boo.get(i)  ).getNumVotes()  )/(double)getTotal(boo)  );
                                         
        }
         System.out.println("\n Total number of votes in election: "+getTotal(boo)+"\n\n");
    }
}
