package package1;
//"Write a Program to calculate Area and Circumference for Square, Triangle, Rectangle and Circle using arithmetic operators"?
public class Assignment8 
{
	public static void main(String[] args) {
		int s = 8;//s is side of the square
		int Area_of_square=s*s;
		System.out.println(Area_of_square);
		
		int a=8;// s is the side of the square
		int circumference_of_square=4*a;
		System.out.println(circumference_of_square);
		
		int r=4;// r is the radius of the circle
		double area_of_circle = Math.PI*r*r;
		System.out.println(area_of_circle);
		
		int r1=8;
		double Circumference_of_circle=Math.PI*2*r1;
		System.out.println(Circumference_of_circle);
		
		int b = 7; //b is the base of the traingle
		int h = 5; // h is the height of the traingle
		double Area_of_Traingle=(b*h)/2.0;
		System.out.println(Area_of_Traingle);
		
		int a1=5; int b1=6; int c1=7;
		int Circumferennce_of_traingle=a1+b1+c1;
		System.out.println(Circumferennce_of_traingle);
		
		int l = 4;//l is length of the rectangle
		int w = 6; // w is the width of the rectangle
		int Area_of_Rectangle=l*w;
		System.out.println(Area_of_Rectangle);
		
		int l_1 = 4;//l is length of the rectangle
		int w_1 = 6; // w is the width of the rectangle
		int Circumference_of_Rectangle=2*(l_1+w_1);
		System.out.println(Circumference_of_Rectangle);
		
	}
}
