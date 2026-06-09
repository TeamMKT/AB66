package module4;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonFresh 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	/*	ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement e1=	driver.findElement(By.xpath("//span[text()='Fresh']"));
			e1.click();
		*/	
			  ChromeDriver driver=new ChromeDriver();
              driver.get("https://www.amazon.in");
              driver.manage().window().minimize();
              Thread.sleep(2000);
              
              List<WebElement> list=driver.findElements(By.tagName("a"));
              
              int count=        list.size();
                      System.out.println(count);
                      for(int i=0;i<list.size();i++)
                      {
                      WebElement first=        list.get(i);
                      String url=                                first.getDomAttribute("href");
                      System.out.println(url);
                      verifyTheLink(url);
                      }
        }        
      static void verifyTheLink(String url) throws IOException
      {
              try {
              URL u1=new URL(url);
              HttpURLConnection h1=                (HttpURLConnection) u1.openConnection();
              
              if(h1.getResponseCode()==200)
              {
                      System.out.println("URL is Valid "+" The Response Message:->"+h1.getResponseMessage()+" "+"The Response Code:->"+h1.getResponseCode());
              }
              else
              {
                      System.out.println("URL is NOT Valid "+" The Response Message:->"+h1.getResponseMessage()+" "+"The Response Code:->"+h1.getResponseCode());

              }
              }
              catch(MalformedURLException h1)
              {
                      System.out.println("Hanlded the exception");
              }
      }
	
}
