package constructors;

public class display 
{
    void show(int a)
    {
    	System.out.println(a);
    }
    void show (String s)
    {
    	System.out.println(s);
    }
    void show(double a)
    {
    	System.out.println(a);
    }
    public static void main(String[] args)
    {
    	display a1 = new display();
    	a1.show(10);
    	a1.show("Rudra");
    	a1.show(1.25);
	}
}
