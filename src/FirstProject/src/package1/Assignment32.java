package package1;
////"Write a Program to calculate Area and Circumference for Square, Triangle, Rectangle and Circle using scanner class.
import java.util.Scanner;
public class Assignment32 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Find area of the square");
		System.out.println("Enter the value of side");
		int s=s1.nextInt();
		int S1 = s*s;//area of square
		System.out.println(S1);
		
		System.out.println("Circumference of square");
		System.out.println("Enter the value of side");
		int a1=s1.nextInt();
		double S2 = 4*a1;//Circumference of square
		System.out.println(S2);
		System.out.println("Final answer");
		
		System.out.println("Find area of the traingle");
		System.out.println("Enter the value of base");
		int b=s1.nextInt();
		System.out.println("Enter the value of height");
		int h=s1.nextInt();
		double T1 = (b*h)/2;//area of traingle
		System.out.println(T1);
		
		System.out.println("Circumference of traingle");
		System.out.println("Enter the value of side1");
		int side1=s1.nextInt();
		System.out.println("Enter the value of side2");
		int side2=s1.nextInt();
		System.out.println("Enter the value of side3");
		int side3=s1.nextInt();
		int T2 = side1+side2+side3;//Circumference of traingle
		System.out.println(T2);
		System.out.println("Final answer");
		
		
		System.out.println("Find area of the rectangle");
		System.out.println("Enter the value of length");
		int l=s1.nextInt();
		System.out.println("Enter the value of width");
		int w=s1.nextInt();
		int R1 = l*w;//area of rectangle
		System.out.println(R1);
		
		System.out.println("Circumference of rectangle");
		System.out.println("Enter the value of length");
		int l1=s1.nextInt();
		System.out.println("Enter the value of width");
		int w1=s1.nextInt();
		int R2 = 2*(l1+w1);//Circumference of rectangle
		System.out.println(R2);
		System.out.println("Final answer");
		
		System.out.println("Find area of the circle");
		System.out.println("Enter the value of r");
		int r=s1.nextInt();
		double g = Math.PI*r*r;//area of circle formula
		System.out.println(g);
		
		System.out.println("Circumference of circle");
		System.out.println("Enter the value of r");
		int r1=s1.nextInt();
		double i = Math.PI*2*r1;//circumferance of circle 
		System.out.println(i);
		System.out.println("Final answer");
		s1.close();
			
	}

}
