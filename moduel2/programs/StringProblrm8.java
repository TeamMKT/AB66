package moduel2.programs;
public class StringProblrm8 
{
	public static void main(String[] args) 
	{
		String a="Automation";//String Pool Area->Method Area
		String b=new String("Automation");//Heap Momory
		
		/*instance variable,ARray,Object,
		 * 
		 */
		boolean b1=	a.equals(b);
		System.out.println(b1);
		boolean b2=	a==b;
		System.out.println(b2);
	}
}
