package package2;

public class Testcase2_AddtoCart extends Logincode 
{
	static void searchingproduct()
	{
		System.out.println("Searching Product");
	}

	public static void main(String[] args)
	{
		logincodewithvalidcredentials();
		searchingproduct();
		logout();
		callMewhenTestcaseisPass();

	}

}
