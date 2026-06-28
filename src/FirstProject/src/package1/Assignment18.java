package package1;
//"Write a Program to call a parameterized non static method present inside your own class"
public class Assignment18 {
 void mul (int length, int breadth)
 {
	 int area_of_rectangle = length*breadth;
	 System.out.println(area_of_rectangle);
 }
	public static void main(String[] args) {
		Assignment18 m1= new Assignment18();
		m1.mul(15,12);

	}

}
