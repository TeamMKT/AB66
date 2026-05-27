package moduel2.programs;
public class ReverseStringProblem 
{
	public static void main(String[] args) 
	{
		String a="auto";
		String reverse="";//cba

		for(int i=a.length();i>=0;i--)
		{
			char c1=	a.charAt(i);
			reverse=reverse+c1;
		/*i=2,c1=c,reverse=c
		 *i=1, c1=b,reverse=c+b=cb
		 *i=0,c1=a,reverse=cb+a=cba
		 * 
		 */
		}
		System.out.println(reverse);

		
	}
}
