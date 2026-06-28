package checked_UncheckedExceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class ForLoop1 
{
  public static void main(String[] args) throws InterruptedException, MalformedURLException
  {
	  URL u1 = new URL("https://www.google.com");
	  for(int i=0;i<100;i++)
	{
		System.out.println(i);
		Thread.sleep(2000);
	}
	  System.out.println("End of the foe loop");
}
}
/*MalformedURLException is checked because Java assumes that URL formatting errors
are predictable and recoverable. It enforces handling them at compile time to ensure the
application doesn't break at runtime due to poorly formatted URLs.*/