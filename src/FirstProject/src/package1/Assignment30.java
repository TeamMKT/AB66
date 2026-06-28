package package1;
//"Write a Program  to call Scanner class methods"
import java.util.Scanner;
public class Assignment30
{
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
		int a = s1.nextInt();
		System.out.println(a);
		byte b = s1.nextByte();
		System.out.println(b);
		long c =s1.nextLong();
		System.out.println(c);
		short d=s1.nextShort();
		System.out.println(d);
		double e = s1.nextDouble();
		System.out.println(e);
		float f = s1.nextFloat();
		System.out.println(f);
		boolean g=s1.nextBoolean();
		System.out.println(g);
		String name=s1.next();
		System.out.println(name);
		s1.close();
		
	}
	
}

