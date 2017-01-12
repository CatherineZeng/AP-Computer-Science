
/**
 * Tests grades
 * @Catherine Zeng
 * @4-19-14
 */
public class TestProgStudentData
{
    public static void main (String[] args)
   {
       double[] gradeJohn={89.00,78.00,95.00,63.00,94.00};
       StudentData John=new StudentData("John","Doe",gradeJohn);
       double[] gradeLindsay={88.00,90.00,100.00,88.00,90.00,100.00};
       StudentData Lindsay=new StudentData("Lindsay","Green",gradeLindsay);
       double[] gradeError={};
       StudentData Error=new StudentData("Error","Booboo",gradeError);
       
       System.out.println(John);
       System.out.println(Lindsay);
       System.out.println(Error);
   }
}
