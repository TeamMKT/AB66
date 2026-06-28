package practiclaJAVA;

public class MethodOverloading
{
    static void add(int a, int b)
    {
    	int c = a+b;
    	System.out.println(c);
    }
    void add(double a , double b)
    {
    	double c = a+b;
    	System.out.println(c);
    }
    void add(int a, int b, double c)
    {
    	double d = a+b+c;
    	System.out.println(d);
    }
    public static void main(String[] args) 
    {
    	add(10,20);
    	
    	MethodOverloading a1 = new MethodOverloading();
    	a1.add(1.25, 2.25);
    	a1.add(15, 25, 2.25);
    	
    	
    	
    	
	}
}
