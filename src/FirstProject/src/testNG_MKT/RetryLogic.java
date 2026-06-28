package testNG_MKT;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
    int initialCount =0;
    int retryCount = 2;
	@Override
	public boolean retry(ITestResult result) //retry is a method of abstraction
	{
		if(initialCount<retryCount)
		{
			initialCount ++;
			return true;
		}
		return false;
	}

		
	
   
}
