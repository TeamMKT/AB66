package collection;

import java.util.ArrayList;

public class Practice3 
{
public static void main(String[] args) 
{
	ArrayList <Float> a1 = new ArrayList<Float>();
	a1.add(12.565F);
	a1.add(13.565F);
	a1.add(18.565F);
	a1.add(17.565F);
	Boolean b1=a1.remove(18.565F);
	System.out.println(b1);
	System.out.println("After removal Float:"+a1);
	
}
}
