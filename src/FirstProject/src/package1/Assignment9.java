package package1;
//"Write a program to create static methods along with a main method that performs to calculate Area and Circumference for Square, Triangle, Rectangle and Circle using arithmetic operators"?
public class Assignment9 {
	static void Area_of_square()
	{  int s = 8;//s is side of the square
	int Area_of_square=s*s;
	System.out.println(Area_of_square);
	}
	static void circumference_of_square()
	{
		int s=8;// s is the side of the square
		int circumference_of_square=4*s;
		System.out.println(circumference_of_square);
	}
	static void area_of_circle()
	{
		int r=4;// r is the radius of the circle
		double area_of_circle = Math.PI*r*r;
		System.out.println(area_of_circle);
	}
	static void Circumference_of_circle()
	{
		int r1=8;
		double Circumference_of_circle=Math.PI*2*r1;
		System.out.println(Circumference_of_circle);
	}
	static void Area_of_Traingle()
	{
		int b = 7; //b is the base of the traingle
		int h = 5; // h is the height of the traingle
		double Area_of_Traingle=(b*h)/2.0;
		System.out.println(Area_of_Traingle);
	}
	static void Circumferennce_of_traingle()
	{
	int a=5; int b=6; int c=7;
	int Circumferennce_of_traingle=a+b+c;
	System.out.println(Circumferennce_of_traingle);
	}
	static void Area_of_Rectangle()
	{
	int l = 4;//l is length of the rectangle
	int w = 6; // w is the width of the rectangle
	int Area_of_Rectangle=l*w;
	System.out.println(Area_of_Rectangle);
	}
	static void Circumference_of_Rectangle()
	{
	int l = 4;//l is length of the rectangle
	int w = 6; // w is the width of the rectangle
	int Circumference_of_Rectangle=2*(l+w);
	System.out.println(Circumference_of_Rectangle);
	}
	public static void main(String[] args) {
		Area_of_square();
		circumference_of_square();
		area_of_circle();
		Circumference_of_circle();
		Area_of_Traingle();
		Circumferennce_of_traingle();
		Area_of_Rectangle();
		Circumference_of_Rectangle();
	}

}
