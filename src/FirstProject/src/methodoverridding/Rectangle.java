package methodoverridding;
//use parent referrance to call both, this is runtime polymorphism
class Shape
{
	void area()
	{
	System.out.println("Calculating area");
    }
}
class Circle extends Shape
{
	void area()
	{
	System.out.println("Circle area");
	}
}
public class Rectangle extends Shape
{
   void area()
   {
   System.out.println("Rectangle area");
   }
 public static void main(String[] args) 
 {
	Shape s = new Circle();
	s.area();
	Shape s1 = new Rectangle();
	s1.area();
}
}
