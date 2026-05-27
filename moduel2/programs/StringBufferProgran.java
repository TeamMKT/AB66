package moduel2.programs;
public class StringBufferProgran 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Order Id: ");	
		s1.append(7854715);
		System.out.println(s1);//this is Mutable
		
		StringBuilder s2=new StringBuilder("Automation");	
		s2.append("Testing");
		System.out.println(s2);//this is Mutable
	}
}
