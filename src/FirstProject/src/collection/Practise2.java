package collection;

import java.util.ArrayList;

public class Practise2 
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
	Boolean b1=a1.remove(Character.valueOf('E'));
	System.out.println(b1);
	System.out.println("After removing Character: " + a1);
}
}
