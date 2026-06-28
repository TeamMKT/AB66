package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IXIGO_XPath_axes {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.ixigo.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='wiz-iframe-intent']"));
    	driver.switchTo().frame(iframe);
    	Thread.sleep(3000);
      
    	WebElement popup = driver.findElement(By.xpath("//img[@id='popupImage']/preceding-sibling::button"));
    	popup.click();
    	Thread.sleep(3000);
    	
    	driver.switchTo().defaultContent();
    	
    	WebElement oneway = driver.findElement(By.xpath("//button[text()='One Way']"));
    	oneway.click();
    	Thread.sleep(3000);
    	
    	WebElement flights = driver.findElement(By.xpath("(//a[@href='/flights'])[2]"));
    	flights.click();
    	Thread.sleep(3000);
    	
    	WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
    	//WebElement from = driver.findElement(By.xpath("//label[text()='From']"));
    	from.click();
    	Thread.sleep(3000);
    	//p[@data-testid='originId']
    	
    	List <WebElement> list = 
  driver.findElements
  (By.xpath("(//div[@class='overflow-y-scroll absolute top-[61px] bg-white w-[375px] min-h-[150px] max-h-[450px] shadow-500 z-20 rounded-20 !animate-none no-scrollbar block Autocompleter_animate__zqRDe']/div)[3]"));
    	list.get(0).click();
    	Thread.sleep(5000);
    	
    	WebElement to = driver.findElement(By.xpath("//span[text()='To']"));
     	
     	Thread.sleep(5000);
    	
    	//span[text()='To']/ancestor::div[@class='flex-1 h-full flex flex-col justify-center px-15 py-10 ']
    	
    	/*WebElement destiny = driver.findElement(By.xpath("//p[@data-testid='originId']"));
    	destiny.sendKeys("Chennai");
    	Thread.sleep(5000);*/
    	
    	List <WebElement> destinylist = 
    	driver.findElements
    	  (By.xpath("(//div[@class='overflow-y-scroll absolute top-[61px] bg-white w-[375px] min-h-[150px] max-h-[450px] shadow-500 z-20 rounded-20 !animate-none no-scrollbar block Autocompleter_animate__zqRDe']/div)"));
    	destinylist.get(5).click();
    	    	Thread.sleep(5000);
    	    	
    	WebElement departure
    = driver.findElement(By.xpath("//div[@class='bg-charcoal-40 hover:bg-neutral-subtle-over w-full']/descendant::p[@data-testid='departureDate']"));
    		departure.click();
    		Thread.sleep(5000);
    		
    WebElement rightarrow 
    = driver.findElement(By.xpath("(//div[@class='relative overflow-y-hidden rounded-20']/div/div)[1]/child::button[3]"));
    rightarrow.click();
    Thread.sleep(5000);
    
    WebElement departuredate 
    = driver.findElement(By.xpath("(//button[@class='react-calendar__tile react-calendar__month-view__days__day'])[15]"));
    departuredate.click();
    		    Thread.sleep(5000); 
    		    
    WebElement tr_cs 
    = driver.findElement(By.xpath("//div[@class='flex items-center !border-none']/descendant::p[text()='1 Traveller,  Economy']"));
    tr_cs .click();
   Thread.sleep(5000); 
   
   
    		    		    
    		    
   
    		  
    WebElement returnto =
   driver.findElement(By.xpath("//div[@class='bg-charcoal-40 border-charcoal-40 hover:bg-neutral-subtle-over hover:border-contrast w-full']/descendant::span"));
    returnto.click();
    
    WebElement returndate 
    = driver.findElement(By.xpath("(//button[@class='react-calendar__tile react-calendar__month-view__days__day'])[25]"));		   
    returndate.click(); 
    Thread.sleep(5000);
    
    
    	
    	
	}

}
//img[@id='popupImage']/preceding-sibling::button[@id='closeButton'