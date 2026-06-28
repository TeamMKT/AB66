package collection;

import java.util.ArrayList;

public class ArraylistPractice1 
{
  public static void main(String[] args)
  {
	ArrayList <String> a1 = new ArrayList<String>();
	a1.add("Uma");
	a1.add("Vineela");
	a1.add("Roma");
	a1.add("Kavita");
	a1.add("Sita");
	System.out.println(a1);
	ArrayList <String> a2 = new ArrayList<String>();
	a2.add("Vizag");
	a2.add("Hyderabad");
	a2.add("Chennai");
	a2.add("Bangalore");
	String d1=a2.get(2);
	System.out.println(d1);
	System.out.println(a2);
	
	
 }
}
