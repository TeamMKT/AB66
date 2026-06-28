package package1;
//"Write A Program to update static and non static global variable"
public class Assignment38 {
     static int a=45;
     int b=80;
	public static void main(String[] args) {
		int a=50; //updated static variable
		Assignment38 a2=new Assignment38 ();
		a2.b=90; //here, b is a nonstatic varaible so create an object.
		System.out.println(a);
		System.out.println(a2.b);

	}

}
