package package1;

import java.util.Scanner;

public class Areaofrectangle_Scannerclass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
	System .out.print("Enter the values of L and W");
		double l = s1.nextDouble();
		double w =s1.nextDouble();
	    double r=l*w;
	    System.out.print("Area of the rectangle");
	    System.out.print(r);
	   s1.close();
	
	}

}
