package package2;
//"Write a program for single-level inheritance using a static method in the single package explorer."
class Ass72
{
	static void add(String Name)
	{
		String name=Name;
		System.out.println(name);
	}
}
public class Assignment71 extends Ass72
{
 static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
 
	public static void main(String[] args) {
		add("Rudra");
		add(15,20);

	}

}
