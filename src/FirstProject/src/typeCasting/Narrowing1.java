package typeCasting;
//short into byte
public class Narrowing1 
{
   public static void main(String[] args) 
   {
	  short s1 = 1000;
	  byte b1 = (byte)s1;// explicitly
	  System.out.println(b1);
// because, byte range is -128 to 127, so it will give negative value.
	  
	  short s2 = 100;
	  byte b2 = (byte)s2;// explicitly
	  System.out.println(b2);
/* because, byte range is -128 to 127, so it will give positive value. (convert into byte , 
	  it will loss the short range)*/
	  
	  short s3 = -250;
	  byte b3 = (byte)s3;// explicitly
	  System.out.println(b3);
/* because, byte range is -128 to 127, so it will give positive value. (convert into byte , 
	  it will loss the short range)*/

}
}
