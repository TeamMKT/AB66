package package2;

public class Testcase1_SearchingProduct extends Logincode 
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
