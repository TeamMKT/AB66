package package1;
//Write a program with:One static method to find sum of two numbersOne non-static method to find average of three numbers Call both methods in main.
public class Staticmethod_nonstaticmethod 
{
static void add(int a, int b)
{
    int c=a+b;
    System.out.println(c);
}
void average(int a, int b, int c)
{
	double average_of_three_numbers=(a+b+c)/3.0;
	System.out.println(average_of_three_numbers);
}
 public static void main(String[] args) 
    {
	add(15,25);
	Staticmethod_nonstaticmethod a1=new Staticmethod_nonstaticmethod();
	a1.average(15,37,48);
    }
}




