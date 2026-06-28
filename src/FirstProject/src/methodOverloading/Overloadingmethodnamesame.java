package methodOverloading;
//Write a program where method name is same but parameter types are different.
public class Overloadingmethodnamesame {
  static void show(int a)
  {
	  int b = a;
	  System.out.println(b);
  }
  static void show(double a)
  {
	  double b = a;
	  System.out.println(b);
  }
	public static void main(String[] args) {
		show(12);
		show(1.25);

	}

}
