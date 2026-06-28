package collection;
import java.util.ArrayList;
//Write a Program on Clear method in the collection class.
public class Assignment175 
{
  public static void main(String[] args)
  {
	ArrayList <Integer> list = new ArrayList <Integer> ();
	list.add(106);
	list.add(111);
	list.add(162);
	list.add(106);
	list.add(152);
	System.out.println("List : " + list);
	list.clear();
	System.out.println("Clear Array : " + list);
	
	
}
}
