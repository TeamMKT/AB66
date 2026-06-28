package practise_Questions;
//Write a program where one non-static method calls another non-static method.
public class Calling_nonstaticmethod {
 void display1()
 {
	 System.out.println("This is method1");
	 display2(); // calling another non static method
	 
 }
 void display2() 
 {
	 System.out.println("This is method2");
	 
 }
	public static void main(String[] args) {
		Calling_nonstaticmethod m1=new Calling_nonstaticmethod();
		m1.display1(); //calling first mehtod

	}

}
