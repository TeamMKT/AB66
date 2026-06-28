package package1;

public class MathClass {

	public static void main(String[] args) {
		int sum=Math.addExact(825, 560);
		System.out.println(sum);
		long sum1 = Math.addExact(9876543210L,8876543310L);
		System.out.println(sum1);
		
		int sub = Math.subtractExact(725, 640);
		System.out.println(sub);
		long sub1=Math.subtractExact(9876543210L,8876543310L);
		System.out.println(sub1);
		
		int mul=Math.multiplyExact(250, 60);
		System.out.println(mul);
		long mul1=Math.multiplyExact(9876543210L, 250);
		System.out.println(mul1);
		
		int div = Math.divideExact(640, 80);
		System.out.println(div);
		Long  div1= Math.divideExact(456789236L, 456284123L);
		System.out.println(div1);
		
		int min=Math.min(45, 72);
		System.out.println(min);
		double min1= Math.min(125.75, 255.25);
		System.out.println(min1);
		
		double max = Math.max(125.75, 255.25);
		System.out.println(max);
		int max1 = Math.max(756, 895);
		System.out.println(max1);
		
		double abs=Math.abs(-125.75);
		System.out.println(abs);
		int abs1=Math.abs(-75);
		System.out.println(abs1);
	
		
	}

}
