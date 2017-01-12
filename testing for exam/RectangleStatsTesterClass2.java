
/**
 * Write a description of class j here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
class RectangleStats
{ 
// Private instance variables

// length is an ArrayList which will contain integer values, width is an array which will contain integer
// values, and area is an array which will contain decimal values.
//code goes here for instance variables goes here
ArrayList <Integer> length= new ArrayList <Integer>();
ArrayList <Integer> width= new ArrayList <Integer>();
ArrayList <Double> values= new ArrayList <Double>();
ArrayList <Double> area= new ArrayList <Double>();

// The constructor for the RectangleStats class takes an ArrayList and an array as parameters for
// length and width, respectively.
// code for constructor goes here
RectangleStats(ArrayList intlength, ArrayList intwidth)
{
    intlength=length;
    intwidth=width;
}
// The calcRectangleArea() method calculates the area of rectangles using the length and
// the width assigned to the private instance variables and assigns the results to the area array of type
// double. This method does not return anything.
// code for the calcRectangleArea() method goes here

public void calcRectangleArea()
{
    for(int n=0;n<length.size();n++)
    {
       area.add((double)length.get(n)*(double)width.get(n));
    }
}

// The printArea() method prints the values assigned to the area array using the most appropriate
// type of loop. This method does not return anything.
// code for the printArea() method goes here
public void printArea()
{
    for (int n=0;n<area.size();n++)
    {
    System.out.println(area.get(n));

}
}
}


// The RectangleStatsTesterClass assigns the length of two rectangles to an ArrayList and assigns the
// width of two rectangles to an array. The calcRectangleArea() and printArea() methods are invoked to
// calculate and print the area of the two rectangles.
public class RectangleStatsTesterClass2 
{ 
public static void main(String[] args)

{

ArrayList intLength = new ArrayList();

intLength.add(7);

intLength.add(5);

int [ ] intWidth = {3, 4};



RectangleStats rectStats = new RectangleStats(intLength, intWidth);

rectStats.calcRectangleArea();

rectStats.printArea();

}

}