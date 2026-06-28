package Stringfunctions;
class A
{
	 final void show()
	{
		System.out.println("A");
	}
}
 class Test extends A {

	public static void main(String[] args) {
		A obj= new Test();
		obj.show();

	}

}
