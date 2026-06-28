package encapsulation;
/*Protecting the data member of a class by making it private and 
giving indirect access to getter and setter is called as encapsulation*/
public class Program1 
{
	private int age =10;
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	public static void main(String[] args) 
	   {
		Program1 a1 = new Program1();
		a1.setAge(25);
		System.out.println(a1.getAge());
	}
}
