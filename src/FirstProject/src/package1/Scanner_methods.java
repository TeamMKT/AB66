package package1;

import java.util.Scanner;

public class Scanner_methods {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a = s1.nextInt();
		System.out.println(a);
		byte b=s1.nextByte();
		
		short c=s1.nextShort();
		long d=s1.nextLong();
		double e=s1.nextDouble();
		float f=s1.nextFloat();
		boolean g=s1.nextBoolean();
		String h=s1.next();
		
		s1.close();
		
		
	}

}
