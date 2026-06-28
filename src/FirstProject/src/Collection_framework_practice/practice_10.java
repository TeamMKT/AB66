package Collection_framework_practice;

import java.util.ArrayList;

public class practice_10 
{
   public static void main(String[] args) 
   {
	   ArrayList <Object>a1 = new ArrayList<Object>();
	   a1.add("Ramu");
	   a1.add("Raja");
	   a1.add("Rudra");
	   a1.add("Ravi");
	   System.out.println(a1);
	   ArrayList <Object>a2 = new ArrayList<Object>();
	   a2.add(101);
	   a2.add(102);
	   a2.add(103);
	   a2.add(104);
	   System.out.println(a2);
	   
	   a1.addAll(a2);
	   System.out.println(a1);
	   
	   
}
}
