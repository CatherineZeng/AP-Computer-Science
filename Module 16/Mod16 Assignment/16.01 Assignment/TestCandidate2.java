
/**
 * Prints random information using arraylist
 * 
 * @Catherine Zeng
 * @3-17-14
 */
import java.util.ArrayList;
public class TestCandidate2
{
    public static void main(String[] args)
    {
        ArrayList<Candidate> boo= new ArrayList<Candidate>();
        boo.add(new Candidate("John Smith", 5000));
        boo.add(new Candidate("Mary Miller", 4000));
        boo.add(new Candidate("Michael Duffy", 6000));
        boo.add(new Candidate("Tim Robinson", 2500));
        boo.add(new Candidate("Joe Ashtony", 1800));
        
        System.out.println("Results per candidate: \n_________________");
        printVotes(boo);
        System.out.println("\n\n");
        printResults(boo);
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
    }
}
