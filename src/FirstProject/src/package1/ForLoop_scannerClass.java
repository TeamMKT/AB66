package package1;

import java.util.Scanner;

public class ForLoop_scannerClass {

	public static void main(String[] args) 
	{
	    for(int i=1;i<=74;i++)
	    {
	    	System.out.println("Roll no->"+i);
	    	Scanner s1=new Scanner(System.in);
	    	System.out.println("What is your name?");
	    	String name=s1.next();
	    	System.out.println("What is your age");
	    	int age=s1.nextInt();
	    	System.out.println(name);
	    	System.out.println(age);
	    }

	}

}
//in rowno:11, write +i, because, without out +i it is not meaningful becasue it is with string "roll no"so we can add +i.otherwise it shows compilation error.