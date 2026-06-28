package checked_UncheckedExceptions;

import java.util.Arrays;

public class Try_catch1 {

	public static void main(String[] args) 
	{
		try {
			int []  input = new int  [4];
			input [0] = 45;
			input [1] = 58;
			input [2] = 96;
			input [3] = 75;
			System.out.println(Arrays.toString(input));
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Please check your Array size");
		}
		/*catch(StringIndexOutOfBoundsException a1)
		{
			System.out.println("Please check your Array size");
		}*/
	
	}
	

}
