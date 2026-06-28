package practiclaJAVA;

public class StringMarches
{
   public static void main(String[] args) 
   {
	  String s1 = "Geeta123";
	  System.out.println(s1.matches(".*a"));
	  System.out.println(s1.matches("G.*"));
	  System.out.println(s1.matches(".*.*"));
}
}
