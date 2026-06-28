package package1;
//this is syntax2: here, break is not mandatory, if you don't write break, the  line with the next line also will execute.
import java.util.Scanner;
public class SwitchCase_5 {
public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Which case you would like to execute");
		System.out.println("Press 1: Chrome ");
		System.out.println("Press 2:  Edge");
		System.out.println("Press 3: Safari");
		System.out.println("Press 4: Mozilla");
		int option=s1.nextInt();
        switch(option)
		{
		case 1:
			System.out.println("Launching Chrome Browser");
			//break; here, i stop break so case1 and case2 are execute.
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
