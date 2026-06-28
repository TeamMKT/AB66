package Stringfunctions;

public class SubString 
{
 public static void main(String[] args)
 {
		String a = "manual  testing";
		a.substring(6);
		System.out.println(a.substring(6));
		System.out.println(a.substring(7));
		System.out.println(a.substring(5));
		System.out.println(a.substring(1));
		System.out.println(a.substring(1,4));//here, 1 is a, and 4 is (4-1)=3, it is u.
		System.out.println(a.substring(0,7));
		System.out.println(a.substring(0,6));
		System.out.println(a.substring(1,7));
		System.out.println(a.substring(1,6));
		System.out.println(a.substring(1,5));
		System.out.println(a.substring(a.length()));//the second parameter always taking n-1;
	}

}
