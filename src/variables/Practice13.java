package variables;

public class Practice13 
{ 
	int x= 10;
	void show()
	{
		int x=30;
		Practice13 g1 = new Practice13();
		System.out.println(g1.x);
	}
	public static void main(String[] args) 
	{
		Practice13 g1 = new Practice13();
		g1.show();
	}
	

}
