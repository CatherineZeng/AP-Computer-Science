
/**
 * Calculates and prints grades
 * 
 * @Catherine Zeng
 * @4-19-14
 */
public class StudentData
{
    String firstName;
    String lastName;
    double[] testScores;
    double gradeAvg;
    char grade;
    
    StudentData(String firstName,String lastName,double[] testScores)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.testScores=testScores;
    }
    
    public String getFirstName()
    {return firstName;}
    public String getLastName()
    {return lastName;}
    public double getTestScores(int n)
    {return testScores[n];}
    public char getGrade()
    {
        courseGrade(testScores);
        if(gradeAvg<60)
        grade='F';
        else if(gradeAvg<70)
        grade='D';
        else if(gradeAvg<80)
        grade='C';
        else if(gradeAvg<90)
        grade='B';
        else
        grade='A';
        return grade;
    }
    
    public void courseGrade(double[] list)
    {
        String msg="Error: Grade list cannot be empty";
        if (list.length<1)
        {
            throw new IllegalArgumentException(msg);
        }
        int i=0;
        double total=0;
        for (i=0;i<list.length;i++)
        total+=list[i];
        gradeAvg= (double)total/(double)i;
    }
    
    public String toString()
    {
        System.out.printf("%8s %8s", getFirstName(), getLastName());
        
        for (int i=0;i<testScores.length;i++)
        System.out.printf("%8.2f",getTestScores(i));
        
        System.out.printf("%3c", getGrade());
                               
       return "";
    }
    }

