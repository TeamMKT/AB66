package Collection_framework_practice;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayList_iterator 
{
  public static void main(String[] args)
  {
	ArrayList <Integer> a1 = new ArrayList <Integer> ();
	a1.add(105);
	a1.add(106);
	a1.add(105);
	a1.add(null);
	System.out.println(a1);
	ListIterator <Integer> list = a1.listIterator();
	System.out.println("Forward iteration using using ListIterator");
	while(list.hasNext())
	{
		Integer i1 = list.next();
		System.out.println(i1);
	}
	System.out.println("Backward operation using ListIterator");
	while(list.hasPrevious())
	{
		Integer i2 = list.previous();
		System.out.println(i2);
		if(i2==105)
		{
			list.remove();
			System.out.println("removeing null value:"+i2);
		}
		
	}
	System.out.println("After removing: "+a1);
	
	
	
}
}
