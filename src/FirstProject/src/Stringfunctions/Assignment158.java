package Stringfunctions;
//"Write a program where Input is "Manish Kumar Tiwari"; Output "MKT"
public class Assignment158 
{
 public static void main(String[] args) 
 {
	 String s1 = "Manish Kumar Tiwari";
	 String [ ] s2 = s1.split(" ");
	 String result ="";
	 for(int i=0;i<s2.length;i++)
	 {
		 result = result + s2[i].charAt(0);
	 }
	 System.out.println(result);
	 
	 
	 
 }
}

   


	