package package2;
//Write a program to create three overloaded constructors:
public class ConstructorOverloadingwithNumbers {
	ConstructorOverloadingwithNumbers(int a)
	{
	   System.out.println(a);
	}
	ConstructorOverloadingwithNumbers(int a, int b)
	{
		int z= a+b;
		
		System.out.println(z);
	}
	ConstructorOverloadingwithNumbers(int i , int j,  double k)
	{
		double f = i+j+k;
		
		System.out.println(f);
	}
	public static void main(String[] args) {
		new ConstructorOverloadingwithNumbers(12);
		new ConstructorOverloadingwithNumbers(13,14);
		new ConstructorOverloadingwithNumbers(15,6,7.5);

	}

}
