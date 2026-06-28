package collection;
//write a program on add All method in the Collection class .
import java.util.ArrayList;
public class Assignment174 {
	public static void main(String[] args) 
	{
	 ArrayList <String> list1 = new ArrayList <String> ();
	 list1.add("Ravi");
	 list1.add("Rudra");
	 list1.add("Ramu");
	 list1.add("Raja");
	 list1.add("Rudra");
	 list1.add(null);
	 System.out.println("List1 : " + list1);
	 ArrayList <String> list2 = new ArrayList <String>();
	 list2.add("Kavita");
	 list2.add("Roma");
	 list2.add("Khushi");
	 list2.add("Roma");
	 list2.add(null);
	 System.out.println("List2 : "+ list2);
	 boolean b1=list1.addAll(list2);
	 System.out.println("After adAll():" + list1);
	 System.out.println("Operation sussceessful: "+ b1);

	}

}
