
/**
 * Write a description of class ghj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ghj
{
    public static void main(String[] args)
    {
      int n = 0; 
       String s="hellohellohi";
       String t="hi";
    int sSize = s.length(); 
    int tSize = t.length(); 
    boolean found = false; 
    
    while ( !found && n + tSize <= sSize ) 
    { 
      if ( t.equals( s.substring( n, n + tSize ) ) ) 
        found = true; 

      n++; 
    } 
    if ( found ) 
      n--; 
    else 
      n = -1;
}
}
