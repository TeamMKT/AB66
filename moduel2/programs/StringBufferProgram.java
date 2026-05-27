package moduel2.programs;
public class StringBufferProgram 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Manual Testing");
		//System.out.println(s1.insert(7, "API "));
	//	System.out.println(s1.replace(0, 6, "Automation"));
	//	System.out.println(s1.delete(0, 6));
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7,9));

	}
}
