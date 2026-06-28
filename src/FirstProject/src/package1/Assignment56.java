package package1;
//"Write  a program with combination of forLoop and scanner class."
import java.util.Scanner;
public class Assignment56 {

	public static void main(String[] args)
	{   
		Scanner s1=new Scanner(System.in);
		System.out.println("Print the numbers");
		for (int i=1;i<=5;i++)
		{
		   System.out.println("Enter the number:"+i);
		   int num=s1.nextInt();
		   System.out.println(num);
		}
			
		s1.close();	

	}
}


