package methodOverloading;
//Write a program with overloaded display() methods:display(String name);display(String name, int age);display(String name, int age, String city)
public class Overloadeddisplay_methods {

	static void display(String name)
	{
		String Name = name;
		System.out.println(Name);
	}
	static void display(String name, int age)
	{
		String Name=name;
		 int age1 = age;
		System.out.println( Name);
		System.out.println( age1);
	}
	 static void display(String name, int age, String city)
		{
			String Name = name;
			int age1= age;
			String City=city;
			System.out.println(Name);
			System.out.println(age1);
			System.out.println(City);
		}
	public static void main(String[] args) {
		display("Rudra");
		display("Rudra",18);
		display("Rudra",18,"Vizag");

	}

}
