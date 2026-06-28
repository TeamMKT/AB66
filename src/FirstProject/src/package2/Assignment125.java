package package2;
//Write A Program on Multi Level Inheritance using Interface Concept.
interface A
{
	abstract void showA();
}
interface B extends A
{
	abstract void showB();
}
public class Assignment125 implements B
{
	@Override
	public void showA()
	{
		System.out.println("Shows A");
	}
	@Override
	public void showB()
	{
		System.out.println("Shows B");
	}
	public static void main(String[] args)
	{
		Assignment125 obj = new Assignment125();
		obj .showA();
		obj.showB();

	}
}
