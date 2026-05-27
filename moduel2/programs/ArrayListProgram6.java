package moduel2.programs;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram6 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(963);
		a1.add(1000);
		a1.add(96);
		a1.add(92);
		a1.add(2);
		a1.add(2);

		System.out.println(a1);
		System.out.println(Collections.frequency(a1, 2));
		
	/*	Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		
		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));
		*/

		
	}
}
