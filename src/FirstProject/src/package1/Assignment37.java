package package1;
//"Write A Program for static and non static global varibles and utilize them in both static and non static methods"
public class Assignment37 
{
	 static int a =15;//static varaible
            int b=45;//non static varaible
 public static void main(String[] args)
	{
	 Assignment37 a2=new Assignment37();//here b is a nonstaic varaible so we can create an object.
	 int mul=a*(a2.b);//utilize
   	 System.out.println(mul);
	 int c=a2.b-a;
		System.out.println(c);

	}

}
