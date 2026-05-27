package moduel2.programs;
public class TestCase1_SearchingProduct extends LoginCode
{
	static void searchingProduct()
	{
		System.out.println("searching product");
	}
	public static void main(String[] args) 
	{
		loginWithValidCredentails();
		searchingProduct();
		logout();
		callMeWhenTestCaseisPass();
	}
}
