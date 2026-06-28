package package1;
//area of circle in scanner class using radius valus as a input.
import java.util.Scanner;

public class Areaofcirclein_Scannerclass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of radius r");
		int r = s1.nextInt();
		double area =Math.PI*r*r; 
		System.out.println("Answer");
		System.out.println(area);
		s1.close();
		

	}

}

