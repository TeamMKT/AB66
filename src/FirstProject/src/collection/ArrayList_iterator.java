package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_iterator
{
  public static void main(String[] args)
  {
	 ArrayList <String> a1 = new ArrayList <String> ();
	 a1.add("Ramu");
	 a1.add("Geeta");
	 a1.add("Rudra");
	 a1.add("Ravi");
	 System.out.println(a1);
	 Iterator <String> i1 = a1. iterator();
	 System.out.println("Iteration using iterator");
	 while(i1.hasNext())
	 {
		 String s1 = i1.next();
		 System.out.println(s1);
	 if(s1.equals("Geeta"))
	    {
		  i1.remove();
		  System.out.println("Removed: " +s1);
		 }
	
	 }
	 System.out.println("After removing List:" + a1);
	 
}
}
