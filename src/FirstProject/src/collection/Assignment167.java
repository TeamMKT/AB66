package collection;
import java.util.ArrayList;
//Write a program to show all available remove functions in ArrayList.
public class Assignment167 
{
  public static void main(String[] args) 
  {
	ArrayList<Integer>a1= new ArrayList<Integer>();
	a1.add(564);
	a1.add(589);
	a1.add(678);
	a1.add(895);
	a1.add(456);
	System.out.println("Original List:" + a1);
	Integer i1 = a1.remove(1);
	System.out.println("Remove by Index:"+i1);
	System.out.println("After removal Index: "+a1);
	Boolean b1 = a1.remove(Integer.valueOf(895));
    System.out.println("Removed by value 895: " + b1);
    System.out.println("After value removal: " + a1);
	
	
	
	
}
}
