package checked_UncheckedExceptions;

public class ForLoop {

	public static void main(String[] args) throws InterruptedException
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);//pause execution for 2seconds
			
		}
		
		System.out.println("End of the For Loop");
	}
}
/*InterruptedException is a checkedException.so it must be handled at compile-time.
You cannot ignore it; otherwise, the program will fail to compile.*/
