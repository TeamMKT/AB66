package array_String;

public class Practise2 
{
	public static void main(String[] args) 
	{
		String name = "geeta";
		int i1 =name.indexOf('g');
		System.out.println(i1);
		int i2 = name.indexOf("e");
		System.out.println(i2);
	System.out.println(name.indexOf('e', 1));
	System.out.println(name.indexOf("t", 1));
	System.out.println(name.indexOf('t', 2, 4));
	System.out.println(name.indexOf("e", 1, 4));
	String str = "  Geeta Jyothi  ";
	System.out.println("Before:"+"Geeta jyothi");
	System.out.println("After:"+ str.trim());
	
	
		
		
		
				
	}

}
