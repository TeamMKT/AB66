package stringBuffer;

public class Practisequestions
{
public static void main(String[] args) {
	StringBuilder s1 = new StringBuilder("1234567");

	//s1.insert(1, "ello");
	s1.delete(2,6);
	s1.reverse();
	s1.insert(1, "x");
	//s1.capacity();
	//s1.setLength(5);
	//s1.charAt(2);
	//s1.append("World").substring(4);
	System.out.println(s1);
	
	
}
}
