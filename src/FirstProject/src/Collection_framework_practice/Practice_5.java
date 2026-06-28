package Collection_framework_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Practice_5
{
  public static void main(String[] args) 
  {
ArrayList <Integer> a1 = new ArrayList<Integer>();
	a1.add(11);
	a1.add(12);
	a1.add(13);
	a1.add(14);
	a1.add(15);
	a1.clear();
	System.out.println("Clear list is:"+a1);
	//a1.removeAll(a1);
	//Collections.reverse(a1);
	System.out.println("Remove all List is:"+ a1);
}
}
