package package1;
//in this switch option you will give 1, it will execute case1, if you can give 2, case 2 will execute, and you can give 400, default will exceute.
public class SwitchCase2 {

	public static void main(String[] args) 
	{
		switch(1)
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

	}

}
