package Collection_framework_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practice_3 
{
   public static void main(String[] args) 
   {
	 ArrayList <Integer> a1 = new ArrayList<Integer> ();
	 a1.add(111);
	 a1.add(112);
	 a1.add(113);
	 a1.add(114);
	 a1.add(114);
	 System.out.println(a1);
	 Set < Integer> s1 = new HashSet<Integer>(a1);
      System.out.println(s1);
      
   }
   
}
