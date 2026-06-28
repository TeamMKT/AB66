package Collection_framework_practice;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop 
{
   public static void main(String[] args) 
   {
	List <Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	for(Integer i : list)
	{
		if(i == 2)
		{
			list.remove(i);
		}
	}
System.out.println(list);
}
}
