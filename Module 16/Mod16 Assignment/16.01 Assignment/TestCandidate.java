
/**
 * Prints random information using array
 * 
 * @Catherine Zeng
 * @3-17-14
 */
public class TestCandidate
{
    public static void main(String[] args)
    {
        Candidate[] boo= new Candidate[5];
        boo[0]= (new Candidate("John Smith", 5000));
        boo[1]=(new Candidate("Mary Miller", 4000));
        boo[2]=(new Candidate("Michael Duffy", 6000));
        boo[3]= (new Candidate("Tim Robinson", 2500));
        boo[4]=(new Candidate("Joe Ashtony", 1800));
        
        System.out.println("Results per candidate: \n_________________");
        printVotes(boo);
        System.out.println("\n\n");
        printResults(boo);
    }
    
    public static void printVotes(Candidate[]boo)
    {
        for (int n=0; n<boo.length;n++)
        System.out.println(boo[n]);
    }
    
    public static int getTotal(Candidate[]boo)
    {
        int n=0;
        for (int i=0; i<boo.length;i++)
        n+=(boo[i]).getNumVotes();
        return n;
    }
    
    public static void printResults(Candidate[]boo)
    {
        System.out.printf("%13s %13s %28s \n","Candidate", "Total", "Percentage of Total Votes");
        for (int i=0; i<boo.length;i++)
        {
           System.out.printf("%13s %13d %13.2f\n",(boo[i]).getName(), 
                                                (boo[i]).getNumVotes(),
                                                 (double) (   (  boo[i]  ).getNumVotes()  )/(double)getTotal(boo)  );
                                         
        }
    }
}
