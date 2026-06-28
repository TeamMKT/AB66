package this_Keyword;

public class Car
{
   String brand;
   int year;
   void display()
   {
	   System.out.println("Brand:" + brand + " & Year:"+year);
   }
   public static void main(String[] args)
   {
	   Car c1  = new Car();
	   c1.brand = "Toyoto";
	   c1.year = 2000;
	   c1.display();
	   
}
}
