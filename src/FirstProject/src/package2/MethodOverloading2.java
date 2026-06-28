package package2;

public class MethodOverloading2 {
	static void add()
	{
		System.out.println("Addition1");
	}
    static void add(int a,int b)
    {
    	int c= a+b;
    	System.out.println(c); 
    }
     void add(int a,double b)
    {
    	double c= a+b;
    	System.out.println(c); 
    }
    static void add(double a,double b)
    {
    	double c= a+b;
    	System.out.println(c); 
    }
    void add(double a,int b)
    {
    	double c= a+b;
    	System.out.println(c); 
    }
	public static void main(String[] args) {
		add(6,5);
		add(1.5,2.7);
		MethodOverloading2 m2 = new MethodOverloading2();
		m2.add(5, 6.5);
		m2.add(7.5, 8);

	}

}
