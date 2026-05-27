package moduel2.programs;
public class TestCase2_AddTocart extends LoginCode
{
	static void addToCart()
	{
		System.out.println("Adding to cart");
	}
	public static void main(String[] args) 
	{
		loginWithValidCredentails();
		addToCart();
		logout();
		callMeWhenTestCaseisPass();
	}
}
