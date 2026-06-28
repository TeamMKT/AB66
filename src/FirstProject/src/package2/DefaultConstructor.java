package package2;
//Write a program with a default constructor that initializes values for length and width and prints the area of rectangle.
public class DefaultConstructor {
	DefaultConstructor()
	{
			int length = 4;//l is length of the rectangle
			int width = 6; // w is the width of the rectangle
			int Area_of_Rectangle=length*width;
			System.out.println(Area_of_Rectangle);
			
	}
	public static void main(String[] args) {
		new DefaultConstructor();

	}

}
