
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Student
{
    // instance variables - replace the example below with your own
    String name;
    int[] boo= new int[5];
    int qz1;
    int qz2;
    int qz3;
    int qz4;
    int qz5;
    Student(String name,int qz1,int qz2, int qz3,int qz4, int qz5)
    {
        this.name=name;
        this.qz1=qz1;
        this.qz2=qz2;
        this.qz3=qz3;
        this.qz4=qz4;
        this.qz5=qz5;
        boo[0]=qz1;
        boo[1]=qz2;
        boo[2]=qz3;
        boo[3]=qz4;
        boo[4]=qz5;
    }
    
    public int getQuiz(int n)
    {
        boo[0]=qz1;
        boo[1]=qz2;
        boo[2]=qz3;
        boo[3]=qz4;
        boo[4]=qz5;
       
        return boo[n-1];
    }
    
    public void setQuiz(int quizNum, int QuizScore)
    {
        boo[quizNum-1]=QuizScore;
    }  
    
    public String toString()
    {
        System.out.printf("%20s %8d %8d %8d %8d %8d ", name,boo[0],boo[1],boo[2],boo[3],boo[4]);
        return "";
    }
}
