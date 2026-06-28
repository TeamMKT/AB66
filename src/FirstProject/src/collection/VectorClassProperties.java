package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClassProperties 
{
  public static void main(String[] args)
  {
	  Vector <String> v1 = new Vector <String>();
	  v1.addElement("gaurav");
	  v1.addElement("rudra");
	  v1.addElement("geeta");
	  System.out.println(v1);
	  Enumeration <String> e1= v1.elements();
	  System.out.println("Iteration using Iterator");
	  while(e1.hasMoreElements())
	  {
		  System.out.println(e1.nextElement());
	  }
	  
	  
}
	
  
     
     
    
    
}

