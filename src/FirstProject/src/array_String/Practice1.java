package array_String;

public class Practice1 
{
  public static void main(String[] args) 
  {
	String txt = "Rudraprasad Sharma";
	int i1 =txt.length();//return type for length object is int.
	System.out.println(i1);
	String s1 = txt.toLowerCase();
	System.out.println(s1);
	String s2 = txt.toUpperCase();
	System.out.println(s2);
	int i2=txt.indexOf("Sharma");//index the position
	System.out.println(i2);
	String txt1 = "Gundugola Rudraprasad Sharma";
	int i3=txt1.indexOf("Sharma");
	System.out.println(i3);
	int i4=txt1.indexOf('R');
	System.out.println(i4);
	int i5=txt1.indexOf('R',9);
	System.out.println(i5);
	txt1.indexOf("Rudra", 9);
	int i6 =txt1.lastIndexOf('r');
	System.out.println(i6);
	
}
}
