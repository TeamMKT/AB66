package moduel2.programs;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListRemoveMethod 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(963);
		a1.add(1000);
		a1.add(96);
		a1.add(null);
		a1.add(92);
		a1.add(null);
		a1.add(20);
		System.out.println(a1);
		
		
		
		
		Iterator<Integer> i1=	a1.iterator();
		while(i1.hasNext())
		{
			/*if(i1.next()==null)
			{
				i1.remove();
			}*/
			if(i1.next()==a1.get(1))
			{
				i1.remove();
			}
		}
		System.out.println("Updated LIst without NULLs"+a1);

	
		
	}
}
