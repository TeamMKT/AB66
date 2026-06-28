package package1;
//Write a program to launch different browsers using Scanner class in switch Concept
import java.util.Scanner;
public class Assignment62 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Launching different Browsers");
		int option = s1.nextInt();
		switch(option)
		{
		case 1: 
			System.out.println("Launching Chrome Browser");
			break;
		case 2:
			System.out.println("Launching Edge");
			break;
		case 3:
			System.out.println("Launching Safari");
		    break;
		case 4:
			System.out.println("Launching Mozilla");
			break;
		default:
			System.out.println("Sorry your selection is wrong");
		    
		}
		
        s1.close();
	}

}
