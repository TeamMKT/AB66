package package1;
//"Write a program to create a 3 Non-Static Methods and call them in main method with a single reference variable"?
public class Assignment14 {
   
	void method1()
	{
		System.out.println("Non-static method1");
	}
	void method2()
	{
		System.out.println("Non-static method2");
	}
	void method3()
	{
		System.out.println("Non-static method3");
	}

   public static void main(String[] args) {
		Assignment14 n1=new Assignment14();
		n1.method1();
		n1.method2();
		n1.method3();
		
		

	}

}
