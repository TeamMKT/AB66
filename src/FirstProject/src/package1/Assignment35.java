package package1;
//"Write A Program to declare a vairable inside a static and non static Method. For global varable."
public class Assignment35 {
    static int a=100;
static int b=200;
int c=50;
int d=45;

 static void add()
 {
	 int add=a+b;
	 System.out.println(add);
 }
 void mul()
 {
	 int mul=c*d;
	 System.out.println(mul);
 }
 public static void main(String[] args) 
	{
		add();
		Assignment35 a1=new Assignment35();
		a1.mul();
	}

}