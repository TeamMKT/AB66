package collection;
import java.util.ArrayList;
// write a program on Remove All method in the Collection class.
public class Assignment180 {

	public static void main(String[] args) {
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
		 boolean b1 =list1.removeAll(list2);
		 System.out.println("Removed elements: " + b1);
		 System.out.println("Updated :" + list1);

	}

}
