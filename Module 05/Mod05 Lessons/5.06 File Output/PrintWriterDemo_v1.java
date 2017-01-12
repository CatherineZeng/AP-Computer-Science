
/**
 * Write a description of class PrintWriterDemo_v1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException; 
 import java.io.PrintWriter; 
import java.io.File; 
import java.util.Random;
 class PrintWriterDemo_v1 
 { 
 public static void main (String [ ] args) throws IOException 
 { 
   Random randNum = new Random();
   PrintWriter outFile = new PrintWriter (new File("hellofrogli.txt")); 
     for (int loop = 1; loop <= 5; loop++) 
    { 
        outFile.print(randNum.nextInt(100)); 
        System.out.println(loop+"Hello World");
    } 
   outFile.close ( ); 
} 
}
