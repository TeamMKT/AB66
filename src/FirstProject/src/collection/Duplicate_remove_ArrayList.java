package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_remove_ArrayList {

	public static void main(String[] args) 
	{
        List<String> list = new ArrayList<String>();
        list.add("Ramu");
        list.add("Rudra");
        list.add("Ramu");
        list.add("Ravi");
        list.add("Rudra");
        System.out.println(list);
        Set<String> set = new HashSet<String>(list);
        //set.add("Krishna");
        System.out.println("Duplicaes are removing in Arraylist :"+ set);
        
        }

}
