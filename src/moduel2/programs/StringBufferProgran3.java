package moduel2.programs;
public class StringBufferProgran3 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer(5);	
		System.out.println(s1.capacity());
		s1.ensureCapacity(20);
		System.out.println(s1.append("My school name is EURO"));
		System.out.println(s1.capacity());

	

	}
}
