package checked_UncheckedExceptions;

public class Program3
{
  public static void main(String[] args) throws InterruptedException  
  {
	for(int i=0;i<=5;i++)
	{
		System.out.println(i);
		Thread.sleep(1000);
		//throw i;//it can't work out here.*/
		/*try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
			throw ie;//here, throw keyword is working only at related variable in catch block.
		}*/
		
	}
  }
}

  

