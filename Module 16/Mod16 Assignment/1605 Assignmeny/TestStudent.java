
/**
 * Write a description of class TestStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class TestStudent
{
    public static void main(String[] args)
    {
        ArrayList<Student> boo= new ArrayList<Student>();
        boo.add(new Student("Mark Kennedy", 70,80,90,100,90));
        boo.add(new Student("Max Gerard", 80,85,90,85,80));
        boo.add(new Student("Jean Smith", 50,79,89,99,100));
        boo.add(new Student("Betty Farm", 85,80,85,88,89));
        boo.add(new Student("Dilbert Gamma", 70,70,90,70,80));
        
        System.out.println("Starting Gradebook");
        printBook(boo);
        System.out.println("Changing Betty's name to Betty Boop");
        replaceName(boo, "Betty Farm","Betty Boop");
        printBook(boo);
        System.out.println("Changing Jean's quiz 1 score to 80");
        replaceQuiz(boo, "Jean Smith",1,80);
        printBook(boo);
        System.out.println("Replacing Dilbert with Mike Kappa: 80,80,80,90,90");
        replaceStudent(boo, "Dilbert Gamma","Mike Kappa", 80,80,80,90,90);
        printBook(boo);
        System.out.println("Inserting Lily Mu: 85,95,70,0,100");
        insertStudent(boo,"Betty Boop", "Lily Mu",85,95,70,0,100);
        printBook(boo);
        System.out.println("Deleting Max Gerard");
        deleteStudent( boo, "Max Gerard");
        printBook(boo);
    }
    
    public static void printBook(ArrayList<Student> boo)
    {
        System.out.printf("%20s %8s %8s %8s %8s %8s \n", "Student name","Q1", "Q2", "Q3", "Q4", "Q5");
        for (int i=0; i<boo.size();i++)
        System.out.println(boo.get(i));
        
        System.out.println("");
    }
    
    public static void replaceName(ArrayList<Student> boo,String oldName, String newName)
    {
        for (int i=0; i<boo.size();i++)
        if (boo.get(i).name.equals(oldName))
        boo.get(i).name=newName;
    }
    
    public static void replaceQuiz(ArrayList<Student> boo, String name,int quizNum, int newQuizGrade)
    {
        for (int i=0; i<boo.size();i++)
        if (boo.get(i).name.equals(name))
        boo.get(i).setQuiz(quizNum,newQuizGrade);
    }
    
    public static void replaceStudent(ArrayList<Student> boo, String oldName, String newName,int qz1,int qz2, int qz3,int qz4, int qz5)
    {
        for (int i=0; i<boo.size();i++)
        if (boo.get(i).name.equals(oldName))
        {
            boo.set(i,new Student(newName,qz1,qz2,qz3,qz4,qz5));
        }
    }
    
    public static void insertStudent(ArrayList<Student> boo, String oldName,String name,int qz1,int qz2, int qz3,int qz4, int qz5)
    {
        for (int i=0; i<boo.size();i++)
        if (boo.get(i).name.equals(oldName))
        {
            boo.add(i,new Student(name, qz1,qz2,qz3,qz4,qz5));
            boo.remove(boo.size()-1);
            break;
        }
        
    }
    
    public static void deleteStudent(ArrayList<Student> boo, String name)
    {
        for (int i=0; i<boo.size();i++)
        if (boo.get(i).name.equals(name))
        {
            boo.remove(i);
        }
    }
}
