package array_String;
import java.util.Arrays;
public class ReverseArray2 
{
   public static void main(String[] args)
   {
	   int [] rollno1 = new int[5];
	   rollno1[0]=85;
	   rollno1[1]= 95;
	   rollno1[2]=45;
	   rollno1[3]=75;
	   rollno1[4]=98;
	   System.out.println(Arrays.toString(rollno1));
	   int [] rollno2 = new int[rollno1.length];
	   
	   for(int i=0,j=rollno1.length-1;i<rollno1.length;i++,j--)
	   {
		   rollno2 [j]=rollno1[i];
	   }
	   System.out.println("My roll no is : " + Arrays.toString(rollno1));
	   System.out.println("My reverse Array is : " + Arrays.toString(rollno2));
	   
}
}
