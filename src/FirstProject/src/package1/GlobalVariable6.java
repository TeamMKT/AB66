package package1;
// How to access the global variables
public class GlobalVariable6 {
  static int a=100;//Global variable
         int b=10;//instance variable-global variable
      public static void main(String[] args) 
      {
		System.out.println(a);
		GlobalVariable6 g1 = new GlobalVariable6();
		System.out.println(g1.b);
	}
}
