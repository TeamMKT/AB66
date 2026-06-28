package stringBuffer;
public class StringBuffer_methods 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Rudra");
		s1.append("Prasad");
		System.out.println(s1);
		s1.insert(11, 'G');
		System.out.println(s1);
		s1.replace(0, 11, "Sharma");
		System.out.println(s1);
		s1.delete(1, 5);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.ensureCapacity(25);
        //System.out.println(s1);
		StringBuffer s2= new StringBuffer("Java");
		s2.delete(1,3);
		System.out.println(s2);
		StringBuffer s3= new StringBuffer("Test");
		s3.append(123);
		s3.insert(4, 'x');
		System.out.println(s3);
		StringBuffer s4= new StringBuffer("123456");
		s4.deleteCharAt(3);
		System.out.println(s4);
		/*s4.append("X");
		System.out.println(s4);*/
		s4.replace(1,4,"X");
		System.out.println(s4);
		StringBuffer s5= new StringBuffer("HELLO");
		s5.delete(1, 4);
		System.out.println(s5);
		s5.insert(1, "XYZ");
		System.out.println(s5);
		s5.reverse();
		System.out.println(s5);
		


		

	}

}
