package Collection_framework_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Practice_4 
{
   public static void main(String[] args)
   {
	 ArrayList <Integer> a1 = new ArrayList<Integer>();
	 a1.add(1);
	 a1.add(2);
	 a1.add(2);
	 a1.add(3);
	 a1.add(1);
	 a1.add(2);
	 System.out.println(a1);
	 int i1 =Collections.frequency(a1, 1);
	 System.out.println("frequencey 1=" +i1);
	 int i2 = Collections.frequency(a1, 2);
	 System.out.println("frequencey 2=" +i2);
	 int i3 = Collections.frequency(a1, 3);
	 System.out.println("frequencey 3=" +i3);
	 int i4 = Collections.max(a1);
	 System.out.println("Maximum Element is:" + i4);
	 
	 
}
}
