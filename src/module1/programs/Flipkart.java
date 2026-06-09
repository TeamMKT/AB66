package module1.programs;
class ManishP
{
	void java()
	{
		System.out.println("Java Course");
	}
}
public class Flipkart extends ManishP
{
	static void add()//sttaic method
	{
		System.out.println("sttaic method");
	}
	void sub() //non sttaic method
	{
		System.out.println("NOn sttaic method");
	}
	Flipkart()       //Constructor
	{
		System.out.println("Constructor method");
	}
	public static void main(String[] args) 
	{
	ManishP m1=(ManishP)new Flipkart();
	//upcasting
	
	
		add();
		Flipkart f1=new Flipkart();//create an object
		//this is how we can call the constructor
		f1.sub();
		Flipkart f2=new Flipkart();//create an object
		Flipkart f3=new Flipkart();//create an object
		new Flipkart();//creating an Object
	}
}
