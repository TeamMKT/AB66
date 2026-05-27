package moduel2.programs;
public class StringProblrm6 
{
	public static void main(String[] args) 
	{
		String a="auto";
		System.out.println(a.replace('o', 'A'));
		String b="manual testing";
		System.out.println(b.replace("manual", "Automation"));
		String c="K v no 2";
		System.out.println(c.replaceAll("[A-Z]", "BlueShirt"));

		System.out.println(c.replaceAll("[a-z]", "BlueShirt"));
		System.out.println(c.replaceAll("[a-z]", " "));
		System.out.println(c.replaceAll("[0-9]", "AZ"));

	}
}
