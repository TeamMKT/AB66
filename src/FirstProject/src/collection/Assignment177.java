package collection;
//write a program on Contains method in the Collection class.
import java.util.ArrayList;

public class Assignment177 
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
	boolean b1 = list.contains(152);
	System.out.println(b1);
	
	
}
}
