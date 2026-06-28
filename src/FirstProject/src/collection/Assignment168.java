package collection;
//Write a program to show isempty functions in ArrayList
import java.util.ArrayList;
public class Assignment168
{
 public static void main(String[] args)
 {
	ArrayList<Character> a1 = new ArrayList<Character>();
	a1.add('M');
	a1.add('E');
	a1.add('D');
	a1.add('U');
	a1.add('R');
	a1.add('I');
	System.out.println("List:" + a1);
	Boolean b1=a1.isEmpty();
	System.out.println("Is List empty: " + b1);
	 a1.clear();
	 System.out.println("After clear:" + a1);
	 System.out.println("Is List empty:"+ a1.isEmpty());
	
}
}
