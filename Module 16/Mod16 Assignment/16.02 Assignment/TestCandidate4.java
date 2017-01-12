
/**
 * Prints random information using arraylist
 * 
 * @Catherine Zeng
 * @3-17-14
 */
import java.util.ArrayList;
public class TestCandidate4
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
        System.out.println("Changing Michael Duffy to John Elmos: \n");
        replaceName(boo,"Michael Duffy", "John Elmos");
        printResults(boo);
        System.out.println("Changing Mickey Jones votes to 2500");
        replaceVotes(boo,"Mickey Jones", 2500);
        printResults(boo);
        System.out.println("Replacing Kathleen Turned with John Kennedy:");
        replaceCandidate(boo, "Kathleen Turner", "John Kennedy",8500);
        printResults(boo);
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
        System.out.printf("%13s %13s %28s \n","Candidate", "Total", "Percentage of Total Votes");
        for (int i=0; i<boo.size();i++)
        {
           System.out.printf("%13s %13d %13.2f\n",(boo.get(i)).getName(), 
                                                (boo.get(i)).getNumVotes(),
                                                 (double) (   (  boo.get(i)  ).getNumVotes()  )/(double)getTotal(boo)  );
                                         
        }
         System.out.println("\n Total number of votes in election: "+getTotal(boo)+"\n\n");
    }
}
