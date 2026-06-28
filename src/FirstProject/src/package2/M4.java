package package2;
//How can you access the non static method of class present in different package?
import package1.Nonstatic_method;

public class M4 
{

	public static void main(String[] args) 
	{
		Nonstatic_method.mul(14,15);//static method with different class thatis Classname.methodname();
		Nonstatic_method a1=new Nonstatic_method ();//object creation
		a1.add(25,35);
		
		

	}

}
