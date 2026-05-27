package moduel2.programs;
import java.util.ArrayList;
public class ArrayListProgram2 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(963);
		a1.add(1000);
		a1.add(96);
		a1.add(92);
		a1.add(2);
		
		a1.remove(a1.size()-1);
		System.out.println(a1);
		
	}
}
