/**
 *Catherine Zeng 
 *7/4/13
 *
 *This program calculated the average of 4 test grades.
 *
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
     //heading
     System.out.println("Calculating grade averages from 4 test scores");
     System.out.println("*********************************************");
     System.out.println("");
        
     //local variables 
     int numTests = 0; //counts number of tests
     int testGrade = 0; //individual test grade
     int totalPoints = 0; //total points for all tests
     double average = 0.0; //average grade
     
     //calculation for 1st test grade
     numTests++;
     testGrade=97;
     totalPoints+=testGrade;
     average=(double)totalPoints/numTests;
     System.out.print("n = "+numTests+"   New Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score:" +average);
     System.out.println("");
     
     //calculations for 2nd test grade
     numTests++;
     testGrade=79;
     totalPoints+=testGrade;
     average=(double)totalPoints/numTests;
     System.out.print("n = "+numTests+"   New Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score:" +average);
     System.out.println("");
     
     //calculation for 3rd test grade
     numTests++;
     testGrade=83;
     totalPoints+=testGrade;
     average=(double)totalPoints/numTests;
     System.out.print("n = "+numTests+"   New Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score:" +average);
     System.out.println("");
     
     //calculation for 4th test grade
     numTests++;
     testGrade=88;
     totalPoints+=testGrade;
     average=(double)totalPoints/numTests;
     System.out.print("n = "+numTests+"   New Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score:" +average);
     System.out.println("");
     System.out.println("");
     
     //processing 4 more tests with grades of my choice
     //local variables 
     System.out.println("Processing 4 more tests with grades of my choice");
     System.out.println("");
     int numTests2 = 0; //counts number of tests
     int testGrade2 = 0; //individual test grade
     int totalPoints2 = 0; //total points for all tests
     double average2 = 0.0; //average grade
     
     //calculation for 1th test grade
     numTests2++;
     testGrade2=56;
     totalPoints2+=testGrade2;
     average2=(double)totalPoints2/numTests2;
     System.out.print("n = "+numTests2+"   New Test Grade: "+testGrade2+"   Total Points: "+totalPoints2+"   Average Score:" +average2);
     System.out.println("");
     
     //calculation for 2nd test grade
     numTests2++;
     testGrade2=78;
     totalPoints2+=testGrade2;
     average2=(double)totalPoints2/numTests2;
     System.out.print("n = "+numTests2+"   New Test Grade: "+testGrade2+"   Total Points: "+totalPoints2+"   Average Score:" +average2);
     System.out.println("");
     
     //calculation for 3rd test grade
     numTests2++;
     testGrade2=99;
     totalPoints2+=testGrade2;
     average2=(double)totalPoints2/numTests2;
     System.out.print("n = "+numTests2+"   New Test Grade: "+testGrade2+"   Total Points: "+totalPoints2+"   Average Score:" +average2);
     System.out.println("");
     
     //calculation for 4th test grade
     numTests2++;
     testGrade2=87;
     totalPoints2+=testGrade2;
     average2=(double)totalPoints2/numTests2;
     System.out.print("n = "+numTests2+"   New Test Grade: "+testGrade2+"   Total Points: "+totalPoints2+"   Average Score:" +average2);
     System.out.println("");
     

     
    } // end of main method
} // end of class