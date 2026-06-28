package Stringfunctions;
public class String_Arrays2 
{
	public static void main(String[] args)
	{
		String a = "Auto";
		System.out.println(a.replace('o', 'A'));
		String b ="manual testing";
		System.out.println(b.replaceAll("manual", "Automation"));
		String c = "K V no 2";
		System.out.println(c.replaceAll("[A-Z]", "BlueShirt"));
		System.out.println(c.replaceAll("[a-z]", "BlueShirt"));
		System.out.println(c.replaceAll("[a-z]", " "));
		System.out.println(c.replaceAll("[0-9]", "AZ"));
		
	}

}
