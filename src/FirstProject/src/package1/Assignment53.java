package package1;
//"Write a program to calculate simple interest and check if it is greater than 1000 must use math class and scanner class"
import java.util.Scanner;

public class Assignment53 
{
 public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("calculate simple interest");
		System.out.println("Enter the pricipal value P");
		int P=s1.nextInt();
		System.out.println("Enter the interest rate R");
		double R=s1.nextDouble();
		System.out.println("Enter the time N");
		int N=s1.nextInt();
		double simpleinterest=(P*N*R)/100;
		double result =Math.round(simpleinterest);//Math class
		System.out.println(simpleinterest);
		if (simpleinterest>=1000)
		{
			System.out.println("The simple interset is greater than 1000");
		}
		else
		{
			System.out.println("The simple interset is not greater than 1000");
		}
	s1.close();
	}
}

