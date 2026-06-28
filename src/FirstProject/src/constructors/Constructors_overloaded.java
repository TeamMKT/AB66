package constructors;
//Write a program with overloaded constructors:Constructor with name;Constructor with name and marks
public class Constructors_overloaded {
	Constructors_overloaded(String name)
	{
		String Name=name;
		System.out.println(Name);
	
	}
	
	Constructors_overloaded(String name, int marks)
	{
		String Name=name;
		int Marks=marks;
		System.out.println(Name);
		System.out.println(Marks);
	
	}
	public static void main(String[] args) {
		new Constructors_overloaded("Rudra");
		new Constructors_overloaded("Rudra",50);

	}

}
