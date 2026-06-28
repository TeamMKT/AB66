package Stringfunctions;
/*"Write a program with different string function mentioned below; Length;tolowercase;touppercase;trim;charAt(index);indexof(char);
substring(start index);substring(start index, end index);equals;contains;equalsIgnoreCase"*/
public class Assignment127 
{
	public static void main(String[] args) 
	{
		String name = " Rudraprasad Sharma ";
		String name1="Gundugola";
		name.length();
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.charAt(8));
		System.out.println(name.indexOf('r'));
		System.out.println(name.substring(5));
		System.out.println(name.substring(7, 15));
		boolean b1 = name.equals(name1);
		System.out.println(b1);
		boolean b2= name1.equals(name1);
		System.out.println(b2);
		boolean b3 = name1.contains(name);
		System.out.println(b3);
		boolean b4 = name.equalsIgnoreCase("RUDRAPRASAD SHARMA");
		System.out.println(b4);
		
		
				
	}

}
