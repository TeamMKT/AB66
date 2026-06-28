package package1;
//"Write a Program to call 3 parameterized non static Method Overloading"
public class Assignment21 {
 void add(int a)
{
	System.out.println(a);
}
 void add(int a , int b)
{
	int c= a+b;
	System.out.println(c);
}
 void add(int a , double b, float c)
{
	double d=a+b+c;
	System.out.println(d);
}

public static void main(String[] args) 
{
	Assignment21 a1=new Assignment21();
	a1.add(15);
	a1.add(15,12);
	a1.add(15,1.25,12.356f);
}



}