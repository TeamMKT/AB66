package module1.programs;
public class M1 
{
	void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		M2.add(100, 250);
		M1 m1=new M1();//create an Object
		m1.subtract(45, 30);
		M2 m2=new M2();
		m2.multiply(100, 9);
		
	}
}
