package package1;
//"Write a Program to calculate Area and Circumference for Square, Triangle, Rectangle and Circle using math class"
public class Assignment31 {
	public static void main(String[] args)
	{
		int side=5;
        int mul=Math.multiplyExact(5,5);
        int area_of_square=side*side;
        int Circumference_of_square=4*side;
        System.out.println(area_of_square);
        System.out.println(Circumference_of_square);
        
		int length = 5;
		int width = 6;
		int mul1=Math.multiplyExact(5,6);
		int area_of_rectangle = length*width;
		int circumference_of_rectangle =2*(length+width);
		System.out.println(area_of_rectangle);
		System.out.println(circumference_of_rectangle);
		
		int b=10;
		int h=16;
		int s=20;
		int mul2=Math.multiplyExact(10,16);
		int area_of_traingle=(b*h)/2;
        int Circumference_of_traingle=b+h+s;
        System.out.println(area_of_traingle);
        System.out.println(Circumference_of_traingle);
        
        int r=10;
        int mul3=Math.multiplyExact(10,10);
        double area_of_circle = Math.PI*r*r;
        double circumference_of_circle=Math.PI*2*r;
        System.out.println(area_of_circle );
        System.out.println(circumference_of_circle);
        
        
		
	}

}
