package package1;

import java.util.Scanner;

public class Scannerprogram {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);// it is now calling the parametrized constructor. system.in means it takes the input values only.
		System.out.println("Please enter the value of A:");
			int a = s1.nextInt();
		System.out.println("Please enter the value of B:");	
			int b = s1.nextInt();
			int c=a*b;
		System.out.println("Answer:");
		System.out.println(c);
			s1.close();// otherwise it will show the yello error in the prdogram. So, compulosory we must close in Scanner class.
			}

		}

		
		
		
	
