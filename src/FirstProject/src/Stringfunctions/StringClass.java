package Stringfunctions;

public class StringClass {

	public static void main(String[] args)
	{
		String a ="automation";
		System.out.println(a.length());
		System.out.println(a.charAt(0));//it means it takes only index
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(9));
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf('t'));
		System.out.println(a.lastIndexOf('t'));
		System.out.println(a.indexOf('u'));
		System.out.println(a.indexOf('m'));
		System.out.println(a.concat("testing"));
		System.out.println(a.indexOf('t', 3));
		System.out.println(a.indexOf('t') + " " + a.indexOf('t', 3));
		System.out.println(a.indexOf('a') + " " + a.indexOf('a', 1));
		System.out.println(a.indexOf('o') + " " + a.indexOf('o', 4));
	}

}
