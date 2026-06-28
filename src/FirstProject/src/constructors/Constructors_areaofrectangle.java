package constructors;
//Write a program where constructor takes length and breadth and calculates area of rectangle.
public class Constructors_areaofrectangle {
	Constructors_areaofrectangle(int lenght, int breadth)
	{
		int l=lenght;
		int b= breadth;
		int area_of_rectangle=l*b;
		System.out.println(area_of_rectangle);
	}
	public static void main(String[] args) {
		new Constructors_areaofrectangle(15,12);
	}

}
