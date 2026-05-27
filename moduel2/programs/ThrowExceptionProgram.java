package moduel2.programs;
public class ThrowExceptionProgram 
{
	public static void main(String[] args) 
	{
		if(1>1)
		{
	throw new NullPointerException("SOrry the cell is empty");
		}
		else
		{
	throw new ArithmeticException("Sorry infinity cannot be storred in java");
		}
	
	}
}