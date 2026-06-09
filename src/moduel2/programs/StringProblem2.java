package moduel2.programs;

import java.util.Arrays;

public class StringProblem2 
{
	public static void main(String[] args) 
	{
		String a="Automation";
		boolean b1=	a.matches("A(.*)");
		boolean b2=	a.matches("(.*)n");
		String url="https://www.amazon.in/cart/smart-wagon?newItems=4dc1bc3e-fc73-4e01-ba2f-073f8e5eab3c,1&ref_=sw_refresh";

		boolean b3=	url.matches("(.*)cart(.*)");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		String b="auto";
		boolean b4=	b.matches("....");
		System.out.println(b4);
	}
}
