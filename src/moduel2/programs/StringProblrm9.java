package moduel2.programs;

public class StringProblrm9 
{
	public static void main(String[] args) 
	{
		String a="Automation";//String Pool Area->Method Area
		/*Memory Efficient
		 * 
		 */
		String b="Automation";//String Pool Area->Method Area
		boolean b1=	a.equals(b);
		boolean b2=	a==b;
		System.out.println(b1);
		System.out.println(b2);
		String c=new String("Automation");//Heap Momory
		/*Memory inEfficient
		 * 
		 */
	}
}
