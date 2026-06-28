package stringBuffer;

public class StringBuffer_Program6 
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer(5);
		System.out.println(s1.capacity());
		s1.ensureCapacity(20);
		System.out.println(s1.append("My School name is Euro"));
		System.out.println(s1.capacity());
		
		
		
		
	}

}
