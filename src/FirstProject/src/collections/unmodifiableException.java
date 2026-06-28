package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class unmodifiableException {

	public static void main(String[] args) 
	{
		Map<Integer,String> a1 = new HashMap<>();
		a1.put(1, "Java");
		a1.put(2, "Python");
		a1.put(3, "C++");
		Map<Integer,String> a2 = Collections.unmodifiableMap(a1);
		System.out.println("UnmodifiableMap:" + a1);
		a2.put(4, "JavaScript");
		System.out.println("UnmodifiableMap:" + a1);

	/*UnsupportedOperationException occurs when we try to modify a collection that does not support modification operations.
		means we can added the additional map to the map. we canot do add, update, delete, create, 
		but we can do ony fetching and iteration*/

	}

}
