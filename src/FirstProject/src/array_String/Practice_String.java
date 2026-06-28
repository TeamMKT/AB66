package array_String;

public class Practice_String 
{
  public static void main(String[] args)
  {
	String str = "Hyderabad";
	 int i1 =str.length();//length,size, count
	 System.out.println(i1);
	 System.out.println(str.trim());//trim
	 char c1 = str.charAt(4);//char at index position
	 System.out.println(c1);
	 int i2 = str.indexOf("e");//index of string
	 System.out.println(i2);
	 String s1 =str.substring(2); //sub string start index
	 System.out.println(s1);
	 System.out.println(str.substring(0, 9));//substring start and end index
	 String str1 = str.concat("roma");
	 System.out.println(str1);
	 System.out.println(str1.length());
	 boolean b1=str1.contains(str);
	 System.out.println(b1);
	 int i3 =str.compareTo(str1);
	 System.out.println(i3);
	 
	 
}
}
