package module1.programs;

import java.util.Scanner;

public class AreaOfcircle 
{
	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.println("PLease enter the value of R");
		int r=	s1.nextInt();
		
		double area=Math.PI*r*r;;//local but Pi is a global
		System.out.println(area);
		s1.close();
		
		Object o1=(Object)new AreaOfcircle();
		//upcasting
		
	}
}
