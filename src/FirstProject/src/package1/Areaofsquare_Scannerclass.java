package package1;
//area of square in scanner class using radius valus as a input.
import java.util.Scanner;
public class Areaofsquare_Scannerclass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of s");
		int s= s1.nextInt();
		int c=s*s;
		System.out.println("Area of the square");
		System.out.println(c);
		
		s1.close();
		
		
	}

}
