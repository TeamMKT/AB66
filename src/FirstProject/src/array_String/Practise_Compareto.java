package array_String;

public class Practise_Compareto 
{
   public static void main(String[] args) 
   {
	 String a = "god";
	 String b= "dog";
	int i = a.compareTo(b);
	System.out.println(i);
	boolean b1 = a==b;
	System.out.println(b1);
	System.out.println(b.equals(a));
	boolean b2=b.equalsIgnoreCase("GOD");
	System.out.println(b2);
}
}
