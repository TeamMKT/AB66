package package2;
/*Write A Program to create relation between 2 classes having non-static methods using extends keyword. 
Single Level Inheritance from  package*/
public class Assignment76 extends Assignment76_Parentclass
{
	void add()
	{
		System.out.println("Non static mehtod for child class");
	}
	
	public static void main(String[] args) 
	{
		Assignment76 a1=new Assignment76();
		a1.add();
		a1.sub();
		

	}

}
/*package package2;

public class Assignment76_Parentclass 
{
	void sub()
	{
		System.out.println("The non static method for parent class");
	}

}*/