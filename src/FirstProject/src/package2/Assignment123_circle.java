package package2;
//Write A Program on Abstract Class with both Abstract and Concrete methods
abstract class Shape
{
	abstract void draw();
	 void color()
	{
		System.out.println("Shape has color");
	}
}
public class Assignment123_circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	public static void main(String[] args)
	{
		Assignment123_circle obj = new Assignment123_circle();
		obj.draw();
		obj.color();
	}
}
