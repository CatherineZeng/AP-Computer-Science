
/**
 * Write a description of class hi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
class CircleStats 
{
public static void main(String[] args) 
{
  int[ ] a = {17, 34, 43, 71}; 
int i = 0; 
while (i < a.length) 
{ 
if ((a[i] % 2) == 1) 
{ 
a[i] = a[i] % 3; 
} 
else 
{ 
a[i] = a[i] /3; 
} 
i++; 
}

for (int x:a)
System.out.print(x);

}

public static String doSomething(ArrayList a, int b) { 
int i; 
String s; 

for (i = 0; i <= a.size(); i++) { 
s = (String)(a.get(i)); 
if (s.length() == b) { 
return s; 
} 
} 

return null; 
}

}