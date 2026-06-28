package Collection_framework_practice;
//for loop concept to iterate the elements
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program
{
   public static void main(String[] args) 
   {
	ArrayList <Integer> a1 = new ArrayList<Integer>();
	a1.add(101);
	a1.add(102);
	a1.add(103);
	a1.add(102);
	a1.add(105);
	System.out.println(a1);
	 Collections.sort(a1);
	System.out.println(a1);
	
	
	/*for(int i=0; i<=a1.size()-1;i++)
	{
		System.out.println(a1.get(i));
	}*/
	
}
}
