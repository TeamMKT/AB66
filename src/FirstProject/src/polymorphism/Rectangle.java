package polymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw the shape of the circle");
	}
}

public class Rectangle extends Shape
{
   void draw()
   {
	   System.out.println("Draw the shape of the rectangle");
	   
   }
   public static void main(String[] args) {
	   Shape s1 = (Shape)new Circle();
	   s1.draw();
	   Shape s2 = (Shape)new Rectangle();
	   s2.draw();

	   
	
}
}
