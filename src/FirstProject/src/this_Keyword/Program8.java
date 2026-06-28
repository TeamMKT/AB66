package this_Keyword;

public class Program8
{
   int largest(int a, int b)
   {
	   if(a>b)
	   {
		   
		   return a;
	   }
	   else
	   {
           return b;
	   }
   }
   public static void main(String[] args)
   {
	   Program8 p = new Program8();
	   int result = p.largest(25, 40);
	   System.out.println(result);
	   
}
}
