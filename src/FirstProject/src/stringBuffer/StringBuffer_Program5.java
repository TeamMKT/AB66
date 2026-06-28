package stringBuffer;

public class StringBuffer_Program5 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer(5);
		System.out.println(s1.capacity());
		s1.append("Automation");
		System.out.println(s1.capacity());
		s1.append("Testing");
		System.out.println(s1.capacity());
		
	}

}
