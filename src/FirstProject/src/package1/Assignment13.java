package package1;
//"Write a program to create 3 non parameterized non static method and try calling them inside main method"?
public class Assignment13 {
      void add()
      {
    	  System.out.println("Non parametrized non static mehtod1 ");
      }
      void mul()
      {
    	  System.out.println("Non parametrized non static mehtod2 ");
      }
      void sub()
      {
    	  System.out.println("Non parametrized non static mehtod3 ");
      }
	public static void main(String[] args) {
		Assignment13 n1 = new Assignment13();// to create an object
		n1.add();
		Assignment13 m1 = new Assignment13();
		m1.mul();
		Assignment13 a1 = new Assignment13();
		a1.sub();
		
	}

}
