package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1
{
  public static void main(String[] args) 
  {
	Vector<String> v = new Vector<>();
	v.add("Python");
	v.add("Java");
Enumeration<String>e = v.elements()	;
while(e.hasMoreElements())
{
	System.out.println(e.nextElement());
}
	
}
}
