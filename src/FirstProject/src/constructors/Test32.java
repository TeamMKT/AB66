package constructors;

public class Test32
{
	Test32()
	{
		System.out.println("1");
	}
void show()
{
	System.out.println("2");
}
void diplay()
{
	System.out.println("3");
}
public static void main(String[] args) {
	Test32 obj = new Test32();
	obj.show();
	obj.diplay();
}
}
