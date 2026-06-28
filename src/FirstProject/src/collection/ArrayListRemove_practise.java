package collection;

import java.util.ArrayList;

public class ArrayListRemove_practise 
{
   public static void main(String[] args) 
   {
	   ArrayList <Integer> a1 = new ArrayList <Integer> ();
	   a1.add(5);
	   a1.add(10);
	   a1.add(15);
	   a1.add(20);
	   a1.remove(1);
	   System.out.println(a1);
	   ArrayList <String> a2 = new ArrayList <String> ();
	   a2.add("Red");
	   a2.add("Blue");
	   a2.add("Green");
	   a2.add("Yellow");
	   a2.remove(2);
	   System.out.println(a2);
	   ArrayList <Integer> a3 = new ArrayList <Integer> ();
       a3.add(1);
       a3.add(2);
       a3.add(3);
       a3.add(4);
       a3.add(5);
       a3.remove(0);
       System.out.println(a3);
       a3.remove(Integer.valueOf(4));
       System.out.println(a3);

	   
	
}
	
}
