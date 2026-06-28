package stringBuffer;

public class StringBuffer_Program4 
{

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer(5);
		System.out.println(s1.capacity());
		s1.append("Automation");
		System.out.println(s1.capacity());

	}

}
//instead of string name you can take the int value get the s1.capacity is 5, and you can append with String name.
//then use the formula. new Capacity = (old capacity*2+2);