package Stringfunctions;
//Write a program using different methods in string buffer
public class Assignment161 {

	public static void main(String[] args) 
	{
		StringBuffer sb =  new StringBuffer("Rudra");
		 sb.append("Prasad");
		 System.out.println("After Append : " + sb);
		 sb.insert(11, " Sharma");
		 System.out.println("After insert: " + sb );
		 sb.replace(11, 19, " Gundugola");
		 System.out.println("After replace : " + sb);
		 sb.capacity();
		 System.out.println("Capacity is: " + sb.capacity());
		 int i1 =sb.length();
		 System.out.println("Length is: " + i1);
		 sb.reverse();
		 System.out.println("After reverse is : " + sb);
		 
		 

	}

}
