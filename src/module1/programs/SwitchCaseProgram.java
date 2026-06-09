package module1.programs;

import java.util.Scanner;

public class SwitchCaseProgram 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Which browser you would like to launch:");
		System.out.println("Press 1: Chrome");
		System.out.println("Press 2: Edge");
		System.out.println("Press 3: Safari");
		System.out.println("Press 4: Mozilla");

		int manish=	s1.nextInt();
	
		switch(manish)
		{
			case 1:
					System.out.println("Launching Chrome Browser");
			//		break;
			
			case 2:	System.out.println("Launching Edge Browser");
				//	break;	
				
			case 3:	System.out.println("Launching Safari Browser");
				//	break;	
				
			case 4:System.out.println("Launching Mozilla Browser");
				//	break;	
				
		/*	default:	
					System.out.println("Sorry your selection is wrong");
		*/
		}
		
		s1.close();
	}
}
