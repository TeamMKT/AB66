package variables;
//"Write A Program to update static and non static global variable"
public class Practice10
{
    static int a =10;
   int b =25;
   public static void main(String[] args) 
   {
	  a  = 45;  // update varaible a
	  Practice10 g1 = new Practice10();
	  g1.b = 75; 
	  
	System.out.println(a);
	System.out.println(g1.b);
}
   
}
