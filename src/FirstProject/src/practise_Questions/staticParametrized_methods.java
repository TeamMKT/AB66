package practise_Questions;
//Write a program with two static parameterized methods:One method to calculate sum of two numbers;Another method to calculate average of three numbers.
public class staticParametrized_methods {

	static void sum(int x, double y)
	{
	    double sum_of_two_numbers = x+y;
		
	    System.out.println(sum_of_two_numbers);
	}
	static void average(int d, double e, int f)
	{
	    double average_of_three_numbers = (d+e+f)/3.0;
		System.out.println(average_of_three_numbers);
	}
	
	public static void main(String[] args) {
		
       sum(15,2.5);
       average(15,1.25,35);
	}

}
