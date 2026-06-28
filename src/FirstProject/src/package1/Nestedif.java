package package1;

public class Nestedif
{
public static void main(String[] args) 
{
		char gender1 ='F';
		char gender2 ='M';
		double salary =25000;
		if(gender1 == 'F')
		{
			System.out.println("You are eligible");
			System.out.println("please click on apply: to chack if you can avail it");
			if(salary<=25000)
			{
				System.out.println("congratulations");
			}
			else
			{
				System.out.println("Sorry this is not eligible salary more than 25K");
			}
		}
		else
		{
			System.out.println("Sorry this is not for you");
		}
		
}
}



