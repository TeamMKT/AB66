package collection;
import java.util.ArrayList;
//WAP on collection concept with the help of Upcasting on Different Data types (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.
public class Assignment171{
public static void main(String[] args) {
	ArrayList <Integer> l1 = new ArrayList<Integer>();
	l1.add(586);
	l1.add(856);
	l1.add(640);
	l1.add(489);
	System.out.println("The original list is:" + l1);
	l1.add(1, 729);
	System.out.println("After the list is: " + l1);
	Integer i1 = l1.remove(1);
	System.out.println("removal indexing 1:" + i1);
	System.out.println("After value removal: " + l1);
	Boolean b1 = l1.contains(640);
	System.out.println("The element contains: "+ b1);
	ArrayList <Character> c1 = new ArrayList<Character>();
	c1.add('G');
	c1.add('I');
	c1.add('T');
	c1.add('A');
	c1.add(null);
	System.out.println("The original Char list is:" + c1);
	c1.add(4, 'M');
	System.out.println("After the list is: " + c1);
	Boolean b2 = c1.remove(Character.valueOf('M'));
	System.out.println(b2);
	System.out.println("After removing Character:" + c1);
	Boolean b3 = c1.remove(null);
	System.out.println(b3);
	System.out.println("After removing Character:" + c1);
	
}
}
