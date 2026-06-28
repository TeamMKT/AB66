package collection;

import java.util.ArrayList;

public class ArrayList_practice4 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList <String>();
		  a1.add("Java");
		  a1.add("Python");
		  a1.add("C++");
		  boolean b1 = a1.contains("Python");
		  System.out.println(b1);
		  if(a1.contains("Python"))
		  {
			  a1.remove("Python"); 
		  }
		  System.out.println(a1);
		  
	}
	  
      
}

