package collection;
//Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, length, 
//substring(int) & substring (start & end index) using StringBuilder concept.
public class Assignment170 {
	public static void main(String[] args) 
	{
		StringBuilder sb= new StringBuilder("Rudra");
		StringBuilder sb1 = sb.append("Prasad @");
		System.out.println("After Append: " + sb1);
		StringBuilder sb2 = sb.insert(13, 2007);
		System.out.println("Inserting the index value: "+sb2);
		StringBuilder sb3 = sb.replace(0, 11, "Rudra ");
		System.out.println("Replacing the indexing: " +sb3);
		/*StringBuffer sb4=sb.deleteCharAt(5);
		System.out.println("Deleting Char at indexing :" + sb4);*/
		StringBuilder sb5 = sb.delete(6, 7);
		System.out.println("Deleting start and end indexing: "+sb5);
		int i1 = sb.capacity();
		System.out.println("The original capacity: " + i1);
		char c1 = sb.charAt(7);
		System.out.println("The character at indexing position :" + c1);
		int i2 = sb.length();
		System.out.println("The length of the String : " + i2);
		String sb6 = sb.substring(6);
		System.out.println("The substring at int index is 6:" +sb6);
		String sb7 = sb6.substring(1, 5);
		System.out.println(sb7);
		
		
	}
	}


