package Stringfunctions;

public class StringReversename 
{
   public static void main(String[] args) 
   {
	  String name = "Ramu";
	  System.out.println(name.length());
	  String reverse ="";
	  for(int i=name.length()-1;i>=0;i--)
	  {
		  char a=name.charAt(i);
		  reverse = reverse +a;
		  /*i=3, a=u, reverse=u;
		  i=2, a=m,reverse=u+m=um;
		  i=1,a=a,reverse=um+a=uma;
		  i=0,a=R, reverse=uma+R=umaR;*/
	  
	  System.out.println(reverse);
	  /* you can print the reverse in for loop you will get the iterations. 
	  You want to get only reverse name you can print after for loop*/
	  }
		  
		  
	  
	}

}
