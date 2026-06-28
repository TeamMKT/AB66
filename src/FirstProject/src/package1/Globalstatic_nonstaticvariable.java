package package1;

public class Globalstatic_nonstaticvariable
{
static int a=100;
int b=45;
  public static void main(String[] args) 
  {
		int a=98;
		Globalstatic_nonstaticvariable obj=new Globalstatic_nonstaticvariable();
		int add=a+obj.b;
		System.out.println(add);
		int d=a*obj.b;
		System.out.println(d);

	}

}
