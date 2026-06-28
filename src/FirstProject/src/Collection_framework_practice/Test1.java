package Collection_framework_practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Test1 
{
    public static void main(String[] args) 
    {
		List<Integer> list = new ArrayList<Integer>();
		list.add(102);
		list.add(104);
		list.add(102);
		list.add(106);
		list.add(105);
		System.out.println(list);
		/*Collections.rotate(list, -2);
		System.out.println(list);*/
		int i1 = Collections.max(list);//max
		System.out.println(i1);
		Collections.sort(list);//sort
		int i =Collections.binarySearch(list, 105);
		System.out.println("Binary search:"+i);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);//reverse
		Collections.shuffle(list);
		System.out.println(list);//shuffle
		int i2 =Collections.frequency(list, 102);
		System.out.println(i2);
		//Collections.fill(list, 103);
		//System.out.println(list);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(111);
		list1.add(112);
		list1.add(113);
		list1.add(114);
		list1.add(115);
		/*System.out.println(list1);
		Collections.copy(list1, list);
		System.out.println(list);*/
		boolean b1 = Collections.disjoint(list, list1);
		System.out.println(b1);
		
		
		
		
		
		
		
		
	}
    
}
