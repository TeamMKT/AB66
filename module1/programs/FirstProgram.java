package module1.programs;
import java.lang.Math;
public class FirstProgram 
{
	
	
	 static int add(int a,int b)   // sttaic method
	{
		int c=a+b;
		return c;
	}
	 static double areaOfCircle(double radius)   // sttaic method
		{
			double area=Math.PI*radius*radius;
			return area;
		}
	public static void main(String [] args)// sttaic method
	{
		System.out.println(add(10,30));
		System.out.print("Vaibhav");

	}
	
}
