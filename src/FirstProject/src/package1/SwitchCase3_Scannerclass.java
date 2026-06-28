package package1;
//write a program to launch a browser using Scannerclass.
import java.util.Scanner;

public class SwitchCase3_Scannerclass {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Which case you would like to execute");
		int option=s1.nextInt();
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
			System.out.println("Sorry Your selection is wrong");
			
		}
	s1.close();
	}
	
	
}
