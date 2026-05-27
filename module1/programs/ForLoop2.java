package module1.programs;

import java.util.Scanner;

public class ForLoop2 
{
	public static void main(String[] args) 
	{
		for(int i =1;i<=74;i++)
		{
			System.out.println("Roll no->"+i);
	Scanner s1=new Scanner(System.in);
	System.out.println("What is your name?");
	String name=	s1.next();
	System.out.println("WHat is your age?");
	int age=	s1.nextInt();
	
	System.out.println(name);
	System.out.println(age);
		}
		
		
	}
}
