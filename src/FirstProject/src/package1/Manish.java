package package1;

import java.util.Scanner;

//Scanner class is predefined class in java which is under present under the java util package. it is non static methods in it. since it is coming from java.util package. u need to import in it. scanner class is useful for accepting the human input at run time.//
public class Manish //here, scanner is already predefined package no need to taken as a class we can change scanner to name also.
{
  public static void main(String[] args) 
  {
	// Scanner s1=new Scanner(); // it is nonparametrized constructor of scanner class but the fact is you don't have nonparametrized constructor in scanner class, Only parametrized constructor in it.
	Scanner s1 = new Scanner(System.in);// it is now calling the parametrized constructor. system.in means it takes the input values only.
	int a = s1.nextInt();
	int b = s1.nextInt();
	int c=a*b;
	System.out.println(c);
	s1.close();// otherwise it will show the yello error in the prdogram. copulosory we must close in Scanner class.2532
	}

}
