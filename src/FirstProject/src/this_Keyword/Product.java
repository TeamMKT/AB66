package this_Keyword;

public class Product 
{
  int price;
  void setPrice(int price)
  {
	  this.price = price;
  }
  int getDiscountPrice()
  {
	  if(price>=1000)
	  {
		  return price-200;
	  }
	  else
	  {
		  return price - 50;
	  }
  }
  public static void main(String[] args) 
  {
	  Product P1 = new Product();
	  P1.setPrice(1500);
	  int result = P1.getDiscountPrice();
	  System.out.println(result);
}
  
}
