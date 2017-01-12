
/**
 * Prints random information using array
 * 
 * @Catherine Zeng
 * @3-17-14
 */
public class TestCandidate7
{
    public static void main(String[] args)
    {
        Candidate[] boo= new Candidate[10];
        boo[0]= (new Candidate("John Smith", 5000));
        boo[1]=(new Candidate("Mary Miller", 4000));
        boo[2]=(new Candidate("Michael Duffy", 6000));
        boo[3]= (new Candidate("Tim Robinson", 2500));
        boo[4]=(new Candidate("Joe Ashtony", 1800));
        boo[5]=(new Candidate("Mickey Jones", 3000));
        boo[6]=(new Candidate("Rebecca Morgan", 2000));
        boo[7]=(new Candidate("Kathleen Turner", 8000));
        boo[8]=(new Candidate("Tory Parker", 500));
        boo[9]=(new Candidate("Ashton Davis", 10000));
        
        System.out.println("Original results: \n");
        printResults(boo);
        System.out.println("Deleted location 6: \n");
        deleteByLoc(boo,6);
        printResults(boo);
        System.out.println("Deleted Kathleen Turner \n");
        deleteByName(boo,"Kathleen Turner");
        printResults(boo);
        
    }
    
    public static void deleteByLoc(Candidate[] boo,int location)
    {
        if ((location>0)&&(location<boo.length))
        {
            for (int i=location; i<boo.length-1; i++)
            boo[i]=boo[i+1];
            
            boo[boo.length-1]=null;
        }
    }
    
   public static void deleteByName(Candidate[]boo, String name)
   {
       int location=0;
       int i;
       
       for (i=0;i<boo.length;i++)
       { 
           if ((boo[i]!=null)&&(boo[i].getName().equals(name)))
          { 
           location=i;
           break;
          }
          else if (boo[i]==null)
          {
              location=-1;
              break;
            }
        }
    
        if((i!=boo.length)&&(location>=0))
        {
            for(i=location; i<boo.length-1;i++)
            boo[i]=boo[i+1];
            boo[boo.length-1]=null;
        }
    }
  
    
    public static void insertPosition(Candidate[]boo, int position, String name, int votes)
    {
        for( int i=boo.length-1;i>position;i--)
        boo[i]=boo[i-1];
        
        boo[position]=new Candidate(name, votes);
    }
    
    public static void insertCandidate(Candidate[] boo, String findName, String name, int votes)
    {
        int location=0;
        for (int i=0;i<boo.length;i++)
        {
            if (boo[i].getName().equals(findName))
            location=i;
        }
        
        for (int i=boo.length-1;i>location;i--)
         boo[i]=boo[i-1];
         
        boo[location]= new Candidate(name, votes);
        }
        
    
    public static void replaceName(Candidate[] boo, String name, String replace)
    {
        for (int i=0;i<boo.length;i++)
        if(boo[i].getName().equals(name))
        boo[i].setName(replace);
    }
    
    public static void replaceVotes(Candidate[] boo, String name, int replacedVotes)
    {
        for(int i=0;i<boo.length;i++)
        if (boo[i].getName().equals(name))
        boo[i].setVotes(replacedVotes);
    }
    
    public static void replaceCandidate(Candidate[] boo, String name, String replacementName, int replacementVotes)
    {
        for (int i=0;i<boo.length;i++)
        {
           if (boo[i].getName().equals(name))
        {
            boo[i].setName(replacementName);
            boo[i].setVotes(replacementVotes);
        
        }
      }
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
        {
            if (boo[i]==null)
                n+=0;
            else
                n+=(boo[i]).getNumVotes();
        
       }
       return n; 
    }
    
    public static void printResults(Candidate[]boo)
    {
        System.out.printf("%20s %20s %28s \n","Candidate", "Total", "Percentage of Total Votes");
        for (int i=0; i<boo.length;i++)
        {
            if(boo[i]!=null)
            {
             System.out.printf("%20s %20d %13.2f\n",(boo[i]).getName(), 
                                                (boo[i]).getNumVotes(),
                                                 (double) (   (  boo[i]  ).getNumVotes()  )/(double)getTotal(boo)  );
            }
                                         
        }
        System.out.println("\n Total number of votes in election: "+getTotal(boo)+"\n\n");
    }
}
