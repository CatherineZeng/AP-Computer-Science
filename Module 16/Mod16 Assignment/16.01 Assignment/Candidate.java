
/**
 * Shows candidates and votes
 * 
 * @3-17-14
 * @Catherine Zeng
 */
public class Candidate
{
    String name;
    int numVotes;
    
    public Candidate(String name, int numVotes)
    {
        this.name=name;
        this.numVotes=numVotes;
    }
    
    public int getNumVotes()
    {
        return numVotes;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return name+" received "+numVotes +" votes.";
    }
    
}
