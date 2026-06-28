package package2;

public class MethodOverloading1 {
	static void add()
	{
		System.out.println("Addition1");
	}
    static void add(int a,int b)
    {
    	int c= a+b;
    	System.out.println(c); 
    }
    static void add(int a,double b)
    {
    	double c= a+b;
    	System.out.println(c); 
    }
    static void add(double a,double b)
    {
    	double c= a+b;
    	System.out.println(c); 
    }
    static void add(double a,int b)
    {
    	double c= a+b;
    	System.out.println(c); 
    }
	public static void main(String[] args) {
		add();
		add(25,85);
		add(25,5.7);
		add(2.5,5.6);
		add(8.5,15);

	}

}
