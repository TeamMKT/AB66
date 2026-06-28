package array_String;

public class Practice7 
{
   public static void main(String[] args) 
   {
	 String s1 = " Geeta 123 %";
	 String s2 = s1.replace('e','A' );
	 System.out.println(s2);
	 System.out.println(s1.replace("geeta", "Jyothi"));
	 System.out.println(s1.replaceAll("[a-z]", "Meduri"));
	 System.out.println(s1.replaceAll("[0-9]", "Jyothi"));
	 System.out.println(s1.replaceAll("[^A-Z a-z 0-9]","M"));
}
}
