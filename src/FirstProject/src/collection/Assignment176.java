package collection;
import java.util.ArrayList;
//write a program on isempty method in the Collection class.
public class Assignment176 
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
		boolean b1 =list.isEmpty();
		System.out.println("Is List  empty :" + b1);
	}

}
