package package1;
 //if you have many method also in the program then which method will be execute? "Main Method"
// How to call a static method in another method of the same class? By its name.
public class Module5 {

	public static void main(String[] args)
	{
	     sub();
		 System.out.println("Main Method");
		 add();
		 add();

	}
       static void add()
       {
    	   System.out.println("addition");
       }
        static void sub()
       {
	System.out.println("Subtraction");
       }


}
