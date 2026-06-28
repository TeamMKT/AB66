package Collection_framework_practice;

import java.util.ArrayList;

public class Array_list2 
{
    public static void main(String[] args) 
    {
    	ArrayList <String> a1 = new ArrayList <String> ();
        a1.add("Ramu");	
        a1.add("Rudra");
        a1.add("Ravi");	
        a1.add("Raju");	
        System.out.println("ArrayList Collection a1:" + a1);
        a1.ensureCapacity(5);
        System.out.println(a1);
    	ArrayList <String> a2 = new ArrayList <String> ();
    	a2.add("Uma");
    	a2.add("Vineela");
    	a2.add("Geeta");
    	a2.add("Roma");
    	a2.add(null);
    	a2.add("Uma");
    	System.out.println("ArractList Collection a2:" + a2);
    	a1.addAll(a2);
    	System.out.println("Collection add a1&a2:" + a1);
    	a1.addAll(3, a2);
    	System.out.println(a2);
    	boolean b1=a1.containsAll(a2);
    	System.out.println(b1);
    	a1.removeAll(a2);
    	System.out.println(a1);
    	a2.sort(null);//it shows nullpointerexception
    	System.out.println(a2);
    	
    	
    	
    	
    	
    	
    	
    	
    	



        
	}
	
    
}

