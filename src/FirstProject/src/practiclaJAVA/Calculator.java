package practiclaJAVA;

public class Calculator 
{
     void add(int a, int b)
     {
    	 int c =a+b;
    	 System.out.println(c);
     }
void add(double a, double b)
{
	 double c =a+b;
	 System.out.println(c);
}
void add(int a, int b, int c)
{
	 int d =a+b+c;
	 System.out.println(d);
}
public static void main(String[] args) 
{
	Calculator c1= new Calculator();
	c1.add(12, 13);
	c1.add(1.25, 2.35);
	c1.add(15, 26, 35);
}
}

