package package2;
//Write a program using constructor overloading to calculate:Area of square; Area of rectangle
public class ConstructorOverloadingwithShapes {
	ConstructorOverloadingwithShapes(int side)
	{
        int Area_of_square=side*side;
		System.out.println(Area_of_square);
		
	}
	ConstructorOverloadingwithShapes(double length, double width)
	{
		double  Area_of_rectangle=length*width;
		System.out.println(Area_of_rectangle);
	}
	
	public static void main(String[] args) {
		new ConstructorOverloadingwithShapes(15);
		new ConstructorOverloadingwithShapes(1.5,2.5);
	}

}
