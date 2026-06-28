package array_String;

public class Practice_ 
{
   public static void main(String[] args) 
   {
	 String s1 = "train";
	 s1.matches("t(.*)");
	System.out.println( s1.matches("t(.*)"));
	System.out.println(s1.matches("(.*)n"));
	System.out.println(s1.matches("(.*)a(.*)"));
	String s2 ="Mail1";
	System.out.println(s1.matches("....."));
}
}
