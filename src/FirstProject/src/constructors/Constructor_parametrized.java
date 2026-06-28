package constructors;
//Write a program with a constructor that accepts name and age and prints them.
public class Constructor_parametrized {
	Constructor_parametrized(String Name, int age)
	{
		String name = Name;
		int age1 = age;
		System.out.println(name);
		System.out.println(age1);
		
	}
	public static void main(String[] args) {
		new Constructor_parametrized("Rudra",18);
		

	}

}
