package package1;

public class Finalvariable1 {

	final static int a=100;//Global variable
    static int b=10; //Global variable
    static void add()
    {
    	int c=a+b;
    	System.out.println(c);
    }
    static void sub()
    {
       
    	//a=110; //not possible in java
    	int c=a-b;
    	System.out.println(c);
    }
	public static void main(String[] args) {
		add();
		sub();
	}

}
