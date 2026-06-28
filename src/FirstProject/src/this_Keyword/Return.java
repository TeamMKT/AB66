package this_Keyword;
public class Return 
{
   int add()
   {
	   int a =10;
	   int b =20;
	   int c =a+b;
	   return c;
   }
   public static void main(String[] args) 
   {
	   Return r = new Return ();
	   int result= r.add();
	   System.out.println(result);
	   
}
}
