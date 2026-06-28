package Stringfunctions;

public class Stringclass1 
{
	public static void main(String[] args) 
	{
		String name = "RudraprasadSharma";
		System.out.println("The length of the name is:" + name.length());
		System.out.println("The index value for R is  :"+ name.charAt(0));
		System.out.println("The index value for r is  :"+ name.charAt(6));
		System.out.println("The index value for a is  :"+ name.charAt(4));
		System.out.println(name.charAt(8));
		String name1=name.concat("Gundugola");
		System.out.println(name1);
		System.out.println(name.concat("Gundugola"));
		System.out.println(name.indexOf('r'));
		System.out.println(name.indexOf('S'));


	}

}
