package collection;
// write a program on Remove method in the Collection class.
import java.util.ArrayList;
public class Assignment179 {
	public static void main(String[] args) 
	{
		ArrayList <Integer> list = new ArrayList <Integer> ();
		list.add(106);
		list.add(111);
		list.add(162);
		list.add(106);
		list.add(152);
		System.out.println("List : " + list);
		Integer i1 = list.remove(2);
		System.out.println("Removed Element: "+ i1);
		System.out.println("updated: " + list);

	}

}
