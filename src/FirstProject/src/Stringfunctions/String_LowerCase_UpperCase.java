package Stringfunctions;

public class String_LowerCase_UpperCase 
{
	public static void main(String[] args)
	{
        String name = "Rudraprasad Sharma";
        System.out.println("My name is:-" + "Rudraprsad Sharma");
        System.out.println("length of my name is:>" + name.length());
        System.out.println(name.charAt(8));
        System.out.println(name.indexOf('S'));
        System.out.println(name.concat(" Gundugola"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
	}

}
