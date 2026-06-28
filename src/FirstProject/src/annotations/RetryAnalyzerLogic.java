package annotations;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerLogic implements IRetryAnalyzer
{

	int initialCount = 0;
	int retriveCount =2;
			
	public boolean retry(ITestResult result) 
	{
		if(initialCount<retriveCount)
		{
			initialCount ++;
			return true;
		}
		
		return false;
	}

}
