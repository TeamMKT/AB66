package Stringfunctions;
public class String_Arrays5 
{
	public static void main(String[] args)
	{
		String a = "Automation";//String Pool area-> Method Area
		
		String b = new String("Automation");//Heap Memory
		
		/* instance variable, Array, Object
		 * 
		 */
		boolean b1 = a.equals(b);
		System.out.println(b1);
		boolean b2 = a==b;
		System.out.println(b2);
		
	}

}
